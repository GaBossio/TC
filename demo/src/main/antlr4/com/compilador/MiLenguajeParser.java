// Generated from c:/Users/wichi/Documents/Universidad/TC/TC/demo/src/main/antlr4/com/compilador/MiLenguaje.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiLenguajeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, VOID=3, CHAR=4, DOUBLE=5, STRING=6, BOOL=7, INT_LIT=8, 
		FLOAT_LIT=9, CHAR_LIT=10, DOUBLE_LIT=11, STRING_LIT=12, TRUE=13, FALSE=14, 
		RETURN=15, BREAK=16, CONTINUAR=17, SI=18, SINO=19, IMPRIMIR=20, WHILE=21, 
		FOR=22, INCLUIR=23, MASIGUAL=24, MENOSIGUAL=25, ASTERISCOIGUAL=26, BARRAIGUAL=27, 
		PORCENTAJEIGUAL=28, MENOR_IGUAL=29, MAYOR_IGUAL=30, MENOR=31, MAYOR=32, 
		COMILLA=33, MAS=34, MENOS=35, ASTERISCO=36, BARRA=37, BARRA_DOBLE=38, 
		PORCENTAJE=39, IGUAL_IGUAL=40, DIFERENTE=41, ASIGNAR=42, Y_LOGICO=43, 
		O_LOGICO=44, NO_LOGICO=45, INCREMENTO=46, DECREMENTO=47, PUNTO=48, PAREN_IZQ=49, 
		PAREN_DER=50, LLAVE_IZQ=51, LLAVE_DER=52, PUNTOYCOMA=53, COMA=54, ID=55, 
		WS=56, COMMENT=57, BLOCK_COMMENT=58;
	public static final int
		RULE_program = 0, RULE_elemento = 1, RULE_incluide = 2, RULE_libreria = 3, 
		RULE_listaParametros = 4, RULE_parametro = 5, RULE_bloque = 6, RULE_declaracionOInstruccion = 7, 
		RULE_instruccionSimple = 8, RULE_llamadaFuncion = 9, RULE_sentenciaExpr = 10, 
		RULE_instruccion = 11, RULE_asignacion = 12, RULE_asignacionCompuesta = 13, 
		RULE_sentenciaIf = 14, RULE_bucles = 15, RULE_whileLoop = 16, RULE_forLoop = 17, 
		RULE_forInit = 18, RULE_forUpdate = 19, RULE_expresion = 20, RULE_expresionLogica = 21, 
		RULE_expresionComparacion = 22, RULE_expresionAritmetica = 23, RULE_expresionUnaria = 24, 
		RULE_expresionPostfijo = 25, RULE_expresionPrimaria = 26, RULE_declaracion = 27, 
		RULE_declaracionFuncion = 28, RULE_declaracionVariable = 29, RULE_sentenciaRetorno = 30, 
		RULE_sentenciaBreak = 31, RULE_sentenciaContinue = 32, RULE_tipo = 33, 
		RULE_literal = 34, RULE_operadorAritmetico = 35, RULE_operadorComparacion = 36, 
		RULE_operadorLogico = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "elemento", "incluide", "libreria", "listaParametros", "parametro", 
			"bloque", "declaracionOInstruccion", "instruccionSimple", "llamadaFuncion", 
			"sentenciaExpr", "instruccion", "asignacion", "asignacionCompuesta", 
			"sentenciaIf", "bucles", "whileLoop", "forLoop", "forInit", "forUpdate", 
			"expresion", "expresionLogica", "expresionComparacion", "expresionAritmetica", 
			"expresionUnaria", "expresionPostfijo", "expresionPrimaria", "declaracion", 
			"declaracionFuncion", "declaracionVariable", "sentenciaRetorno", "sentenciaBreak", 
			"sentenciaContinue", "tipo", "literal", "operadorAritmetico", "operadorComparacion", 
			"operadorLogico"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'void'", "'char'", "'double'", "'string'", 
			"'bool'", null, null, null, null, null, "'true'", "'false'", "'return'", 
			"'break'", "'continue'", "'if'", "'else'", "'print'", "'while'", "'for'", 
			"'#include'", "'+='", "'-='", "'*='", "'/='", "'%='", "'<='", "'>='", 
			"'<'", "'>'", "'\"'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'%'", "'=='", 
			"'!='", "'='", "'&&'", "'||'", "'!'", "'++'", "'--'", "'.'", "'('", "')'", 
			"'{'", "'}'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "VOID", "CHAR", "DOUBLE", "STRING", "BOOL", "INT_LIT", 
			"FLOAT_LIT", "CHAR_LIT", "DOUBLE_LIT", "STRING_LIT", "TRUE", "FALSE", 
			"RETURN", "BREAK", "CONTINUAR", "SI", "SINO", "IMPRIMIR", "WHILE", "FOR", 
			"INCLUIR", "MASIGUAL", "MENOSIGUAL", "ASTERISCOIGUAL", "BARRAIGUAL", 
			"PORCENTAJEIGUAL", "MENOR_IGUAL", "MAYOR_IGUAL", "MENOR", "MAYOR", "COMILLA", 
			"MAS", "MENOS", "ASTERISCO", "BARRA", "BARRA_DOBLE", "PORCENTAJE", "IGUAL_IGUAL", 
			"DIFERENTE", "ASIGNAR", "Y_LOGICO", "O_LOGICO", "NO_LOGICO", "INCREMENTO", 
			"DECREMENTO", "PUNTO", "PAREN_IZQ", "PAREN_DER", "LLAVE_IZQ", "LLAVE_DER", 
			"PUNTOYCOMA", "COMA", "ID", "WS", "COMMENT", "BLOCK_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MiLenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiLenguajeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MiLenguajeParser.EOF, 0); }
		public List<ElementoContext> elemento() {
			return getRuleContexts(ElementoContext.class);
		}
		public ElementoContext elemento(int i) {
			return getRuleContext(ElementoContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8388862L) != 0)) {
				{
				{
				setState(76);
				elemento();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementoContext extends ParserRuleContext {
		public IncluideContext incluide() {
			return getRuleContext(IncluideContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public ElementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterElemento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitElemento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitElemento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementoContext elemento() throws RecognitionException {
		ElementoContext _localctx = new ElementoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_elemento);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCLUIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				incluide();
				}
				break;
			case INT:
			case FLOAT:
			case VOID:
			case CHAR:
			case DOUBLE:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				declaracion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncluideContext extends ParserRuleContext {
		public TerminalNode INCLUIR() { return getToken(MiLenguajeParser.INCLUIR, 0); }
		public LibreriaContext libreria() {
			return getRuleContext(LibreriaContext.class,0);
		}
		public TerminalNode PUNTOYCOMA() { return getToken(MiLenguajeParser.PUNTOYCOMA, 0); }
		public IncluideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incluide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterIncluide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitIncluide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitIncluide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncluideContext incluide() throws RecognitionException {
		IncluideContext _localctx = new IncluideContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_incluide);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(INCLUIR);
			setState(89);
			libreria();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTOYCOMA) {
				{
				setState(90);
				match(PUNTOYCOMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LibreriaContext extends ParserRuleContext {
		public TerminalNode MENOR() { return getToken(MiLenguajeParser.MENOR, 0); }
		public List<TerminalNode> ID() { return getTokens(MiLenguajeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiLenguajeParser.ID, i);
		}
		public TerminalNode MAYOR() { return getToken(MiLenguajeParser.MAYOR, 0); }
		public List<TerminalNode> PUNTO() { return getTokens(MiLenguajeParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(MiLenguajeParser.PUNTO, i);
		}
		public List<TerminalNode> COMILLA() { return getTokens(MiLenguajeParser.COMILLA); }
		public TerminalNode COMILLA(int i) {
			return getToken(MiLenguajeParser.COMILLA, i);
		}
		public LibreriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libreria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterLibreria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitLibreria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitLibreria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibreriaContext libreria() throws RecognitionException {
		LibreriaContext _localctx = new LibreriaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_libreria);
		int _la;
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(MENOR);
				setState(94);
				match(ID);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PUNTO) {
					{
					{
					setState(95);
					match(PUNTO);
					setState(96);
					match(ID);
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(102);
				match(MAYOR);
				}
				break;
			case COMILLA:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(COMILLA);
				setState(104);
				match(ID);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PUNTO) {
					{
					{
					setState(105);
					match(PUNTO);
					setState(106);
					match(ID);
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				match(COMILLA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(MiLenguajeParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(MiLenguajeParser.COMA, i);
		}
		public ListaParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterListaParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitListaParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitListaParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listaParametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			parametro();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(116);
				match(COMA);
				setState(117);
				parametro();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			tipo();
			setState(124);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LLAVE_IZQ() { return getToken(MiLenguajeParser.LLAVE_IZQ, 0); }
		public TerminalNode LLAVE_DER() { return getToken(MiLenguajeParser.LLAVE_DER, 0); }
		public List<DeclaracionOInstruccionContext> declaracionOInstruccion() {
			return getRuleContexts(DeclaracionOInstruccionContext.class);
		}
		public DeclaracionOInstruccionContext declaracionOInstruccion(int i) {
			return getRuleContext(DeclaracionOInstruccionContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(LLAVE_IZQ);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36239903258280190L) != 0)) {
				{
				{
				setState(127);
				declaracionOInstruccion();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(LLAVE_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionOInstruccionContext extends ParserRuleContext {
		public DeclaracionVariableContext declaracionVariable() {
			return getRuleContext(DeclaracionVariableContext.class,0);
		}
		public InstruccionSimpleContext instruccionSimple() {
			return getRuleContext(InstruccionSimpleContext.class,0);
		}
		public DeclaracionOInstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionOInstruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDeclaracionOInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDeclaracionOInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDeclaracionOInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionOInstruccionContext declaracionOInstruccion() throws RecognitionException {
		DeclaracionOInstruccionContext _localctx = new DeclaracionOInstruccionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracionOInstruccion);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case VOID:
			case CHAR:
			case DOUBLE:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				declaracionVariable();
				}
				break;
			case RETURN:
			case BREAK:
			case CONTINUAR:
			case SI:
			case WHILE:
			case FOR:
			case INCREMENTO:
			case DECREMENTO:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				instruccionSimple();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionSimpleContext extends ParserRuleContext {
		public BuclesContext bucles() {
			return getRuleContext(BuclesContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public AsignacionCompuestaContext asignacionCompuesta() {
			return getRuleContext(AsignacionCompuestaContext.class,0);
		}
		public SentenciaRetornoContext sentenciaRetorno() {
			return getRuleContext(SentenciaRetornoContext.class,0);
		}
		public SentenciaBreakContext sentenciaBreak() {
			return getRuleContext(SentenciaBreakContext.class,0);
		}
		public SentenciaContinueContext sentenciaContinue() {
			return getRuleContext(SentenciaContinueContext.class,0);
		}
		public LlamadaFuncionContext llamadaFuncion() {
			return getRuleContext(LlamadaFuncionContext.class,0);
		}
		public TerminalNode PUNTOYCOMA() { return getToken(MiLenguajeParser.PUNTOYCOMA, 0); }
		public SentenciaIfContext sentenciaIf() {
			return getRuleContext(SentenciaIfContext.class,0);
		}
		public InstruccionSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccionSimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterInstruccionSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitInstruccionSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitInstruccionSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionSimpleContext instruccionSimple() throws RecognitionException {
		InstruccionSimpleContext _localctx = new InstruccionSimpleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instruccionSimple);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				bucles();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				asignacionCompuesta();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				sentenciaRetorno();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				sentenciaBreak();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				sentenciaContinue();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
				llamadaFuncion();
				setState(146);
				match(PUNTOYCOMA);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(148);
				sentenciaIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LlamadaFuncionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode PAREN_IZQ() { return getToken(MiLenguajeParser.PAREN_IZQ, 0); }
		public TerminalNode PAREN_DER() { return getToken(MiLenguajeParser.PAREN_DER, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(MiLenguajeParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(MiLenguajeParser.COMA, i);
		}
		public LlamadaFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadaFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterLlamadaFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitLlamadaFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitLlamadaFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamadaFuncionContext llamadaFuncion() throws RecognitionException {
		LlamadaFuncionContext _localctx = new LlamadaFuncionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_llamadaFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(ID);
			setState(152);
			match(PAREN_IZQ);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36838089116647168L) != 0)) {
				{
				setState(153);
				expresion();
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(154);
					match(COMA);
					setState(155);
					expresion();
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(163);
			match(PAREN_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaExprContext extends ParserRuleContext {
		public LlamadaFuncionContext llamadaFuncion() {
			return getRuleContext(LlamadaFuncionContext.class,0);
		}
		public TerminalNode PUNTOYCOMA() { return getToken(MiLenguajeParser.PUNTOYCOMA, 0); }
		public SentenciaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSentenciaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSentenciaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSentenciaExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaExprContext sentenciaExpr() throws RecognitionException {
		SentenciaExprContext _localctx = new SentenciaExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sentenciaExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			llamadaFuncion();
			setState(166);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public InstruccionSimpleContext instruccionSimple() {
			return getRuleContext(InstruccionSimpleContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_instruccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			instruccionSimple();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode ASIGNAR() { return getToken(MiLenguajeParser.ASIGNAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTOYCOMA() { return getToken(MiLenguajeParser.PUNTOYCOMA, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(ID);
			setState(171);
			match(ASIGNAR);
			setState(172);
			expresion();
			setState(173);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionCompuestaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTOYCOMA() { return getToken(MiLenguajeParser.PUNTOYCOMA, 0); }
		public TerminalNode MASIGUAL() { return getToken(MiLenguajeParser.MASIGUAL, 0); }
		public TerminalNode MENOSIGUAL() { return getToken(MiLenguajeParser.MENOSIGUAL, 0); }
		public TerminalNode ASTERISCOIGUAL() { return getToken(MiLenguajeParser.ASTERISCOIGUAL, 0); }
		public TerminalNode BARRAIGUAL() { return getToken(MiLenguajeParser.BARRAIGUAL, 0); }
		public TerminalNode PORCENTAJEIGUAL() { return getToken(MiLenguajeParser.PORCENTAJEIGUAL, 0); }
		public TerminalNode INCREMENTO() { return getToken(MiLenguajeParser.INCREMENTO, 0); }
		public TerminalNode DECREMENTO() { return getToken(MiLenguajeParser.DECREMENTO, 0); }
		public AsignacionCompuestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacionCompuesta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterAsignacionCompuesta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitAsignacionCompuesta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitAsignacionCompuesta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionCompuestaContext asignacionCompuesta() throws RecognitionException {
		AsignacionCompuestaContext _localctx = new AsignacionCompuestaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_asignacionCompuesta);
		int _la;
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(ID);
				setState(176);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 520093696L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(177);
				expresion();
				setState(178);
				match(PUNTOYCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(ID);
				setState(181);
				_la = _input.LA(1);
				if ( !(_la==INCREMENTO || _la==DECREMENTO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(182);
				match(PUNTOYCOMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				_la = _input.LA(1);
				if ( !(_la==INCREMENTO || _la==DECREMENTO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(184);
				match(ID);
				setState(185);
				match(PUNTOYCOMA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaIfContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(MiLenguajeParser.SI, 0); }
		public TerminalNode PAREN_IZQ() { return getToken(MiLenguajeParser.PAREN_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_DER() { return getToken(MiLenguajeParser.PAREN_DER, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode SINO() { return getToken(MiLenguajeParser.SINO, 0); }
		public SentenciaIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSentenciaIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSentenciaIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSentenciaIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaIfContext sentenciaIf() throws RecognitionException {
		SentenciaIfContext _localctx = new SentenciaIfContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sentenciaIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(SI);
			setState(189);
			match(PAREN_IZQ);
			setState(190);
			expresion();
			setState(191);
			match(PAREN_DER);
			setState(192);
			bloque();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(193);
				match(SINO);
				setState(194);
				bloque();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BuclesContext extends ParserRuleContext {
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public BuclesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterBucles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitBucles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitBucles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuclesContext bucles() throws RecognitionException {
		BuclesContext _localctx = new BuclesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bucles);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				whileLoop();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				forLoop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MiLenguajeParser.WHILE, 0); }
		public TerminalNode PAREN_IZQ() { return getToken(MiLenguajeParser.PAREN_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_DER() { return getToken(MiLenguajeParser.PAREN_DER, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(WHILE);
			setState(202);
			match(PAREN_IZQ);
			setState(203);
			expresion();
			setState(204);
			match(PAREN_DER);
			setState(205);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MiLenguajeParser.FOR, 0); }
		public TerminalNode PAREN_IZQ() { return getToken(MiLenguajeParser.PAREN_IZQ, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(MiLenguajeParser.PUNTOYCOMA, 0); }
		public TerminalNode PAREN_DER() { return getToken(MiLenguajeParser.PAREN_DER, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(FOR);
			setState(208);
			match(PAREN_IZQ);
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(209);
				forInit();
				}
				break;
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36838089116647168L) != 0)) {
				{
				setState(212);
				expresion();
				}
			}

			setState(215);
			match(PUNTOYCOMA);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36838089116647168L) != 0)) {
				{
				setState(216);
				forUpdate();
				}
			}

			setState(219);
			match(PAREN_DER);
			setState(220);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForInitContext extends ParserRuleContext {
		public DeclaracionVariableContext declaracionVariable() {
			return getRuleContext(DeclaracionVariableContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forInit);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case VOID:
			case CHAR:
			case DOUBLE:
			case STRING:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				declaracionVariable();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				asignacion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForUpdateContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionCompuestaContext asignacionCompuesta() {
			return getRuleContext(AsignacionCompuestaContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitForUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forUpdate);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				expresion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				asignacionCompuesta();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionLogicaContext expresionLogica() {
			return getRuleContext(ExpresionLogicaContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			expresionLogica();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionLogicaContext extends ParserRuleContext {
		public List<ExpresionComparacionContext> expresionComparacion() {
			return getRuleContexts(ExpresionComparacionContext.class);
		}
		public ExpresionComparacionContext expresionComparacion(int i) {
			return getRuleContext(ExpresionComparacionContext.class,i);
		}
		public List<OperadorLogicoContext> operadorLogico() {
			return getRuleContexts(OperadorLogicoContext.class);
		}
		public OperadorLogicoContext operadorLogico(int i) {
			return getRuleContext(OperadorLogicoContext.class,i);
		}
		public ExpresionLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionLogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpresionLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpresionLogica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpresionLogica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionLogicaContext expresionLogica() throws RecognitionException {
		ExpresionLogicaContext _localctx = new ExpresionLogicaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expresionLogica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			expresionComparacion();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Y_LOGICO || _la==O_LOGICO) {
				{
				{
				setState(233);
				operadorLogico();
				setState(234);
				expresionComparacion();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionComparacionContext extends ParserRuleContext {
		public List<ExpresionAritmeticaContext> expresionAritmetica() {
			return getRuleContexts(ExpresionAritmeticaContext.class);
		}
		public ExpresionAritmeticaContext expresionAritmetica(int i) {
			return getRuleContext(ExpresionAritmeticaContext.class,i);
		}
		public List<OperadorComparacionContext> operadorComparacion() {
			return getRuleContexts(OperadorComparacionContext.class);
		}
		public OperadorComparacionContext operadorComparacion(int i) {
			return getRuleContext(OperadorComparacionContext.class,i);
		}
		public ExpresionComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionComparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpresionComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpresionComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpresionComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionComparacionContext expresionComparacion() throws RecognitionException {
		ExpresionComparacionContext _localctx = new ExpresionComparacionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expresionComparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			expresionAritmetica();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3306587947008L) != 0)) {
				{
				{
				setState(242);
				operadorComparacion();
				setState(243);
				expresionAritmetica();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionAritmeticaContext extends ParserRuleContext {
		public List<ExpresionUnariaContext> expresionUnaria() {
			return getRuleContexts(ExpresionUnariaContext.class);
		}
		public ExpresionUnariaContext expresionUnaria(int i) {
			return getRuleContext(ExpresionUnariaContext.class,i);
		}
		public List<OperadorAritmeticoContext> operadorAritmetico() {
			return getRuleContexts(OperadorAritmeticoContext.class);
		}
		public OperadorAritmeticoContext operadorAritmetico(int i) {
			return getRuleContext(OperadorAritmeticoContext.class,i);
		}
		public ExpresionAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpresionAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpresionAritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpresionAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionAritmeticaContext expresionAritmetica() throws RecognitionException {
		ExpresionAritmeticaContext _localctx = new ExpresionAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expresionAritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			expresionUnaria();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 807453851648L) != 0)) {
				{
				{
				setState(251);
				operadorAritmetico();
				setState(252);
				expresionUnaria();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionUnariaContext extends ParserRuleContext {
		public TerminalNode NO_LOGICO() { return getToken(MiLenguajeParser.NO_LOGICO, 0); }
		public ExpresionUnariaContext expresionUnaria() {
			return getRuleContext(ExpresionUnariaContext.class,0);
		}
		public TerminalNode MENOS() { return getToken(MiLenguajeParser.MENOS, 0); }
		public TerminalNode MAS() { return getToken(MiLenguajeParser.MAS, 0); }
		public TerminalNode INCREMENTO() { return getToken(MiLenguajeParser.INCREMENTO, 0); }
		public ExpresionPrimariaContext expresionPrimaria() {
			return getRuleContext(ExpresionPrimariaContext.class,0);
		}
		public TerminalNode DECREMENTO() { return getToken(MiLenguajeParser.DECREMENTO, 0); }
		public ExpresionPostfijoContext expresionPostfijo() {
			return getRuleContext(ExpresionPostfijoContext.class,0);
		}
		public ExpresionUnariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionUnaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpresionUnaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpresionUnaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpresionUnaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionUnariaContext expresionUnaria() throws RecognitionException {
		ExpresionUnariaContext _localctx = new ExpresionUnariaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expresionUnaria);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NO_LOGICO:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(NO_LOGICO);
				setState(260);
				expresionUnaria();
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(MENOS);
				setState(262);
				expresionUnaria();
				}
				break;
			case MAS:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				match(MAS);
				setState(264);
				expresionUnaria();
				}
				break;
			case INCREMENTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				match(INCREMENTO);
				setState(266);
				expresionPrimaria();
				}
				break;
			case DECREMENTO:
				enterOuterAlt(_localctx, 5);
				{
				setState(267);
				match(DECREMENTO);
				setState(268);
				expresionPrimaria();
				}
				break;
			case INT_LIT:
			case FLOAT_LIT:
			case CHAR_LIT:
			case DOUBLE_LIT:
			case STRING_LIT:
			case TRUE:
			case FALSE:
			case PAREN_IZQ:
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(269);
				expresionPostfijo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionPostfijoContext extends ParserRuleContext {
		public ExpresionPrimariaContext expresionPrimaria() {
			return getRuleContext(ExpresionPrimariaContext.class,0);
		}
		public TerminalNode INCREMENTO() { return getToken(MiLenguajeParser.INCREMENTO, 0); }
		public TerminalNode DECREMENTO() { return getToken(MiLenguajeParser.DECREMENTO, 0); }
		public LlamadaFuncionContext llamadaFuncion() {
			return getRuleContext(LlamadaFuncionContext.class,0);
		}
		public ExpresionPostfijoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionPostfijo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpresionPostfijo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpresionPostfijo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpresionPostfijo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionPostfijoContext expresionPostfijo() throws RecognitionException {
		ExpresionPostfijoContext _localctx = new ExpresionPostfijoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expresionPostfijo);
		int _la;
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				expresionPrimaria();
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INCREMENTO || _la==DECREMENTO) {
					{
					setState(273);
					_la = _input.LA(1);
					if ( !(_la==INCREMENTO || _la==DECREMENTO) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				llamadaFuncion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionPrimariaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode PAREN_IZQ() { return getToken(MiLenguajeParser.PAREN_IZQ, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_DER() { return getToken(MiLenguajeParser.PAREN_DER, 0); }
		public ExpresionPrimariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionPrimaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterExpresionPrimaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitExpresionPrimaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitExpresionPrimaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionPrimariaContext expresionPrimaria() throws RecognitionException {
		ExpresionPrimariaContext _localctx = new ExpresionPrimariaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expresionPrimaria);
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(ID);
				}
				break;
			case INT_LIT:
			case FLOAT_LIT:
			case CHAR_LIT:
			case DOUBLE_LIT:
			case STRING_LIT:
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				literal();
				}
				break;
			case PAREN_IZQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				match(PAREN_IZQ);
				setState(282);
				expresion();
				setState(283);
				match(PAREN_DER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public DeclaracionVariableContext declaracionVariable() {
			return getRuleContext(DeclaracionVariableContext.class,0);
		}
		public DeclaracionFuncionContext declaracionFuncion() {
			return getRuleContext(DeclaracionFuncionContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declaracion);
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				declaracionVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				declaracionFuncion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionFuncionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode PAREN_IZQ() { return getToken(MiLenguajeParser.PAREN_IZQ, 0); }
		public TerminalNode PAREN_DER() { return getToken(MiLenguajeParser.PAREN_DER, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public DeclaracionFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDeclaracionFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDeclaracionFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDeclaracionFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionFuncionContext declaracionFuncion() throws RecognitionException {
		DeclaracionFuncionContext _localctx = new DeclaracionFuncionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declaracionFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			tipo();
			setState(292);
			match(ID);
			setState(293);
			match(PAREN_IZQ);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 254L) != 0)) {
				{
				setState(294);
				listaParametros();
				}
			}

			setState(297);
			match(PAREN_DER);
			setState(298);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionVariableContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(MiLenguajeParser.PUNTOYCOMA, 0); }
		public TerminalNode ASIGNAR() { return getToken(MiLenguajeParser.ASIGNAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DeclaracionVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDeclaracionVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDeclaracionVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitDeclaracionVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionVariableContext declaracionVariable() throws RecognitionException {
		DeclaracionVariableContext _localctx = new DeclaracionVariableContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_declaracionVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			tipo();
			setState(301);
			match(ID);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASIGNAR) {
				{
				setState(302);
				match(ASIGNAR);
				setState(303);
				expresion();
				}
			}

			setState(306);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaRetornoContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MiLenguajeParser.RETURN, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(MiLenguajeParser.PUNTOYCOMA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public SentenciaRetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaRetorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSentenciaRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSentenciaRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSentenciaRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaRetornoContext sentenciaRetorno() throws RecognitionException {
		SentenciaRetornoContext _localctx = new SentenciaRetornoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_sentenciaRetorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(RETURN);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36838089116647168L) != 0)) {
				{
				setState(309);
				expresion();
				}
			}

			setState(312);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaBreakContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(MiLenguajeParser.BREAK, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(MiLenguajeParser.PUNTOYCOMA, 0); }
		public SentenciaBreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaBreak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSentenciaBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSentenciaBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSentenciaBreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaBreakContext sentenciaBreak() throws RecognitionException {
		SentenciaBreakContext _localctx = new SentenciaBreakContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_sentenciaBreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(BREAK);
			setState(315);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContinueContext extends ParserRuleContext {
		public TerminalNode CONTINUAR() { return getToken(MiLenguajeParser.CONTINUAR, 0); }
		public TerminalNode PUNTOYCOMA() { return getToken(MiLenguajeParser.PUNTOYCOMA, 0); }
		public SentenciaContinueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaContinue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSentenciaContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSentenciaContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitSentenciaContinue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContinueContext sentenciaContinue() throws RecognitionException {
		SentenciaContinueContext _localctx = new SentenciaContinueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_sentenciaContinue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(CONTINUAR);
			setState(318);
			match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MiLenguajeParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MiLenguajeParser.FLOAT, 0); }
		public TerminalNode VOID() { return getToken(MiLenguajeParser.VOID, 0); }
		public TerminalNode CHAR() { return getToken(MiLenguajeParser.CHAR, 0); }
		public TerminalNode DOUBLE() { return getToken(MiLenguajeParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(MiLenguajeParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(MiLenguajeParser.BOOL, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 254L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT_LIT() { return getToken(MiLenguajeParser.INT_LIT, 0); }
		public TerminalNode FLOAT_LIT() { return getToken(MiLenguajeParser.FLOAT_LIT, 0); }
		public TerminalNode CHAR_LIT() { return getToken(MiLenguajeParser.CHAR_LIT, 0); }
		public TerminalNode DOUBLE_LIT() { return getToken(MiLenguajeParser.DOUBLE_LIT, 0); }
		public TerminalNode STRING_LIT() { return getToken(MiLenguajeParser.STRING_LIT, 0); }
		public TerminalNode TRUE() { return getToken(MiLenguajeParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MiLenguajeParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32512L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorAritmeticoContext extends ParserRuleContext {
		public TerminalNode MAS() { return getToken(MiLenguajeParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(MiLenguajeParser.MENOS, 0); }
		public TerminalNode ASTERISCO() { return getToken(MiLenguajeParser.ASTERISCO, 0); }
		public TerminalNode BARRA() { return getToken(MiLenguajeParser.BARRA, 0); }
		public TerminalNode PORCENTAJE() { return getToken(MiLenguajeParser.PORCENTAJE, 0); }
		public OperadorAritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorAritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOperadorAritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOperadorAritmetico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOperadorAritmetico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorAritmeticoContext operadorAritmetico() throws RecognitionException {
		OperadorAritmeticoContext _localctx = new OperadorAritmeticoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_operadorAritmetico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 807453851648L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorComparacionContext extends ParserRuleContext {
		public TerminalNode IGUAL_IGUAL() { return getToken(MiLenguajeParser.IGUAL_IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(MiLenguajeParser.DIFERENTE, 0); }
		public TerminalNode MAYOR_IGUAL() { return getToken(MiLenguajeParser.MAYOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(MiLenguajeParser.MENOR_IGUAL, 0); }
		public TerminalNode MAYOR() { return getToken(MiLenguajeParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(MiLenguajeParser.MENOR, 0); }
		public OperadorComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorComparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOperadorComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOperadorComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOperadorComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorComparacionContext operadorComparacion() throws RecognitionException {
		OperadorComparacionContext _localctx = new OperadorComparacionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_operadorComparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3306587947008L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorLogicoContext extends ParserRuleContext {
		public TerminalNode Y_LOGICO() { return getToken(MiLenguajeParser.Y_LOGICO, 0); }
		public TerminalNode O_LOGICO() { return getToken(MiLenguajeParser.O_LOGICO, 0); }
		public OperadorLogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorLogico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOperadorLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOperadorLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiLenguajeVisitor ) return ((MiLenguajeVisitor<? extends T>)visitor).visitOperadorLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorLogicoContext operadorLogico() throws RecognitionException {
		OperadorLogicoContext _localctx = new OperadorLogicoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_operadorLogico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_la = _input.LA(1);
			if ( !(_la==Y_LOGICO || _la==O_LOGICO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001:\u014b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0005\u0000N\b\u0000"+
		"\n\u0000\f\u0000Q\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0003\u0001W\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\\\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"b\b\u0003\n\u0003\f\u0003e\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003l\b\u0003\n\u0003\f\u0003o\t\u0003"+
		"\u0001\u0003\u0003\u0003r\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004w\b\u0004\n\u0004\f\u0004z\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006\u0081\b\u0006\n\u0006"+
		"\f\u0006\u0084\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u008a\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0096\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u009d\b\t\n\t\f\t\u00a0\t\t\u0003\t\u00a2\b"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00bb\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00c4\b\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u00c8"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00d3\b\u0011\u0001"+
		"\u0011\u0003\u0011\u00d6\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00da"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00e1\b\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u00e5\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u00ed\b\u0015\n\u0015\f\u0015\u00f0\t\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00f6\b\u0016\n\u0016\f\u0016"+
		"\u00f9\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u00ff\b\u0017\n\u0017\f\u0017\u0102\t\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u010f\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u0113\b\u0019\u0001\u0019\u0003\u0019\u0116\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u011e\b\u001a\u0001\u001b\u0001\u001b\u0003\u001b\u0122\b"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0128"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u0131\b\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u0137\b\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001%\u0000\u0000"+
		"&\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJ\u0000\u0007\u0001\u0000\u0018\u001c"+
		"\u0001\u0000./\u0001\u0000\u0001\u0007\u0001\u0000\b\u000e\u0002\u0000"+
		"\"%\'\'\u0002\u0000\u001d ()\u0001\u0000+,\u014f\u0000O\u0001\u0000\u0000"+
		"\u0000\u0002V\u0001\u0000\u0000\u0000\u0004X\u0001\u0000\u0000\u0000\u0006"+
		"q\u0001\u0000\u0000\u0000\bs\u0001\u0000\u0000\u0000\n{\u0001\u0000\u0000"+
		"\u0000\f~\u0001\u0000\u0000\u0000\u000e\u0089\u0001\u0000\u0000\u0000"+
		"\u0010\u0095\u0001\u0000\u0000\u0000\u0012\u0097\u0001\u0000\u0000\u0000"+
		"\u0014\u00a5\u0001\u0000\u0000\u0000\u0016\u00a8\u0001\u0000\u0000\u0000"+
		"\u0018\u00aa\u0001\u0000\u0000\u0000\u001a\u00ba\u0001\u0000\u0000\u0000"+
		"\u001c\u00bc\u0001\u0000\u0000\u0000\u001e\u00c7\u0001\u0000\u0000\u0000"+
		" \u00c9\u0001\u0000\u0000\u0000\"\u00cf\u0001\u0000\u0000\u0000$\u00e0"+
		"\u0001\u0000\u0000\u0000&\u00e4\u0001\u0000\u0000\u0000(\u00e6\u0001\u0000"+
		"\u0000\u0000*\u00e8\u0001\u0000\u0000\u0000,\u00f1\u0001\u0000\u0000\u0000"+
		".\u00fa\u0001\u0000\u0000\u00000\u010e\u0001\u0000\u0000\u00002\u0115"+
		"\u0001\u0000\u0000\u00004\u011d\u0001\u0000\u0000\u00006\u0121\u0001\u0000"+
		"\u0000\u00008\u0123\u0001\u0000\u0000\u0000:\u012c\u0001\u0000\u0000\u0000"+
		"<\u0134\u0001\u0000\u0000\u0000>\u013a\u0001\u0000\u0000\u0000@\u013d"+
		"\u0001\u0000\u0000\u0000B\u0140\u0001\u0000\u0000\u0000D\u0142\u0001\u0000"+
		"\u0000\u0000F\u0144\u0001\u0000\u0000\u0000H\u0146\u0001\u0000\u0000\u0000"+
		"J\u0148\u0001\u0000\u0000\u0000LN\u0003\u0002\u0001\u0000ML\u0001\u0000"+
		"\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000"+
		"RS\u0005\u0000\u0000\u0001S\u0001\u0001\u0000\u0000\u0000TW\u0003\u0004"+
		"\u0002\u0000UW\u00036\u001b\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000"+
		"\u0000\u0000W\u0003\u0001\u0000\u0000\u0000XY\u0005\u0017\u0000\u0000"+
		"Y[\u0003\u0006\u0003\u0000Z\\\u00055\u0000\u0000[Z\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\\u0005\u0001\u0000\u0000\u0000]^\u0005\u001f"+
		"\u0000\u0000^c\u00057\u0000\u0000_`\u00050\u0000\u0000`b\u00057\u0000"+
		"\u0000a_\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0001\u0000\u0000\u0000ec\u0001"+
		"\u0000\u0000\u0000fr\u0005 \u0000\u0000gh\u0005!\u0000\u0000hm\u00057"+
		"\u0000\u0000ij\u00050\u0000\u0000jl\u00057\u0000\u0000ki\u0001\u0000\u0000"+
		"\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000np\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pr\u0005"+
		"!\u0000\u0000q]\u0001\u0000\u0000\u0000qg\u0001\u0000\u0000\u0000r\u0007"+
		"\u0001\u0000\u0000\u0000sx\u0003\n\u0005\u0000tu\u00056\u0000\u0000uw"+
		"\u0003\n\u0005\u0000vt\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000"+
		"xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y\t\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000{|\u0003B!\u0000|}\u00057\u0000\u0000"+
		"}\u000b\u0001\u0000\u0000\u0000~\u0082\u00053\u0000\u0000\u007f\u0081"+
		"\u0003\u000e\u0007\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u00054\u0000\u0000\u0086\r\u0001"+
		"\u0000\u0000\u0000\u0087\u008a\u0003:\u001d\u0000\u0088\u008a\u0003\u0010"+
		"\b\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u000f\u0001\u0000\u0000\u0000\u008b\u0096\u0003\u001e\u000f"+
		"\u0000\u008c\u0096\u0003\u0018\f\u0000\u008d\u0096\u0003\u001a\r\u0000"+
		"\u008e\u0096\u0003<\u001e\u0000\u008f\u0096\u0003>\u001f\u0000\u0090\u0096"+
		"\u0003@ \u0000\u0091\u0092\u0003\u0012\t\u0000\u0092\u0093\u00055\u0000"+
		"\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0096\u0003\u001c\u000e"+
		"\u0000\u0095\u008b\u0001\u0000\u0000\u0000\u0095\u008c\u0001\u0000\u0000"+
		"\u0000\u0095\u008d\u0001\u0000\u0000\u0000\u0095\u008e\u0001\u0000\u0000"+
		"\u0000\u0095\u008f\u0001\u0000\u0000\u0000\u0095\u0090\u0001\u0000\u0000"+
		"\u0000\u0095\u0091\u0001\u0000\u0000\u0000\u0095\u0094\u0001\u0000\u0000"+
		"\u0000\u0096\u0011\u0001\u0000\u0000\u0000\u0097\u0098\u00057\u0000\u0000"+
		"\u0098\u00a1\u00051\u0000\u0000\u0099\u009e\u0003(\u0014\u0000\u009a\u009b"+
		"\u00056\u0000\u0000\u009b\u009d\u0003(\u0014\u0000\u009c\u009a\u0001\u0000"+
		"\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u0099\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u00052\u0000\u0000\u00a4\u0013\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0003\u0012\t\u0000\u00a6\u00a7\u00055\u0000\u0000"+
		"\u00a7\u0015\u0001\u0000\u0000\u0000\u00a8\u00a9\u0003\u0010\b\u0000\u00a9"+
		"\u0017\u0001\u0000\u0000\u0000\u00aa\u00ab\u00057\u0000\u0000\u00ab\u00ac"+
		"\u0005*\u0000\u0000\u00ac\u00ad\u0003(\u0014\u0000\u00ad\u00ae\u00055"+
		"\u0000\u0000\u00ae\u0019\u0001\u0000\u0000\u0000\u00af\u00b0\u00057\u0000"+
		"\u0000\u00b0\u00b1\u0007\u0000\u0000\u0000\u00b1\u00b2\u0003(\u0014\u0000"+
		"\u00b2\u00b3\u00055\u0000\u0000\u00b3\u00bb\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u00057\u0000\u0000\u00b5\u00b6\u0007\u0001\u0000\u0000\u00b6\u00bb"+
		"\u00055\u0000\u0000\u00b7\u00b8\u0007\u0001\u0000\u0000\u00b8\u00b9\u0005"+
		"7\u0000\u0000\u00b9\u00bb\u00055\u0000\u0000\u00ba\u00af\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b4\u0001\u0000\u0000\u0000\u00ba\u00b7\u0001\u0000\u0000"+
		"\u0000\u00bb\u001b\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0012\u0000"+
		"\u0000\u00bd\u00be\u00051\u0000\u0000\u00be\u00bf\u0003(\u0014\u0000\u00bf"+
		"\u00c0\u00052\u0000\u0000\u00c0\u00c3\u0003\f\u0006\u0000\u00c1\u00c2"+
		"\u0005\u0013\u0000\u0000\u00c2\u00c4\u0003\f\u0006\u0000\u00c3\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u001d\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c8\u0003 \u0010\u0000\u00c6\u00c8\u0003\""+
		"\u0011\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c8\u001f\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u0015"+
		"\u0000\u0000\u00ca\u00cb\u00051\u0000\u0000\u00cb\u00cc\u0003(\u0014\u0000"+
		"\u00cc\u00cd\u00052\u0000\u0000\u00cd\u00ce\u0003\f\u0006\u0000\u00ce"+
		"!\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u0016\u0000\u0000\u00d0\u00d2"+
		"\u00051\u0000\u0000\u00d1\u00d3\u0003$\u0012\u0000\u00d2\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d6\u0003(\u0014\u0000\u00d5\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d9\u00055\u0000\u0000\u00d8\u00da\u0003&\u0013\u0000\u00d9"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u00052\u0000\u0000\u00dc\u00dd"+
		"\u0003\f\u0006\u0000\u00dd#\u0001\u0000\u0000\u0000\u00de\u00e1\u0003"+
		":\u001d\u0000\u00df\u00e1\u0003\u0018\f\u0000\u00e0\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1%\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e5\u0003(\u0014\u0000\u00e3\u00e5\u0003\u001a\r\u0000"+
		"\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e5\'\u0001\u0000\u0000\u0000\u00e6\u00e7\u0003*\u0015\u0000\u00e7"+
		")\u0001\u0000\u0000\u0000\u00e8\u00ee\u0003,\u0016\u0000\u00e9\u00ea\u0003"+
		"J%\u0000\u00ea\u00eb\u0003,\u0016\u0000\u00eb\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ec\u00e9\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ef+\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f7\u0003.\u0017\u0000\u00f2\u00f3\u0003H$\u0000\u00f3\u00f4"+
		"\u0003.\u0017\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8-\u0001\u0000"+
		"\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u0100\u00030\u0018"+
		"\u0000\u00fb\u00fc\u0003F#\u0000\u00fc\u00fd\u00030\u0018\u0000\u00fd"+
		"\u00ff\u0001\u0000\u0000\u0000\u00fe\u00fb\u0001\u0000\u0000\u0000\u00ff"+
		"\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0001\u0000\u0000\u0000\u0101/\u0001\u0000\u0000\u0000\u0102\u0100"+
		"\u0001\u0000\u0000\u0000\u0103\u0104\u0005-\u0000\u0000\u0104\u010f\u0003"+
		"0\u0018\u0000\u0105\u0106\u0005#\u0000\u0000\u0106\u010f\u00030\u0018"+
		"\u0000\u0107\u0108\u0005\"\u0000\u0000\u0108\u010f\u00030\u0018\u0000"+
		"\u0109\u010a\u0005.\u0000\u0000\u010a\u010f\u00034\u001a\u0000\u010b\u010c"+
		"\u0005/\u0000\u0000\u010c\u010f\u00034\u001a\u0000\u010d\u010f\u00032"+
		"\u0019\u0000\u010e\u0103\u0001\u0000\u0000\u0000\u010e\u0105\u0001\u0000"+
		"\u0000\u0000\u010e\u0107\u0001\u0000\u0000\u0000\u010e\u0109\u0001\u0000"+
		"\u0000\u0000\u010e\u010b\u0001\u0000\u0000\u0000\u010e\u010d\u0001\u0000"+
		"\u0000\u0000\u010f1\u0001\u0000\u0000\u0000\u0110\u0112\u00034\u001a\u0000"+
		"\u0111\u0113\u0007\u0001\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000"+
		"\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0116\u0001\u0000\u0000\u0000"+
		"\u0114\u0116\u0003\u0012\t\u0000\u0115\u0110\u0001\u0000\u0000\u0000\u0115"+
		"\u0114\u0001\u0000\u0000\u0000\u01163\u0001\u0000\u0000\u0000\u0117\u011e"+
		"\u00057\u0000\u0000\u0118\u011e\u0003D\"\u0000\u0119\u011a\u00051\u0000"+
		"\u0000\u011a\u011b\u0003(\u0014\u0000\u011b\u011c\u00052\u0000\u0000\u011c"+
		"\u011e\u0001\u0000\u0000\u0000\u011d\u0117\u0001\u0000\u0000\u0000\u011d"+
		"\u0118\u0001\u0000\u0000\u0000\u011d\u0119\u0001\u0000\u0000\u0000\u011e"+
		"5\u0001\u0000\u0000\u0000\u011f\u0122\u0003:\u001d\u0000\u0120\u0122\u0003"+
		"8\u001c\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0120\u0001\u0000"+
		"\u0000\u0000\u01227\u0001\u0000\u0000\u0000\u0123\u0124\u0003B!\u0000"+
		"\u0124\u0125\u00057\u0000\u0000\u0125\u0127\u00051\u0000\u0000\u0126\u0128"+
		"\u0003\b\u0004\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0127\u0128\u0001"+
		"\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012a\u0005"+
		"2\u0000\u0000\u012a\u012b\u0003\f\u0006\u0000\u012b9\u0001\u0000\u0000"+
		"\u0000\u012c\u012d\u0003B!\u0000\u012d\u0130\u00057\u0000\u0000\u012e"+
		"\u012f\u0005*\u0000\u0000\u012f\u0131\u0003(\u0014\u0000\u0130\u012e\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0132\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u00055\u0000\u0000\u0133;\u0001\u0000\u0000"+
		"\u0000\u0134\u0136\u0005\u000f\u0000\u0000\u0135\u0137\u0003(\u0014\u0000"+
		"\u0136\u0135\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0139\u00055\u0000\u0000\u0139"+
		"=\u0001\u0000\u0000\u0000\u013a\u013b\u0005\u0010\u0000\u0000\u013b\u013c"+
		"\u00055\u0000\u0000\u013c?\u0001\u0000\u0000\u0000\u013d\u013e\u0005\u0011"+
		"\u0000\u0000\u013e\u013f\u00055\u0000\u0000\u013fA\u0001\u0000\u0000\u0000"+
		"\u0140\u0141\u0007\u0002\u0000\u0000\u0141C\u0001\u0000\u0000\u0000\u0142"+
		"\u0143\u0007\u0003\u0000\u0000\u0143E\u0001\u0000\u0000\u0000\u0144\u0145"+
		"\u0007\u0004\u0000\u0000\u0145G\u0001\u0000\u0000\u0000\u0146\u0147\u0007"+
		"\u0005\u0000\u0000\u0147I\u0001\u0000\u0000\u0000\u0148\u0149\u0007\u0006"+
		"\u0000\u0000\u0149K\u0001\u0000\u0000\u0000\u001fOV[cmqx\u0082\u0089\u0095"+
		"\u009e\u00a1\u00ba\u00c3\u00c7\u00d2\u00d5\u00d9\u00e0\u00e4\u00ee\u00f7"+
		"\u0100\u010e\u0112\u0115\u011d\u0121\u0127\u0130\u0136";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}