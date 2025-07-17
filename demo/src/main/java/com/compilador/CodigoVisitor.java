package com.compilador;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.tree.TerminalNode;
import com.compilador.MiLenguajeParser.*;

public class CodigoVisitor extends MiLenguajeBaseVisitor<String> {
    private final GeneradorCodigo gen = new GeneradorCodigo();
    // *** NUEVO: Para propagación de constantes ***
    private final Map<String, String> constantesPropagadas = new HashMap<>();
    private int optimizacionesAplicadas = 0;

    public GeneradorCodigo getGen() {
        return gen;
    }

    @Override
    public String visitProgram(MiLenguajeParser.ProgramContext ctx) {
        // Genera código para cada elemento (funciones y declaraciones)
        for (MiLenguajeParser.ElementoContext e : ctx.elemento()) {
            visit(e);
        }

        // *** MANTENER: Mostrar el código intermedio original ***
        System.out.println("\n=== Código Intermedio (3 direcciones) ===");
        List<String> instrs = gen.getInstrucciones();
        for (int i = 0; i < instrs.size(); i++) {
            System.out.printf("%2d: %s%n", i, instrs.get(i));
        }

        // *** NUEVO: Aplicar y mostrar optimizaciones ***
        aplicarOptimizaciones();

        return null;
    }

    @Override
    public String visitAsignacion(MiLenguajeParser.AsignacionContext ctx) {
        String id = ctx.ID().getText();
        String valor = visit(ctx.expresion());
        
        // *** PROPAGACIÓN DE CONSTANTES ***
        if (esConstante(valor)) {
            constantesPropagadas.put(id, valor);
            gen.emit(id + " = " + valor);
        } else {
            // Eliminar de constantes si ya no es constante
            constantesPropagadas.remove(id);
            gen.emit(id + " = " + valor);
        }
        return id;
    }

