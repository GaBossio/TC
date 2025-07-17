// Generated from com/compilador/MiLenguaje.g4 by ANTLR 4.13.1
package com.compilador;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiLenguajeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiLenguajeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MiLenguajeParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#elemento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemento(MiLenguajeParser.ElementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#incluide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncluide(MiLenguajeParser.IncluideContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#libreria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibreria(MiLenguajeParser.LibreriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#listaParametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParametros(MiLenguajeParser.ListaParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(MiLenguajeParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(MiLenguajeParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#declaracionOInstruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionOInstruccion(MiLenguajeParser.DeclaracionOInstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#instruccionSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccionSimple(MiLenguajeParser.InstruccionSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#llamadaFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaFuncion(MiLenguajeParser.LlamadaFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#sentenciaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaExpr(MiLenguajeParser.SentenciaExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(MiLenguajeParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(MiLenguajeParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#asignacionCompuesta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacionCompuesta(MiLenguajeParser.AsignacionCompuestaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#sentenciaIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaIf(MiLenguajeParser.SentenciaIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#bucles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucles(MiLenguajeParser.BuclesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(MiLenguajeParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(MiLenguajeParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(MiLenguajeParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(MiLenguajeParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(MiLenguajeParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expresionLogica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionLogica(MiLenguajeParser.ExpresionLogicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expresionComparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionComparacion(MiLenguajeParser.ExpresionComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expresionAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionAritmetica(MiLenguajeParser.ExpresionAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expresionUnaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionUnaria(MiLenguajeParser.ExpresionUnariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expresionPostfijo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionPostfijo(MiLenguajeParser.ExpresionPostfijoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expresionPrimaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionPrimaria(MiLenguajeParser.ExpresionPrimariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(MiLenguajeParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionFuncion(MiLenguajeParser.DeclaracionFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#declaracionVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionVariable(MiLenguajeParser.DeclaracionVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#sentenciaRetorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaRetorno(MiLenguajeParser.SentenciaRetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#sentenciaBreak}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaBreak(MiLenguajeParser.SentenciaBreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#sentenciaContinue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaContinue(MiLenguajeParser.SentenciaContinueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(MiLenguajeParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MiLenguajeParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#operadorAritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorAritmetico(MiLenguajeParser.OperadorAritmeticoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#operadorComparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorComparacion(MiLenguajeParser.OperadorComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#operadorLogico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorLogico(MiLenguajeParser.OperadorLogicoContext ctx);
}