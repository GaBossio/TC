// Generated from com\compilador\MiLenguaje.g4 by ANTLR 4.9.3
package com.compilador;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiLenguajeParser}.
 */
public interface MiLenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiLenguajeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiLenguajeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#elemento}.
	 * @param ctx the parse tree
	 */
	void enterElemento(MiLenguajeParser.ElementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#elemento}.
	 * @param ctx the parse tree
	 */
	void exitElemento(MiLenguajeParser.ElementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#incluide}.
	 * @param ctx the parse tree
	 */
	void enterIncluide(MiLenguajeParser.IncluideContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#incluide}.
	 * @param ctx the parse tree
	 */
	void exitIncluide(MiLenguajeParser.IncluideContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#libreria}.
	 * @param ctx the parse tree
	 */
	void enterLibreria(MiLenguajeParser.LibreriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#libreria}.
	 * @param ctx the parse tree
	 */
	void exitLibreria(MiLenguajeParser.LibreriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void enterListaParametros(MiLenguajeParser.ListaParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void exitListaParametros(MiLenguajeParser.ListaParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(MiLenguajeParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(MiLenguajeParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(MiLenguajeParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(MiLenguajeParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#declaracionOInstruccion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionOInstruccion(MiLenguajeParser.DeclaracionOInstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#declaracionOInstruccion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionOInstruccion(MiLenguajeParser.DeclaracionOInstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#instruccionSimple}.
	 * @param ctx the parse tree
	 */
	void enterInstruccionSimple(MiLenguajeParser.InstruccionSimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#instruccionSimple}.
	 * @param ctx the parse tree
	 */
	void exitInstruccionSimple(MiLenguajeParser.InstruccionSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(MiLenguajeParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(MiLenguajeParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(MiLenguajeParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(MiLenguajeParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#asignacionCompuesta}.
	 * @param ctx the parse tree
	 */
	void enterAsignacionCompuesta(MiLenguajeParser.AsignacionCompuestaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#asignacionCompuesta}.
	 * @param ctx the parse tree
	 */
	void exitAsignacionCompuesta(MiLenguajeParser.AsignacionCompuestaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sentenciaIf}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaIf(MiLenguajeParser.SentenciaIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sentenciaIf}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaIf(MiLenguajeParser.SentenciaIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#bucles}.
	 * @param ctx the parse tree
	 */
	void enterBucles(MiLenguajeParser.BuclesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#bucles}.
	 * @param ctx the parse tree
	 */
	void exitBucles(MiLenguajeParser.BuclesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(MiLenguajeParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(MiLenguajeParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(MiLenguajeParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(MiLenguajeParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(MiLenguajeParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(MiLenguajeParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(MiLenguajeParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(MiLenguajeParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(MiLenguajeParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(MiLenguajeParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expresionLogica}.
	 * @param ctx the parse tree
	 */
	void enterExpresionLogica(MiLenguajeParser.ExpresionLogicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expresionLogica}.
	 * @param ctx the parse tree
	 */
	void exitExpresionLogica(MiLenguajeParser.ExpresionLogicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expresionComparacion}.
	 * @param ctx the parse tree
	 */
	void enterExpresionComparacion(MiLenguajeParser.ExpresionComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expresionComparacion}.
	 * @param ctx the parse tree
	 */
	void exitExpresionComparacion(MiLenguajeParser.ExpresionComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expresionAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpresionAritmetica(MiLenguajeParser.ExpresionAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expresionAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpresionAritmetica(MiLenguajeParser.ExpresionAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expresionUnaria}.
	 * @param ctx the parse tree
	 */
	void enterExpresionUnaria(MiLenguajeParser.ExpresionUnariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expresionUnaria}.
	 * @param ctx the parse tree
	 */
	void exitExpresionUnaria(MiLenguajeParser.ExpresionUnariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expresionPostfijo}.
	 * @param ctx the parse tree
	 */
	void enterExpresionPostfijo(MiLenguajeParser.ExpresionPostfijoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expresionPostfijo}.
	 * @param ctx the parse tree
	 */
	void exitExpresionPostfijo(MiLenguajeParser.ExpresionPostfijoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expresionPrimaria}.
	 * @param ctx the parse tree
	 */
	void enterExpresionPrimaria(MiLenguajeParser.ExpresionPrimariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expresionPrimaria}.
	 * @param ctx the parse tree
	 */
	void exitExpresionPrimaria(MiLenguajeParser.ExpresionPrimariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(MiLenguajeParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(MiLenguajeParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionFuncion(MiLenguajeParser.DeclaracionFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionFuncion(MiLenguajeParser.DeclaracionFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionVariable(MiLenguajeParser.DeclaracionVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionVariable(MiLenguajeParser.DeclaracionVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sentenciaRetorno}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaRetorno(MiLenguajeParser.SentenciaRetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sentenciaRetorno}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaRetorno(MiLenguajeParser.SentenciaRetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sentenciaBreak}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaBreak(MiLenguajeParser.SentenciaBreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sentenciaBreak}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaBreak(MiLenguajeParser.SentenciaBreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sentenciaContinue}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaContinue(MiLenguajeParser.SentenciaContinueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sentenciaContinue}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaContinue(MiLenguajeParser.SentenciaContinueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#sentenciaExpr}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaExpr(MiLenguajeParser.SentenciaExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#sentenciaExpr}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaExpr(MiLenguajeParser.SentenciaExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(MiLenguajeParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(MiLenguajeParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MiLenguajeParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MiLenguajeParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#operadorAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterOperadorAritmetico(MiLenguajeParser.OperadorAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#operadorAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitOperadorAritmetico(MiLenguajeParser.OperadorAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#operadorComparacion}.
	 * @param ctx the parse tree
	 */
	void enterOperadorComparacion(MiLenguajeParser.OperadorComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#operadorComparacion}.
	 * @param ctx the parse tree
	 */
	void exitOperadorComparacion(MiLenguajeParser.OperadorComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#operadorLogico}.
	 * @param ctx the parse tree
	 */
	void enterOperadorLogico(MiLenguajeParser.OperadorLogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#operadorLogico}.
	 * @param ctx the parse tree
	 */
	void exitOperadorLogico(MiLenguajeParser.OperadorLogicoContext ctx);
}