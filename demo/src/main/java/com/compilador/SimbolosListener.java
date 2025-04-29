package com.compilador;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Listener para construir la tabla de símbolos durante el análisis del AST
 */
public class SimbolosListener extends MiLenguajeBaseListener {
    
    private TablaSimbolos tablaSimbolos;
    private List<String> errores;
    
    public SimbolosListener() {
        this.tablaSimbolos = new TablaSimbolos();
        this.errores = new ArrayList<>();
    }
    
    /**
     * Obtiene la tabla de símbolos construida
     */
    public TablaSimbolos getTablaSimbolos() {
        return tablaSimbolos;
    }
    
    /**
     * Obtiene la lista de errores semánticos
     */
    public List<String> getErrores() {
        return errores;
    }
    
    /**
     * Cuando se encuentra una declaración de función
     */
    @Override
    public void enterDeclaracionFuncion(MiLenguajeParser.DeclaracionFuncionContext ctx) {
        // Obtener información de la función
        String nombre = ctx.ID().getText();
        String tipo = ctx.tipo().getText();
        int linea = ctx.ID().getSymbol().getLine();
        int columna = ctx.ID().getSymbol().getCharPositionInLine();
        
        // Crear símbolo para la función
        TablaSimbolos.Simbolo simbolo = new TablaSimbolos.Simbolo(
            nombre, tipo, "funcion", linea, columna, "global"
        );
        
        // Agregar parámetros si existen
        if (ctx.parametros() != null) {
            for (MiLenguajeParser.ParametroContext paramCtx : ctx.parametros().parametro()) {
                String tipoParam = paramCtx.tipo().getText();
                String nombreParam = paramCtx.ID().getText();
                
                // Agregar tipo de parámetro a la función
                simbolo.addParametro(tipoParam);
                
                // Crear símbolo para el parámetro
                TablaSimbolos.Simbolo paramSimbolo = new TablaSimbolos.Simbolo(
                    nombreParam, tipoParam, "parametro", 
                    paramCtx.ID().getSymbol().getLine(),
                    paramCtx.ID().getSymbol().getCharPositionInLine(),
                    nombre  // El ámbito del parámetro es el nombre de la función
                );
                
                // Agregar el parámetro a la tabla de símbolos
                if (!tablaSimbolos.agregar(paramSimbolo)) {
                    errores.add("Error semántico en línea " + paramCtx.ID().getSymbol().getLine() + 
                              ": Parámetro duplicado '" + nombreParam + "'");
                }
            }
        }
        
        // Agregar la función a la tabla de símbolos
        if (!tablaSimbolos.agregar(simbolo)) {
            errores.add("Error semántico en línea " + linea + 
                      ": Función '" + nombre + "' ya declarada");
        }
        
        // Cambiar el ámbito actual
        tablaSimbolos.setAmbito(nombre);
    }
    
    /**
     * Al salir de una declaración de función
     */
    @Override
    public void exitDeclaracionFuncion(MiLenguajeParser.DeclaracionFuncionContext ctx) {
        // Restaurar el ámbito global
        tablaSimbolos.setAmbito("global");
    }
    
    /**
     * Cuando se encuentra una referencia a una variable
     */
    @Override
    public void enterExpVariable(MiLenguajeParser.ExpVariableContext ctx) {
        String nombre = ctx.ID().getText();
        TablaSimbolos.Simbolo simbolo = tablaSimbolos.buscar(nombre);
        
        if (simbolo == null) {
            errores.add("Error semántico en línea " + ctx.ID().getSymbol().getLine() + 
                      ": Variable o función '" + nombre + "' no declarada");
        }
    }
    
    /**
     * Al encontrar un nodo de error en el árbol de análisis sintáctico
     */
    @Override
    public void visitErrorNode(ErrorNode node) {
        errores.add("Error sintáctico en token: " + node.getText());
    }
}