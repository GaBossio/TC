// Generated from c:/Users/wichi/Documents/Universidad/TC/TC-ANTLR4/demo/src/main/antlr4/com/compilador/MiLenguaje.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link MiLenguajeParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(MiLenguajeParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(MiLenguajeParser.TokenContext ctx);
}