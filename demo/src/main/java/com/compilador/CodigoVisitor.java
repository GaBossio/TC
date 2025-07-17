package com.compilador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.tree.TerminalNode;
import com.compilador.MiLenguajeParser.*;

public class CodigoVisitor extends MiLenguajeBaseVisitor<String> {
    private final GeneradorCodigo gen = new GeneradorCodigo();
    private final Map<String, String> constantesPropagadas = new HashMap<>();
    private int optimizacionesAplicadas = 0;
    private boolean enMain = false;

    public GeneradorCodigo getGen() {
        return gen;
    }

    @Override
    public String visitProgram(MiLenguajeParser.ProgramContext ctx) {
        // Encabezado del programa
        gen.emit("// Código de tres direcciones generado");
        gen.emit("PROGRAMA_INICIO:");
        gen.emit("// Declaración de variables globales");
        
        // Procesar elementos del programa
        for (MiLenguajeParser.ElementoContext e : ctx.elemento()) {
            visit(e);
        }
        
        // Final del programa
        gen.emit("PROGRAMA_FIN:");

        // Mostrar código intermedio
        System.out.println("\n=== Código Intermedio (3 direcciones) ===");
        List<String> instrs = gen.getInstrucciones();
        for (int i = 0; i < instrs.size(); i++) {
            System.out.printf("%3d: %s%n", i, instrs.get(i));
        }

        aplicarOptimizaciones();
        return null;
    }

    @Override
    public String visitDeclaracionVariable(MiLenguajeParser.DeclaracionVariableContext ctx) {
        String nombreVariable = ctx.ID().getText();
        String tipoVariable = ctx.tipo().getText();
        
        if (ctx.expresion() != null) {
            // Variable con inicialización
            String temp = visit(ctx.expresion());
            gen.emit(nombreVariable + " = " + temp);
        } else {
            // Variable sin inicialización - solo declarar
            if (!enMain) {
                // Variables globales
                gen.emit("DECLARE " + nombreVariable + " " + tipoVariable);
            } else {
                // Variables locales
                gen.emit("DECLARE " + nombreVariable + " " + tipoVariable);
            }
        }
        return null;
    }

    @Override
    public String visitDeclaracionFuncion(MiLenguajeParser.DeclaracionFuncionContext ctx) {
        String nombre = ctx.ID().getText();
        
        if (nombre.equals("main")) {
            enMain = true;
            gen.emit("func_main:");
        } else {
            gen.emit("func_" + nombre + ":");
        }
        
        // Agregar parámetros si existen
        if (ctx.listaParametros() != null) {
            for (ParametroContext param : ctx.listaParametros().parametro()) {
                String nombreParam = param.ID().getText();
                String tipoParam = param.tipo().getText();
                gen.emit("PARAM " + nombreParam + " " + tipoParam);
            }
        }
        
        visit(ctx.bloque());
        
        enMain = false;
        return null;
    }

    @Override
    public String visitAsignacion(MiLenguajeParser.AsignacionContext ctx) {
        String id = ctx.ID().getText();
        String valor = visit(ctx.expresion());
        
        if (esConstante(valor)) {
            constantesPropagadas.put(id, valor);
        } else {
            constantesPropagadas.remove(id);
        }
        
        gen.emit(id + " = " + valor);
        return id;
    }

    @Override
    public String visitExpresionPrimaria(MiLenguajeParser.ExpresionPrimariaContext ctx) {
        if (ctx.ID() != null) {
            String nombre = ctx.ID().getText();
            if (constantesPropagadas.containsKey(nombre)) {
                return constantesPropagadas.get(nombre);
            }
            return nombre;
        } else if (ctx.literal() != null) {
            return visit(ctx.literal());
        } else if (ctx.expresion() != null) {
            return visit(ctx.expresion());
        }
        return "";
    }

    @Override
    public String visitLlamadaFuncion(MiLenguajeParser.LlamadaFuncionContext ctx) {
        String nombreFuncion = ctx.ID().getText();
        
        // Generar parámetros de la llamada
        List<String> params = new ArrayList<>();
        if (ctx.expresion() != null && !ctx.expresion().isEmpty()) {
            for (MiLenguajeParser.ExpresionContext expr : ctx.expresion()) {
                String paramValue = visit(expr);
                if (paramValue != null && !paramValue.isEmpty()) {
                    params.add(paramValue);
                }
            }
        }
        
        // Emitir llamada a función con formato mejorado
        StringBuilder callBuilder = new StringBuilder();
        callBuilder.append("CALL func_").append(nombreFuncion);
        for (String param : params) {
            callBuilder.append(", ").append(param);
        }
        gen.emit(callBuilder.toString());
        
        // Generar variable temporal para el valor de retorno
        String temp = gen.newTemp();
        gen.emit(temp + " = RETURN_VALUE");
        
        return temp;
    }

