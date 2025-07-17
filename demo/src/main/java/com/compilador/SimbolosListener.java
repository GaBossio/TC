package com.compilador;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import com.compilador.MiLenguajeParser.*;
import com.compilador.MiLenguajeLexer.*;

public class SimbolosListener extends MiLenguajeBaseListener {
    private final TablaSimbolos tabla = new TablaSimbolos();
    private final List<String> errores = new ArrayList<>();

    public TablaSimbolos getTablaSimbolos() {
        return tabla;
    }

    public List<String> getErrores() {
        return errores;
    }

    @Override
    public void enterDeclaracionFuncion(DeclaracionFuncionContext ctx) {
        String nombre = ctx.ID().getText();
        String tipoRetorno = ctx.tipo().getText();
        int linea = ctx.start.getLine();
        int col = ctx.start.getCharPositionInLine();

        List<String> params = new ArrayList<>();
        if (ctx.listaParametros() != null) {
            ctx.listaParametros().parametro().forEach(p -> params.add(p.tipo().getText()));
        }

        Simbolo funcion = new Simbolo(
                nombre, tipoRetorno, Simbolo.Categoria.FUNCION,
                linea, col, "global", params);
        try {
            tabla.agregar(funcion);
        } catch (RuntimeException e) {
            errores.add(e.getMessage());
        }

        // Cambiar al ámbito de la función
        tabla.setAmbito(nombre);
        
        // *** NUEVO: Agregar parámetros a la tabla de símbolos ***
        if (ctx.listaParametros() != null) {
            for (ParametroContext param : ctx.listaParametros().parametro()) {
                String nombreParam = param.ID().getText();
                String tipoParam = param.tipo().getText();
                int lineaParam = param.start.getLine();
                int colParam = param.start.getCharPositionInLine();
                
                Simbolo parametro = new Simbolo(
                        nombreParam, tipoParam, Simbolo.Categoria.PARAMETRO,
                        lineaParam, colParam, nombre, null);
                
                try {
                    tabla.agregar(parametro);
                } catch (RuntimeException e) {
                    errores.add(e.getMessage());
                }
            }
        }
    }

    @Override
    public void exitDeclaracionFuncion(DeclaracionFuncionContext ctx) {
        // Sólo reajusta el ámbito a global, sin avisos aquí
        tabla.setAmbito("global");
    }

    @Override
    public void enterDeclaracionVariable(DeclaracionVariableContext ctx) {
        String nombre = ctx.ID().getText();
        String tipo = ctx.tipo().getText();
        int linea = ctx.start.getLine();
        int col = ctx.start.getCharPositionInLine();

        Simbolo var = new Simbolo(
                nombre, tipo, Simbolo.Categoria.VARIABLE,
                linea, col, tabla.getAmbito(), null);
        try {
            tabla.agregar(var);
        } catch (RuntimeException e) {
            errores.add(e.getMessage());
        }
    }

    @Override
    public void enterExpresionPrimaria(ExpresionPrimariaContext ctx) {
        if (ctx.ID() != null) {
            String nombre = ctx.ID().getText();
            try {
                Simbolo simbolo = tabla.buscar(nombre);
                simbolo.setUsada(true);
                // *** ACTUALIZADO: Permitir parámetros como variables válidas ***
                if (simbolo.getCategoria() != Simbolo.Categoria.VARIABLE && 
                    simbolo.getCategoria() != Simbolo.Categoria.PARAMETRO) {
                    errores.add("Error: '" + nombre + "' no es una variable válida en línea " +
                            ctx.start.getLine());
                }
            } catch (RuntimeException e) {
                errores.add("Error: Variable '" + nombre + "' no declarada en línea " +
                        ctx.start.getLine());
            }
        }
    }

