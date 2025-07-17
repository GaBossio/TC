package com.compilador;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OptimizadorCodigoMuerto {
    private List<String> instrucciones;
    private final Set<String> variablesUsadas = new HashSet<>();
    private final Set<String> etiquetasUsadas = new HashSet<>();
    
    public List<String> eliminarCodigoMuerto(List<String> instrucciones) {
        this.instrucciones = new ArrayList<>(instrucciones);
        
        // Paso 1: Marcar variables y etiquetas usadas
        marcarVariablesUsadas();
        marcarEtiquetasUsadas();
        
        // Paso 2: Solo eliminar código después de return (más conservador)
        int eliminadas = eliminarCodigoDespuesReturn();
        
        // Paso 3: Eliminar etiquetas no referenciadas
        eliminadas += eliminarEtiquetasInutiles();
        
        if (eliminadas > 0) {
            ColorLogger.exito("Eliminadas " + eliminadas + " instrucciones de código muerto");
        }
        
        return this.instrucciones;
    }
    
    private void marcarVariablesUsadas() {
        for (String instr : instrucciones) {
            if (instr.contains(" = ") && !instr.contains(":")) {
                String[] partes = instr.split(" = ");
                if (partes.length == 2) {
                    marcarVariablesEnExpresion(partes[1]);
                }
            }
            if (instr.startsWith("if") || instr.startsWith("ifFalse")) {
                marcarVariablesEnExpresion(instr);
            }
            if (instr.startsWith("return")) {
                marcarVariablesEnExpresion(instr);
            }
        }
    }
    
    private void marcarEtiquetasUsadas() {
        for (String instr : instrucciones) {
            if (instr.contains("goto ")) {
                String[] partes = instr.split("goto ");
                if (partes.length == 2) {
                    String etiqueta = partes[1].trim();
                    etiquetasUsadas.add(etiqueta);
                }
            }
        }
    }
    
    private void marcarVariablesEnExpresion(String expresion) {
        String[] tokens = expresion.split("\\s+");
        for (String token : tokens) {
            if (esIdentificador(token) && !esNumero(token) && !esOperador(token)) {
                variablesUsadas.add(token);
            }
        }
    }
    
    private int eliminarCodigoDespuesReturn() {
        int eliminadas = 0;
        List<String> nuevasInstrucciones = new ArrayList<>();
        boolean eliminarHasta = false;
        
        for (String instr : instrucciones) {
            if (eliminarHasta) {
                if (instr.contains(":") && !instr.contains(" = ")) {
                    eliminarHasta = false;
                    nuevasInstrucciones.add(instr);
                } else {
                    eliminadas++;
                }
            } else {
                nuevasInstrucciones.add(instr);
                if (instr.trim().startsWith("return")) {
                    eliminarHasta = true;
                }
            }
        }
        
        instrucciones = nuevasInstrucciones;
        return eliminadas;
    }
    
    private int eliminarEtiquetasInutiles() {
        int eliminadas = 0;
        List<String> nuevasInstrucciones = new ArrayList<>();
        
        for (String instr : instrucciones) {
            boolean mantener = true;
            
            if (instr.contains(":") && !instr.contains(" = ")) {
                String etiqueta = instr.replace(":", "").trim();
                if (!etiquetasUsadas.contains(etiqueta) && !etiqueta.equals("main")) {
                    mantener = false;
                    eliminadas++;
                }
            }
            
            if (mantener) {
                nuevasInstrucciones.add(instr);
            }
        }
        
        instrucciones = nuevasInstrucciones;
        return eliminadas;
    }
    
    private boolean esIdentificador(String token) {
        return token.matches("[a-zA-Z][a-zA-Z0-9_]*");
    }
    
    private boolean esNumero(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    private boolean esOperador(String token) {
        return token.matches("[+\\-*/%()==!<>&|]+");
    }
}