// Generated from c:/Users/wichi/Documents/Universidad/TC/TC/demo/src/main/antlr4/com/compilador/MiLenguaje.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MiLenguajeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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
		"\u0004\u0000\u000b\u0096\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001"+
		"\u0000\u0001\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\"\b\u0001\u000b\u0001"+
		"\f\u0001#\u0001\u0002\u0004\u0002\'\b\u0002\u000b\u0002\f\u0002(\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003/\b\u0003\n\u0003"+
		"\f\u00032\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004?\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005b\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006s\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0004\bx\b\b\u000b\b\f\by\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0082\b\t\n\t\f\t\u0085"+
		"\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u008d\b\n"+
		"\n\n\f\n\u0090\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u008e"+
		"\u0000\u000b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0001\u0000\u000b\u0002"+
		"\u0000AZaz\u0004\u000009AZ__az\u0002\u0000XXxx\u0003\u000009AFaf\u0001"+
		"\u000009\u0003\u0000\n\n\r\r\"\"\u0005\u0000%%*+--//==\u0002\u0000<<>"+
		">\u0006\u0000(),,..;;{{}}\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u00ac"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0001\u0017\u0001\u0000\u0000\u0000\u0003\u001e"+
		"\u0001\u0000\u0000\u0000\u0005&\u0001\u0000\u0000\u0000\u0007*\u0001\u0000"+
		"\u0000\u0000\t>\u0001\u0000\u0000\u0000\u000ba\u0001\u0000\u0000\u0000"+
		"\rr\u0001\u0000\u0000\u0000\u000ft\u0001\u0000\u0000\u0000\u0011w\u0001"+
		"\u0000\u0000\u0000\u0013}\u0001\u0000\u0000\u0000\u0015\u0088\u0001\u0000"+
		"\u0000\u0000\u0017\u001b\u0007\u0000\u0000\u0000\u0018\u001a\u0007\u0001"+
		"\u0000\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000"+
		"\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000"+
		"\u0000\u0000\u001c\u0002\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u00050\u0000\u0000\u001f!\u0007\u0002\u0000\u0000"+
		" \"\u0007\u0003\u0000\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\u0004\u0001"+
		"\u0000\u0000\u0000%\'\u0007\u0004\u0000\u0000&%\u0001\u0000\u0000\u0000"+
		"\'(\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000)\u0006\u0001\u0000\u0000\u0000*0\u0005\"\u0000\u0000+/\b\u0005"+
		"\u0000\u0000,-\u0005\\\u0000\u0000-/\u0005\"\u0000\u0000.+\u0001\u0000"+
		"\u0000\u0000.,\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u000013\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000034\u0005\"\u0000\u00004\b\u0001\u0000\u0000"+
		"\u000056\u0005t\u0000\u000067\u0005r\u0000\u000078\u0005u\u0000\u0000"+
		"8?\u0005e\u0000\u00009:\u0005f\u0000\u0000:;\u0005a\u0000\u0000;<\u0005"+
		"l\u0000\u0000<=\u0005s\u0000\u0000=?\u0005e\u0000\u0000>5\u0001\u0000"+
		"\u0000\u0000>9\u0001\u0000\u0000\u0000?\n\u0001\u0000\u0000\u0000@A\u0005"+
		"v\u0000\u0000AB\u0005a\u0000\u0000Bb\u0005r\u0000\u0000CD\u0005i\u0000"+
		"\u0000Db\u0005f\u0000\u0000EF\u0005e\u0000\u0000FG\u0005l\u0000\u0000"+
		"GH\u0005s\u0000\u0000Hb\u0005e\u0000\u0000IJ\u0005p\u0000\u0000JK\u0005"+
		"r\u0000\u0000KL\u0005i\u0000\u0000LM\u0005n\u0000\u0000Mb\u0005t\u0000"+
		"\u0000NO\u0005w\u0000\u0000OP\u0005h\u0000\u0000PQ\u0005i\u0000\u0000"+
		"QR\u0005l\u0000\u0000Rb\u0005e\u0000\u0000ST\u0005f\u0000\u0000TU\u0005"+
		"u\u0000\u0000UV\u0005n\u0000\u0000VW\u0005c\u0000\u0000WX\u0005t\u0000"+
		"\u0000XY\u0005i\u0000\u0000YZ\u0005o\u0000\u0000Zb\u0005n\u0000\u0000"+
		"[\\\u0005r\u0000\u0000\\]\u0005e\u0000\u0000]^\u0005t\u0000\u0000^_\u0005"+
		"u\u0000\u0000_`\u0005r\u0000\u0000`b\u0005n\u0000\u0000a@\u0001\u0000"+
		"\u0000\u0000aC\u0001\u0000\u0000\u0000aE\u0001\u0000\u0000\u0000aI\u0001"+
		"\u0000\u0000\u0000aN\u0001\u0000\u0000\u0000aS\u0001\u0000\u0000\u0000"+
		"a[\u0001\u0000\u0000\u0000b\f\u0001\u0000\u0000\u0000cs\u0007\u0006\u0000"+
		"\u0000de\u0005=\u0000\u0000es\u0005=\u0000\u0000fg\u0005!\u0000\u0000"+
		"gs\u0005=\u0000\u0000hs\u0007\u0007\u0000\u0000ij\u0005<\u0000\u0000j"+
		"s\u0005=\u0000\u0000kl\u0005>\u0000\u0000ls\u0005=\u0000\u0000mn\u0005"+
		"&\u0000\u0000ns\u0005&\u0000\u0000op\u0005|\u0000\u0000ps\u0005|\u0000"+
		"\u0000qs\u0005!\u0000\u0000rc\u0001\u0000\u0000\u0000rd\u0001\u0000\u0000"+
		"\u0000rf\u0001\u0000\u0000\u0000rh\u0001\u0000\u0000\u0000ri\u0001\u0000"+
		"\u0000\u0000rk\u0001\u0000\u0000\u0000rm\u0001\u0000\u0000\u0000ro\u0001"+
		"\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000s\u000e\u0001\u0000\u0000"+
		"\u0000tu\u0007\b\u0000\u0000u\u0010\u0001\u0000\u0000\u0000vx\u0007\t"+
		"\u0000\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{|\u0006\b\u0000\u0000|\u0012\u0001\u0000\u0000\u0000}~\u0005/\u0000\u0000"+
		"~\u007f\u0005/\u0000\u0000\u007f\u0083\u0001\u0000\u0000\u0000\u0080\u0082"+
		"\b\n\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001"+
		"\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0006\t\u0000\u0000\u0087\u0014\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0005/\u0000\u0000\u0089\u008a\u0005*\u0000\u0000"+
		"\u008a\u008e\u0001\u0000\u0000\u0000\u008b\u008d\t\u0000\u0000\u0000\u008c"+
		"\u008b\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f"+
		"\u0091\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0005*\u0000\u0000\u0092\u0093\u0005/\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0006\n\u0000\u0000\u0095\u0016\u0001\u0000"+
		"\u0000\u0000\f\u0000\u001b#(.0>ary\u0083\u008e\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}