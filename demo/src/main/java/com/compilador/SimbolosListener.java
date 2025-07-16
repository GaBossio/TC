package com.compilador;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import com.compilador.MiLenguajeParser.*;
import com.compilador.MiLenguajeLexer.*;

public class SimbolosListener extends MiLenguajeBaseListener {
    private final TablaSimbolos tabla = new TablaSimbolos();
    private final List<String> errores = new ArrayList<>();

    public TablaSimbolos getTablaSimbolos() { return tabla; }
    public List<String> getErrores() { return errores; }

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
            linea, col, "global", params
        );
        try {
            tabla.agregar(funcion);
        } catch (RuntimeException e) {
            errores.add(e.getMessage());
        }

        tabla.setAmbito(nombre);
    }

    @Override
    public void exitDeclaracionFuncion(DeclaracionFuncionContext ctx) {
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
            linea, col, tabla.getAmbito(), null
        );
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

    // Ejemplo de warning
    public void agregarWarning(String mensaje) {
        errores.add("Warning: " + mensaje);
    }

    @Override
    public void enterAsignacion(AsignacionContext ctx) {
        // Verificar que la variable del lado izquierdo esté declarada
        String nombre = ctx.ID().getText();
        try {
            Simbolo simbolo = tabla.buscar(nombre);
            if (simbolo.getCategoria() != Simbolo.Categoria.VARIABLE) {
                errores.add("'" + nombre + "' no es una variable válida para asignación en línea " + 
                          ctx.start.getLine());
            }
        } catch (RuntimeException e) {
            errores.add("Variable '" + nombre + "' no declarada para asignación en línea " + 
                      ctx.start.getLine());
        }
    }
}