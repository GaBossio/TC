package com.compilador;

import com.compilador.MiLenguajeParser.*;

public class CodigoVisitor extends MiLenguajeBaseVisitor<String> {
    private final GeneradorCodigo gen = new GeneradorCodigo();

    public GeneradorCodigo getGen() {
        return gen;
    }

    @Override
    public String visitDeclaracionVariable(DeclaracionVariableContext ctx) {
        // si viene con inicialización, la procesamos
        if (ctx.expresion() != null) {
            String temp = visit(ctx.expresion());
            gen.emit(ctx.ID().getText() + " = " + temp);
        }
        return null;
    }

    @Override
    public String visitAsignacion(AsignacionContext ctx) {
        String id = ctx.ID().getText();
        String temp = visit(ctx.expresion());
        gen.emit(id + " = " + temp);
        return id;
    }

    @Override
    public String visitExpresionAritmetica(ExpresionAritmeticaContext ctx) {
        // caso un solo operando
        if (ctx.operadorAritmetico().isEmpty()) {
            return visit(ctx.expresionUnaria(0));
        }
        // izquierda
        String left = visit(ctx.expresionUnaria(0));
        for (int i = 1; i < ctx.expresionUnaria().size(); i++) {
            String op = ctx.operadorAritmetico(i-1).getText();
            String right = visit(ctx.expresionUnaria(i));
            String temp = gen.newTemp();
            gen.emit(temp + " = " + left + " " + op + " " + right);
            left = temp;
        }
        return left;
    }

    @Override
    public String visitExpresionUnaria(ExpresionUnariaContext ctx) {
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
    public String visitExpresionPostfijo(ExpresionPostfijoContext ctx) {
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
        return ""; // fallback
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
        return ""; // fallback
    }

    @Override
    public String visitSentenciaIf(SentenciaIfContext ctx) {
        String cond = visit(ctx.expresion());
        String labelElse = gen.newLabel();
        String labelEnd  = gen.newLabel();

        gen.emit("ifFalse " + cond + " goto " + labelElse);
        visit(ctx.bloque(0));  // bloque THEN
        gen.emit("goto " + labelEnd);
        gen.emit(labelElse + ":");
        if (ctx.bloque(1) != null) {
            visit(ctx.bloque(1));  // bloque ELSE
        }
        gen.emit(labelEnd + ":");
        return null;
    }

    @Override
    public String visitWhileLoop(WhileLoopContext ctx) {
        String startLabel = gen.newLabel();
        String endLabel   = gen.newLabel();

        gen.emit(startLabel + ":");
        String cond = visit(ctx.expresion());
        gen.emit("ifFalse " + cond + " goto " + endLabel);
        visit(ctx.bloque());
        gen.emit("goto " + startLabel);
        gen.emit(endLabel + ":");
        return null;
    }

    @Override
    public String visitDeclaracionFuncion(DeclaracionFuncionContext ctx) {
        String name = ctx.ID().getText();
        gen.emit(name + ":");
        visit(ctx.bloque());
        return null;
    }

    // Dejar por defecto recorrer hijos
    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        return nextResult != null ? nextResult : aggregate;
    }
}