    @Override
    public String visitExpresionPrimaria(MiLenguajeParser.ExpresionPrimariaContext ctx) {
        if (ctx.ID() != null) {
            String nombre = ctx.ID().getText();
            // *** PROPAGAR CONSTANTE SI EXISTE ***
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
    public String visitExpresionAritmetica(MiLenguajeParser.ExpresionAritmeticaContext ctx) {
        // caso un solo operando
        if (ctx.operadorAritmetico().isEmpty()) {
            return visit(ctx.expresionUnaria(0));
        }
        
        // Empieza por la izquierda
        String result = visit(ctx.expresionUnaria(0));
        
        // Procesa de izquierda a derecha
        for (int i = 1; i < ctx.expresionUnaria().size(); i++) {
            String op = ctx.operadorAritmetico(i-1).getText();
            String right = visit(ctx.expresionUnaria(i));
            
            // *** SIMPLIFICACIÓN DE EXPRESIONES ***
            String simplificado = simplificarExpresion(result, op, right);
            if (simplificado != null) {
                optimizacionesAplicadas++;
                result = simplificado;
                continue;
            }

            // *** PROPAGACIÓN DE CONSTANTES: Evaluar expresiones constantes ***
            if (esConstante(result) && esConstante(right)) {
                try {
                    double resultado = evaluarConstantes(result, op, right);
                    String valorCalculado = formatearResultado(resultado);
                    optimizacionesAplicadas++;
                    result = valorCalculado;
                    continue;
                } catch (Exception e) {
                    // Si hay error, continuar con código normal
                }
            }
            
            // Division por 0 check
            if (op.equals("/") || op.equals("%")) {
                if (right.equals("0")) {
                    System.err.println("ERROR: División por cero detectada en tiempo de compilación");
                    throw new RuntimeException("División por cero no permitida");
                }
                else if (!isNumericLiteral(right)) {
                    String checkLabel = gen.newLabel();
                    String errorLabel = gen.newLabel();
                    
                    gen.emit("if " + right + " != 0 goto " + checkLabel);
                    gen.emit("goto " + errorLabel);
                    gen.emit(errorLabel + ":");
                    gen.emit("error \"División por cero\"");
                    gen.emit("halt");
                    gen.emit(checkLabel + ":");
                }
            }
            
            // Genera la operacion normal
            String temp = gen.newTemp();
            gen.emit(temp + " = " + result + " " + op + " " + right);
            result = temp;
        }
        return result;
    }

    // *** NUEVO: Método de simplificación de expresiones ***
    private String simplificarExpresion(String left, String op, String right) {
        switch (op) {
            case "+":
                if (left.equals("0")) return right;  // 0 + x = x
                if (right.equals("0")) return left;  // x + 0 = x
                break;
            case "-":
                if (right.equals("0")) return left;  // x - 0 = x
                if (left.equals(right)) return "0";  // x - x = 0
                break;
            case "*":
                if (left.equals("0") || right.equals("0")) return "0";  // x * 0 = 0
                if (left.equals("1")) return right;  // 1 * x = x
                if (right.equals("1")) return left;  // x * 1 = x
                break;
            case "/":
                if (right.equals("1")) return left;  // x / 1 = x
                if (left.equals(right) && !left.equals("0")) return "1";  // x / x = 1
                break;
        }
        return null;
    }

    // *** NUEVO: Verificar si es una constante ***
    private boolean esConstante(String valor) {
        try {
            Double.parseDouble(valor);
            return true;
        } catch (NumberFormatException e) {
            return valor.equals("true") || valor.equals("false");
        }
    }

    // *** NUEVO: Evaluar expresiones constantes ***
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

    // *** NUEVO: Formatear resultado ***
    private String formatearResultado(double resultado) {
        if (resultado == (long) resultado) {
            return String.valueOf((long) resultado);
        } else {
            return String.valueOf(resultado);
        }
    }

    // *** NUEVO: Aplicar optimizaciones al final ***
    private void aplicarOptimizaciones() {
        if (optimizacionesAplicadas > 0) {
            ColorLogger.subtitulo("OPTIMIZACIONES APLICADAS");
            ColorLogger.exito("Se aplicaron " + optimizacionesAplicadas + " optimizaciones durante la generación");
        }
        
        // Crear una copia de las instrucciones para optimizar
        List<String> instruccionesOriginales = List.copyOf(gen.getInstrucciones());
        
        // Aplicar eliminación de código muerto
        OptimizadorCodigoMuerto optimizador = new OptimizadorCodigoMuerto();
        List<String> instruccionesOptimizadas = optimizador.eliminarCodigoMuerto(instruccionesOriginales);
        
        // Solo mostrar si hay diferencias
        if (instruccionesOptimizadas.size() != instruccionesOriginales.size()) {
            System.out.println("\n=== Código Intermedio Optimizado ===");
            for (int i = 0; i < instruccionesOptimizadas.size(); i++) {
                System.out.printf("%2d: %s%n", i, instruccionesOptimizadas.get(i));
            }
            
            ColorLogger.info("Instrucciones eliminadas: " + (instruccionesOriginales.size() - instruccionesOptimizadas.size()));
        } else {
            ColorLogger.info("No se encontró código muerto para eliminar");
        }
    }

    // *** RESTO DEL CÓDIGO EXISTENTE SIN CAMBIOS ***
    @Override
    public String visitDeclaracionFuncion(MiLenguajeParser.DeclaracionFuncionContext ctx) {
        String name = ctx.ID().getText();
        gen.emit(name + ":");
        visit(ctx.bloque());
        return null;
    }

    @Override
    public String visitSentenciaIf(MiLenguajeParser.SentenciaIfContext ctx) {
        String cond = visit(ctx.expresion());
        String labelElse = gen.newLabel();
        String labelEnd  = gen.newLabel();

        gen.emit("ifFalse " + cond + " goto " + labelElse);
        visit(ctx.bloque(0));
        gen.emit("goto " + labelEnd);
        gen.emit(labelElse + ":");
        if (ctx.bloque(1) != null) {
            visit(ctx.bloque(1));
        }
        gen.emit(labelEnd + ":");
        return null;
    }

    @Override
    public String visitWhileLoop(MiLenguajeParser.WhileLoopContext ctx) {
        String start = gen.newLabel();
        String end   = gen.newLabel();

        gen.emit(start + ":");
        String cond = visit(ctx.expresion());
        gen.emit("ifFalse " + cond + " goto " + end);
        visit(ctx.bloque());
        gen.emit("goto " + start);
        gen.emit(end + ":");
        return null;
    }

    @Override
    public String visitDeclaracionVariable(MiLenguajeParser.DeclaracionVariableContext ctx) {
        if (ctx.expresion() != null) {
            String temp = visit(ctx.expresion());
            gen.emit(ctx.ID().getText() + " = " + temp);
        }
        return null;
    }

    @Override
    public String visitExpresionUnaria(MiLenguajeParser.ExpresionUnariaContext ctx) {
        if (ctx.MENOS() != null) {
            String v = visit(ctx.expresionUnaria());
            String temp = gen.newTemp();
            gen.emit(temp + " = 0 - " + v);
            return temp;
        }
        if (ctx.NO_LOGICO() != null) {
            String v = visit(ctx.expresionUnaria());
            String temp = gen.newTemp();
            gen.emit(temp + " = !" + v);
            return temp;
        }
        return visit(ctx.expresionPostfijo());
    }

    @Override
    public String visitExpresionPostfijo(MiLenguajeParser.ExpresionPostfijoContext ctx) {
        if (ctx.INCREMENTO() != null || ctx.DECREMENTO() != null) {
            String id = ctx.expresionPrimaria().getText();
            String op = ctx.INCREMENTO() != null ? " + 1" : " - 1";
            String temp = gen.newTemp();
            gen.emit(temp + " = " + id + op);
            gen.emit(id + " = " + temp);
            return temp;
        }
        return visit(ctx.expresionPrimaria());
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

    private boolean isNumericLiteral(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
