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
		ID=1, HEX=2, INTEGER=3, STRING=4, BOOLEAN=5, KEYWORD=6, OPERATOR=7, SEPARATOR=8, 
		WS=9, COMMENT=10, BLOCK_COMMENT=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ID", "HEX", "INTEGER", "STRING", "BOOLEAN", "KEYWORD", "OPERATOR", "SEPARATOR", 
			"WS", "COMMENT", "BLOCK_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "HEX", "INTEGER", "STRING", "BOOLEAN", "KEYWORD", "OPERATOR", 
			"SEPARATOR", "WS", "COMMENT", "BLOCK_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r\u0098\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\3\3\3\3\3\6\3$\n\3"+
		"\r\3\16\3%\3\4\6\4)\n\4\r\4\16\4*\3\5\3\5\3\5\3\5\7\5\61\n\5\f\5\16\5"+
		"\64\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6A\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7d\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bu\n\b\3\t\3"+
		"\t\3\n\6\nz\n\n\r\n\16\n{\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u0084\n\13"+
		"\f\13\16\13\u0087\13\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u008f\n\f\f\f\16"+
		"\f\u0092\13\f\3\f\3\f\3\f\3\f\3\f\3\u0090\2\r\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\3\2\r\4\2C\\c|\6\2\62;C\\aac|\4\2ZZzz\5\2\62"+
		";CHch\3\2\62;\5\2\f\f\17\17$$\7\2\'\',-//\61\61??\4\2>>@@\b\2*+..\60\60"+
		"==}}\177\177\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u00ae\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5 \3"+
		"\2\2\2\7(\3\2\2\2\t,\3\2\2\2\13@\3\2\2\2\rc\3\2\2\2\17t\3\2\2\2\21v\3"+
		"\2\2\2\23y\3\2\2\2\25\177\3\2\2\2\27\u008a\3\2\2\2\31\35\t\2\2\2\32\34"+
		"\t\3\2\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\4"+
		"\3\2\2\2\37\35\3\2\2\2 !\7\62\2\2!#\t\4\2\2\"$\t\5\2\2#\"\3\2\2\2$%\3"+
		"\2\2\2%#\3\2\2\2%&\3\2\2\2&\6\3\2\2\2\')\t\6\2\2(\'\3\2\2\2)*\3\2\2\2"+
		"*(\3\2\2\2*+\3\2\2\2+\b\3\2\2\2,\62\7$\2\2-\61\n\7\2\2./\7^\2\2/\61\7"+
		"$\2\2\60-\3\2\2\2\60.\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2"+
		"\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\7$\2\2\66\n\3\2\2\2\678\7v\2\289"+
		"\7t\2\29:\7w\2\2:A\7g\2\2;<\7h\2\2<=\7c\2\2=>\7n\2\2>?\7u\2\2?A\7g\2\2"+
		"@\67\3\2\2\2@;\3\2\2\2A\f\3\2\2\2BC\7x\2\2CD\7c\2\2Dd\7t\2\2EF\7k\2\2"+
		"Fd\7h\2\2GH\7g\2\2HI\7n\2\2IJ\7u\2\2Jd\7g\2\2KL\7r\2\2LM\7t\2\2MN\7k\2"+
		"\2NO\7p\2\2Od\7v\2\2PQ\7y\2\2QR\7j\2\2RS\7k\2\2ST\7n\2\2Td\7g\2\2UV\7"+
		"h\2\2VW\7w\2\2WX\7p\2\2XY\7e\2\2YZ\7v\2\2Z[\7k\2\2[\\\7q\2\2\\d\7p\2\2"+
		"]^\7t\2\2^_\7g\2\2_`\7v\2\2`a\7w\2\2ab\7t\2\2bd\7p\2\2cB\3\2\2\2cE\3\2"+
		"\2\2cG\3\2\2\2cK\3\2\2\2cP\3\2\2\2cU\3\2\2\2c]\3\2\2\2d\16\3\2\2\2eu\t"+
		"\b\2\2fg\7?\2\2gu\7?\2\2hi\7#\2\2iu\7?\2\2ju\t\t\2\2kl\7>\2\2lu\7?\2\2"+
		"mn\7@\2\2nu\7?\2\2op\7(\2\2pu\7(\2\2qr\7~\2\2ru\7~\2\2su\7#\2\2te\3\2"+
		"\2\2tf\3\2\2\2th\3\2\2\2tj\3\2\2\2tk\3\2\2\2tm\3\2\2\2to\3\2\2\2tq\3\2"+
		"\2\2ts\3\2\2\2u\20\3\2\2\2vw\t\n\2\2w\22\3\2\2\2xz\t\13\2\2yx\3\2\2\2"+
		"z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\b\n\2\2~\24\3\2\2\2\177\u0080"+
		"\7\61\2\2\u0080\u0081\7\61\2\2\u0081\u0085\3\2\2\2\u0082\u0084\n\f\2\2"+
		"\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\b\13\2\2"+
		"\u0089\26\3\2\2\2\u008a\u008b\7\61\2\2\u008b\u008c\7,\2\2\u008c\u0090"+
		"\3\2\2\2\u008d\u008f\13\2\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0093\u0094\7,\2\2\u0094\u0095\7\61\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\b\f\2\2\u0097\30\3\2\2\2\16\2\35%*\60\62@ct{\u0085\u0090\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}