    @Override
    public void enterAsignacion(AsignacionContext ctx) {
        String nombre = ctx.ID().getText();
        try {
            Simbolo simbolo = tabla.buscar(nombre);
            simbolo.setUsada(true);
            // *** ACTUALIZADO: Permitir parámetros en asignaciones ***
            if (simbolo.getCategoria() != Simbolo.Categoria.VARIABLE && 
                simbolo.getCategoria() != Simbolo.Categoria.PARAMETRO) {
                errores.add("'" + nombre + "' no es una variable válida para asignación en línea " +
                        ctx.start.getLine());
            }
        } catch (RuntimeException e) {
            errores.add("Variable '" + nombre + "' no declarada para asignación en línea " +
                    ctx.start.getLine());
        }
    }

    @Override
    public void enterAsignacionCompuesta(AsignacionCompuestaContext ctx) {
        String nombre = ctx.ID().getText();
        try {
            Simbolo simbolo = tabla.buscar(nombre);
            simbolo.setUsada(true);
        } catch (RuntimeException e) {
            errores.add("Variable '" + nombre + "' no declarada en línea " + ctx.start.getLine());
        }
    }

    @Override
    public void enterExpresionPostfijo(ExpresionPostfijoContext ctx) {
        if (ctx.expresionPrimaria() != null && ctx.expresionPrimaria().ID() != null) {
            String nombre = ctx.expresionPrimaria().ID().getText();
            try {
                Simbolo simbolo = tabla.buscar(nombre);
                simbolo.setUsada(true);
            } catch (RuntimeException e) {
                errores.add("Variable '" + nombre + "' no declarada en línea " + ctx.start.getLine());
            }
        }
    }

    // *** NUEVO: Manejar llamadas a funciones ***
    @Override
    public void enterLlamadaFuncion(LlamadaFuncionContext ctx) {
        String nombreFuncion = ctx.ID().getText();
        try {
            Simbolo simbolo = tabla.buscar(nombreFuncion);
            simbolo.setUsada(true);
            if (simbolo.getCategoria() != Simbolo.Categoria.FUNCION) {
                errores.add("Error: '" + nombreFuncion + "' no es una función válida en línea " +
                        ctx.start.getLine());
            }
        } catch (RuntimeException e) {
            errores.add("Error: Función '" + nombreFuncion + "' no declarada en línea " +
                    ctx.start.getLine());
        }
    }

    @Override
    public void enterExpresionAritmetica(ExpresionAritmeticaContext ctx) {
        if (!ctx.operadorAritmetico().isEmpty()) {
            for (int i = 0; i < ctx.operadorAritmetico().size(); i++) {
                String operador = ctx.operadorAritmetico(i).getText();
                String left = ctx.expresionUnaria(i).getText();
                String right = ctx.expresionUnaria(i + 1).getText();

                if (operador.equals("+") && (left.equals("0") || right.equals("0"))) {
                    agregarWarning("Operación redundante '" + left + " + " + right + "' en línea " + ctx.start.getLine());
                }
            }
        }
    }

    public void verificarVariablesNoUsadas() {
        for (Simbolo simbolo : tabla.getTabla()) {
            // *** ACTUALIZADO: Solo verificar variables y parámetros, no funciones ***
            if ((simbolo.getCategoria() == Simbolo.Categoria.VARIABLE || 
                 simbolo.getCategoria() == Simbolo.Categoria.PARAMETRO) && 
                !simbolo.isUsada()) {
                agregarWarning("Variable '" + simbolo.getNombre() + "' declarada pero no utilizada en línea " + simbolo.getLinea());
            }
        }
    }

    // Nuevo método: verificar funciones no usadas
    public void verificarFuncionesNoUsadas() {
        for (Simbolo simbolo : tabla.getTabla()) {
            if (simbolo.getCategoria() == Simbolo.Categoria.FUNCION
                && !simbolo.getNombre().equals("main")
                && !simbolo.isUsada()) {
                agregarWarning("Función '" + simbolo.getNombre() +
                               "' declarada pero no llamada en línea " + simbolo.getLinea());
            }
        }
    }

    public void agregarWarning(String mensaje) {
        errores.add("Warning: " + mensaje);
    }
}