// Generated from com\compilador\MiLenguaje.g4 by ANTLR 4.9.3
package com.compilador;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiLenguajeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "FLOAT", "VOID", "CHAR", "DOUBLE", "STRING", "BOOL", "INT_LIT", 
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


	public MiLenguajeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiLenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u0192\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\6\t\u00a0\n\t\r\t\16\t\u00a1\3\n\6\n\u00a5\n\n\r\n\16\n\u00a6"+
		"\3\n\3\n\7\n\u00ab\n\n\f\n\16\n\u00ae\13\n\3\n\3\n\6\n\u00b2\n\n\r\n\16"+
		"\n\u00b3\5\n\u00b6\n\n\3\13\3\13\3\13\3\13\5\13\u00bc\n\13\3\13\3\13\3"+
		"\f\6\f\u00c1\n\f\r\f\16\f\u00c2\3\f\3\f\7\f\u00c7\n\f\f\f\16\f\u00ca\13"+
		"\f\3\f\3\f\6\f\u00ce\n\f\r\f\16\f\u00cf\5\f\u00d2\n\f\3\r\3\r\3\r\3\r"+
		"\7\r\u00d8\n\r\f\r\16\r\u00db\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3"+
		"+\3,\3,\3,\3-\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\78\u016e\n8\f"+
		"8\168\u0171\138\39\69\u0174\n9\r9\169\u0175\39\39\3:\3:\3:\3:\7:\u017e"+
		"\n:\f:\16:\u0181\13:\3:\3:\3;\3;\3;\3;\7;\u0189\n;\f;\16;\u018c\13;\3"+
		";\3;\3;\3;\3;\3\u018a\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65i\66k\67m8o9q:s;u<\3\2\t\3\2\62;\6\2\f\f\17\17))^^\6\2\f\f"+
		"\17\17$$^^\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17"+
		"\2\u01a1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5{"+
		"\3\2\2\2\7\u0081\3\2\2\2\t\u0086\3\2\2\2\13\u008b\3\2\2\2\r\u0092\3\2"+
		"\2\2\17\u0099\3\2\2\2\21\u009f\3\2\2\2\23\u00b5\3\2\2\2\25\u00b7\3\2\2"+
		"\2\27\u00d1\3\2\2\2\31\u00d3\3\2\2\2\33\u00de\3\2\2\2\35\u00e3\3\2\2\2"+
		"\37\u00e9\3\2\2\2!\u00f0\3\2\2\2#\u00f6\3\2\2\2%\u00ff\3\2\2\2\'\u0102"+
		"\3\2\2\2)\u0107\3\2\2\2+\u010d\3\2\2\2-\u0113\3\2\2\2/\u0117\3\2\2\2\61"+
		"\u0120\3\2\2\2\63\u0123\3\2\2\2\65\u0126\3\2\2\2\67\u0129\3\2\2\29\u012c"+
		"\3\2\2\2;\u012f\3\2\2\2=\u0132\3\2\2\2?\u0135\3\2\2\2A\u0137\3\2\2\2C"+
		"\u0139\3\2\2\2E\u013b\3\2\2\2G\u013d\3\2\2\2I\u013f\3\2\2\2K\u0141\3\2"+
		"\2\2M\u0143\3\2\2\2O\u0145\3\2\2\2Q\u0147\3\2\2\2S\u014a\3\2\2\2U\u014d"+
		"\3\2\2\2W\u014f\3\2\2\2Y\u0152\3\2\2\2[\u0155\3\2\2\2]\u0157\3\2\2\2_"+
		"\u015a\3\2\2\2a\u015d\3\2\2\2c\u015f\3\2\2\2e\u0161\3\2\2\2g\u0163\3\2"+
		"\2\2i\u0165\3\2\2\2k\u0167\3\2\2\2m\u0169\3\2\2\2o\u016b\3\2\2\2q\u0173"+
		"\3\2\2\2s\u0179\3\2\2\2u\u0184\3\2\2\2wx\7k\2\2xy\7p\2\2yz\7v\2\2z\4\3"+
		"\2\2\2{|\7h\2\2|}\7n\2\2}~\7q\2\2~\177\7c\2\2\177\u0080\7v\2\2\u0080\6"+
		"\3\2\2\2\u0081\u0082\7x\2\2\u0082\u0083\7q\2\2\u0083\u0084\7k\2\2\u0084"+
		"\u0085\7f\2\2\u0085\b\3\2\2\2\u0086\u0087\7e\2\2\u0087\u0088\7j\2\2\u0088"+
		"\u0089\7c\2\2\u0089\u008a\7t\2\2\u008a\n\3\2\2\2\u008b\u008c\7f\2\2\u008c"+
		"\u008d\7q\2\2\u008d\u008e\7w\2\2\u008e\u008f\7d\2\2\u008f\u0090\7n\2\2"+
		"\u0090\u0091\7g\2\2\u0091\f\3\2\2\2\u0092\u0093\7u\2\2\u0093\u0094\7v"+
		"\2\2\u0094\u0095\7t\2\2\u0095\u0096\7k\2\2\u0096\u0097\7p\2\2\u0097\u0098"+
		"\7i\2\2\u0098\16\3\2\2\2\u0099\u009a\7d\2\2\u009a\u009b\7q\2\2\u009b\u009c"+
		"\7q\2\2\u009c\u009d\7n\2\2\u009d\20\3\2\2\2\u009e\u00a0\t\2\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\22\3\2\2\2\u00a3\u00a5\t\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00ac\7\60\2\2\u00a9\u00ab\t\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3"+
		"\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b6\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b1\7\60\2\2\u00b0\u00b2\t\2\2\2\u00b1\u00b0\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b6\3\2\2\2\u00b5\u00a4\3\2\2\2\u00b5\u00af\3\2\2\2\u00b6\24\3\2\2"+
		"\2\u00b7\u00bb\7)\2\2\u00b8\u00bc\n\3\2\2\u00b9\u00ba\7^\2\2\u00ba\u00bc"+
		"\13\2\2\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\3\2\2\2"+
		"\u00bd\u00be\7)\2\2\u00be\26\3\2\2\2\u00bf\u00c1\t\2\2\2\u00c0\u00bf\3"+
		"\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c8\7\60\2\2\u00c5\u00c7\t\2\2\2\u00c6\u00c5\3"+
		"\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00d2\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\7\60\2\2\u00cc\u00ce\t"+
		"\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00c0\3\2\2\2\u00d1\u00cb\3\2"+
		"\2\2\u00d2\30\3\2\2\2\u00d3\u00d9\7$\2\2\u00d4\u00d8\n\4\2\2\u00d5\u00d6"+
		"\7^\2\2\u00d6\u00d8\13\2\2\2\u00d7\u00d4\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7$\2\2\u00dd\32\3\2\2\2\u00de\u00df"+
		"\7v\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7w\2\2\u00e1\u00e2\7g\2\2\u00e2"+
		"\34\3\2\2\2\u00e3\u00e4\7h\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7n\2\2\u00e6"+
		"\u00e7\7u\2\2\u00e7\u00e8\7g\2\2\u00e8\36\3\2\2\2\u00e9\u00ea\7t\2\2\u00ea"+
		"\u00eb\7g\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7w\2\2\u00ed\u00ee\7t\2\2"+
		"\u00ee\u00ef\7p\2\2\u00ef \3\2\2\2\u00f0\u00f1\7d\2\2\u00f1\u00f2\7t\2"+
		"\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7m\2\2\u00f5\"\3"+
		"\2\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7p\2\2\u00f9"+
		"\u00fa\7v\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd\7w\2\2"+
		"\u00fd\u00fe\7g\2\2\u00fe$\3\2\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7h\2"+
		"\2\u0101&\3\2\2\2\u0102\u0103\7g\2\2\u0103\u0104\7n\2\2\u0104\u0105\7"+
		"u\2\2\u0105\u0106\7g\2\2\u0106(\3\2\2\2\u0107\u0108\7r\2\2\u0108\u0109"+
		"\7t\2\2\u0109\u010a\7k\2\2\u010a\u010b\7p\2\2\u010b\u010c\7v\2\2\u010c"+
		"*\3\2\2\2\u010d\u010e\7y\2\2\u010e\u010f\7j\2\2\u010f\u0110\7k\2\2\u0110"+
		"\u0111\7n\2\2\u0111\u0112\7g\2\2\u0112,\3\2\2\2\u0113\u0114\7h\2\2\u0114"+
		"\u0115\7q\2\2\u0115\u0116\7t\2\2\u0116.\3\2\2\2\u0117\u0118\7%\2\2\u0118"+
		"\u0119\7k\2\2\u0119\u011a\7p\2\2\u011a\u011b\7e\2\2\u011b\u011c\7n\2\2"+
		"\u011c\u011d\7w\2\2\u011d\u011e\7f\2\2\u011e\u011f\7g\2\2\u011f\60\3\2"+
		"\2\2\u0120\u0121\7-\2\2\u0121\u0122\7?\2\2\u0122\62\3\2\2\2\u0123\u0124"+
		"\7/\2\2\u0124\u0125\7?\2\2\u0125\64\3\2\2\2\u0126\u0127\7,\2\2\u0127\u0128"+
		"\7?\2\2\u0128\66\3\2\2\2\u0129\u012a\7\61\2\2\u012a\u012b\7?\2\2\u012b"+
		"8\3\2\2\2\u012c\u012d\7\'\2\2\u012d\u012e\7?\2\2\u012e:\3\2\2\2\u012f"+
		"\u0130\7>\2\2\u0130\u0131\7?\2\2\u0131<\3\2\2\2\u0132\u0133\7@\2\2\u0133"+
		"\u0134\7?\2\2\u0134>\3\2\2\2\u0135\u0136\7>\2\2\u0136@\3\2\2\2\u0137\u0138"+
		"\7@\2\2\u0138B\3\2\2\2\u0139\u013a\7$\2\2\u013aD\3\2\2\2\u013b\u013c\7"+
		"-\2\2\u013cF\3\2\2\2\u013d\u013e\7/\2\2\u013eH\3\2\2\2\u013f\u0140\7,"+
		"\2\2\u0140J\3\2\2\2\u0141\u0142\7\61\2\2\u0142L\3\2\2\2\u0143\u0144\7"+
		"^\2\2\u0144N\3\2\2\2\u0145\u0146\7\'\2\2\u0146P\3\2\2\2\u0147\u0148\7"+
		"?\2\2\u0148\u0149\7?\2\2\u0149R\3\2\2\2\u014a\u014b\7#\2\2\u014b\u014c"+
		"\7?\2\2\u014cT\3\2\2\2\u014d\u014e\7?\2\2\u014eV\3\2\2\2\u014f\u0150\7"+
		"(\2\2\u0150\u0151\7(\2\2\u0151X\3\2\2\2\u0152\u0153\7~\2\2\u0153\u0154"+
		"\7~\2\2\u0154Z\3\2\2\2\u0155\u0156\7#\2\2\u0156\\\3\2\2\2\u0157\u0158"+
		"\7-\2\2\u0158\u0159\7-\2\2\u0159^\3\2\2\2\u015a\u015b\7/\2\2\u015b\u015c"+
		"\7/\2\2\u015c`\3\2\2\2\u015d\u015e\7\60\2\2\u015eb\3\2\2\2\u015f\u0160"+
		"\7*\2\2\u0160d\3\2\2\2\u0161\u0162\7+\2\2\u0162f\3\2\2\2\u0163\u0164\7"+
		"}\2\2\u0164h\3\2\2\2\u0165\u0166\7\177\2\2\u0166j\3\2\2\2\u0167\u0168"+
		"\7=\2\2\u0168l\3\2\2\2\u0169\u016a\7.\2\2\u016an\3\2\2\2\u016b\u016f\t"+
		"\5\2\2\u016c\u016e\t\6\2\2\u016d\u016c\3\2\2\2\u016e\u0171\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170p\3\2\2\2\u0171\u016f\3\2\2\2"+
		"\u0172\u0174\t\7\2\2\u0173\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173"+
		"\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\b9\2\2\u0178"+
		"r\3\2\2\2\u0179\u017a\7\61\2\2\u017a\u017b\7\61\2\2\u017b\u017f\3\2\2"+
		"\2\u017c\u017e\n\b\2\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d"+
		"\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182"+
		"\u0183\b:\2\2\u0183t\3\2\2\2\u0184\u0185\7\61\2\2\u0185\u0186\7,\2\2\u0186"+
		"\u018a\3\2\2\2\u0187\u0189\13\2\2\2\u0188\u0187\3\2\2\2\u0189\u018c\3"+
		"\2\2\2\u018a\u018b\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018d\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018d\u018e\7,\2\2\u018e\u018f\7\61\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\u0191\b;\2\2\u0191v\3\2\2\2\23\2\u00a1\u00a6\u00ac\u00b3\u00b5"+
		"\u00bb\u00c2\u00c8\u00cf\u00d1\u00d7\u00d9\u016f\u0175\u017f\u018a\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}