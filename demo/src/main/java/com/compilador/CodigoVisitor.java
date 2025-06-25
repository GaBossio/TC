package com.compilador;

import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;
// + estas importaciones para los contextos anidados:
import com.compilador.MiLenguajeParser.AsignacionContext;
import com.compilador.MiLenguajeParser.DeclaracionVariableContext;
import com.compilador.MiLenguajeParser.ExpresionAritmeticaContext;
import com.compilador.MiLenguajeParser.ExpresionUnariaContext;
import com.compilador.MiLenguajeParser.ExpresionPostfijoContext;

public class CodigoVisitor extends MiLenguajeBaseVisitor<String> {
    private final GeneradorCodigo gen = new GeneradorCodigo();

    public GeneradorCodigo getGen() {
        return gen;
    }

    @Override
    public String visitProgram(MiLenguajeParser.ProgramContext ctx) {
        // Genera código para cada elemento (funciones y declaraciones)
        for (MiLenguajeParser.ElementoContext e : ctx.elemento()) {
            visit(e);
        }

        // Mostrar el código intermedio UNA sola vez
        System.out.println("\n=== Código Intermedio (3 direcciones) ===");
        List<String> instrs = gen.getInstrucciones();
        for (int i = 0; i < instrs.size(); i++) {
            System.out.printf("%2d: %s%n", i, instrs.get(i));
        }
        return null;
    }

    @Override
    public String visitDeclaracionFuncion(MiLenguajeParser.DeclaracionFuncionContext ctx) {
        // Emitir etiqueta de función solo una vez
        String name = ctx.ID().getText();
        gen.emit(name + ":");
        // Generar código del bloque de la función
        visit(ctx.bloque());
        return null;
    }

    @Override
    public String visitSentenciaIf(MiLenguajeParser.SentenciaIfContext ctx) {
        String cond = visit(ctx.expresion());
        String labelElse = gen.newLabel();
        String labelEnd  = gen.newLabel();

        gen.emit("ifFalse " + cond + " goto " + labelElse);
        visit(ctx.bloque(0));               // THEN
        gen.emit("goto " + labelEnd);
        gen.emit(labelElse + ":");
        if (ctx.bloque(1) != null) {
            visit(ctx.bloque(1));           // ELSE
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
        // si viene con inicialización, la procesamos
        if (ctx.expresion() != null) {
            String temp = visit(ctx.expresion());
            gen.emit(ctx.ID().getText() + " = " + temp);
        }
        return null;
    }

    @Override
    public String visitAsignacion(MiLenguajeParser.AsignacionContext ctx) {
        String id = ctx.ID().getText();
        String temp = visit(ctx.expresion());
        gen.emit(id + " = " + temp);
        return id;
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
            
            // Division por 0
            if (op.equals("/") || op.equals("%")) {
                if (right.equals("0")) {
                    System.err.println("ERROR: División por cero detectada en tiempo de compilación");
                    System.err.println("Operación: " + result + " " + op + " " + right);
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
            
            // Genera la operacion = codigo derecha
            String temp = gen.newTemp();
            gen.emit(temp + " = " + result + " " + op + " " + right);
            result = temp;  // Actualiza para la prox iteración
        }
        return result;
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
        // caso postfijo o primaria
        return visit(ctx.expresionPostfijo());
    }

    @Override
    public String visitExpresionPostfijo(MiLenguajeParser.ExpresionPostfijoContext ctx) {
        if (ctx.INCREMENTO() != null || ctx.DECREMENTO() != null) {
            // ++x o x++
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
    public String visitExpresionPrimaria(MiLenguajeParser.ExpresionPrimariaContext ctx) {
        if (ctx.ID() != null) {
            return ctx.ID().getText();
        } else if (ctx.literal() != null) {
            return visit(ctx.literal());
        } else if (ctx.expresion() != null) {
            return visit(ctx.expresion());
        }
        return "";
    }

    @Override
    public String visitExpresionComparacion(MiLenguajeParser.ExpresionComparacionContext ctx) {
        // caso un solo operando
        if (ctx.operadorComparacion().isEmpty()) {
            return visit(ctx.expresionAritmetica(0));
        }
        // izquierda
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
        // caso un solo operando
        if (ctx.operadorLogico().isEmpty()) {
            return visit(ctx.expresionComparacion(0));
        }
        // izquierda
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

    // Dejar ppara recorrer hijos
    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        return nextResult != null ? nextResult : aggregate;
    }

    // verifica si es un literal numérico
    private boolean isNumericLiteral(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
