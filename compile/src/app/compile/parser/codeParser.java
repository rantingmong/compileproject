// Generated from E:\Code\compileproject\code.g4 by ANTLR 4.1
package app.compile.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class codeParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LOGIC_1=1, LOGIC_2=2, LOGIC_3=3, ARTH_1=4, ARTH_2=5, ARTH_3=6, ARTH_4=7, 
		TOKEN_GRAB=8, TOKEN_MAIN=9, TOKEN_FUNCTION=10, TOKEN_RETURNING=11, TOKEN_REPEAT=12, 
		TOKEN_UNTIL=13, TOKEN_FROM=14, TOKEN_TO=15, TOKEN_WITH=16, TOKEN_DECLARE=17, 
		TOKEN_AS=18, TOKEN_IS=19, TOKEN_IF=20, TOKEN_CHECK=21, TOKEN_ELSE=22, 
		TOKEN_TORF=23, TOKEN_NO_PARAM=24, TOKEN_NOT=25, TYPE=26, ID=27, NUM=28, 
		STRING=29, WS=30, TOKEN_OPEN_B=31, TOKEN_CLOS_B=32, TOKEN_OPEN_P=33, TOKEN_CLOS_P=34, 
		TOKEN_OPEN_S=35, TOKEN_CLOS_S=36, TOKEN_COMMA=37, TOKEN_SEMICOLON=38, 
		TOKEN_COLON=39;
	public static final String[] tokenNames = {
		"<INVALID>", "LOGIC_1", "LOGIC_2", "LOGIC_3", "ARTH_1", "ARTH_2", "ARTH_3", 
		"ARTH_4", "TOKEN_GRAB", "TOKEN_MAIN", "TOKEN_FUNCTION", "TOKEN_RETURNING", 
		"TOKEN_REPEAT", "TOKEN_UNTIL", "TOKEN_FROM", "TOKEN_TO", "TOKEN_WITH", 
		"TOKEN_DECLARE", "TOKEN_AS", "TOKEN_IS", "TOKEN_IF", "TOKEN_CHECK", "TOKEN_ELSE", 
		"TOKEN_TORF", "TOKEN_NO_PARAM", "TOKEN_NOT", "TYPE", "ID", "NUM", "STRING", 
		"WS", "'['", "']'", "'('", "')'", "'<<'", "'>>'", "','", "';'", "':'"
	};
	public static final int
		RULE_s = 0, RULE_operator_bool1 = 1, RULE_operator_bool2 = 2, RULE_operator_bool3 = 3, 
		RULE_operator_bool4 = 4, RULE_operator_bool5 = 5, RULE_expression1 = 6, 
		RULE_expression2 = 7, RULE_expression3 = 8, RULE_expression4 = 9, RULE_expression5 = 10, 
		RULE_expression_final = 11, RULE_package_declaration = 12, RULE_main_function = 13, 
		RULE_function_declaration = 14, RULE_parameter = 15, RULE_parameter_entry = 16, 
		RULE_function_call = 17, RULE_function_arguments = 18, RULE_group_statement = 19, 
		RULE_statement = 20, RULE_return_statement = 21, RULE_function_call_statement = 22, 
		RULE_declare_statement = 23, RULE_assignment_statement = 24, RULE_logical_statement = 25, 
		RULE_conditional_statement = 26, RULE_conditional_IF = 27, RULE_conditional_SWITCH = 28, 
		RULE_conditional_SWITCH_H = 29, RULE_conditional_CASE = 30, RULE_conditional_DEFAULT = 31, 
		RULE_conditional_ELSEIF = 32, RULE_conditional_ELSE = 33, RULE_loop_statement = 34, 
		RULE_loop_DO_WHILE = 35, RULE_loop_WHILE = 36, RULE_loop_for = 37, RULE_loop_for_control = 38;
	public static final String[] ruleNames = {
		"s", "operator_bool1", "operator_bool2", "operator_bool3", "operator_bool4", 
		"operator_bool5", "expression1", "expression2", "expression3", "expression4", 
		"expression5", "expression_final", "package_declaration", "main_function", 
		"function_declaration", "parameter", "parameter_entry", "function_call", 
		"function_arguments", "group_statement", "statement", "return_statement", 
		"function_call_statement", "declare_statement", "assignment_statement", 
		"logical_statement", "conditional_statement", "conditional_IF", "conditional_SWITCH", 
		"conditional_SWITCH_H", "conditional_CASE", "conditional_DEFAULT", "conditional_ELSEIF", 
		"conditional_ELSE", "loop_statement", "loop_DO_WHILE", "loop_WHILE", "loop_for", 
		"loop_for_control"
	};

	@Override
	public String getGrammarFileName() { return "code.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public codeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public List<Main_functionContext> main_function() {
			return getRuleContexts(Main_functionContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public Main_functionContext main_function(int i) {
			return getRuleContext(Main_functionContext.class,i);
		}
		public Package_declarationContext package_declaration(int i) {
			return getRuleContext(Package_declarationContext.class,i);
		}
		public List<Package_declarationContext> package_declaration() {
			return getRuleContexts(Package_declarationContext.class);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_GRAB) {
				{
				{
				setState(78); package_declaration();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(84); function_declaration();
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_FUNCTION) {
				{
				{
				setState(90); main_function();
				}
				}
				setState(95);
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

	public static class Operator_bool1Context extends ParserRuleContext {
		public Expression5Context expression5() {
			return getRuleContext(Expression5Context.class,0);
		}
		public List<Operator_bool2Context> operator_bool2() {
			return getRuleContexts(Operator_bool2Context.class);
		}
		public Expression3Context expression3() {
			return getRuleContext(Expression3Context.class,0);
		}
		public TerminalNode LOGIC_1(int i) {
			return getToken(codeParser.LOGIC_1, i);
		}
		public Expression4Context expression4() {
			return getRuleContext(Expression4Context.class,0);
		}
		public Operator_bool5Context operator_bool5() {
			return getRuleContext(Operator_bool5Context.class,0);
		}
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public Expression_finalContext expression_final() {
			return getRuleContext(Expression_finalContext.class,0);
		}
		public Operator_bool3Context operator_bool3() {
			return getRuleContext(Operator_bool3Context.class,0);
		}
		public List<TerminalNode> LOGIC_1() { return getTokens(codeParser.LOGIC_1); }
		public Operator_bool4Context operator_bool4() {
			return getRuleContext(Operator_bool4Context.class,0);
		}
		public Operator_bool2Context operator_bool2(int i) {
			return getRuleContext(Operator_bool2Context.class,i);
		}
		public Operator_bool1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_bool1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitOperator_bool1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_bool1Context operator_bool1() throws RecognitionException {
		Operator_bool1Context _localctx = new Operator_bool1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_operator_bool1);
		int _la;
		try {
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96); expression_final();
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(97); match(LOGIC_1);
					setState(98); operator_bool2();
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); expression5();
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(105); match(LOGIC_1);
					setState(106); operator_bool2();
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112); expression4();
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(113); match(LOGIC_1);
					setState(114); operator_bool2();
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120); expression3();
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(121); match(LOGIC_1);
					setState(122); operator_bool2();
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128); expression2();
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(129); match(LOGIC_1);
					setState(130); operator_bool2();
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(136); expression1();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(137); match(LOGIC_1);
					setState(138); operator_bool2();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(144); operator_bool5();
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(145); match(LOGIC_1);
					setState(146); operator_bool2();
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(152); operator_bool4();
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(153); match(LOGIC_1);
					setState(154); operator_bool2();
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(160); operator_bool3();
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(161); match(LOGIC_1);
					setState(162); operator_bool2();
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(168); operator_bool2();
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(169); match(LOGIC_1);
					setState(170); operator_bool2();
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Operator_bool2Context extends ParserRuleContext {
		public Expression_finalContext expression_final() {
			return getRuleContext(Expression_finalContext.class,0);
		}
		public Expression5Context expression5() {
			return getRuleContext(Expression5Context.class,0);
		}
		public List<Operator_bool3Context> operator_bool3() {
			return getRuleContexts(Operator_bool3Context.class);
		}
		public Operator_bool3Context operator_bool3(int i) {
			return getRuleContext(Operator_bool3Context.class,i);
		}
		public Expression3Context expression3() {
			return getRuleContext(Expression3Context.class,0);
		}
		public Operator_bool4Context operator_bool4() {
			return getRuleContext(Operator_bool4Context.class,0);
		}
		public Operator_bool5Context operator_bool5() {
			return getRuleContext(Operator_bool5Context.class,0);
		}
		public Expression4Context expression4() {
			return getRuleContext(Expression4Context.class,0);
		}
		public TerminalNode LOGIC_2(int i) {
			return getToken(codeParser.LOGIC_2, i);
		}
		public List<TerminalNode> LOGIC_2() { return getTokens(codeParser.LOGIC_2); }
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public Operator_bool2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_bool2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitOperator_bool2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_bool2Context operator_bool2() throws RecognitionException {
		Operator_bool2Context _localctx = new Operator_bool2Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_operator_bool2);
		int _la;
		try {
			setState(250);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178); expression_final();
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(179); match(LOGIC_2);
					setState(180); operator_bool3();
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186); expression5();
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(187); match(LOGIC_2);
					setState(188); operator_bool3();
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194); expression4();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(195); match(LOGIC_2);
					setState(196); operator_bool3();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(202); expression3();
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(203); match(LOGIC_2);
					setState(204); operator_bool3();
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(210); expression2();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(211); match(LOGIC_2);
					setState(212); operator_bool3();
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(218); expression1();
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(219); match(LOGIC_2);
					setState(220); operator_bool3();
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(226); operator_bool5();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(227); match(LOGIC_2);
					setState(228); operator_bool3();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(234); operator_bool4();
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(235); match(LOGIC_2);
					setState(236); operator_bool3();
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(242); operator_bool3();
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(243); match(LOGIC_2);
					setState(244); operator_bool3();
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Operator_bool3Context extends ParserRuleContext {
		public Expression_finalContext expression_final() {
			return getRuleContext(Expression_finalContext.class,0);
		}
		public Expression5Context expression5() {
			return getRuleContext(Expression5Context.class,0);
		}
		public TerminalNode LOGIC_3(int i) {
			return getToken(codeParser.LOGIC_3, i);
		}
		public Expression3Context expression3() {
			return getRuleContext(Expression3Context.class,0);
		}
		public Operator_bool4Context operator_bool4(int i) {
			return getRuleContext(Operator_bool4Context.class,i);
		}
		public List<Operator_bool4Context> operator_bool4() {
			return getRuleContexts(Operator_bool4Context.class);
		}
		public Operator_bool5Context operator_bool5() {
			return getRuleContext(Operator_bool5Context.class,0);
		}
		public Expression4Context expression4() {
			return getRuleContext(Expression4Context.class,0);
		}
		public List<TerminalNode> LOGIC_3() { return getTokens(codeParser.LOGIC_3); }
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public Operator_bool3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_bool3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitOperator_bool3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_bool3Context operator_bool3() throws RecognitionException {
		Operator_bool3Context _localctx = new Operator_bool3Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_operator_bool3);
		int _la;
		try {
			setState(316);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252); expression_final();
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_3) {
					{
					{
					setState(253); match(LOGIC_3);
					setState(254); operator_bool4();
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260); expression5();
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_3) {
					{
					{
					setState(261); match(LOGIC_3);
					setState(262); operator_bool4();
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268); expression4();
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_3) {
					{
					{
					setState(269); match(LOGIC_3);
					setState(270); operator_bool4();
					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(276); expression3();
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_3) {
					{
					{
					setState(277); match(LOGIC_3);
					setState(278); operator_bool4();
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(284); expression2();
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_3) {
					{
					{
					setState(285); match(LOGIC_3);
					setState(286); operator_bool4();
					}
					}
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(292); expression1();
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_3) {
					{
					{
					setState(293); match(LOGIC_3);
					setState(294); operator_bool4();
					}
					}
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(300); operator_bool5();
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_3) {
					{
					{
					setState(301); match(LOGIC_3);
					setState(302); operator_bool4();
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(308); operator_bool4();
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_3) {
					{
					{
					setState(309); match(LOGIC_3);
					setState(310); operator_bool4();
					}
					}
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Operator_bool4Context extends ParserRuleContext {
		public Expression_finalContext expression_final() {
			return getRuleContext(Expression_finalContext.class,0);
		}
		public TerminalNode TOKEN_CLOS_P() { return getToken(codeParser.TOKEN_CLOS_P, 0); }
		public Expression5Context expression5() {
			return getRuleContext(Expression5Context.class,0);
		}
		public TerminalNode TOKEN_OPEN_P() { return getToken(codeParser.TOKEN_OPEN_P, 0); }
		public Expression3Context expression3() {
			return getRuleContext(Expression3Context.class,0);
		}
		public Operator_bool1Context operator_bool1() {
			return getRuleContext(Operator_bool1Context.class,0);
		}
		public Operator_bool5Context operator_bool5() {
			return getRuleContext(Operator_bool5Context.class,0);
		}
		public Expression4Context expression4() {
			return getRuleContext(Expression4Context.class,0);
		}
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public Operator_bool4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_bool4; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitOperator_bool4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_bool4Context operator_bool4() throws RecognitionException {
		Operator_bool4Context _localctx = new Operator_bool4Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_operator_bool4);
		try {
			setState(329);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318); expression_final();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319); expression5();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(320); expression4();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(321); expression3();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(322); expression2();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(323); expression1();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(324); operator_bool5();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(325); match(TOKEN_OPEN_P);
				setState(326); operator_bool1();
				setState(327); match(TOKEN_CLOS_P);
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

	public static class Operator_bool5Context extends ParserRuleContext {
		public Expression_finalContext expression_final() {
			return getRuleContext(Expression_finalContext.class,0);
		}
		public TerminalNode TOKEN_CLOS_P() { return getToken(codeParser.TOKEN_CLOS_P, 0); }
		public TerminalNode TOKEN_NOT() { return getToken(codeParser.TOKEN_NOT, 0); }
		public Expression5Context expression5() {
			return getRuleContext(Expression5Context.class,0);
		}
		public TerminalNode TOKEN_OPEN_P() { return getToken(codeParser.TOKEN_OPEN_P, 0); }
		public Expression3Context expression3() {
			return getRuleContext(Expression3Context.class,0);
		}
		public Expression4Context expression4() {
			return getRuleContext(Expression4Context.class,0);
		}
		public Logical_statementContext logical_statement() {
			return getRuleContext(Logical_statementContext.class,0);
		}
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public Operator_bool5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_bool5; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitOperator_bool5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_bool5Context operator_bool5() throws RecognitionException {
		Operator_bool5Context _localctx = new Operator_bool5Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_operator_bool5);
		try {
			setState(342);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331); expression_final();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332); expression5();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(333); expression4();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(334); expression3();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(335); expression2();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(336); expression1();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(337); match(TOKEN_NOT);
				setState(338); match(TOKEN_OPEN_P);
				setState(339); logical_statement();
				setState(340); match(TOKEN_CLOS_P);
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

	public static class Expression1Context extends ParserRuleContext {
		public Expression_finalContext expression_final() {
			return getRuleContext(Expression_finalContext.class,0);
		}
		public Expression5Context expression5() {
			return getRuleContext(Expression5Context.class,0);
		}
		public TerminalNode ARTH_1(int i) {
			return getToken(codeParser.ARTH_1, i);
		}
		public Expression3Context expression3() {
			return getRuleContext(Expression3Context.class,0);
		}
		public List<TerminalNode> ARTH_1() { return getTokens(codeParser.ARTH_1); }
		public Expression4Context expression4() {
			return getRuleContext(Expression4Context.class,0);
		}
		public Expression2Context expression2(int i) {
			return getRuleContext(Expression2Context.class,i);
		}
		public List<Expression2Context> expression2() {
			return getRuleContexts(Expression2Context.class);
		}
		public Expression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitExpression1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression1Context expression1() throws RecognitionException {
		Expression1Context _localctx = new Expression1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression1);
		int _la;
		try {
			setState(384);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344); expression_final();
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_1) {
					{
					{
					setState(345); match(ARTH_1);
					setState(346); expression2();
					}
					}
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352); expression5();
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_1) {
					{
					{
					setState(353); match(ARTH_1);
					setState(354); expression2();
					}
					}
					setState(359);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(360); expression4();
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_1) {
					{
					{
					setState(361); match(ARTH_1);
					setState(362); expression2();
					}
					}
					setState(367);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(368); expression3();
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_1) {
					{
					{
					setState(369); match(ARTH_1);
					setState(370); expression2();
					}
					}
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(376); expression2();
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_1) {
					{
					{
					setState(377); match(ARTH_1);
					setState(378); expression2();
					}
					}
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Expression2Context extends ParserRuleContext {
		public Expression_finalContext expression_final() {
			return getRuleContext(Expression_finalContext.class,0);
		}
		public Expression5Context expression5() {
			return getRuleContext(Expression5Context.class,0);
		}
		public List<Expression3Context> expression3() {
			return getRuleContexts(Expression3Context.class);
		}
		public List<TerminalNode> ARTH_2() { return getTokens(codeParser.ARTH_2); }
		public Expression3Context expression3(int i) {
			return getRuleContext(Expression3Context.class,i);
		}
		public Expression4Context expression4() {
			return getRuleContext(Expression4Context.class,0);
		}
		public TerminalNode ARTH_2(int i) {
			return getToken(codeParser.ARTH_2, i);
		}
		public Expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitExpression2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression2Context expression2() throws RecognitionException {
		Expression2Context _localctx = new Expression2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression2);
		int _la;
		try {
			setState(418);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386); expression_final();
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_2) {
					{
					{
					setState(387); match(ARTH_2);
					setState(388); expression3();
					}
					}
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394); expression5();
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_2) {
					{
					{
					setState(395); match(ARTH_2);
					setState(396); expression3();
					}
					}
					setState(401);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(402); expression4();
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_2) {
					{
					{
					setState(403); match(ARTH_2);
					setState(404); expression3();
					}
					}
					setState(409);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(410); expression3();
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_2) {
					{
					{
					setState(411); match(ARTH_2);
					setState(412); expression3();
					}
					}
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Expression3Context extends ParserRuleContext {
		public Expression_finalContext expression_final() {
			return getRuleContext(Expression_finalContext.class,0);
		}
		public Expression5Context expression5() {
			return getRuleContext(Expression5Context.class,0);
		}
		public List<TerminalNode> ARTH_3() { return getTokens(codeParser.ARTH_3); }
		public Expression4Context expression4(int i) {
			return getRuleContext(Expression4Context.class,i);
		}
		public List<Expression4Context> expression4() {
			return getRuleContexts(Expression4Context.class);
		}
		public TerminalNode ARTH_3(int i) {
			return getToken(codeParser.ARTH_3, i);
		}
		public Expression3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitExpression3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression3Context expression3() throws RecognitionException {
		Expression3Context _localctx = new Expression3Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression3);
		int _la;
		try {
			setState(444);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420); expression_final();
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_3) {
					{
					{
					setState(421); match(ARTH_3);
					setState(422); expression4();
					}
					}
					setState(427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428); expression5();
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_3) {
					{
					{
					setState(429); match(ARTH_3);
					setState(430); expression4();
					}
					}
					setState(435);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(436); expression4();
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_3) {
					{
					{
					setState(437); match(ARTH_3);
					setState(438); expression4();
					}
					}
					setState(443);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Expression4Context extends ParserRuleContext {
		public Expression_finalContext expression_final() {
			return getRuleContext(Expression_finalContext.class,0);
		}
		public Expression5Context expression5() {
			return getRuleContext(Expression5Context.class,0);
		}
		public TerminalNode ARTH_4() { return getToken(codeParser.ARTH_4, 0); }
		public Expression4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression4; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitExpression4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression4Context expression4() throws RecognitionException {
		Expression4Context _localctx = new Expression4Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression4);
		try {
			setState(450);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446); expression_final();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447); expression5();
				setState(448); match(ARTH_4);
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

	public static class Expression5Context extends ParserRuleContext {
		public Expression_finalContext expression_final() {
			return getRuleContext(Expression_finalContext.class,0);
		}
		public TerminalNode TOKEN_CLOS_P() { return getToken(codeParser.TOKEN_CLOS_P, 0); }
		public TerminalNode TOKEN_OPEN_P() { return getToken(codeParser.TOKEN_OPEN_P, 0); }
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public Expression5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression5; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitExpression5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression5Context expression5() throws RecognitionException {
		Expression5Context _localctx = new Expression5Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression5);
		try {
			setState(457);
			switch (_input.LA(1)) {
			case TOKEN_TORF:
			case ID:
			case NUM:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(452); expression_final();
				}
				break;
			case TOKEN_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(453); match(TOKEN_OPEN_P);
				setState(454); expression1();
				setState(455); match(TOKEN_CLOS_P);
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

	public static class Expression_finalContext extends ParserRuleContext {
		public TerminalNode TOKEN_TORF() { return getToken(codeParser.TOKEN_TORF, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode ID() { return getToken(codeParser.ID, 0); }
		public TerminalNode STRING() { return getToken(codeParser.STRING, 0); }
		public TerminalNode NUM() { return getToken(codeParser.NUM, 0); }
		public Expression_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_final; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitExpression_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_finalContext expression_final() throws RecognitionException {
		Expression_finalContext _localctx = new Expression_finalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression_final);
		int _la;
		try {
			setState(461);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_TORF) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460); function_call();
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

	public static class Package_declarationContext extends ParserRuleContext {
		public TerminalNode TOKEN_GRAB() { return getToken(codeParser.TOKEN_GRAB, 0); }
		public TerminalNode STRING() { return getToken(codeParser.STRING, 0); }
		public TerminalNode TOKEN_SEMICOLON() { return getToken(codeParser.TOKEN_SEMICOLON, 0); }
		public Package_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitPackage_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_declarationContext package_declaration() throws RecognitionException {
		Package_declarationContext _localctx = new Package_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_package_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463); match(TOKEN_GRAB);
			setState(464); match(STRING);
			setState(465); match(TOKEN_SEMICOLON);
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

	public static class Main_functionContext extends ParserRuleContext {
		public TerminalNode TOKEN_MAIN() { return getToken(codeParser.TOKEN_MAIN, 0); }
		public TerminalNode TOKEN_RETURNING() { return getToken(codeParser.TOKEN_RETURNING, 0); }
		public TerminalNode TOKEN_CLOS_B() { return getToken(codeParser.TOKEN_CLOS_B, 0); }
		public TerminalNode TOKEN_OPEN_B() { return getToken(codeParser.TOKEN_OPEN_B, 0); }
		public TerminalNode TOKEN_FUNCTION() { return getToken(codeParser.TOKEN_FUNCTION, 0); }
		public Group_statementContext group_statement() {
			return getRuleContext(Group_statementContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(codeParser.TYPE, 0); }
		public Main_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitMain_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_functionContext main_function() throws RecognitionException {
		Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_main_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467); match(TOKEN_FUNCTION);
			setState(468); match(TOKEN_MAIN);
			setState(469); match(TOKEN_OPEN_B);
			setState(470); match(TOKEN_CLOS_B);
			setState(471); match(TOKEN_RETURNING);
			setState(472); match(TYPE);
			setState(473); group_statement();
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

	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode TOKEN_RETURNING() { return getToken(codeParser.TOKEN_RETURNING, 0); }
		public TerminalNode TOKEN_CLOS_B() { return getToken(codeParser.TOKEN_CLOS_B, 0); }
		public TerminalNode TOKEN_OPEN_B() { return getToken(codeParser.TOKEN_OPEN_B, 0); }
		public TerminalNode TOKEN_FUNCTION() { return getToken(codeParser.TOKEN_FUNCTION, 0); }
		public Group_statementContext group_statement() {
			return getRuleContext(Group_statementContext.class,0);
		}
		public TerminalNode ID() { return getToken(codeParser.ID, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(codeParser.TYPE, 0); }
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475); match(TOKEN_FUNCTION);
			setState(476); match(ID);
			setState(477); match(TOKEN_OPEN_B);
			setState(478); parameter();
			setState(479); match(TOKEN_CLOS_B);
			setState(480); match(TOKEN_RETURNING);
			setState(481); match(TYPE);
			setState(482); group_statement();
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

	public static class ParameterContext extends ParserRuleContext {
		public Parameter_entryContext parameter_entry(int i) {
			return getRuleContext(Parameter_entryContext.class,i);
		}
		public List<Parameter_entryContext> parameter_entry() {
			return getRuleContexts(Parameter_entryContext.class);
		}
		public List<TerminalNode> TOKEN_COMMA() { return getTokens(codeParser.TOKEN_COMMA); }
		public TerminalNode TOKEN_COMMA(int i) {
			return getToken(codeParser.TOKEN_COMMA, i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(484); parameter_entry();
			}
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMMA) {
				{
				{
				setState(485); match(TOKEN_COMMA);
				setState(486); parameter_entry();
				}
				}
				setState(491);
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

	public static class Parameter_entryContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(codeParser.ID, 0); }
		public TerminalNode TOKEN_NO_PARAM() { return getToken(codeParser.TOKEN_NO_PARAM, 0); }
		public TerminalNode TYPE() { return getToken(codeParser.TYPE, 0); }
		public Parameter_entryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_entry; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitParameter_entry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_entryContext parameter_entry() throws RecognitionException {
		Parameter_entryContext _localctx = new Parameter_entryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameter_entry);
		try {
			setState(495);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(492); match(TYPE);
				setState(493); match(ID);
				}
				break;
			case TOKEN_NO_PARAM:
				enterOuterAlt(_localctx, 2);
				{
				setState(494); match(TOKEN_NO_PARAM);
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

	public static class Function_callContext extends ParserRuleContext {
		public Function_argumentsContext function_arguments() {
			return getRuleContext(Function_argumentsContext.class,0);
		}
		public TerminalNode TOKEN_CLOS_B() { return getToken(codeParser.TOKEN_CLOS_B, 0); }
		public TerminalNode TOKEN_OPEN_B() { return getToken(codeParser.TOKEN_OPEN_B, 0); }
		public TerminalNode ID() { return getToken(codeParser.ID, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497); match(ID);
			setState(498); match(TOKEN_OPEN_B);
			setState(499); function_arguments();
			setState(500); match(TOKEN_CLOS_B);
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

	public static class Function_argumentsContext extends ParserRuleContext {
		public Logical_statementContext logical_statement(int i) {
			return getRuleContext(Logical_statementContext.class,i);
		}
		public List<TerminalNode> TOKEN_COMMA() { return getTokens(codeParser.TOKEN_COMMA); }
		public List<Logical_statementContext> logical_statement() {
			return getRuleContexts(Logical_statementContext.class);
		}
		public TerminalNode TOKEN_COMMA(int i) {
			return getToken(codeParser.TOKEN_COMMA, i);
		}
		public Function_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitFunction_arguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_argumentsContext function_arguments() throws RecognitionException {
		Function_argumentsContext _localctx = new Function_argumentsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_arguments);
		int _la;
		try {
			setState(513);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_TORF) | (1L << TOKEN_NOT) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << TOKEN_OPEN_P))) != 0)) {
					{
					setState(502); logical_statement();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(505); logical_statement();
				}
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_COMMA) {
					{
					{
					setState(506); match(TOKEN_COMMA);
					setState(507); logical_statement();
					}
					}
					setState(512);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Group_statementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode TOKEN_CLOS_S() { return getToken(codeParser.TOKEN_CLOS_S, 0); }
		public TerminalNode TOKEN_OPEN_S() { return getToken(codeParser.TOKEN_OPEN_S, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Group_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitGroup_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_statementContext group_statement() throws RecognitionException {
		Group_statementContext _localctx = new Group_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_group_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515); match(TOKEN_OPEN_S);
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_RETURNING) | (1L << TOKEN_REPEAT) | (1L << TOKEN_DECLARE) | (1L << TOKEN_IF) | (1L << TOKEN_CHECK) | (1L << ID) | (1L << TOKEN_OPEN_S))) != 0)) {
				{
				{
				setState(516); statement();
				}
				}
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(522); match(TOKEN_CLOS_S);
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

	public static class StatementContext extends ParserRuleContext {
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Function_call_statementContext function_call_statement() {
			return getRuleContext(Function_call_statementContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Group_statementContext group_statement() {
			return getRuleContext(Group_statementContext.class,0);
		}
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Declare_statementContext declare_statement() {
			return getRuleContext(Declare_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statement);
		try {
			setState(531);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524); declare_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(525); group_statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(526); assignment_statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(527); conditional_statement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(528); loop_statement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(529); function_call_statement();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(530); return_statement();
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode TOKEN_RETURNING() { return getToken(codeParser.TOKEN_RETURNING, 0); }
		public Logical_statementContext logical_statement() {
			return getRuleContext(Logical_statementContext.class,0);
		}
		public TerminalNode TOKEN_SEMICOLON() { return getToken(codeParser.TOKEN_SEMICOLON, 0); }
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_return_statement);
		try {
			setState(539);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(533); match(TOKEN_RETURNING);
				setState(534); logical_statement();
				setState(535); match(TOKEN_SEMICOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(537); match(TOKEN_RETURNING);
				setState(538); match(TOKEN_SEMICOLON);
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

	public static class Function_call_statementContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode TOKEN_SEMICOLON() { return getToken(codeParser.TOKEN_SEMICOLON, 0); }
		public Function_call_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitFunction_call_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_statementContext function_call_statement() throws RecognitionException {
		Function_call_statementContext _localctx = new Function_call_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_call_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541); function_call();
			setState(542); match(TOKEN_SEMICOLON);
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

	public static class Declare_statementContext extends ParserRuleContext {
		public TerminalNode TOKEN_AS() { return getToken(codeParser.TOKEN_AS, 0); }
		public TerminalNode TOKEN_DECLARE() { return getToken(codeParser.TOKEN_DECLARE, 0); }
		public TerminalNode ID() { return getToken(codeParser.ID, 0); }
		public TerminalNode TOKEN_TO() { return getToken(codeParser.TOKEN_TO, 0); }
		public Logical_statementContext logical_statement() {
			return getRuleContext(Logical_statementContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(codeParser.TYPE, 0); }
		public TerminalNode TOKEN_SEMICOLON() { return getToken(codeParser.TOKEN_SEMICOLON, 0); }
		public Declare_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitDeclare_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_statementContext declare_statement() throws RecognitionException {
		Declare_statementContext _localctx = new Declare_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declare_statement);
		try {
			setState(557);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(544); match(TOKEN_DECLARE);
				setState(545); match(ID);
				setState(546); match(TOKEN_AS);
				setState(547); match(TYPE);
				setState(548); match(TOKEN_SEMICOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(549); match(TOKEN_DECLARE);
				setState(550); match(ID);
				setState(551); match(TOKEN_AS);
				setState(552); match(TYPE);
				setState(553); match(TOKEN_TO);
				setState(554); logical_statement();
				setState(555); match(TOKEN_SEMICOLON);
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(codeParser.ID, 0); }
		public Logical_statementContext logical_statement() {
			return getRuleContext(Logical_statementContext.class,0);
		}
		public TerminalNode TOKEN_IS() { return getToken(codeParser.TOKEN_IS, 0); }
		public TerminalNode TOKEN_SEMICOLON() { return getToken(codeParser.TOKEN_SEMICOLON, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitAssignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559); match(ID);
			setState(560); match(TOKEN_IS);
			setState(561); logical_statement();
			setState(562); match(TOKEN_SEMICOLON);
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

	public static class Logical_statementContext extends ParserRuleContext {
		public Expression_finalContext expression_final() {
			return getRuleContext(Expression_finalContext.class,0);
		}
		public Expression5Context expression5() {
			return getRuleContext(Expression5Context.class,0);
		}
		public Operator_bool2Context operator_bool2() {
			return getRuleContext(Operator_bool2Context.class,0);
		}
		public Operator_bool3Context operator_bool3() {
			return getRuleContext(Operator_bool3Context.class,0);
		}
		public Expression3Context expression3() {
			return getRuleContext(Expression3Context.class,0);
		}
		public Operator_bool4Context operator_bool4() {
			return getRuleContext(Operator_bool4Context.class,0);
		}
		public Operator_bool1Context operator_bool1() {
			return getRuleContext(Operator_bool1Context.class,0);
		}
		public Operator_bool5Context operator_bool5() {
			return getRuleContext(Operator_bool5Context.class,0);
		}
		public Expression4Context expression4() {
			return getRuleContext(Expression4Context.class,0);
		}
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public Logical_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitLogical_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_statementContext logical_statement() throws RecognitionException {
		Logical_statementContext _localctx = new Logical_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logical_statement);
		try {
			setState(575);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(564); expression_final();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(565); expression5();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(566); expression4();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(567); expression3();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(568); expression2();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(569); expression1();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(570); operator_bool5();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(571); operator_bool4();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(572); operator_bool3();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(573); operator_bool2();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(574); operator_bool1();
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

	public static class Conditional_statementContext extends ParserRuleContext {
		public Conditional_SWITCHContext conditional_SWITCH() {
			return getRuleContext(Conditional_SWITCHContext.class,0);
		}
		public Conditional_IFContext conditional_IF() {
			return getRuleContext(Conditional_IFContext.class,0);
		}
		public Conditional_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitConditional_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_statementContext conditional_statement() throws RecognitionException {
		Conditional_statementContext _localctx = new Conditional_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_conditional_statement);
		try {
			setState(579);
			switch (_input.LA(1)) {
			case TOKEN_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(577); conditional_IF();
				}
				break;
			case TOKEN_CHECK:
				enterOuterAlt(_localctx, 2);
				{
				setState(578); conditional_SWITCH();
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

	public static class Conditional_IFContext extends ParserRuleContext {
		public List<Conditional_ELSEIFContext> conditional_ELSEIF() {
			return getRuleContexts(Conditional_ELSEIFContext.class);
		}
		public Conditional_ELSEIFContext conditional_ELSEIF(int i) {
			return getRuleContext(Conditional_ELSEIFContext.class,i);
		}
		public TerminalNode TOKEN_CLOS_B() { return getToken(codeParser.TOKEN_CLOS_B, 0); }
		public TerminalNode TOKEN_OPEN_B() { return getToken(codeParser.TOKEN_OPEN_B, 0); }
		public Group_statementContext group_statement() {
			return getRuleContext(Group_statementContext.class,0);
		}
		public Logical_statementContext logical_statement() {
			return getRuleContext(Logical_statementContext.class,0);
		}
		public TerminalNode TOKEN_IF() { return getToken(codeParser.TOKEN_IF, 0); }
		public Conditional_ELSEContext conditional_ELSE() {
			return getRuleContext(Conditional_ELSEContext.class,0);
		}
		public Conditional_IFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_IF; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitConditional_IF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_IFContext conditional_IF() throws RecognitionException {
		Conditional_IFContext _localctx = new Conditional_IFContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_conditional_IF);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(581); match(TOKEN_IF);
			setState(582); match(TOKEN_OPEN_B);
			{
			setState(583); logical_statement();
			}
			setState(584); match(TOKEN_CLOS_B);
			setState(585); group_statement();
			setState(589);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(586); conditional_ELSEIF();
					}
					} 
				}
				setState(591);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			setState(593);
			_la = _input.LA(1);
			if (_la==TOKEN_ELSE) {
				{
				setState(592); conditional_ELSE();
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

	public static class Conditional_SWITCHContext extends ParserRuleContext {
		public TerminalNode TOKEN_CLOS_S() { return getToken(codeParser.TOKEN_CLOS_S, 0); }
		public Conditional_SWITCH_HContext conditional_SWITCH_H() {
			return getRuleContext(Conditional_SWITCH_HContext.class,0);
		}
		public List<Conditional_CASEContext> conditional_CASE() {
			return getRuleContexts(Conditional_CASEContext.class);
		}
		public Conditional_DEFAULTContext conditional_DEFAULT() {
			return getRuleContext(Conditional_DEFAULTContext.class,0);
		}
		public TerminalNode TOKEN_OPEN_S() { return getToken(codeParser.TOKEN_OPEN_S, 0); }
		public Conditional_CASEContext conditional_CASE(int i) {
			return getRuleContext(Conditional_CASEContext.class,i);
		}
		public Conditional_SWITCHContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_SWITCH; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitConditional_SWITCH(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_SWITCHContext conditional_SWITCH() throws RecognitionException {
		Conditional_SWITCHContext _localctx = new Conditional_SWITCHContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_conditional_SWITCH);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595); conditional_SWITCH_H();
			setState(596); match(TOKEN_OPEN_S);
			setState(598); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(597); conditional_CASE();
				}
				}
				setState(600); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TOKEN_IS );
			setState(603);
			_la = _input.LA(1);
			if (_la==TOKEN_ELSE) {
				{
				setState(602); conditional_DEFAULT();
				}
			}

			setState(605); match(TOKEN_CLOS_S);
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

	public static class Conditional_SWITCH_HContext extends ParserRuleContext {
		public TerminalNode TOKEN_CLOS_B() { return getToken(codeParser.TOKEN_CLOS_B, 0); }
		public TerminalNode TOKEN_OPEN_B() { return getToken(codeParser.TOKEN_OPEN_B, 0); }
		public TerminalNode ID() { return getToken(codeParser.ID, 0); }
		public TerminalNode TOKEN_IF() { return getToken(codeParser.TOKEN_IF, 0); }
		public TerminalNode TOKEN_CHECK() { return getToken(codeParser.TOKEN_CHECK, 0); }
		public Conditional_SWITCH_HContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_SWITCH_H; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitConditional_SWITCH_H(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_SWITCH_HContext conditional_SWITCH_H() throws RecognitionException {
		Conditional_SWITCH_HContext _localctx = new Conditional_SWITCH_HContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_conditional_SWITCH_H);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607); match(TOKEN_CHECK);
			setState(608); match(TOKEN_IF);
			setState(609); match(TOKEN_OPEN_B);
			setState(610); match(ID);
			setState(611); match(TOKEN_CLOS_B);
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

	public static class Conditional_CASEContext extends ParserRuleContext {
		public TerminalNode TOKEN_COLON() { return getToken(codeParser.TOKEN_COLON, 0); }
		public TerminalNode TOKEN_TORF() { return getToken(codeParser.TOKEN_TORF, 0); }
		public Group_statementContext group_statement() {
			return getRuleContext(Group_statementContext.class,0);
		}
		public TerminalNode STRING() { return getToken(codeParser.STRING, 0); }
		public TerminalNode TOKEN_IS() { return getToken(codeParser.TOKEN_IS, 0); }
		public TerminalNode NUM() { return getToken(codeParser.NUM, 0); }
		public Conditional_CASEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_CASE; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitConditional_CASE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_CASEContext conditional_CASE() throws RecognitionException {
		Conditional_CASEContext _localctx = new Conditional_CASEContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_conditional_CASE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613); match(TOKEN_IS);
			setState(614);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_TORF) | (1L << NUM) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(615); match(TOKEN_COLON);
			setState(616); group_statement();
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

	public static class Conditional_DEFAULTContext extends ParserRuleContext {
		public TerminalNode TOKEN_COLON() { return getToken(codeParser.TOKEN_COLON, 0); }
		public TerminalNode TOKEN_ELSE() { return getToken(codeParser.TOKEN_ELSE, 0); }
		public Group_statementContext group_statement() {
			return getRuleContext(Group_statementContext.class,0);
		}
		public Conditional_DEFAULTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_DEFAULT; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitConditional_DEFAULT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_DEFAULTContext conditional_DEFAULT() throws RecognitionException {
		Conditional_DEFAULTContext _localctx = new Conditional_DEFAULTContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_conditional_DEFAULT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618); match(TOKEN_ELSE);
			setState(619); match(TOKEN_COLON);
			setState(620); group_statement();
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

	public static class Conditional_ELSEIFContext extends ParserRuleContext {
		public TerminalNode TOKEN_CLOS_B() { return getToken(codeParser.TOKEN_CLOS_B, 0); }
		public TerminalNode TOKEN_OPEN_B() { return getToken(codeParser.TOKEN_OPEN_B, 0); }
		public TerminalNode TOKEN_ELSE() { return getToken(codeParser.TOKEN_ELSE, 0); }
		public Group_statementContext group_statement() {
			return getRuleContext(Group_statementContext.class,0);
		}
		public Logical_statementContext logical_statement() {
			return getRuleContext(Logical_statementContext.class,0);
		}
		public TerminalNode TOKEN_IF() { return getToken(codeParser.TOKEN_IF, 0); }
		public Conditional_ELSEIFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_ELSEIF; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitConditional_ELSEIF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_ELSEIFContext conditional_ELSEIF() throws RecognitionException {
		Conditional_ELSEIFContext _localctx = new Conditional_ELSEIFContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_conditional_ELSEIF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622); match(TOKEN_ELSE);
			setState(623); match(TOKEN_IF);
			setState(624); match(TOKEN_OPEN_B);
			setState(625); logical_statement();
			setState(626); match(TOKEN_CLOS_B);
			setState(627); group_statement();
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

	public static class Conditional_ELSEContext extends ParserRuleContext {
		public TerminalNode TOKEN_ELSE() { return getToken(codeParser.TOKEN_ELSE, 0); }
		public Group_statementContext group_statement() {
			return getRuleContext(Group_statementContext.class,0);
		}
		public Conditional_ELSEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_ELSE; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitConditional_ELSE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_ELSEContext conditional_ELSE() throws RecognitionException {
		Conditional_ELSEContext _localctx = new Conditional_ELSEContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_conditional_ELSE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629); match(TOKEN_ELSE);
			setState(630); group_statement();
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

	public static class Loop_statementContext extends ParserRuleContext {
		public Loop_WHILEContext loop_WHILE() {
			return getRuleContext(Loop_WHILEContext.class,0);
		}
		public Loop_forContext loop_for() {
			return getRuleContext(Loop_forContext.class,0);
		}
		public Loop_DO_WHILEContext loop_DO_WHILE() {
			return getRuleContext(Loop_DO_WHILEContext.class,0);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitLoop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_loop_statement);
		try {
			setState(635);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(632); loop_DO_WHILE();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(633); loop_WHILE();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(634); loop_for();
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

	public static class Loop_DO_WHILEContext extends ParserRuleContext {
		public TerminalNode TOKEN_CLOS_B() { return getToken(codeParser.TOKEN_CLOS_B, 0); }
		public TerminalNode TOKEN_OPEN_B() { return getToken(codeParser.TOKEN_OPEN_B, 0); }
		public Group_statementContext group_statement() {
			return getRuleContext(Group_statementContext.class,0);
		}
		public TerminalNode TOKEN_REPEAT() { return getToken(codeParser.TOKEN_REPEAT, 0); }
		public Logical_statementContext logical_statement() {
			return getRuleContext(Logical_statementContext.class,0);
		}
		public TerminalNode TOKEN_UNTIL() { return getToken(codeParser.TOKEN_UNTIL, 0); }
		public TerminalNode TOKEN_SEMICOLON() { return getToken(codeParser.TOKEN_SEMICOLON, 0); }
		public Loop_DO_WHILEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_DO_WHILE; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitLoop_DO_WHILE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_DO_WHILEContext loop_DO_WHILE() throws RecognitionException {
		Loop_DO_WHILEContext _localctx = new Loop_DO_WHILEContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_loop_DO_WHILE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637); match(TOKEN_REPEAT);
			setState(638); group_statement();
			setState(639); match(TOKEN_UNTIL);
			setState(640); match(TOKEN_OPEN_B);
			setState(641); logical_statement();
			setState(642); match(TOKEN_CLOS_B);
			setState(643); match(TOKEN_SEMICOLON);
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

	public static class Loop_WHILEContext extends ParserRuleContext {
		public TerminalNode TOKEN_CLOS_B() { return getToken(codeParser.TOKEN_CLOS_B, 0); }
		public TerminalNode TOKEN_OPEN_B() { return getToken(codeParser.TOKEN_OPEN_B, 0); }
		public Group_statementContext group_statement() {
			return getRuleContext(Group_statementContext.class,0);
		}
		public TerminalNode TOKEN_REPEAT() { return getToken(codeParser.TOKEN_REPEAT, 0); }
		public Logical_statementContext logical_statement() {
			return getRuleContext(Logical_statementContext.class,0);
		}
		public TerminalNode TOKEN_UNTIL() { return getToken(codeParser.TOKEN_UNTIL, 0); }
		public Loop_WHILEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_WHILE; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitLoop_WHILE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_WHILEContext loop_WHILE() throws RecognitionException {
		Loop_WHILEContext _localctx = new Loop_WHILEContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_loop_WHILE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645); match(TOKEN_REPEAT);
			setState(646); match(TOKEN_UNTIL);
			setState(647); match(TOKEN_OPEN_B);
			setState(648); logical_statement();
			setState(649); match(TOKEN_CLOS_B);
			setState(650); group_statement();
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

	public static class Loop_forContext extends ParserRuleContext {
		public TerminalNode TOKEN_WITH() { return getToken(codeParser.TOKEN_WITH, 0); }
		public Loop_for_controlContext loop_for_control() {
			return getRuleContext(Loop_for_controlContext.class,0);
		}
		public Group_statementContext group_statement() {
			return getRuleContext(Group_statementContext.class,0);
		}
		public TerminalNode ID() { return getToken(codeParser.ID, 0); }
		public TerminalNode TOKEN_REPEAT() { return getToken(codeParser.TOKEN_REPEAT, 0); }
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public TerminalNode TYPE() { return getToken(codeParser.TYPE, 0); }
		public Loop_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_for; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitLoop_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_forContext loop_for() throws RecognitionException {
		Loop_forContext _localctx = new Loop_forContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_loop_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652); match(TOKEN_REPEAT);
			setState(653); match(TYPE);
			setState(654); match(ID);
			setState(655); loop_for_control();
			setState(658);
			_la = _input.LA(1);
			if (_la==TOKEN_WITH) {
				{
				setState(656); match(TOKEN_WITH);
				setState(657); expression1();
				}
			}

			setState(660); group_statement();
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

	public static class Loop_for_controlContext extends ParserRuleContext {
		public TerminalNode TOKEN_FROM() { return getToken(codeParser.TOKEN_FROM, 0); }
		public TerminalNode TOKEN_TO() { return getToken(codeParser.TOKEN_TO, 0); }
		public Expression1Context expression1(int i) {
			return getRuleContext(Expression1Context.class,i);
		}
		public List<Expression1Context> expression1() {
			return getRuleContexts(Expression1Context.class);
		}
		public Loop_for_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_for_control; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitLoop_for_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_for_controlContext loop_for_control() throws RecognitionException {
		Loop_for_controlContext _localctx = new Loop_for_controlContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_loop_for_control);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662); match(TOKEN_FROM);
			setState(663); expression1();
			setState(664); match(TOKEN_TO);
			setState(665); expression1();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3)\u029e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\7\2R\n\2\f\2\16"+
		"\2U\13\2\3\2\7\2X\n\2\f\2\16\2[\13\2\3\2\7\2^\n\2\f\2\16\2a\13\2\3\3\3"+
		"\3\3\3\7\3f\n\3\f\3\16\3i\13\3\3\3\3\3\3\3\7\3n\n\3\f\3\16\3q\13\3\3\3"+
		"\3\3\3\3\7\3v\n\3\f\3\16\3y\13\3\3\3\3\3\3\3\7\3~\n\3\f\3\16\3\u0081\13"+
		"\3\3\3\3\3\3\3\7\3\u0086\n\3\f\3\16\3\u0089\13\3\3\3\3\3\3\3\7\3\u008e"+
		"\n\3\f\3\16\3\u0091\13\3\3\3\3\3\3\3\7\3\u0096\n\3\f\3\16\3\u0099\13\3"+
		"\3\3\3\3\3\3\7\3\u009e\n\3\f\3\16\3\u00a1\13\3\3\3\3\3\3\3\7\3\u00a6\n"+
		"\3\f\3\16\3\u00a9\13\3\3\3\3\3\3\3\7\3\u00ae\n\3\f\3\16\3\u00b1\13\3\5"+
		"\3\u00b3\n\3\3\4\3\4\3\4\7\4\u00b8\n\4\f\4\16\4\u00bb\13\4\3\4\3\4\3\4"+
		"\7\4\u00c0\n\4\f\4\16\4\u00c3\13\4\3\4\3\4\3\4\7\4\u00c8\n\4\f\4\16\4"+
		"\u00cb\13\4\3\4\3\4\3\4\7\4\u00d0\n\4\f\4\16\4\u00d3\13\4\3\4\3\4\3\4"+
		"\7\4\u00d8\n\4\f\4\16\4\u00db\13\4\3\4\3\4\3\4\7\4\u00e0\n\4\f\4\16\4"+
		"\u00e3\13\4\3\4\3\4\3\4\7\4\u00e8\n\4\f\4\16\4\u00eb\13\4\3\4\3\4\3\4"+
		"\7\4\u00f0\n\4\f\4\16\4\u00f3\13\4\3\4\3\4\3\4\7\4\u00f8\n\4\f\4\16\4"+
		"\u00fb\13\4\5\4\u00fd\n\4\3\5\3\5\3\5\7\5\u0102\n\5\f\5\16\5\u0105\13"+
		"\5\3\5\3\5\3\5\7\5\u010a\n\5\f\5\16\5\u010d\13\5\3\5\3\5\3\5\7\5\u0112"+
		"\n\5\f\5\16\5\u0115\13\5\3\5\3\5\3\5\7\5\u011a\n\5\f\5\16\5\u011d\13\5"+
		"\3\5\3\5\3\5\7\5\u0122\n\5\f\5\16\5\u0125\13\5\3\5\3\5\3\5\7\5\u012a\n"+
		"\5\f\5\16\5\u012d\13\5\3\5\3\5\3\5\7\5\u0132\n\5\f\5\16\5\u0135\13\5\3"+
		"\5\3\5\3\5\7\5\u013a\n\5\f\5\16\5\u013d\13\5\5\5\u013f\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u014c\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u0159\n\7\3\b\3\b\3\b\7\b\u015e\n\b\f\b\16\b"+
		"\u0161\13\b\3\b\3\b\3\b\7\b\u0166\n\b\f\b\16\b\u0169\13\b\3\b\3\b\3\b"+
		"\7\b\u016e\n\b\f\b\16\b\u0171\13\b\3\b\3\b\3\b\7\b\u0176\n\b\f\b\16\b"+
		"\u0179\13\b\3\b\3\b\3\b\7\b\u017e\n\b\f\b\16\b\u0181\13\b\5\b\u0183\n"+
		"\b\3\t\3\t\3\t\7\t\u0188\n\t\f\t\16\t\u018b\13\t\3\t\3\t\3\t\7\t\u0190"+
		"\n\t\f\t\16\t\u0193\13\t\3\t\3\t\3\t\7\t\u0198\n\t\f\t\16\t\u019b\13\t"+
		"\3\t\3\t\3\t\7\t\u01a0\n\t\f\t\16\t\u01a3\13\t\5\t\u01a5\n\t\3\n\3\n\3"+
		"\n\7\n\u01aa\n\n\f\n\16\n\u01ad\13\n\3\n\3\n\3\n\7\n\u01b2\n\n\f\n\16"+
		"\n\u01b5\13\n\3\n\3\n\3\n\7\n\u01ba\n\n\f\n\16\n\u01bd\13\n\5\n\u01bf"+
		"\n\n\3\13\3\13\3\13\3\13\5\13\u01c5\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u01cc"+
		"\n\f\3\r\3\r\5\r\u01d0\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\7\21\u01ea\n\21\f\21\16\21\u01ed\13\21\3\22\3\22\3\22\5\22\u01f2"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\24\5\24\u01fa\n\24\3\24\3\24\3\24\7\24"+
		"\u01ff\n\24\f\24\16\24\u0202\13\24\5\24\u0204\n\24\3\25\3\25\7\25\u0208"+
		"\n\25\f\25\16\25\u020b\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\5\26\u0216\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u021e\n\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0230\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0242\n\33\3\34\3\34\5\34\u0246\n"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u024e\n\35\f\35\16\35\u0251\13"+
		"\35\3\35\5\35\u0254\n\35\3\36\3\36\3\36\6\36\u0259\n\36\r\36\16\36\u025a"+
		"\3\36\5\36\u025e\n\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3"+
		" \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\5$\u027e"+
		"\n$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\5\'\u0295\n\'\3\'\3\'\3(\3(\3(\3(\3(\3(\2)\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLN\2\4\4\2\31\31\35\37\4"+
		"\2\31\31\36\37\u02f1\2S\3\2\2\2\4\u00b2\3\2\2\2\6\u00fc\3\2\2\2\b\u013e"+
		"\3\2\2\2\n\u014b\3\2\2\2\f\u0158\3\2\2\2\16\u0182\3\2\2\2\20\u01a4\3\2"+
		"\2\2\22\u01be\3\2\2\2\24\u01c4\3\2\2\2\26\u01cb\3\2\2\2\30\u01cf\3\2\2"+
		"\2\32\u01d1\3\2\2\2\34\u01d5\3\2\2\2\36\u01dd\3\2\2\2 \u01e6\3\2\2\2\""+
		"\u01f1\3\2\2\2$\u01f3\3\2\2\2&\u0203\3\2\2\2(\u0205\3\2\2\2*\u0215\3\2"+
		"\2\2,\u021d\3\2\2\2.\u021f\3\2\2\2\60\u022f\3\2\2\2\62\u0231\3\2\2\2\64"+
		"\u0241\3\2\2\2\66\u0245\3\2\2\28\u0247\3\2\2\2:\u0255\3\2\2\2<\u0261\3"+
		"\2\2\2>\u0267\3\2\2\2@\u026c\3\2\2\2B\u0270\3\2\2\2D\u0277\3\2\2\2F\u027d"+
		"\3\2\2\2H\u027f\3\2\2\2J\u0287\3\2\2\2L\u028e\3\2\2\2N\u0298\3\2\2\2P"+
		"R\5\32\16\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TY\3\2\2\2US\3\2\2"+
		"\2VX\5\36\20\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z_\3\2\2\2[Y\3\2"+
		"\2\2\\^\5\34\17\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\3\3\2\2\2"+
		"a_\3\2\2\2bg\5\30\r\2cd\7\3\2\2df\5\6\4\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2"+
		"\2gh\3\2\2\2h\u00b3\3\2\2\2ig\3\2\2\2jo\5\26\f\2kl\7\3\2\2ln\5\6\4\2m"+
		"k\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\u00b3\3\2\2\2qo\3\2\2\2rw\5\24"+
		"\13\2st\7\3\2\2tv\5\6\4\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\u00b3"+
		"\3\2\2\2yw\3\2\2\2z\177\5\22\n\2{|\7\3\2\2|~\5\6\4\2}{\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u00b3\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0082\u0087\5\20\t\2\u0083\u0084\7\3\2\2\u0084\u0086\5\6\4\2"+
		"\u0085\u0083\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u00b3\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008f\5\16\b\2"+
		"\u008b\u008c\7\3\2\2\u008c\u008e\5\6\4\2\u008d\u008b\3\2\2\2\u008e\u0091"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u00b3\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0097\5\f\7\2\u0093\u0094\7\3\2\2\u0094\u0096\5\6"+
		"\4\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u00b3\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009f\5\n"+
		"\6\2\u009b\u009c\7\3\2\2\u009c\u009e\5\6\4\2\u009d\u009b\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00b3\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a7\5\b\5\2\u00a3\u00a4\7\3\2\2\u00a4"+
		"\u00a6\5\6\4\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00b3\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00af\5\6\4\2\u00ab\u00ac\7\3\2\2\u00ac\u00ae\5\6\4\2\u00ad\u00ab\3\2"+
		"\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2b\3\2\2\2\u00b2j\3\2\2\2\u00b2"+
		"r\3\2\2\2\u00b2z\3\2\2\2\u00b2\u0082\3\2\2\2\u00b2\u008a\3\2\2\2\u00b2"+
		"\u0092\3\2\2\2\u00b2\u009a\3\2\2\2\u00b2\u00a2\3\2\2\2\u00b2\u00aa\3\2"+
		"\2\2\u00b3\5\3\2\2\2\u00b4\u00b9\5\30\r\2\u00b5\u00b6\7\4\2\2\u00b6\u00b8"+
		"\5\b\5\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00fd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00c1\5\26"+
		"\f\2\u00bd\u00be\7\4\2\2\u00be\u00c0\5\b\5\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00fd\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c9\5\24\13\2\u00c5\u00c6\7\4\2\2\u00c6"+
		"\u00c8\5\b\5\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00fd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00d1\5\22\n\2\u00cd\u00ce\7\4\2\2\u00ce\u00d0\5\b\5\2\u00cf\u00cd\3"+
		"\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00fd\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d9\5\20\t\2\u00d5\u00d6\7"+
		"\4\2\2\u00d6\u00d8\5\b\5\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00fd\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00dc\u00e1\5\16\b\2\u00dd\u00de\7\4\2\2\u00de\u00e0\5\b\5\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00fd\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e9\5\f\7\2\u00e5"+
		"\u00e6\7\4\2\2\u00e6\u00e8\5\b\5\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00fd\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00ec\u00f1\5\n\6\2\u00ed\u00ee\7\4\2\2\u00ee\u00f0\5\b"+
		"\5\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00fd\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f9\5\b"+
		"\5\2\u00f5\u00f6\7\4\2\2\u00f6\u00f8\5\b\5\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fd\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00b4\3\2\2\2\u00fc\u00bc\3\2\2\2\u00fc"+
		"\u00c4\3\2\2\2\u00fc\u00cc\3\2\2\2\u00fc\u00d4\3\2\2\2\u00fc\u00dc\3\2"+
		"\2\2\u00fc\u00e4\3\2\2\2\u00fc\u00ec\3\2\2\2\u00fc\u00f4\3\2\2\2\u00fd"+
		"\7\3\2\2\2\u00fe\u0103\5\30\r\2\u00ff\u0100\7\5\2\2\u0100\u0102\5\n\6"+
		"\2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u013f\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u010b\5\26\f\2"+
		"\u0107\u0108\7\5\2\2\u0108\u010a\5\n\6\2\u0109\u0107\3\2\2\2\u010a\u010d"+
		"\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u013f\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u0113\5\24\13\2\u010f\u0110\7\5\2\2\u0110\u0112\5"+
		"\n\6\2\u0111\u010f\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u013f\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u011b\5\22"+
		"\n\2\u0117\u0118\7\5\2\2\u0118\u011a\5\n\6\2\u0119\u0117\3\2\2\2\u011a"+
		"\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u013f\3\2"+
		"\2\2\u011d\u011b\3\2\2\2\u011e\u0123\5\20\t\2\u011f\u0120\7\5\2\2\u0120"+
		"\u0122\5\n\6\2\u0121\u011f\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2"+
		"\2\2\u0123\u0124\3\2\2\2\u0124\u013f\3\2\2\2\u0125\u0123\3\2\2\2\u0126"+
		"\u012b\5\16\b\2\u0127\u0128\7\5\2\2\u0128\u012a\5\n\6\2\u0129\u0127\3"+
		"\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u013f\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0133\5\f\7\2\u012f\u0130\7\5"+
		"\2\2\u0130\u0132\5\n\6\2\u0131\u012f\3\2\2\2\u0132\u0135\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u013f\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0136\u013b\5\n\6\2\u0137\u0138\7\5\2\2\u0138\u013a\5\n\6\2\u0139"+
		"\u0137\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u00fe\3\2\2\2\u013e"+
		"\u0106\3\2\2\2\u013e\u010e\3\2\2\2\u013e\u0116\3\2\2\2\u013e\u011e\3\2"+
		"\2\2\u013e\u0126\3\2\2\2\u013e\u012e\3\2\2\2\u013e\u0136\3\2\2\2\u013f"+
		"\t\3\2\2\2\u0140\u014c\5\30\r\2\u0141\u014c\5\26\f\2\u0142\u014c\5\24"+
		"\13\2\u0143\u014c\5\22\n\2\u0144\u014c\5\20\t\2\u0145\u014c\5\16\b\2\u0146"+
		"\u014c\5\f\7\2\u0147\u0148\7#\2\2\u0148\u0149\5\4\3\2\u0149\u014a\7$\2"+
		"\2\u014a\u014c\3\2\2\2\u014b\u0140\3\2\2\2\u014b\u0141\3\2\2\2\u014b\u0142"+
		"\3\2\2\2\u014b\u0143\3\2\2\2\u014b\u0144\3\2\2\2\u014b\u0145\3\2\2\2\u014b"+
		"\u0146\3\2\2\2\u014b\u0147\3\2\2\2\u014c\13\3\2\2\2\u014d\u0159\5\30\r"+
		"\2\u014e\u0159\5\26\f\2\u014f\u0159\5\24\13\2\u0150\u0159\5\22\n\2\u0151"+
		"\u0159\5\20\t\2\u0152\u0159\5\16\b\2\u0153\u0154\7\33\2\2\u0154\u0155"+
		"\7#\2\2\u0155\u0156\5\64\33\2\u0156\u0157\7$\2\2\u0157\u0159\3\2\2\2\u0158"+
		"\u014d\3\2\2\2\u0158\u014e\3\2\2\2\u0158\u014f\3\2\2\2\u0158\u0150\3\2"+
		"\2\2\u0158\u0151\3\2\2\2\u0158\u0152\3\2\2\2\u0158\u0153\3\2\2\2\u0159"+
		"\r\3\2\2\2\u015a\u015f\5\30\r\2\u015b\u015c\7\6\2\2\u015c\u015e\5\20\t"+
		"\2\u015d\u015b\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\u0183\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0167\5\26\f\2"+
		"\u0163\u0164\7\6\2\2\u0164\u0166\5\20\t\2\u0165\u0163\3\2\2\2\u0166\u0169"+
		"\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0183\3\2\2\2\u0169"+
		"\u0167\3\2\2\2\u016a\u016f\5\24\13\2\u016b\u016c\7\6\2\2\u016c\u016e\5"+
		"\20\t\2\u016d\u016b\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0183\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0177\5\22"+
		"\n\2\u0173\u0174\7\6\2\2\u0174\u0176\5\20\t\2\u0175\u0173\3\2\2\2\u0176"+
		"\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0183\3\2"+
		"\2\2\u0179\u0177\3\2\2\2\u017a\u017f\5\20\t\2\u017b\u017c\7\6\2\2\u017c"+
		"\u017e\5\20\t\2\u017d\u017b\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3"+
		"\2\2\2\u017f\u0180\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0182"+
		"\u015a\3\2\2\2\u0182\u0162\3\2\2\2\u0182\u016a\3\2\2\2\u0182\u0172\3\2"+
		"\2\2\u0182\u017a\3\2\2\2\u0183\17\3\2\2\2\u0184\u0189\5\30\r\2\u0185\u0186"+
		"\7\7\2\2\u0186\u0188\5\22\n\2\u0187\u0185\3\2\2\2\u0188\u018b\3\2\2\2"+
		"\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u01a5\3\2\2\2\u018b\u0189"+
		"\3\2\2\2\u018c\u0191\5\26\f\2\u018d\u018e\7\7\2\2\u018e\u0190\5\22\n\2"+
		"\u018f\u018d\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192"+
		"\3\2\2\2\u0192\u01a5\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0199\5\24\13\2"+
		"\u0195\u0196\7\7\2\2\u0196\u0198\5\22\n\2\u0197\u0195\3\2\2\2\u0198\u019b"+
		"\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u01a5\3\2\2\2\u019b"+
		"\u0199\3\2\2\2\u019c\u01a1\5\22\n\2\u019d\u019e\7\7\2\2\u019e\u01a0\5"+
		"\22\n\2\u019f\u019d\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u0184\3\2"+
		"\2\2\u01a4\u018c\3\2\2\2\u01a4\u0194\3\2\2\2\u01a4\u019c\3\2\2\2\u01a5"+
		"\21\3\2\2\2\u01a6\u01ab\5\30\r\2\u01a7\u01a8\7\b\2\2\u01a8\u01aa\5\24"+
		"\13\2\u01a9\u01a7\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac\u01bf\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01b3\5\26"+
		"\f\2\u01af\u01b0\7\b\2\2\u01b0\u01b2\5\24\13\2\u01b1\u01af\3\2\2\2\u01b2"+
		"\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01bf\3\2"+
		"\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01bb\5\24\13\2\u01b7\u01b8\7\b\2\2\u01b8"+
		"\u01ba\5\24\13\2\u01b9\u01b7\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3"+
		"\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be"+
		"\u01a6\3\2\2\2\u01be\u01ae\3\2\2\2\u01be\u01b6\3\2\2\2\u01bf\23\3\2\2"+
		"\2\u01c0\u01c5\5\30\r\2\u01c1\u01c2\5\26\f\2\u01c2\u01c3\7\t\2\2\u01c3"+
		"\u01c5\3\2\2\2\u01c4\u01c0\3\2\2\2\u01c4\u01c1\3\2\2\2\u01c5\25\3\2\2"+
		"\2\u01c6\u01cc\5\30\r\2\u01c7\u01c8\7#\2\2\u01c8\u01c9\5\16\b\2\u01c9"+
		"\u01ca\7$\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01c6\3\2\2\2\u01cb\u01c7\3\2"+
		"\2\2\u01cc\27\3\2\2\2\u01cd\u01d0\t\2\2\2\u01ce\u01d0\5$\23\2\u01cf\u01cd"+
		"\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0\31\3\2\2\2\u01d1\u01d2\7\n\2\2\u01d2"+
		"\u01d3\7\37\2\2\u01d3\u01d4\7(\2\2\u01d4\33\3\2\2\2\u01d5\u01d6\7\f\2"+
		"\2\u01d6\u01d7\7\13\2\2\u01d7\u01d8\7!\2\2\u01d8\u01d9\7\"\2\2\u01d9\u01da"+
		"\7\r\2\2\u01da\u01db\7\34\2\2\u01db\u01dc\5(\25\2\u01dc\35\3\2\2\2\u01dd"+
		"\u01de\7\f\2\2\u01de\u01df\7\35\2\2\u01df\u01e0\7!\2\2\u01e0\u01e1\5 "+
		"\21\2\u01e1\u01e2\7\"\2\2\u01e2\u01e3\7\r\2\2\u01e3\u01e4\7\34\2\2\u01e4"+
		"\u01e5\5(\25\2\u01e5\37\3\2\2\2\u01e6\u01eb\5\"\22\2\u01e7\u01e8\7\'\2"+
		"\2\u01e8\u01ea\5\"\22\2\u01e9\u01e7\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec!\3\2\2\2\u01ed\u01eb\3\2\2\2"+
		"\u01ee\u01ef\7\34\2\2\u01ef\u01f2\7\35\2\2\u01f0\u01f2\7\32\2\2\u01f1"+
		"\u01ee\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2#\3\2\2\2\u01f3\u01f4\7\35\2\2"+
		"\u01f4\u01f5\7!\2\2\u01f5\u01f6\5&\24\2\u01f6\u01f7\7\"\2\2\u01f7%\3\2"+
		"\2\2\u01f8\u01fa\5\64\33\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"\u0204\3\2\2\2\u01fb\u0200\5\64\33\2\u01fc\u01fd\7\'\2\2\u01fd\u01ff\5"+
		"\64\33\2\u01fe\u01fc\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200"+
		"\u0201\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u01f9\3\2"+
		"\2\2\u0203\u01fb\3\2\2\2\u0204\'\3\2\2\2\u0205\u0209\7%\2\2\u0206\u0208"+
		"\5*\26\2\u0207\u0206\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020d\7&"+
		"\2\2\u020d)\3\2\2\2\u020e\u0216\5\60\31\2\u020f\u0216\5(\25\2\u0210\u0216"+
		"\5\62\32\2\u0211\u0216\5\66\34\2\u0212\u0216\5F$\2\u0213\u0216\5.\30\2"+
		"\u0214\u0216\5,\27\2\u0215\u020e\3\2\2\2\u0215\u020f\3\2\2\2\u0215\u0210"+
		"\3\2\2\2\u0215\u0211\3\2\2\2\u0215\u0212\3\2\2\2\u0215\u0213\3\2\2\2\u0215"+
		"\u0214\3\2\2\2\u0216+\3\2\2\2\u0217\u0218\7\r\2\2\u0218\u0219\5\64\33"+
		"\2\u0219\u021a\7(\2\2\u021a\u021e\3\2\2\2\u021b\u021c\7\r\2\2\u021c\u021e"+
		"\7(\2\2\u021d\u0217\3\2\2\2\u021d\u021b\3\2\2\2\u021e-\3\2\2\2\u021f\u0220"+
		"\5$\23\2\u0220\u0221\7(\2\2\u0221/\3\2\2\2\u0222\u0223\7\23\2\2\u0223"+
		"\u0224\7\35\2\2\u0224\u0225\7\24\2\2\u0225\u0226\7\34\2\2\u0226\u0230"+
		"\7(\2\2\u0227\u0228\7\23\2\2\u0228\u0229\7\35\2\2\u0229\u022a\7\24\2\2"+
		"\u022a\u022b\7\34\2\2\u022b\u022c\7\21\2\2\u022c\u022d\5\64\33\2\u022d"+
		"\u022e\7(\2\2\u022e\u0230\3\2\2\2\u022f\u0222\3\2\2\2\u022f\u0227\3\2"+
		"\2\2\u0230\61\3\2\2\2\u0231\u0232\7\35\2\2\u0232\u0233\7\25\2\2\u0233"+
		"\u0234\5\64\33\2\u0234\u0235\7(\2\2\u0235\63\3\2\2\2\u0236\u0242\5\30"+
		"\r\2\u0237\u0242\5\26\f\2\u0238\u0242\5\24\13\2\u0239\u0242\5\22\n\2\u023a"+
		"\u0242\5\20\t\2\u023b\u0242\5\16\b\2\u023c\u0242\5\f\7\2\u023d\u0242\5"+
		"\n\6\2\u023e\u0242\5\b\5\2\u023f\u0242\5\6\4\2\u0240\u0242\5\4\3\2\u0241"+
		"\u0236\3\2\2\2\u0241\u0237\3\2\2\2\u0241\u0238\3\2\2\2\u0241\u0239\3\2"+
		"\2\2\u0241\u023a\3\2\2\2\u0241\u023b\3\2\2\2\u0241\u023c\3\2\2\2\u0241"+
		"\u023d\3\2\2\2\u0241\u023e\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0240\3\2"+
		"\2\2\u0242\65\3\2\2\2\u0243\u0246\58\35\2\u0244\u0246\5:\36\2\u0245\u0243"+
		"\3\2\2\2\u0245\u0244\3\2\2\2\u0246\67\3\2\2\2\u0247\u0248\7\26\2\2\u0248"+
		"\u0249\7!\2\2\u0249\u024a\5\64\33\2\u024a\u024b\7\"\2\2\u024b\u024f\5"+
		"(\25\2\u024c\u024e\5B\"\2\u024d\u024c\3\2\2\2\u024e\u0251\3\2\2\2\u024f"+
		"\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2"+
		"\2\2\u0252\u0254\5D#\2\u0253\u0252\3\2\2\2\u0253\u0254\3\2\2\2\u02549"+
		"\3\2\2\2\u0255\u0256\5<\37\2\u0256\u0258\7%\2\2\u0257\u0259\5> \2\u0258"+
		"\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2"+
		"\2\2\u025b\u025d\3\2\2\2\u025c\u025e\5@!\2\u025d\u025c\3\2\2\2\u025d\u025e"+
		"\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\7&\2\2\u0260;\3\2\2\2\u0261\u0262"+
		"\7\27\2\2\u0262\u0263\7\26\2\2\u0263\u0264\7!\2\2\u0264\u0265\7\35\2\2"+
		"\u0265\u0266\7\"\2\2\u0266=\3\2\2\2\u0267\u0268\7\25\2\2\u0268\u0269\t"+
		"\3\2\2\u0269\u026a\7)\2\2\u026a\u026b\5(\25\2\u026b?\3\2\2\2\u026c\u026d"+
		"\7\30\2\2\u026d\u026e\7)\2\2\u026e\u026f\5(\25\2\u026fA\3\2\2\2\u0270"+
		"\u0271\7\30\2\2\u0271\u0272\7\26\2\2\u0272\u0273\7!\2\2\u0273\u0274\5"+
		"\64\33\2\u0274\u0275\7\"\2\2\u0275\u0276\5(\25\2\u0276C\3\2\2\2\u0277"+
		"\u0278\7\30\2\2\u0278\u0279\5(\25\2\u0279E\3\2\2\2\u027a\u027e\5H%\2\u027b"+
		"\u027e\5J&\2\u027c\u027e\5L\'\2\u027d\u027a\3\2\2\2\u027d\u027b\3\2\2"+
		"\2\u027d\u027c\3\2\2\2\u027eG\3\2\2\2\u027f\u0280\7\16\2\2\u0280\u0281"+
		"\5(\25\2\u0281\u0282\7\17\2\2\u0282\u0283\7!\2\2\u0283\u0284\5\64\33\2"+
		"\u0284\u0285\7\"\2\2\u0285\u0286\7(\2\2\u0286I\3\2\2\2\u0287\u0288\7\16"+
		"\2\2\u0288\u0289\7\17\2\2\u0289\u028a\7!\2\2\u028a\u028b\5\64\33\2\u028b"+
		"\u028c\7\"\2\2\u028c\u028d\5(\25\2\u028dK\3\2\2\2\u028e\u028f\7\16\2\2"+
		"\u028f\u0290\7\34\2\2\u0290\u0291\7\35\2\2\u0291\u0294\5N(\2\u0292\u0293"+
		"\7\22\2\2\u0293\u0295\5\16\b\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2"+
		"\u0295\u0296\3\2\2\2\u0296\u0297\5(\25\2\u0297M\3\2\2\2\u0298\u0299\7"+
		"\20\2\2\u0299\u029a\5\16\b\2\u029a\u029b\7\21\2\2\u029b\u029c\5\16\b\2"+
		"\u029cO\3\2\2\2HSY_gow\177\u0087\u008f\u0097\u009f\u00a7\u00af\u00b2\u00b9"+
		"\u00c1\u00c9\u00d1\u00d9\u00e1\u00e9\u00f1\u00f9\u00fc\u0103\u010b\u0113"+
		"\u011b\u0123\u012b\u0133\u013b\u013e\u014b\u0158\u015f\u0167\u016f\u0177"+
		"\u017f\u0182\u0189\u0191\u0199\u01a1\u01a4\u01ab\u01b3\u01bb\u01be\u01c4"+
		"\u01cb\u01cf\u01eb\u01f1\u01f9\u0200\u0203\u0209\u0215\u021d\u022f\u0241"+
		"\u0245\u024f\u0253\u025a\u025d\u027d\u0294";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}