    @Override
    public String visitExpresionAritmetica(MiLenguajeParser.ExpresionAritmeticaContext ctx) {
        if (ctx.operadorAritmetico().isEmpty()) {
            return visit(ctx.expresionUnaria(0));
        }
        
        String result = visit(ctx.expresionUnaria(0));
        
        for (int i = 1; i < ctx.expresionUnaria().size(); i++) {
            String op = ctx.operadorAritmetico(i-1).getText();
            String right = visit(ctx.expresionUnaria(i));
            
            // Simplificaciones
            String simplificado = simplificarExpresion(result, op, right);
            if (simplificado != null) {
                optimizacionesAplicadas++;
                result = simplificado;
                continue;
            }

            // Evaluación de constantes
            if (esConstante(result) && esConstante(right)) {
                try {
                    double resultado = evaluarConstantes(result, op, right);
                    String valorCalculado = formatearResultado(resultado);
                    optimizacionesAplicadas++;
                    result = valorCalculado;
                    continue;
                } catch (Exception e) {
                    // Continuar con código normal
                }
            }
            
            // Verificación de división por cero
            if (op.equals("/") || op.equals("%")) {
                if (right.equals("0")) {
                    System.err.println("ERROR: División por cero detectada");
                    throw new RuntimeException("División por cero no permitida");
                }
            }
            
            // Generar operación normal
            String temp = gen.newTemp();
            gen.emit(temp + " = " + result + " " + op + " " + right);
            result = temp;
        }
        return result;
    }

    @Override
    public String visitSentenciaIf(MiLenguajeParser.SentenciaIfContext ctx) {
        String cond = visit(ctx.expresion());
        String labelThen = "THEN_" + gen.getContadorEtiquetas();
        String labelEnd = "END_IF_" + gen.getContadorEtiquetas();
        
        String tempCond = gen.newTemp();
        gen.emit(tempCond + " = " + cond);
        gen.emit("if " + tempCond + " goto " + labelThen);
        gen.emit("goto " + labelEnd);
        gen.emit(labelThen + ":");
        
        visit(ctx.bloque(0));
        
        if (ctx.bloque(1) != null) {
            String labelElse = "ELSE_" + gen.getContadorEtiquetas();
            gen.emit("goto " + labelEnd);
            gen.emit(labelElse + ":");
            visit(ctx.bloque(1));
        }
        
        gen.emit(labelEnd + ":");
        return null;
    }

    @Override
    public String visitWhileLoop(MiLenguajeParser.WhileLoopContext ctx) {
        String start = "WHILE_START_" + gen.getContadorEtiquetas();
        String end = "WHILE_END_" + gen.getContadorEtiquetas();

        gen.emit(start + ":");
        String cond = visit(ctx.expresion());
        String tempCond = gen.newTemp();
        gen.emit(tempCond + " = " + cond);
        gen.emit("if " + tempCond + " goto " + end);
        
        visit(ctx.bloque());
        
        gen.emit("goto " + start);
        gen.emit(end + ":");
        return null;
    }

    @Override
    public String visitSentenciaRetorno(MiLenguajeParser.SentenciaRetornoContext ctx) {
        if (ctx.expresion() != null) {
            String valor = visit(ctx.expresion());
            gen.emit("return " + valor);
        } else {
            gen.emit("return");
        }
        return null;
    }

    // Métodos auxiliares (sin cambios significativos)
    private String simplificarExpresion(String left, String op, String right) {
        switch (op) {
            case "+":
                if (left.equals("0")) return right;
                if (right.equals("0")) return left;
                break;
            case "-":
                if (right.equals("0")) return left;
                if (left.equals(right)) return "0";
                break;
            case "*":
                if (left.equals("0") || right.equals("0")) return "0";
                if (left.equals("1")) return right;
                if (right.equals("1")) return left;
                break;
            case "/":
                if (right.equals("1")) return left;
                if (left.equals(right) && !left.equals("0")) return "1";
                break;
        }
        return null;
    }

    private boolean esConstante(String valor) {
        try {
            Double.parseDouble(valor);
            return true;
        } catch (NumberFormatException e) {
            return valor.equals("true") || valor.equals("false");
        }
    }

    private double evaluarConstantes(String left, String op, String right) {
        double l = Double.parseDouble(left);
        double r = Double.parseDouble(right);
        
        switch (op) {
            case "+": return l + r;
            case "-": return l - r;
            case "*": return l * r;
            case "/": 
                if (r == 0) throw new RuntimeException("División por cero");
                return l / r;
            case "%": 
                if (r == 0) throw new RuntimeException("División por cero");
                return l % r;
            default: throw new RuntimeException("Operador no soportado: " + op);
        }
    }

    private String formatearResultado(double resultado) {
        if (resultado == (long) resultado) {
            return String.valueOf((long) resultado);
        } else {
            return String.valueOf(resultado);
        }
    }

