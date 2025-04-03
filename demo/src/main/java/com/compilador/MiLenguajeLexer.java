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
		ID=1, INTEGER=2, STRING=3, BOOLEAN=4, KEYWORD=5, OPERATOR=6, SEPARATOR=7, 
		WS=8, COMMENT=9, BLOCK_COMMENT=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ID", "INTEGER", "STRING", "BOOLEAN", "KEYWORD", "OPERATOR", "SEPARATOR", 
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
			null, "ID", "INTEGER", "STRING", "BOOLEAN", "KEYWORD", "OPERATOR", "SEPARATOR", 
			"WS", "COMMENT", "BLOCK_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\u008c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\6\3 \n\3\r\3\16\3!\3\4\3"+
		"\4\3\4\3\4\7\4(\n\4\f\4\16\4+\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\58\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6X\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7i\n\7\3\b\3\b\3\t\6\tn\n\t\r\t\16\to\3\t\3\t\3\n\3\n\3\n\3\n\7\nx\n"+
		"\n\f\n\16\n{\13\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u0083\n\13\f\13\16"+
		"\13\u0086\13\13\3\13\3\13\3\13\3\13\3\13\3\u0084\2\f\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\3\2\13\4\2C\\c|\6\2\62;C\\aac|\3\2\62;\5\2"+
		"\f\f\17\17$$\7\2\'\',-//\61\61??\4\2>>@@\b\2*+..\60\60==}}\177\177\5\2"+
		"\13\f\17\17\"\"\4\2\f\f\17\17\2\u00a0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\3\27\3\2\2\2\5\37\3\2\2\2\7#\3\2\2\2\t\67\3\2"+
		"\2\2\13W\3\2\2\2\rh\3\2\2\2\17j\3\2\2\2\21m\3\2\2\2\23s\3\2\2\2\25~\3"+
		"\2\2\2\27\33\t\2\2\2\30\32\t\3\2\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3"+
		"\2\2\2\33\34\3\2\2\2\34\4\3\2\2\2\35\33\3\2\2\2\36 \t\4\2\2\37\36\3\2"+
		"\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\6\3\2\2\2#)\7$\2\2$(\n\5\2\2%"+
		"&\7^\2\2&(\7$\2\2\'$\3\2\2\2\'%\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2"+
		"*,\3\2\2\2+)\3\2\2\2,-\7$\2\2-\b\3\2\2\2./\7v\2\2/\60\7t\2\2\60\61\7w"+
		"\2\2\618\7g\2\2\62\63\7h\2\2\63\64\7c\2\2\64\65\7n\2\2\65\66\7u\2\2\66"+
		"8\7g\2\2\67.\3\2\2\2\67\62\3\2\2\28\n\3\2\2\29:\7k\2\2:X\7h\2\2;<\7g\2"+
		"\2<=\7n\2\2=>\7u\2\2>X\7g\2\2?@\7r\2\2@A\7t\2\2AB\7k\2\2BC\7p\2\2CX\7"+
		"v\2\2DE\7y\2\2EF\7j\2\2FG\7k\2\2GH\7n\2\2HX\7g\2\2IJ\7h\2\2JK\7w\2\2K"+
		"L\7p\2\2LM\7e\2\2MN\7v\2\2NO\7k\2\2OP\7q\2\2PX\7p\2\2QR\7t\2\2RS\7g\2"+
		"\2ST\7v\2\2TU\7w\2\2UV\7t\2\2VX\7p\2\2W9\3\2\2\2W;\3\2\2\2W?\3\2\2\2W"+
		"D\3\2\2\2WI\3\2\2\2WQ\3\2\2\2X\f\3\2\2\2Yi\t\6\2\2Z[\7?\2\2[i\7?\2\2\\"+
		"]\7#\2\2]i\7?\2\2^i\t\7\2\2_`\7>\2\2`i\7?\2\2ab\7@\2\2bi\7?\2\2cd\7(\2"+
		"\2di\7(\2\2ef\7~\2\2fi\7~\2\2gi\7#\2\2hY\3\2\2\2hZ\3\2\2\2h\\\3\2\2\2"+
		"h^\3\2\2\2h_\3\2\2\2ha\3\2\2\2hc\3\2\2\2he\3\2\2\2hg\3\2\2\2i\16\3\2\2"+
		"\2jk\t\b\2\2k\20\3\2\2\2ln\t\t\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2"+
		"\2\2pq\3\2\2\2qr\b\t\2\2r\22\3\2\2\2st\7\61\2\2tu\7\61\2\2uy\3\2\2\2v"+
		"x\n\n\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2"+
		"|}\b\n\2\2}\24\3\2\2\2~\177\7\61\2\2\177\u0080\7,\2\2\u0080\u0084\3\2"+
		"\2\2\u0081\u0083\13\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0088\7,\2\2\u0088\u0089\7\61\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\b\13\2\2\u008b\26\3\2\2\2\r\2\33!\')\67Whoy\u0084\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}