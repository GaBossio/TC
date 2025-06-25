package com.compilador;

import java.util.List;

/**
 * Representa una entrada en la Tabla de Símbolos.
 */
public class Simbolo {
    private final String nombre;
    private final String tipo;
    private final Categoria categoria;
    private final int linea;
    private final int columna;
    private final String ambito;
    private final List<String> parametros;

    public enum Categoria {
        VARIABLE,
        FUNCION,
        PARAMETRO,
        CONSTANTE
    }

    public Simbolo(String nombre, String tipo, Categoria categoria,
                   int linea, int columna, String ambito, List<String> parametros) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.categoria = categoria;
        this.linea = linea;
        this.columna = columna;
        this.ambito = ambito;
        this.parametros = parametros;
    }

    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public Categoria getCategoria() { return categoria; }
    public int getLinea() { return linea; }
    public int getColumna() { return columna; }
    public String getAmbito() { return ambito; }
    public List<String> getParametros() { return parametros; }

    @Override
    public String toString() {
        return String.format("%-10s %-8s %-10s %4d %4d %-8s %s",
            nombre, tipo, categoria, linea, columna, ambito,
            parametros != null ? parametros : "[]");
    }
}