    private void aplicarOptimizaciones() {
        if (optimizacionesAplicadas > 0) {
            ColorLogger.subtitulo("OPTIMIZACIONES APLICADAS");
            ColorLogger.exito("Se aplicaron " + optimizacionesAplicadas + " optimizaciones durante la generación");
        }
        
        // *** SOLO MOSTRAR EN CONSOLA, NO DUPLICAR EN ARCHIVO ***
        List<String> instruccionesOriginales = List.copyOf(gen.getInstrucciones());
        
        OptimizadorCodigoMuerto optimizador = new OptimizadorCodigoMuerto();
        List<String> instruccionesOptimizadas = optimizador.eliminarCodigoMuerto(instruccionesOriginales);
        
        if (instruccionesOptimizadas.size() != instruccionesOriginales.size()) {
            System.out.println("\n=== Código Intermedio Optimizado ===");
            for (int i = 0; i < instruccionesOptimizadas.size(); i++) {
                System.out.printf("%3d: %s%n", i, instruccionesOptimizadas.get(i));
            }
            
            ColorLogger.info("Instrucciones eliminadas: " + (instruccionesOriginales.size() - instruccionesOptimizadas.size()));
            ColorLogger.info("Código completo guardado en 'output_codigo_intermedio.txt'");
        } else {
            ColorLogger.info("No se encontró código muerto para eliminar");
        }
    }

    // Resto de métodos visitXXX sin cambios...
    @Override
    public String visitExpresionUnaria(MiLenguajeParser.ExpresionUnariaContext ctx) {
        if (ctx.MENOS() != null) {
            String v = visit(ctx.expresionUnaria());
            if (v != null && !v.isEmpty()) {
                String temp = gen.newTemp();
                gen.emit(temp + " = 0 - " + v);
                return temp;
            }
        }
        if (ctx.NO_LOGICO() != null) {
            String v = visit(ctx.expresionUnaria());
            if (v != null && !v.isEmpty()) {
                String temp = gen.newTemp();
                gen.emit(temp + " = !" + v);
                return temp;
            }
        }
        
        if (ctx.expresionPostfijo() != null) {
            return visit(ctx.expresionPostfijo());
        }
        
        return "";
    }

    @Override
    public String visitExpresionPostfijo(MiLenguajeParser.ExpresionPostfijoContext ctx) {
        if (ctx.INCREMENTO() != null || ctx.DECREMENTO() != null) {
            if (ctx.expresionPrimaria() != null) {
                String id = ctx.expresionPrimaria().getText();
                String op = ctx.INCREMENTO() != null ? " + 1" : " - 1";
                String temp = gen.newTemp();
                gen.emit(temp + " = " + id + op);
                gen.emit(id + " = " + temp);
                return temp;
            }
        }
        
        if (ctx.llamadaFuncion() != null) {
            return visit(ctx.llamadaFuncion());
        }
        
        if (ctx.expresionPrimaria() != null) {
            return visit(ctx.expresionPrimaria());
        }
        
        return "";
    }

    @Override
    public String visitLiteral(MiLenguajeParser.LiteralContext ctx) {
        if (ctx.INT_LIT() != null) {
            return ctx.INT_LIT().getText();
        } else if (ctx.FLOAT_LIT() != null) {
            return ctx.FLOAT_LIT().getText();
        } else if (ctx.DOUBLE_LIT() != null) {
            return ctx.DOUBLE_LIT().getText();
        } else if (ctx.CHAR_LIT() != null) {
            return ctx.CHAR_LIT().getText();
        } else if (ctx.STRING_LIT() != null) {
            return ctx.STRING_LIT().getText();
        } else if (ctx.TRUE() != null) {
            return ctx.TRUE().getText();
        } else if (ctx.FALSE() != null) {
            return ctx.FALSE().getText();
        }
        return "";
    }

    @Override
    public String visitExpresionComparacion(MiLenguajeParser.ExpresionComparacionContext ctx) {
        if (ctx.operadorComparacion().isEmpty()) {
            return visit(ctx.expresionAritmetica(0));
        }
        String left = visit(ctx.expresionAritmetica(0));
        for (int i = 1; i < ctx.expresionAritmetica().size(); i++) {
            String op = ctx.operadorComparacion(i-1).getText();
            String right = visit(ctx.expresionAritmetica(i));
            String temp = gen.newTemp();
            gen.emit(temp + " = " + left + " " + op + " " + right);
            left = temp;
        }
        return left;
    }

    @Override
    public String visitExpresionLogica(MiLenguajeParser.ExpresionLogicaContext ctx) {
        if (ctx.operadorLogico().isEmpty()) {
            return visit(ctx.expresionComparacion(0));
        }
        String left = visit(ctx.expresionComparacion(0));
        for (int i = 1; i < ctx.expresionComparacion().size(); i++) {
            String op = ctx.operadorLogico(i-1).getText();
            String right = visit(ctx.expresionComparacion(i));
            String temp = gen.newTemp();
            gen.emit(temp + " = " + left + " " + op + " " + right);
            left = temp;
        }
        return left;
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        return nextResult != null ? nextResult : aggregate;
    }
}