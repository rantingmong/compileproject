package app.compile;

// Generated from E:\Code\COMPILE\code.g4 by ANTLR 4.1

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class codeLexer extends Lexer
{
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
    public static final int WS = 1, TOKEN_OPEN_B = 2, TOKEN_CLOS_B = 3,
            TOKEN_OPEN_P = 4, TOKEN_CLOS_P = 5, TOKEN_OPEN_S = 6,
            TOKEN_CLOS_S = 7, TOKEN_COMMA = 8, TOKEN_SEMICOLON = 9,
            TOKEN_COLON = 10, LOGIC_1 = 11, LOGIC_2 = 12, LOGIC_3 = 13,
            ARTH_1 = 14, ARTH_2 = 15, ARTH_3 = 16, ARTH_4 = 17,
            TOKEN_GRAB = 18, TOKEN_MAIN = 19, TOKEN_FUNCTION = 20,
            TOKEN_RETURNING = 21, TOKEN_REPEAT = 22, TOKEN_UNTIL = 23,
            TOKEN_FROM = 24, TOKEN_TO = 25, TOKEN_WITH = 26,
            TOKEN_DECLARE = 27, TOKEN_AS = 28, TOKEN_IS = 29, TOKEN_IF = 30,
            TOKEN_CHECK = 31, TOKEN_OR = 32, TOKEN_ELSE = 33, TYPE = 34,
            ID = 35, NUM = 36, STRING = 37;

    public static String[] modeNames = { "DEFAULT_MODE" };

    public static final String[] tokenNames = { "<INVALID>", "WS", "'['", "']'", "'('", "')'", "'<<'", "'>>'", "','", "';'", "':'", "LOGIC_1", "LOGIC_2", "LOGIC_3", "ARTH_1", "ARTH_2", "ARTH_3", "ARTH_4", "TOKEN_GRAB", "TOKEN_MAIN", "TOKEN_FUNCTION", "TOKEN_RETURNING", "TOKEN_REPEAT", "TOKEN_UNTIL", "TOKEN_FROM", "TOKEN_TO", "TOKEN_WITH", "TOKEN_DECLARE", "TOKEN_AS", "TOKEN_IS", "TOKEN_IF", "TOKEN_CHECK", "TOKEN_OR", "TOKEN_ELSE", "TYPE", "ID", "NUM", "STRING" };
    public static final String[] ruleNames = { "WS", "TOKEN_OPEN_B", "TOKEN_CLOS_B", "TOKEN_OPEN_P", "TOKEN_CLOS_P", "TOKEN_OPEN_S", "TOKEN_CLOS_S", "TOKEN_COMMA", "TOKEN_SEMICOLON", "TOKEN_COLON", "LOGIC_1", "LOGIC_2", "LOGIC_3", "ARTH_1", "ARTH_2", "ARTH_3", "ARTH_4", "TOKEN_GRAB", "TOKEN_MAIN", "TOKEN_FUNCTION", "TOKEN_RETURNING", "TOKEN_REPEAT", "TOKEN_UNTIL", "TOKEN_FROM", "TOKEN_TO", "TOKEN_WITH", "TOKEN_DECLARE", "TOKEN_AS", "TOKEN_IS", "TOKEN_IF", "TOKEN_CHECK", "TOKEN_OR", "TOKEN_ELSE", "TYPE", "ID", "NUM", "STRING" };

    public codeLexer(CharStream input)
    {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName()
    {
        return "code.g4";
    }

    @Override
    public String[] getTokenNames()
    {
        return tokenNames;
    }

    @Override
    public String[] getRuleNames()
    {
        return ruleNames;
    }

    @Override
    public String[] getModeNames()
    {
        return modeNames;
    }

    @Override
    public ATN getATN()
    {
        return _ATN;
    }

    @Override
    public void action(RuleContext _localctx, int ruleIndex, int actionIndex)
    {
        switch (ruleIndex)
        {
        case 0:
            WS_action((RuleContext) _localctx, actionIndex);
            break;
        }
    }

    private void WS_action(RuleContext _localctx, int actionIndex)
    {
        switch (actionIndex)
        {
        case 0:
            _channel = HIDDEN;
            break;
        }
    }

    public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\'\u01ee\b\1\4\2\t" + "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" + "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" + "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" + "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3" + "\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3" + "\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f" + "\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0082\n\f\3\r\3\r\3\r\3\r\3\r" + "\3\r\3\r\3\r\3\r\3\r\5\r\u008e\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16" + "\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16" + "\u00a4\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17" + "\5\17\u00b2\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20" + "\3\20\5\20\u00c0\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c8\n\21\3" + "\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3" + "\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3" + "\22\3\22\3\22\3\22\5\22\u00ea\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23" + "\3\23\5\23\u00f4\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00fe" + "\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25" + "\3\25\3\25\3\25\5\25\u0110\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26" + "\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0124\n\26\3\27" + "\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0132\n\27" + "\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u013e\n\30\3\31" + "\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0148\n\31\3\32\3\32\3\32\3\32" + "\5\32\u014e\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0158\n" + "\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3" + "\34\5\34\u0168\n\34\3\35\3\35\3\35\3\35\5\35\u016e\n\35\3\36\3\36\3\36" + "\3\36\5\36\u0174\n\36\3\37\3\37\3\37\3\37\5\37\u017a\n\37\3 \3 \3 \3 " + "\3 \3 \3 \3 \3 \3 \5 \u0186\n \3!\3!\3!\3!\5!\u018c\n!\3\"\3\"\3\"\3\"" + "\3\"\3\"\3\"\3\"\5\"\u0196\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#" + "\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#" + "\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01ca\n#\3$\3$\7$\u01ce" + "\n$\f$\16$\u01d1\13$\3%\6%\u01d4\n%\r%\16%\u01d5\3%\7%\u01d9\n%\f%\16" + "%\u01dc\13%\3%\3%\6%\u01e0\n%\r%\16%\u01e1\5%\u01e4\n%\3&\3&\7&\u01e8" + "\n&\f&\16&\u01eb\13&\3&\3&\2\'\3\3\2\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17" + "\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22" + "\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1" + "\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1\3\2\5\5\2\13\f" + "\17\17\"\"\4\2C\\c|\5\2\62;C\\c|\u0223\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2" + "\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2" + "\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3" + "\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3" + "\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65" + "\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3" + "\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2" + "\2\5Q\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13W\3\2\2\2\rY\3\2\2\2\17\\\3\2\2" + "\2\21_\3\2\2\2\23a\3\2\2\2\25c\3\2\2\2\27\u0081\3\2\2\2\31\u008d\3\2\2" + "\2\33\u00a3\3\2\2\2\35\u00b1\3\2\2\2\37\u00bf\3\2\2\2!\u00c7\3\2\2\2#" + "\u00e9\3\2\2\2%\u00f3\3\2\2\2\'\u00fd\3\2\2\2)\u010f\3\2\2\2+\u0123\3" + "\2\2\2-\u0131\3\2\2\2/\u013d\3\2\2\2\61\u0147\3\2\2\2\63\u014d\3\2\2\2" + "\65\u0157\3\2\2\2\67\u0167\3\2\2\29\u016d\3\2\2\2;\u0173\3\2\2\2=\u0179" + "\3\2\2\2?\u0185\3\2\2\2A\u018b\3\2\2\2C\u0195\3\2\2\2E\u01c9\3\2\2\2G" + "\u01cb\3\2\2\2I\u01e3\3\2\2\2K\u01e5\3\2\2\2MN\t\2\2\2NO\3\2\2\2OP\b\2" + "\2\2P\4\3\2\2\2QR\7]\2\2R\6\3\2\2\2ST\7_\2\2T\b\3\2\2\2UV\7*\2\2V\n\3" + "\2\2\2WX\7+\2\2X\f\3\2\2\2YZ\7>\2\2Z[\7>\2\2[\16\3\2\2\2\\]\7@\2\2]^\7" + "@\2\2^\20\3\2\2\2_`\7.\2\2`\22\3\2\2\2ab\7=\2\2b\24\3\2\2\2cd\7<\2\2d" + "\26\3\2\2\2ef\7G\2\2fg\7S\2\2gh\7W\2\2hi\7C\2\2i\u0082\7N\2\2jk\7P\2\2" + "kl\7Q\2\2lm\7V\2\2mn\7a\2\2no\7G\2\2op\7S\2\2pq\7W\2\2qr\7C\2\2r\u0082" + "\7N\2\2st\7g\2\2tu\7s\2\2uv\7w\2\2vw\7c\2\2w\u0082\7n\2\2xy\7p\2\2yz\7" + "q\2\2z{\7v\2\2{|\7a\2\2|}\7g\2\2}~\7s\2\2~\177\7w\2\2\177\u0080\7c\2\2" + "\u0080\u0082\7n\2\2\u0081e\3\2\2\2\u0081j\3\2\2\2\u0081s\3\2\2\2\u0081" + "x\3\2\2\2\u0082\30\3\2\2\2\u0083\u0084\7C\2\2\u0084\u0085\7P\2\2\u0085" + "\u008e\7F\2\2\u0086\u0087\7Q\2\2\u0087\u008e\7T\2\2\u0088\u0089\7c\2\2" + "\u0089\u008a\7p\2\2\u008a\u008e\7f\2\2\u008b\u008c\7q\2\2\u008c\u008e" + "\7t\2\2\u008d\u0083\3\2\2\2\u008d\u0086\3\2\2\2\u008d\u0088\3\2\2\2\u008d" + "\u008b\3\2\2\2\u008e\32\3\2\2\2\u008f\u0090\7N\2\2\u0090\u00a4\7V\2\2" + "\u0091\u0092\7I\2\2\u0092\u00a4\7V\2\2\u0093\u0094\7N\2\2\u0094\u0095" + "\7V\2\2\u0095\u00a4\7G\2\2\u0096\u0097\7I\2\2\u0097\u0098\7V\2\2\u0098" + "\u00a4\7G\2\2\u0099\u009a\7n\2\2\u009a\u00a4\7v\2\2\u009b\u009c\7i\2\2" + "\u009c\u00a4\7v\2\2\u009d\u009e\7n\2\2\u009e\u009f\7v\2\2\u009f\u00a4" + "\7g\2\2\u00a0\u00a1\7i\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a4\7g\2\2\u00a3" + "\u008f\3\2\2\2\u00a3\u0091\3\2\2\2\u00a3\u0093\3\2\2\2\u00a3\u0096\3\2" + "\2\2\u00a3\u0099\3\2\2\2\u00a3\u009b\3\2\2\2\u00a3\u009d\3\2\2\2\u00a3" + "\u00a0\3\2\2\2\u00a4\34\3\2\2\2\u00a5\u00a6\7C\2\2\u00a6\u00a7\7F\2\2" + "\u00a7\u00b2\7F\2\2\u00a8\u00a9\7U\2\2\u00a9\u00aa\7W\2\2\u00aa\u00b2" + "\7D\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7f\2\2\u00ad\u00b2\7f\2\2\u00ae" + "\u00af\7u\2\2\u00af\u00b0\7w\2\2\u00b0\u00b2\7d\2\2\u00b1\u00a5\3\2\2" + "\2\u00b1\u00a8\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b2\36" + "\3\2\2\2\u00b3\u00b4\7O\2\2\u00b4\u00b5\7W\2\2\u00b5\u00c0\7N\2\2\u00b6" + "\u00b7\7F\2\2\u00b7\u00b8\7K\2\2\u00b8\u00c0\7X\2\2\u00b9\u00ba\7o\2\2" + "\u00ba\u00bb\7w\2\2\u00bb\u00c0\7n\2\2\u00bc\u00bd\7f\2\2\u00bd\u00be" + "\7k\2\2\u00be\u00c0\7x\2\2\u00bf\u00b3\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf" + "\u00b9\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0 \3\2\2\2\u00c1\u00c2\7O\2\2\u00c2" + "\u00c3\7Q\2\2\u00c3\u00c8\7F\2\2\u00c4\u00c5\7o\2\2\u00c5\u00c6\7q\2\2" + "\u00c6\u00c8\7f\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8\"\3" + "\2\2\2\u00c9\u00ca\7C\2\2\u00ca\u00cb\7F\2\2\u00cb\u00cc\7F\2\2\u00cc" + "\u00ea\7U\2\2\u00cd\u00ce\7U\2\2\u00ce\u00cf\7W\2\2\u00cf\u00d0\7D\2\2" + "\u00d0\u00ea\7U\2\2\u00d1\u00d2\7O\2\2\u00d2\u00d3\7W\2\2\u00d3\u00d4" + "\7N\2\2\u00d4\u00ea\7U\2\2\u00d5\u00d6\7F\2\2\u00d6\u00d7\7K\2\2\u00d7" + "\u00d8\7X\2\2\u00d8\u00ea\7U\2\2\u00d9\u00da\7c\2\2\u00da\u00db\7f\2\2" + "\u00db\u00dc\7f\2\2\u00dc\u00ea\7u\2\2\u00dd\u00de\7u\2\2\u00de\u00df" + "\7w\2\2\u00df\u00e0\7d\2\2\u00e0\u00ea\7u\2\2\u00e1\u00e2\7o\2\2\u00e2" + "\u00e3\7w\2\2\u00e3\u00e4\7n\2\2\u00e4\u00ea\7u\2\2\u00e5\u00e6\7f\2\2" + "\u00e6\u00e7\7k\2\2\u00e7\u00e8\7x\2\2\u00e8\u00ea\7u\2\2\u00e9\u00c9" + "\3\2\2\2\u00e9\u00cd\3\2\2\2\u00e9\u00d1\3\2\2\2\u00e9\u00d5\3\2\2\2\u00e9" + "\u00d9\3\2\2\2\u00e9\u00dd\3\2\2\2\u00e9\u00e1\3\2\2\2\u00e9\u00e5\3\2" + "\2\2\u00ea$\3\2\2\2\u00eb\u00ec\7i\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee" + "\7c\2\2\u00ee\u00f4\7d\2\2\u00ef\u00f0\7I\2\2\u00f0\u00f1\7T\2\2\u00f1" + "\u00f2\7C\2\2\u00f2\u00f4\7D\2\2\u00f3\u00eb\3\2\2\2\u00f3\u00ef\3\2\2" + "\2\u00f4&\3\2\2\2\u00f5\u00f6\7o\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7" + "k\2\2\u00f8\u00fe\7p\2\2\u00f9\u00fa\7O\2\2\u00fa\u00fb\7C\2\2\u00fb\u00fc" + "\7K\2\2\u00fc\u00fe\7P\2\2\u00fd\u00f5\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fe" + "(\3\2\2\2\u00ff\u0100\7h\2\2\u0100\u0101\7w\2\2\u0101\u0102\7p\2\2\u0102" + "\u0103\7e\2\2\u0103\u0104\7v\2\2\u0104\u0105\7k\2\2\u0105\u0106\7q\2\2" + "\u0106\u0110\7p\2\2\u0107\u0108\7H\2\2\u0108\u0109\7W\2\2\u0109\u010a" + "\7P\2\2\u010a\u010b\7E\2\2\u010b\u010c\7V\2\2\u010c\u010d\7K\2\2\u010d" + "\u010e\7Q\2\2\u010e\u0110\7P\2\2\u010f\u00ff\3\2\2\2\u010f\u0107\3\2\2" + "\2\u0110*\3\2\2\2\u0111\u0112\7T\2\2\u0112\u0113\7G\2\2\u0113\u0114\7" + "V\2\2\u0114\u0115\7W\2\2\u0115\u0116\7T\2\2\u0116\u0117\7P\2\2\u0117\u0118" + "\7K\2\2\u0118\u0119\7P\2\2\u0119\u0124\7I\2\2\u011a\u011b\7t\2\2\u011b" + "\u011c\7g\2\2\u011c\u011d\7v\2\2\u011d\u011e\7w\2\2\u011e\u011f\7t\2\2" + "\u011f\u0120\7p\2\2\u0120\u0121\7k\2\2\u0121\u0122\7p\2\2\u0122\u0124" + "\7i\2\2\u0123\u0111\3\2\2\2\u0123\u011a\3\2\2\2\u0124,\3\2\2\2\u0125\u0126" + "\7t\2\2\u0126\u0127\7g\2\2\u0127\u0128\7r\2\2\u0128\u0129\7g\2\2\u0129" + "\u012a\7c\2\2\u012a\u0132\7v\2\2\u012b\u012c\7T\2\2\u012c\u012d\7G\2\2" + "\u012d\u012e\7R\2\2\u012e\u012f\7G\2\2\u012f\u0130\7C\2\2\u0130\u0132" + "\7V\2\2\u0131\u0125\3\2\2\2\u0131\u012b\3\2\2\2\u0132.\3\2\2\2\u0133\u0134" + "\7w\2\2\u0134\u0135\7p\2\2\u0135\u0136\7v\2\2\u0136\u0137\7k\2\2\u0137" + "\u013e\7n\2\2\u0138\u0139\7W\2\2\u0139\u013a\7P\2\2\u013a\u013b\7V\2\2" + "\u013b\u013c\7K\2\2\u013c\u013e\7N\2\2\u013d\u0133\3\2\2\2\u013d\u0138" + "\3\2\2\2\u013e\60\3\2\2\2\u013f\u0140\7h\2\2\u0140\u0141\7t\2\2\u0141" + "\u0142\7q\2\2\u0142\u0148\7o\2\2\u0143\u0144\7H\2\2\u0144\u0145\7T\2\2" + "\u0145\u0146\7Q\2\2\u0146\u0148\7O\2\2\u0147\u013f\3\2\2\2\u0147\u0143" + "\3\2\2\2\u0148\62\3\2\2\2\u0149\u014a\7v\2\2\u014a\u014e\7q\2\2\u014b" + "\u014c\7V\2\2\u014c\u014e\7Q\2\2\u014d\u0149\3\2\2\2\u014d\u014b\3\2\2" + "\2\u014e\64\3\2\2\2\u014f\u0150\7y\2\2\u0150\u0151\7k\2\2\u0151\u0152" + "\7v\2\2\u0152\u0158\7j\2\2\u0153\u0154\7Y\2\2\u0154\u0155\7K\2\2\u0155" + "\u0156\7V\2\2\u0156\u0158\7J\2\2\u0157\u014f\3\2\2\2\u0157\u0153\3\2\2" + "\2\u0158\66\3\2\2\2\u0159\u015a\7f\2\2\u015a\u015b\7g\2\2\u015b\u015c" + "\7e\2\2\u015c\u015d\7n\2\2\u015d\u015e\7c\2\2\u015e\u015f\7t\2\2\u015f" + "\u0168\7g\2\2\u0160\u0161\7F\2\2\u0161\u0162\7G\2\2\u0162\u0163\7E\2\2" + "\u0163\u0164\7N\2\2\u0164\u0165\7C\2\2\u0165\u0166\7T\2\2\u0166\u0168" + "\7G\2\2\u0167\u0159\3\2\2\2\u0167\u0160\3\2\2\2\u01688\3\2\2\2\u0169\u016a" + "\7c\2\2\u016a\u016e\7u\2\2\u016b\u016c\7C\2\2\u016c\u016e\7U\2\2\u016d" + "\u0169\3\2\2\2\u016d\u016b\3\2\2\2\u016e:\3\2\2\2\u016f\u0170\7k\2\2\u0170" + "\u0174\7u\2\2\u0171\u0172\7K\2\2\u0172\u0174\7U\2\2\u0173\u016f\3\2\2" + "\2\u0173\u0171\3\2\2\2\u0174<\3\2\2\2\u0175\u0176\7k\2\2\u0176\u017a\7" + "h\2\2\u0177\u0178\7K\2\2\u0178\u017a\7H\2\2\u0179\u0175\3\2\2\2\u0179" + "\u0177\3\2\2\2\u017a>\3\2\2\2\u017b\u017c\7e\2\2\u017c\u017d\7j\2\2\u017d" + "\u017e\7g\2\2\u017e\u017f\7e\2\2\u017f\u0186\7m\2\2\u0180\u0181\7E\2\2" + "\u0181\u0182\7J\2\2\u0182\u0183\7G\2\2\u0183\u0184\7E\2\2\u0184\u0186" + "\7M\2\2\u0185\u017b\3\2\2\2\u0185\u0180\3\2\2\2\u0186@\3\2\2\2\u0187\u0188" + "\7q\2\2\u0188\u018c\7t\2\2\u0189\u018a\7Q\2\2\u018a\u018c\7T\2\2\u018b" + "\u0187\3\2\2\2\u018b\u0189\3\2\2\2\u018cB\3\2\2\2\u018d\u018e\7g\2\2\u018e" + "\u018f\7n\2\2\u018f\u0190\7u\2\2\u0190\u0196\7g\2\2\u0191\u0192\7G\2\2" + "\u0192\u0193\7N\2\2\u0193\u0194\7U\2\2\u0194\u0196\7G\2\2\u0195\u018d" + "\3\2\2\2\u0195\u0191\3\2\2\2\u0196D\3\2\2\2\u0197\u0198\7p\2\2\u0198\u0199" + "\7q\2\2\u0199\u019a\7v\2\2\u019a\u019b\7j\2\2\u019b\u019c\7k\2\2\u019c" + "\u019d\7p\2\2\u019d\u01ca\7i\2\2\u019e\u019f\7y\2\2\u019f\u01a0\7j\2\2" + "\u01a0\u01a1\7q\2\2\u01a1\u01a2\7n\2\2\u01a2\u01a3\7g\2\2\u01a3\u01a4" + "\7a\2\2\u01a4\u01a5\7p\2\2\u01a5\u01a6\7w\2\2\u01a6\u01a7\7o\2\2\u01a7" + "\u01a8\7d\2\2\u01a8\u01a9\7g\2\2\u01a9\u01ca\7t\2\2\u01aa\u01ab\7t\2\2" + "\u01ab\u01ac\7g\2\2\u01ac\u01ad\7c\2\2\u01ad\u01ae\7n\2\2\u01ae\u01af" + "\7a\2\2\u01af\u01b0\7p\2\2\u01b0\u01b1\7w\2\2\u01b1\u01b2\7o\2\2\u01b2" + "\u01b3\7d\2\2\u01b3\u01b4\7g\2\2\u01b4\u01ca\7t\2\2\u01b5\u01b6\7u\2\2" + "\u01b6\u01b7\7{\2\2\u01b7\u01b8\7o\2\2\u01b8\u01b9\7d\2\2\u01b9\u01ba" + "\7q\2\2\u01ba\u01ca\7n\2\2\u01bb\u01bc\7e\2\2\u01bc\u01bd\7j\2\2\u01bd" + "\u01be\7c\2\2\u01be\u01bf\7t\2\2\u01bf\u01c0\7c\2\2\u01c0\u01c1\7e\2\2" + "\u01c1\u01c2\7v\2\2\u01c2\u01c3\7g\2\2\u01c3\u01c4\7t\2\2\u01c4\u01ca" + "\7u\2\2\u01c5\u01c6\7v\2\2\u01c6\u01c7\7q\2\2\u01c7\u01c8\7t\2\2\u01c8" + "\u01ca\7h\2\2\u01c9\u0197\3\2\2\2\u01c9\u019e\3\2\2\2\u01c9\u01aa\3\2" + "\2\2\u01c9\u01b5\3\2\2\2\u01c9\u01bb\3\2\2\2\u01c9\u01c5\3\2\2\2\u01ca" + "F\3\2\2\2\u01cb\u01cf\t\3\2\2\u01cc\u01ce\t\4\2\2\u01cd\u01cc\3\2\2\2" + "\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0H\3" + "\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d4\4\62;\2\u01d3\u01d2\3\2\2\2\u01d4" + "\u01d5\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01e4\3\2" + "\2\2\u01d7\u01d9\4\62;\2\u01d8\u01d7\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da" + "\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\3\2\2\2\u01dc\u01da\3\2" + "\2\2\u01dd\u01df\7\60\2\2\u01de\u01e0\4\62;\2\u01df\u01de\3\2\2\2\u01e0" + "\u01e1\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2" + "\2\2\u01e3\u01d3\3\2\2\2\u01e3\u01da\3\2\2\2\u01e4J\3\2\2\2\u01e5\u01e9" + "\7>\2\2\u01e6\u01e8\t\4\2\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9" + "\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01e9\3\2" + "\2\2\u01ec\u01ed\7@\2\2\u01edL\3\2\2\2!\2\u0081\u008d\u00a3\u00b1\u00bf" + "\u00c7\u00e9\u00f3\u00fd\u010f\u0123\u0131\u013d\u0147\u014d\u0157\u0167" + "\u016d\u0173\u0179\u0185\u018b\u0195\u01c9\u01cf\u01d5\u01da\u01e1\u01e3" + "\u01e9";
    public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN.toCharArray());
    static
    {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++)
        {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}