package com.compilador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Gestión de la Tabla de Símbolos con soporte de ámbitos.
 */
public class TablaSimbolos {
    private final List<Simbolo> tabla = new ArrayList<>();
    private String ambitoActual = "global";

    public void setAmbito(String ambito) {
        this.ambitoActual = ambito;
    }

    public String getAmbito() {
        return ambitoActual;
    }

    public void agregar(Simbolo simbolo) {
        Optional<Simbolo> existente = tabla.stream()
            .filter(s -> s.getNombre().equals(simbolo.getNombre())
                      && s.getAmbito().equals(simbolo.getAmbito()))
            .findFirst();
        if (existente.isPresent()) {
            throw new RuntimeException("Simbolo duplicado: " + simbolo.getNombre()
                                       + " en ambito " + simbolo.getAmbito());
        }
        tabla.add(simbolo);
    }

    public Simbolo buscar(String nombre) {
        for (Simbolo s : tabla) {
            if (s.getNombre().equals(nombre)
                && s.getAmbito().equals(ambitoActual)) {
                return s;
            }
        }
        for (Simbolo s : tabla) {
            if (s.getNombre().equals(nombre)
                && s.getAmbito().equals("global")) {
                return s;
            }
        }
        throw new RuntimeException("Simbolo no declarado: " + nombre);
    }

    public void imprimir() {
        System.out.println("=== TABLA DE SIMBOLOS ===");
        System.out.printf("%-10s %-8s %-10s %4s %4s %-8s %s%n",
            "NOMBRE","TIPO","CATEGORIA","LINEA","COL","AMBITO","PARAMETROS");
        System.out.println("----------------------------------------------------------------");
        tabla.forEach(s -> System.out.println(s.toString()));
    }

    public List<Simbolo> getTabla() {
        return tabla;
    }
}