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

        tabla.setAmbito(nombre);
    }

    @Override
    public void exitDeclaracionFuncion(DeclaracionFuncionContext ctx) {
        String nombre = ctx.ID().getText();
        
        
        if (nombre.equals("main")) {
            tabla.setAmbito("global");
            return;
        }
        
        try {
            Simbolo simbolo = tabla.buscar(nombre);
            if (!simbolo.isUsada()) {
                agregarWarning("Función '" + nombre + "' declarada pero no llamada en línea " + ctx.start.getLine());
            }
        } catch (RuntimeException e) {
        }
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
                if (simbolo.getCategoria() != Simbolo.Categoria.VARIABLE) {
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
        // Verificar que la variable del lado izquierdo esté declarada
        String nombre = ctx.ID().getText();
        try {
            Simbolo simbolo = tabla.buscar(nombre);
            simbolo.setUsada(true);
            if (simbolo.getCategoria() != Simbolo.Categoria.VARIABLE) {
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

    @Override
    public void enterExpresionAritmetica(ExpresionAritmeticaContext ctx) {
        // Verificar si hay operadores aritméticos
        if (!ctx.operadorAritmetico().isEmpty()) {
            for (int i = 0; i < ctx.operadorAritmetico().size(); i++) {
                String operador = ctx.operadorAritmetico(i).getText();
                String left = ctx.expresionUnaria(i).getText();
                String right = ctx.expresionUnaria(i + 1).getText();

                // Detectar operaciones redundantes
                if (operador.equals("+") && (left.equals("0") || right.equals("0"))) {
                    agregarWarning("Operación redundante '" + left + " + " + right + "' en línea " + ctx.start.getLine());
                }
            }
        }
    }

    public void verificarVariablesNoUsadas() {
        for (Simbolo simbolo : tabla.getTabla()) {
            if (simbolo.getCategoria() == Simbolo.Categoria.VARIABLE && !simbolo.isUsada()) {
                agregarWarning("Variable '" + simbolo.getNombre() + "' declarada pero no utilizada en línea " + simbolo.getLinea());
            }
        }
    }

    public void agregarWarning(String mensaje) {
        errores.add("Warning: " + mensaje);
    }
}