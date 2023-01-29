// Generated from /home/joan/Escritorio/CL/practica/examen2020/asl/Asl.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AslLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ASSIGN=8, E=9, 
		NE=10, GE=11, LE=12, GT=13, LT=14, AND=15, OR=16, NOT=17, PLUS=18, MINUS=19, 
		MUL=20, DIV=21, MOD=22, VAR=23, INT=24, BOOL=25, FLOAT=26, CHAR=27, IF=28, 
		THEN=29, ELSE=30, ENDIF=31, WHILE=32, DO=33, ENDWHILE=34, FUNC=35, ENDFUNC=36, 
		RETURN=37, READ=38, WRITE=39, ARRAY=40, OF=41, SUM=42, FILTER=43, INTO=44, 
		USING=45, BOOLVAL=46, INTVAL=47, FLOATVAL=48, CHARVAL=49, ID=50, STRING=51, 
		COMMENT=52, WS=53;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "ASSIGN", "E", 
			"NE", "GE", "LE", "GT", "LT", "AND", "OR", "NOT", "PLUS", "MINUS", "MUL", 
			"DIV", "MOD", "VAR", "INT", "BOOL", "FLOAT", "CHAR", "IF", "THEN", "ELSE", 
			"ENDIF", "WHILE", "DO", "ENDWHILE", "FUNC", "ENDFUNC", "RETURN", "READ", 
			"WRITE", "ARRAY", "OF", "SUM", "FILTER", "INTO", "USING", "BOOLVAL", 
			"INTVAL", "FLOATVAL", "CHARVAL", "ID", "STRING", "ESC_SEQ", "COMMENT", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "':'", "','", "'['", "']'", "';'", "'='", "'=='", 
			"'!='", "'>='", "'<='", "'>'", "'<'", "'and'", "'or'", "'not'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'var'", "'int'", "'bool'", "'float'", "'char'", 
			"'if'", "'then'", "'else'", "'endif'", "'while'", "'do'", "'endwhile'", 
			"'func'", "'endfunc'", "'return'", "'read'", "'write'", "'array'", "'of'", 
			"'sum'", "'filter'", "'into'", "'using'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "ASSIGN", "E", "NE", 
			"GE", "LE", "GT", "LT", "AND", "OR", "NOT", "PLUS", "MINUS", "MUL", "DIV", 
			"MOD", "VAR", "INT", "BOOL", "FLOAT", "CHAR", "IF", "THEN", "ELSE", "ENDIF", 
			"WHILE", "DO", "ENDWHILE", "FUNC", "ENDFUNC", "RETURN", "READ", "WRITE", 
			"ARRAY", "OF", "SUM", "FILTER", "INTO", "USING", "BOOLVAL", "INTVAL", 
			"FLOATVAL", "CHARVAL", "ID", "STRING", "COMMENT", "WS"
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


	public AslLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Asl.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u016d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3("+
		"\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,"+
		"\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0129"+
		"\n/\3\60\6\60\u012c\n\60\r\60\16\60\u012d\3\61\6\61\u0131\n\61\r\61\16"+
		"\61\u0132\3\61\3\61\7\61\u0137\n\61\f\61\16\61\u013a\13\61\3\62\3\62\3"+
		"\62\5\62\u013f\n\62\3\62\3\62\3\63\3\63\7\63\u0145\n\63\f\63\16\63\u0148"+
		"\13\63\3\64\3\64\3\64\7\64\u014d\n\64\f\64\16\64\u0150\13\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\7\66\u015b\n\66\f\66\16\66\u015e\13"+
		"\66\3\66\5\66\u0161\n\66\3\66\3\66\3\66\3\66\3\67\6\67\u0168\n\67\r\67"+
		"\16\67\u0169\3\67\3\67\2\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\65i\2k\66m\67\3\2\t\4\2))^^\4\2C\\c|\6\2\62;C\\aac|\4\2$"+
		"$^^\n\2$$))^^ddhhppttvv\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0176\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5q"+
		"\3\2\2\2\7s\3\2\2\2\tu\3\2\2\2\13w\3\2\2\2\ry\3\2\2\2\17{\3\2\2\2\21}"+
		"\3\2\2\2\23\177\3\2\2\2\25\u0082\3\2\2\2\27\u0085\3\2\2\2\31\u0088\3\2"+
		"\2\2\33\u008b\3\2\2\2\35\u008d\3\2\2\2\37\u008f\3\2\2\2!\u0093\3\2\2\2"+
		"#\u0096\3\2\2\2%\u009a\3\2\2\2\'\u009c\3\2\2\2)\u009e\3\2\2\2+\u00a0\3"+
		"\2\2\2-\u00a2\3\2\2\2/\u00a4\3\2\2\2\61\u00a8\3\2\2\2\63\u00ac\3\2\2\2"+
		"\65\u00b1\3\2\2\2\67\u00b7\3\2\2\29\u00bc\3\2\2\2;\u00bf\3\2\2\2=\u00c4"+
		"\3\2\2\2?\u00c9\3\2\2\2A\u00cf\3\2\2\2C\u00d5\3\2\2\2E\u00d8\3\2\2\2G"+
		"\u00e1\3\2\2\2I\u00e6\3\2\2\2K\u00ee\3\2\2\2M\u00f5\3\2\2\2O\u00fa\3\2"+
		"\2\2Q\u0100\3\2\2\2S\u0106\3\2\2\2U\u0109\3\2\2\2W\u010d\3\2\2\2Y\u0114"+
		"\3\2\2\2[\u0119\3\2\2\2]\u0128\3\2\2\2_\u012b\3\2\2\2a\u0130\3\2\2\2c"+
		"\u013b\3\2\2\2e\u0142\3\2\2\2g\u0149\3\2\2\2i\u0153\3\2\2\2k\u0156\3\2"+
		"\2\2m\u0167\3\2\2\2op\7*\2\2p\4\3\2\2\2qr\7+\2\2r\6\3\2\2\2st\7<\2\2t"+
		"\b\3\2\2\2uv\7.\2\2v\n\3\2\2\2wx\7]\2\2x\f\3\2\2\2yz\7_\2\2z\16\3\2\2"+
		"\2{|\7=\2\2|\20\3\2\2\2}~\7?\2\2~\22\3\2\2\2\177\u0080\7?\2\2\u0080\u0081"+
		"\7?\2\2\u0081\24\3\2\2\2\u0082\u0083\7#\2\2\u0083\u0084\7?\2\2\u0084\26"+
		"\3\2\2\2\u0085\u0086\7@\2\2\u0086\u0087\7?\2\2\u0087\30\3\2\2\2\u0088"+
		"\u0089\7>\2\2\u0089\u008a\7?\2\2\u008a\32\3\2\2\2\u008b\u008c\7@\2\2\u008c"+
		"\34\3\2\2\2\u008d\u008e\7>\2\2\u008e\36\3\2\2\2\u008f\u0090\7c\2\2\u0090"+
		"\u0091\7p\2\2\u0091\u0092\7f\2\2\u0092 \3\2\2\2\u0093\u0094\7q\2\2\u0094"+
		"\u0095\7t\2\2\u0095\"\3\2\2\2\u0096\u0097\7p\2\2\u0097\u0098\7q\2\2\u0098"+
		"\u0099\7v\2\2\u0099$\3\2\2\2\u009a\u009b\7-\2\2\u009b&\3\2\2\2\u009c\u009d"+
		"\7/\2\2\u009d(\3\2\2\2\u009e\u009f\7,\2\2\u009f*\3\2\2\2\u00a0\u00a1\7"+
		"\61\2\2\u00a1,\3\2\2\2\u00a2\u00a3\7\'\2\2\u00a3.\3\2\2\2\u00a4\u00a5"+
		"\7x\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7t\2\2\u00a7\60\3\2\2\2\u00a8\u00a9"+
		"\7k\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7v\2\2\u00ab\62\3\2\2\2\u00ac\u00ad"+
		"\7d\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7n\2\2\u00b0"+
		"\64\3\2\2\2\u00b1\u00b2\7h\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7q\2\2\u00b4"+
		"\u00b5\7c\2\2\u00b5\u00b6\7v\2\2\u00b6\66\3\2\2\2\u00b7\u00b8\7e\2\2\u00b8"+
		"\u00b9\7j\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7t\2\2\u00bb8\3\2\2\2\u00bc"+
		"\u00bd\7k\2\2\u00bd\u00be\7h\2\2\u00be:\3\2\2\2\u00bf\u00c0\7v\2\2\u00c0"+
		"\u00c1\7j\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7p\2\2\u00c3<\3\2\2\2\u00c4"+
		"\u00c5\7g\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7g\2\2"+
		"\u00c8>\3\2\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7f\2"+
		"\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7h\2\2\u00ce@\3\2\2\2\u00cf\u00d0\7"+
		"y\2\2\u00d0\u00d1\7j\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4"+
		"\7g\2\2\u00d4B\3\2\2\2\u00d5\u00d6\7f\2\2\u00d6\u00d7\7q\2\2\u00d7D\3"+
		"\2\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7f\2\2\u00db"+
		"\u00dc\7y\2\2\u00dc\u00dd\7j\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7n\2\2"+
		"\u00df\u00e0\7g\2\2\u00e0F\3\2\2\2\u00e1\u00e2\7h\2\2\u00e2\u00e3\7w\2"+
		"\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7e\2\2\u00e5H\3\2\2\2\u00e6\u00e7\7"+
		"g\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9\7f\2\2\u00e9\u00ea\7h\2\2\u00ea\u00eb"+
		"\7w\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7e\2\2\u00edJ\3\2\2\2\u00ee\u00ef"+
		"\7t\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7w\2\2\u00f2"+
		"\u00f3\7t\2\2\u00f3\u00f4\7p\2\2\u00f4L\3\2\2\2\u00f5\u00f6\7t\2\2\u00f6"+
		"\u00f7\7g\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7f\2\2\u00f9N\3\2\2\2\u00fa"+
		"\u00fb\7y\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7v\2\2"+
		"\u00fe\u00ff\7g\2\2\u00ffP\3\2\2\2\u0100\u0101\7c\2\2\u0101\u0102\7t\2"+
		"\2\u0102\u0103\7t\2\2\u0103\u0104\7c\2\2\u0104\u0105\7{\2\2\u0105R\3\2"+
		"\2\2\u0106\u0107\7q\2\2\u0107\u0108\7h\2\2\u0108T\3\2\2\2\u0109\u010a"+
		"\7u\2\2\u010a\u010b\7w\2\2\u010b\u010c\7o\2\2\u010cV\3\2\2\2\u010d\u010e"+
		"\7h\2\2\u010e\u010f\7k\2\2\u010f\u0110\7n\2\2\u0110\u0111\7v\2\2\u0111"+
		"\u0112\7g\2\2\u0112\u0113\7t\2\2\u0113X\3\2\2\2\u0114\u0115\7k\2\2\u0115"+
		"\u0116\7p\2\2\u0116\u0117\7v\2\2\u0117\u0118\7q\2\2\u0118Z\3\2\2\2\u0119"+
		"\u011a\7w\2\2\u011a\u011b\7u\2\2\u011b\u011c\7k\2\2\u011c\u011d\7p\2\2"+
		"\u011d\u011e\7i\2\2\u011e\\\3\2\2\2\u011f\u0120\7v\2\2\u0120\u0121\7t"+
		"\2\2\u0121\u0122\7w\2\2\u0122\u0129\7g\2\2\u0123\u0124\7h\2\2\u0124\u0125"+
		"\7c\2\2\u0125\u0126\7n\2\2\u0126\u0127\7u\2\2\u0127\u0129\7g\2\2\u0128"+
		"\u011f\3\2\2\2\u0128\u0123\3\2\2\2\u0129^\3\2\2\2\u012a\u012c\4\62;\2"+
		"\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e`\3\2\2\2\u012f\u0131\4\62;\2\u0130\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u0138\7\60\2\2\u0135\u0137\4\62;\2\u0136\u0135\3\2\2\2\u0137"+
		"\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139b\3\2\2\2"+
		"\u013a\u0138\3\2\2\2\u013b\u013e\7)\2\2\u013c\u013f\n\2\2\2\u013d\u013f"+
		"\5i\65\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0141\7)\2\2\u0141d\3\2\2\2\u0142\u0146\t\3\2\2\u0143\u0145\t\4\2\2\u0144"+
		"\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147f\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014e\7$\2\2\u014a\u014d"+
		"\5i\65\2\u014b\u014d\n\5\2\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d"+
		"\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2"+
		"\2\2\u0150\u014e\3\2\2\2\u0151\u0152\7$\2\2\u0152h\3\2\2\2\u0153\u0154"+
		"\7^\2\2\u0154\u0155\t\6\2\2\u0155j\3\2\2\2\u0156\u0157\7\61\2\2\u0157"+
		"\u0158\7\61\2\2\u0158\u015c\3\2\2\2\u0159\u015b\n\7\2\2\u015a\u0159\3"+
		"\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0161\7\17\2\2\u0160\u015f\3"+
		"\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\7\f\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0165\b\66\2\2\u0165l\3\2\2\2\u0166\u0168\t\b\2\2"+
		"\u0167\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\b\67\2\2\u016cn\3\2\2\2\16\2"+
		"\u0128\u012d\u0132\u0138\u013e\u0146\u014c\u014e\u015c\u0160\u0169\3\b"+
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