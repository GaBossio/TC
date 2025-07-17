package com.compilador;

import java.util.ArrayList;
import java.util.List;

public class GeneradorCodigo {
    private final List<String> instrucciones = new ArrayList<>();
    private int contadorTemporales = 0;
    private int contadorEtiquetas = 0;

    public void emit(String instruccion) {
        instrucciones.add(instruccion);
    }

    public String newTemp() {
        return "t" + (++contadorTemporales);
    }

    public String newLabel() {
        return "L" + (++contadorEtiquetas);
    }

    public int getContadorEtiquetas() {
        return ++contadorEtiquetas;
    }

    public List<String> getInstrucciones() {
        return new ArrayList<>(instrucciones);
    }
}