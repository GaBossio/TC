package com.compilador;

import java.util.ArrayList;
import java.util.List;

public class GeneradorCodigo {
    private int tempCount = 0;
    private int labelCount = 0;
    private final List<String> instrucciones = new ArrayList<>();

    public String newTemp() {
        return "t" + (tempCount++);
    }

    public String newLabel() {
        return "L" + (labelCount++);
    }

    public void emit(String instr) {
        instrucciones.add(instr);
    }

    public List<String> getInstrucciones() {
        return instrucciones;
    }
}
