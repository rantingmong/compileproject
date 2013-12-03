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
		RULE_conditional_statement = 26, RULE_conditional_SWITCH = 27, RULE_conditional_SWITCH_H = 28, 
		RULE_conditional_CASE = 29, RULE_conditional_CASE_CONST = 30, RULE_conditional_DEFAULT = 31, 
		RULE_conditional_IF = 32, RULE_conditional_IF_H = 33, RULE_conditional_ELSEIF = 34, 
		RULE_conditional_ELSE = 35, RULE_loop_statement = 36, RULE_loop_DO_WHILE = 37, 
		RULE_loop_WHILE = 38, RULE_loop_for = 39, RULE_loop_for_control = 40;
	public static final String[] ruleNames = {
		"s", "operator_bool1", "operator_bool2", "operator_bool3", "operator_bool4", 
		"operator_bool5", "expression1", "expression2", "expression3", "expression4", 
		"expression5", "expression_final", "package_declaration", "main_function", 
		"function_declaration", "parameter", "parameter_entry", "function_call", 
		"function_arguments", "group_statement", "statement", "return_statement", 
		"function_call_statement", "declare_statement", "assignment_statement", 
		"logical_statement", "conditional_statement", "conditional_SWITCH", "conditional_SWITCH_H", 
		"conditional_CASE", "conditional_CASE_CONST", "conditional_DEFAULT", "conditional_IF", 
		"conditional_IF_H", "conditional_ELSEIF", "conditional_ELSE", "loop_statement", 
		"loop_DO_WHILE", "loop_WHILE", "loop_for", "loop_for_control"
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
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_GRAB) {
				{
				{
				setState(82); package_declaration();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(88); function_declaration();
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_FUNCTION) {
				{
				{
				setState(94); main_function();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
			//System.out.println(re.getOffendingToken().getText() + " " + re.getOffendingToken().getStartIndex() + ":" + re.getOffendingToken().getStopIndex());
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
			setState(180);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100); expression_final();
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(101); match(LOGIC_1);
					setState(102); operator_bool2();
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108); expression5();
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(109); match(LOGIC_1);
					setState(110); operator_bool2();
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116); expression4();
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(117); match(LOGIC_1);
					setState(118); operator_bool2();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124); expression3();
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(125); match(LOGIC_1);
					setState(126); operator_bool2();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132); expression2();
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(133); match(LOGIC_1);
					setState(134); operator_bool2();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(140); expression1();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(141); match(LOGIC_1);
					setState(142); operator_bool2();
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(148); operator_bool5();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(149); match(LOGIC_1);
					setState(150); operator_bool2();
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(156); operator_bool4();
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(157); match(LOGIC_1);
					setState(158); operator_bool2();
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(164); operator_bool3();
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(165); match(LOGIC_1);
					setState(166); operator_bool2();
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(172); operator_bool2();
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(173); match(LOGIC_1);
					setState(174); operator_bool2();
					}
					}
					setState(179);
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
			setState(254);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182); expression_final();
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(183); match(LOGIC_2);
					setState(184); operator_bool3();
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190); expression5();
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(191); match(LOGIC_2);
					setState(192); operator_bool3();
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198); expression4();
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(199); match(LOGIC_2);
					setState(200); operator_bool3();
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(206); expression3();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(207); match(LOGIC_2);
					setState(208); operator_bool3();
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(214); expression2();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(215); match(LOGIC_2);
					setState(216); operator_bool3();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(222); expression1();
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(223); match(LOGIC_2);
					setState(224); operator_bool3();
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(230); operator_bool5();
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(231); match(LOGIC_2);
					setState(232); operator_bool3();
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(238); operator_bool4();
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(239); match(LOGIC_2);
					setState(240); operator_bool3();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(246); operator_bool3();
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(247); match(LOGIC_2);
					setState(248); operator_bool3();
					}
					}
					setState(253);
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
			setState(320);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256); expression_final();
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_3) {
					{
					{
					setState(257); match(LOGIC_3);
					setState(258); operator_bool4();
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264); expression5();
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_3) {
					{
					{
					setState(265); match(LOGIC_3);
					setState(266); operator_bool4();
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272); expression4();
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_3) {
					{
					{
					setState(273); match(LOGIC_3);
					setState(274); operator_bool4();
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(280); expression3();
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_3) {
					{
					{
					setState(281); match(LOGIC_3);
					setState(282); operator_bool4();
					}
					}
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(288); expression2();
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_3) {
					{
					{
					setState(289); match(LOGIC_3);
					setState(290); operator_bool4();
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(296); expression1();
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_3) {
					{
					{
					setState(297); match(LOGIC_3);
					setState(298); operator_bool4();
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(304); operator_bool5();
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_3) {
					{
					{
					setState(305); match(LOGIC_3);
					setState(306); operator_bool4();
					}
					}
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(312); operator_bool4();
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_3) {
					{
					{
					setState(313); match(LOGIC_3);
					setState(314); operator_bool4();
					}
					}
					setState(319);
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
			setState(333);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322); expression_final();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(323); expression5();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(324); expression4();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(325); expression3();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(326); expression2();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(327); expression1();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(328); operator_bool5();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(329); match(TOKEN_OPEN_P);
				setState(330); operator_bool1();
				setState(331); match(TOKEN_CLOS_P);
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
			setState(346);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335); expression_final();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336); expression5();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(337); expression4();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(338); expression3();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(339); expression2();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(340); expression1();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(341); match(TOKEN_NOT);
				setState(342); match(TOKEN_OPEN_P);
				setState(343); logical_statement();
				setState(344); match(TOKEN_CLOS_P);
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
			setState(388);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348); expression_final();
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_1) {
					{
					{
					setState(349); match(ARTH_1);
					setState(350); expression2();
					}
					}
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356); expression5();
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_1) {
					{
					{
					setState(357); match(ARTH_1);
					setState(358); expression2();
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364); expression4();
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_1) {
					{
					{
					setState(365); match(ARTH_1);
					setState(366); expression2();
					}
					}
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(372); expression3();
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_1) {
					{
					{
					setState(373); match(ARTH_1);
					setState(374); expression2();
					}
					}
					setState(379);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(380); expression2();
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_1) {
					{
					{
					setState(381); match(ARTH_1);
					setState(382); expression2();
					}
					}
					setState(387);
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
			setState(422);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390); expression_final();
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_2) {
					{
					{
					setState(391); match(ARTH_2);
					setState(392); expression3();
					}
					}
					setState(397);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398); expression5();
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_2) {
					{
					{
					setState(399); match(ARTH_2);
					setState(400); expression3();
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(406); expression4();
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_2) {
					{
					{
					setState(407); match(ARTH_2);
					setState(408); expression3();
					}
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(414); expression3();
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_2) {
					{
					{
					setState(415); match(ARTH_2);
					setState(416); expression3();
					}
					}
					setState(421);
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
			setState(448);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424); expression_final();
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_3) {
					{
					{
					setState(425); match(ARTH_3);
					setState(426); expression4();
					}
					}
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432); expression5();
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_3) {
					{
					{
					setState(433); match(ARTH_3);
					setState(434); expression4();
					}
					}
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(440); expression4();
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_3) {
					{
					{
					setState(441); match(ARTH_3);
					setState(442); expression4();
					}
					}
					setState(447);
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
			setState(454);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450); expression_final();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451); expression5();
				setState(452); match(ARTH_4);
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
			setState(461);
			switch (_input.LA(1)) {
			case TOKEN_TORF:
			case ID:
			case NUM:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(456); expression_final();
				}
				break;
			case TOKEN_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(457); match(TOKEN_OPEN_P);
				setState(458); expression1();
				setState(459); match(TOKEN_CLOS_P);
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
			setState(465);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
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
				setState(464); function_call();
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
			setState(467); match(TOKEN_GRAB);
			setState(468); match(STRING);
			setState(469); match(TOKEN_SEMICOLON);
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
			setState(471); match(TOKEN_FUNCTION);
			setState(472); match(TOKEN_MAIN);
			setState(473); match(TOKEN_OPEN_B);
			setState(474); match(TOKEN_CLOS_B);
			setState(475); match(TOKEN_RETURNING);
			setState(476); match(TYPE);
			setState(477); group_statement();
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
			setState(479); match(TOKEN_FUNCTION);
			setState(480); match(ID);
			setState(481); parameter();
			setState(482); match(TOKEN_RETURNING);
			setState(483); match(TYPE);
			setState(484); group_statement();
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
		public TerminalNode TOKEN_CLOS_B() { return getToken(codeParser.TOKEN_CLOS_B, 0); }
		public TerminalNode TOKEN_OPEN_B() { return getToken(codeParser.TOKEN_OPEN_B, 0); }
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
			setState(499);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(486); match(TOKEN_OPEN_B);
				{
				setState(487); parameter_entry();
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_COMMA) {
					{
					{
					setState(488); match(TOKEN_COMMA);
					setState(489); parameter_entry();
					}
					}
					setState(494);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(495); match(TOKEN_CLOS_B);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497); match(TOKEN_OPEN_B);
				setState(498); match(TOKEN_CLOS_B);
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

	public static class Parameter_entryContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(codeParser.ID, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
			setState(501); match(TYPE);
			setState(502); match(ID);
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
			setState(504); match(ID);
			setState(505); match(TOKEN_OPEN_B);
			setState(506); function_arguments();
			setState(507); match(TOKEN_CLOS_B);
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
			setState(520);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_TORF) | (1L << TOKEN_NOT) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << TOKEN_OPEN_P))) != 0)) {
					{
					setState(509); logical_statement();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(512); logical_statement();
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_COMMA) {
					{
					{
					setState(513); match(TOKEN_COMMA);
					setState(514); logical_statement();
					}
					}
					setState(519);
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
			setState(522); match(TOKEN_OPEN_S);
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_RETURNING) | (1L << TOKEN_REPEAT) | (1L << TOKEN_DECLARE) | (1L << TOKEN_IF) | (1L << TOKEN_CHECK) | (1L << ID) | (1L << TOKEN_OPEN_S))) != 0)) {
				{
				{
				setState(523); statement();
				}
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(529); match(TOKEN_CLOS_S);
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
			setState(538);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(531); declare_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(532); group_statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(533); assignment_statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(534); conditional_statement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(535); loop_statement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(536); function_call_statement();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(537); return_statement();
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
			setState(546);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(540); match(TOKEN_RETURNING);
				setState(541); logical_statement();
				setState(542); match(TOKEN_SEMICOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(544); match(TOKEN_RETURNING);
				setState(545); match(TOKEN_SEMICOLON);
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
			setState(548); function_call();
			setState(549); match(TOKEN_SEMICOLON);
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
			setState(564);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(551); match(TOKEN_DECLARE);
				setState(552); match(ID);
				setState(553); match(TOKEN_AS);
				setState(554); match(TYPE);
				setState(555); match(TOKEN_SEMICOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(556); match(TOKEN_DECLARE);
				setState(557); match(ID);
				setState(558); match(TOKEN_AS);
				setState(559); match(TYPE);
				setState(560); match(TOKEN_TO);
				setState(561); logical_statement();
				setState(562); match(TOKEN_SEMICOLON);
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
			setState(566); match(ID);
			setState(567); match(TOKEN_IS);
			setState(568); logical_statement();
			setState(569); match(TOKEN_SEMICOLON);
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
			setState(582);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(571); expression_final();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(572); expression5();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(573); expression4();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(574); expression3();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(575); expression2();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(576); expression1();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(577); operator_bool5();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(578); operator_bool4();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(579); operator_bool3();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(580); operator_bool2();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(581); operator_bool1();
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
			setState(586);
			switch (_input.LA(1)) {
			case TOKEN_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(584); conditional_IF();
				}
				break;
			case TOKEN_CHECK:
				enterOuterAlt(_localctx, 2);
				{
				setState(585); conditional_SWITCH();
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
		enterRule(_localctx, 54, RULE_conditional_SWITCH);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588); conditional_SWITCH_H();
			setState(589); match(TOKEN_OPEN_S);
			setState(591); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(590); conditional_CASE();
				}
				}
				setState(593); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TOKEN_IS );
			setState(596);
			_la = _input.LA(1);
			if (_la==TOKEN_ELSE) {
				{
				setState(595); conditional_DEFAULT();
				}
			}

			setState(598); match(TOKEN_CLOS_S);
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
		enterRule(_localctx, 56, RULE_conditional_SWITCH_H);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600); match(TOKEN_CHECK);
			setState(601); match(TOKEN_IF);
			setState(602); match(TOKEN_OPEN_B);
			setState(603); match(ID);
			setState(604); match(TOKEN_CLOS_B);
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
		public Conditional_CASE_CONSTContext conditional_CASE_CONST() {
			return getRuleContext(Conditional_CASE_CONSTContext.class,0);
		}
		public TerminalNode TOKEN_COLON() { return getToken(codeParser.TOKEN_COLON, 0); }
		public Group_statementContext group_statement() {
			return getRuleContext(Group_statementContext.class,0);
		}
		public TerminalNode TOKEN_IS() { return getToken(codeParser.TOKEN_IS, 0); }
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
		enterRule(_localctx, 58, RULE_conditional_CASE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606); match(TOKEN_IS);
			setState(607); conditional_CASE_CONST();
			setState(608); match(TOKEN_COLON);
			setState(609); group_statement();
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

	public static class Conditional_CASE_CONSTContext extends ParserRuleContext {
		public TerminalNode TOKEN_TORF() { return getToken(codeParser.TOKEN_TORF, 0); }
		public TerminalNode STRING() { return getToken(codeParser.STRING, 0); }
		public TerminalNode NUM() { return getToken(codeParser.NUM, 0); }
		public Conditional_CASE_CONSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_CASE_CONST; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitConditional_CASE_CONST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_CASE_CONSTContext conditional_CASE_CONST() throws RecognitionException {
		Conditional_CASE_CONSTContext _localctx = new Conditional_CASE_CONSTContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_conditional_CASE_CONST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_TORF) | (1L << NUM) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
			setState(613); match(TOKEN_ELSE);
			setState(614); match(TOKEN_COLON);
			setState(615); group_statement();
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
		public Conditional_IF_HContext conditional_IF_H() {
			return getRuleContext(Conditional_IF_HContext.class,0);
		}
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
		enterRule(_localctx, 64, RULE_conditional_IF);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(617); conditional_IF_H();
			setState(621);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(618); conditional_ELSEIF();
					}
					} 
				}
				setState(623);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			setState(625);
			_la = _input.LA(1);
			if (_la==TOKEN_ELSE) {
				{
				setState(624); conditional_ELSE();
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

	public static class Conditional_IF_HContext extends ParserRuleContext {
		public TerminalNode TOKEN_CLOS_B() { return getToken(codeParser.TOKEN_CLOS_B, 0); }
		public TerminalNode TOKEN_OPEN_B() { return getToken(codeParser.TOKEN_OPEN_B, 0); }
		public Group_statementContext group_statement() {
			return getRuleContext(Group_statementContext.class,0);
		}
		public Logical_statementContext logical_statement() {
			return getRuleContext(Logical_statementContext.class,0);
		}
		public TerminalNode TOKEN_IF() { return getToken(codeParser.TOKEN_IF, 0); }
		public Conditional_IF_HContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_IF_H; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof codeVisitor ) return ((codeVisitor<? extends T>)visitor).visitConditional_IF_H(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_IF_HContext conditional_IF_H() throws RecognitionException {
		Conditional_IF_HContext _localctx = new Conditional_IF_HContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_conditional_IF_H);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627); match(TOKEN_IF);
			setState(628); match(TOKEN_OPEN_B);
			setState(629); logical_statement();
			setState(630); match(TOKEN_CLOS_B);
			setState(631); group_statement();
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
		enterRule(_localctx, 68, RULE_conditional_ELSEIF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633); match(TOKEN_ELSE);
			setState(634); match(TOKEN_IF);
			setState(635); match(TOKEN_OPEN_B);
			setState(636); logical_statement();
			setState(637); match(TOKEN_CLOS_B);
			setState(638); group_statement();
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
		enterRule(_localctx, 70, RULE_conditional_ELSE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640); match(TOKEN_ELSE);
			setState(641); group_statement();
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
		enterRule(_localctx, 72, RULE_loop_statement);
		try {
			setState(646);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(643); loop_DO_WHILE();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(644); loop_WHILE();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(645); loop_for();
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
		enterRule(_localctx, 74, RULE_loop_DO_WHILE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648); match(TOKEN_REPEAT);
			setState(649); group_statement();
			setState(650); match(TOKEN_UNTIL);
			setState(651); match(TOKEN_OPEN_B);
			setState(652); logical_statement();
			setState(653); match(TOKEN_CLOS_B);
			setState(654); match(TOKEN_SEMICOLON);
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
		enterRule(_localctx, 76, RULE_loop_WHILE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656); match(TOKEN_REPEAT);
			setState(657); match(TOKEN_UNTIL);
			setState(658); match(TOKEN_OPEN_B);
			setState(659); logical_statement();
			setState(660); match(TOKEN_CLOS_B);
			setState(661); group_statement();
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
		enterRule(_localctx, 78, RULE_loop_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663); match(TOKEN_REPEAT);
			setState(664); match(TYPE);
			setState(665); match(ID);
			setState(666); loop_for_control();
			setState(669);
			_la = _input.LA(1);
			if (_la==TOKEN_WITH) {
				{
				setState(667); match(TOKEN_WITH);
				setState(668); expression1();
				}
			}

			setState(671); group_statement();
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
		enterRule(_localctx, 80, RULE_loop_for_control);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673); match(TOKEN_FROM);
			setState(674); expression1();
			setState(675); match(TOKEN_TO);
			setState(676); expression1();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3)\u02a9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\7\2"+
		"V\n\2\f\2\16\2Y\13\2\3\2\7\2\\\n\2\f\2\16\2_\13\2\3\2\7\2b\n\2\f\2\16"+
		"\2e\13\2\3\3\3\3\3\3\7\3j\n\3\f\3\16\3m\13\3\3\3\3\3\3\3\7\3r\n\3\f\3"+
		"\16\3u\13\3\3\3\3\3\3\3\7\3z\n\3\f\3\16\3}\13\3\3\3\3\3\3\3\7\3\u0082"+
		"\n\3\f\3\16\3\u0085\13\3\3\3\3\3\3\3\7\3\u008a\n\3\f\3\16\3\u008d\13\3"+
		"\3\3\3\3\3\3\7\3\u0092\n\3\f\3\16\3\u0095\13\3\3\3\3\3\3\3\7\3\u009a\n"+
		"\3\f\3\16\3\u009d\13\3\3\3\3\3\3\3\7\3\u00a2\n\3\f\3\16\3\u00a5\13\3\3"+
		"\3\3\3\3\3\7\3\u00aa\n\3\f\3\16\3\u00ad\13\3\3\3\3\3\3\3\7\3\u00b2\n\3"+
		"\f\3\16\3\u00b5\13\3\5\3\u00b7\n\3\3\4\3\4\3\4\7\4\u00bc\n\4\f\4\16\4"+
		"\u00bf\13\4\3\4\3\4\3\4\7\4\u00c4\n\4\f\4\16\4\u00c7\13\4\3\4\3\4\3\4"+
		"\7\4\u00cc\n\4\f\4\16\4\u00cf\13\4\3\4\3\4\3\4\7\4\u00d4\n\4\f\4\16\4"+
		"\u00d7\13\4\3\4\3\4\3\4\7\4\u00dc\n\4\f\4\16\4\u00df\13\4\3\4\3\4\3\4"+
		"\7\4\u00e4\n\4\f\4\16\4\u00e7\13\4\3\4\3\4\3\4\7\4\u00ec\n\4\f\4\16\4"+
		"\u00ef\13\4\3\4\3\4\3\4\7\4\u00f4\n\4\f\4\16\4\u00f7\13\4\3\4\3\4\3\4"+
		"\7\4\u00fc\n\4\f\4\16\4\u00ff\13\4\5\4\u0101\n\4\3\5\3\5\3\5\7\5\u0106"+
		"\n\5\f\5\16\5\u0109\13\5\3\5\3\5\3\5\7\5\u010e\n\5\f\5\16\5\u0111\13\5"+
		"\3\5\3\5\3\5\7\5\u0116\n\5\f\5\16\5\u0119\13\5\3\5\3\5\3\5\7\5\u011e\n"+
		"\5\f\5\16\5\u0121\13\5\3\5\3\5\3\5\7\5\u0126\n\5\f\5\16\5\u0129\13\5\3"+
		"\5\3\5\3\5\7\5\u012e\n\5\f\5\16\5\u0131\13\5\3\5\3\5\3\5\7\5\u0136\n\5"+
		"\f\5\16\5\u0139\13\5\3\5\3\5\3\5\7\5\u013e\n\5\f\5\16\5\u0141\13\5\5\5"+
		"\u0143\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0150\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u015d\n\7\3\b\3\b\3\b\7"+
		"\b\u0162\n\b\f\b\16\b\u0165\13\b\3\b\3\b\3\b\7\b\u016a\n\b\f\b\16\b\u016d"+
		"\13\b\3\b\3\b\3\b\7\b\u0172\n\b\f\b\16\b\u0175\13\b\3\b\3\b\3\b\7\b\u017a"+
		"\n\b\f\b\16\b\u017d\13\b\3\b\3\b\3\b\7\b\u0182\n\b\f\b\16\b\u0185\13\b"+
		"\5\b\u0187\n\b\3\t\3\t\3\t\7\t\u018c\n\t\f\t\16\t\u018f\13\t\3\t\3\t\3"+
		"\t\7\t\u0194\n\t\f\t\16\t\u0197\13\t\3\t\3\t\3\t\7\t\u019c\n\t\f\t\16"+
		"\t\u019f\13\t\3\t\3\t\3\t\7\t\u01a4\n\t\f\t\16\t\u01a7\13\t\5\t\u01a9"+
		"\n\t\3\n\3\n\3\n\7\n\u01ae\n\n\f\n\16\n\u01b1\13\n\3\n\3\n\3\n\7\n\u01b6"+
		"\n\n\f\n\16\n\u01b9\13\n\3\n\3\n\3\n\7\n\u01be\n\n\f\n\16\n\u01c1\13\n"+
		"\5\n\u01c3\n\n\3\13\3\13\3\13\3\13\5\13\u01c9\n\13\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u01d0\n\f\3\r\3\r\5\r\u01d4\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\7\21\u01ed\n\21\f\21\16\21\u01f0\13\21\3\21\3\21\3\21\3\21"+
		"\5\21\u01f6\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\5\24\u0201"+
		"\n\24\3\24\3\24\3\24\7\24\u0206\n\24\f\24\16\24\u0209\13\24\5\24\u020b"+
		"\n\24\3\25\3\25\7\25\u020f\n\25\f\25\16\25\u0212\13\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u021d\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0225\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0237\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0249\n\33"+
		"\3\34\3\34\5\34\u024d\n\34\3\35\3\35\3\35\6\35\u0252\n\35\r\35\16\35\u0253"+
		"\3\35\5\35\u0257\n\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3!\3!\3!\3!\3\"\3\"\7\"\u026e\n\"\f\"\16\"\u0271"+
		"\13\"\3\"\5\"\u0274\n\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3"+
		"%\3&\3&\3&\5&\u0289\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3("+
		"\3(\3(\3)\3)\3)\3)\3)\3)\5)\u02a0\n)\3)\3)\3*\3*\3*\3*\3*\3*\2+\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2"+
		"\4\4\2\31\31\35\37\4\2\31\31\36\37\u02fa\2W\3\2\2\2\4\u00b6\3\2\2\2\6"+
		"\u0100\3\2\2\2\b\u0142\3\2\2\2\n\u014f\3\2\2\2\f\u015c\3\2\2\2\16\u0186"+
		"\3\2\2\2\20\u01a8\3\2\2\2\22\u01c2\3\2\2\2\24\u01c8\3\2\2\2\26\u01cf\3"+
		"\2\2\2\30\u01d3\3\2\2\2\32\u01d5\3\2\2\2\34\u01d9\3\2\2\2\36\u01e1\3\2"+
		"\2\2 \u01f5\3\2\2\2\"\u01f7\3\2\2\2$\u01fa\3\2\2\2&\u020a\3\2\2\2(\u020c"+
		"\3\2\2\2*\u021c\3\2\2\2,\u0224\3\2\2\2.\u0226\3\2\2\2\60\u0236\3\2\2\2"+
		"\62\u0238\3\2\2\2\64\u0248\3\2\2\2\66\u024c\3\2\2\28\u024e\3\2\2\2:\u025a"+
		"\3\2\2\2<\u0260\3\2\2\2>\u0265\3\2\2\2@\u0267\3\2\2\2B\u026b\3\2\2\2D"+
		"\u0275\3\2\2\2F\u027b\3\2\2\2H\u0282\3\2\2\2J\u0288\3\2\2\2L\u028a\3\2"+
		"\2\2N\u0292\3\2\2\2P\u0299\3\2\2\2R\u02a3\3\2\2\2TV\5\32\16\2UT\3\2\2"+
		"\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X]\3\2\2\2YW\3\2\2\2Z\\\5\36\20\2[Z\3"+
		"\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^c\3\2\2\2_]\3\2\2\2`b\5\34\17\2"+
		"a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\3\3\2\2\2ec\3\2\2\2fk\5\30\r"+
		"\2gh\7\3\2\2hj\5\6\4\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\u00b7"+
		"\3\2\2\2mk\3\2\2\2ns\5\26\f\2op\7\3\2\2pr\5\6\4\2qo\3\2\2\2ru\3\2\2\2"+
		"sq\3\2\2\2st\3\2\2\2t\u00b7\3\2\2\2us\3\2\2\2v{\5\24\13\2wx\7\3\2\2xz"+
		"\5\6\4\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\u00b7\3\2\2\2}{\3\2"+
		"\2\2~\u0083\5\22\n\2\177\u0080\7\3\2\2\u0080\u0082\5\6\4\2\u0081\177\3"+
		"\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u00b7\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u008b\5\20\t\2\u0087\u0088\7"+
		"\3\2\2\u0088\u008a\5\6\4\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u00b7\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u0093\5\16\b\2\u008f\u0090\7\3\2\2\u0090\u0092\5\6\4\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u00b7\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u009b\5\f\7\2\u0097"+
		"\u0098\7\3\2\2\u0098\u009a\5\6\4\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00b7\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u00a3\5\n\6\2\u009f\u00a0\7\3\2\2\u00a0\u00a2\5\6"+
		"\4\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00b7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00ab\5\b"+
		"\5\2\u00a7\u00a8\7\3\2\2\u00a8\u00aa\5\6\4\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b7\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b3\5\6\4\2\u00af\u00b0\7\3\2\2\u00b0"+
		"\u00b2\5\6\4\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6"+
		"f\3\2\2\2\u00b6n\3\2\2\2\u00b6v\3\2\2\2\u00b6~\3\2\2\2\u00b6\u0086\3\2"+
		"\2\2\u00b6\u008e\3\2\2\2\u00b6\u0096\3\2\2\2\u00b6\u009e\3\2\2\2\u00b6"+
		"\u00a6\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b7\5\3\2\2\2\u00b8\u00bd\5\30\r"+
		"\2\u00b9\u00ba\7\4\2\2\u00ba\u00bc\5\b\5\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u0101\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c5\5\26\f\2\u00c1\u00c2\7\4\2\2\u00c2\u00c4\5"+
		"\b\5\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u0101\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cd\5\24"+
		"\13\2\u00c9\u00ca\7\4\2\2\u00ca\u00cc\5\b\5\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u0101\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d5\5\22\n\2\u00d1\u00d2\7\4\2\2\u00d2"+
		"\u00d4\5\b\5\2\u00d3\u00d1\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u0101\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00dd\5\20\t\2\u00d9\u00da\7\4\2\2\u00da\u00dc\5\b\5\2\u00db\u00d9\3"+
		"\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u0101\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e5\5\16\b\2\u00e1\u00e2\7"+
		"\4\2\2\u00e2\u00e4\5\b\5\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u0101\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e8\u00ed\5\f\7\2\u00e9\u00ea\7\4\2\2\u00ea\u00ec\5\b\5\2\u00eb"+
		"\u00e9\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u0101\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f5\5\n\6\2\u00f1"+
		"\u00f2\7\4\2\2\u00f2\u00f4\5\b\5\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u0101\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00fd\5\b\5\2\u00f9\u00fa\7\4\2\2\u00fa\u00fc\5\b"+
		"\5\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u00b8\3\2"+
		"\2\2\u0100\u00c0\3\2\2\2\u0100\u00c8\3\2\2\2\u0100\u00d0\3\2\2\2\u0100"+
		"\u00d8\3\2\2\2\u0100\u00e0\3\2\2\2\u0100\u00e8\3\2\2\2\u0100\u00f0\3\2"+
		"\2\2\u0100\u00f8\3\2\2\2\u0101\7\3\2\2\2\u0102\u0107\5\30\r\2\u0103\u0104"+
		"\7\5\2\2\u0104\u0106\5\n\6\2\u0105\u0103\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0143\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u010a\u010f\5\26\f\2\u010b\u010c\7\5\2\2\u010c\u010e\5\n\6\2\u010d"+
		"\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0143\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0117\5\24\13\2\u0113"+
		"\u0114\7\5\2\2\u0114\u0116\5\n\6\2\u0115\u0113\3\2\2\2\u0116\u0119\3\2"+
		"\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0143\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u011a\u011f\5\22\n\2\u011b\u011c\7\5\2\2\u011c\u011e\5"+
		"\n\6\2\u011d\u011b\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0143\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0127\5\20"+
		"\t\2\u0123\u0124\7\5\2\2\u0124\u0126\5\n\6\2\u0125\u0123\3\2\2\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0143\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u012a\u012f\5\16\b\2\u012b\u012c\7\5\2\2\u012c"+
		"\u012e\5\n\6\2\u012d\u012b\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u0130\u0143\3\2\2\2\u0131\u012f\3\2\2\2\u0132"+
		"\u0137\5\f\7\2\u0133\u0134\7\5\2\2\u0134\u0136\5\n\6\2\u0135\u0133\3\2"+
		"\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0143\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013f\5\n\6\2\u013b\u013c\7\5"+
		"\2\2\u013c\u013e\5\n\6\2\u013d\u013b\3\2\2\2\u013e\u0141\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0142\u0102\3\2\2\2\u0142\u010a\3\2\2\2\u0142\u0112\3\2\2\2\u0142"+
		"\u011a\3\2\2\2\u0142\u0122\3\2\2\2\u0142\u012a\3\2\2\2\u0142\u0132\3\2"+
		"\2\2\u0142\u013a\3\2\2\2\u0143\t\3\2\2\2\u0144\u0150\5\30\r\2\u0145\u0150"+
		"\5\26\f\2\u0146\u0150\5\24\13\2\u0147\u0150\5\22\n\2\u0148\u0150\5\20"+
		"\t\2\u0149\u0150\5\16\b\2\u014a\u0150\5\f\7\2\u014b\u014c\7#\2\2\u014c"+
		"\u014d\5\4\3\2\u014d\u014e\7$\2\2\u014e\u0150\3\2\2\2\u014f\u0144\3\2"+
		"\2\2\u014f\u0145\3\2\2\2\u014f\u0146\3\2\2\2\u014f\u0147\3\2\2\2\u014f"+
		"\u0148\3\2\2\2\u014f\u0149\3\2\2\2\u014f\u014a\3\2\2\2\u014f\u014b\3\2"+
		"\2\2\u0150\13\3\2\2\2\u0151\u015d\5\30\r\2\u0152\u015d\5\26\f\2\u0153"+
		"\u015d\5\24\13\2\u0154\u015d\5\22\n\2\u0155\u015d\5\20\t\2\u0156\u015d"+
		"\5\16\b\2\u0157\u0158\7\33\2\2\u0158\u0159\7#\2\2\u0159\u015a\5\64\33"+
		"\2\u015a\u015b\7$\2\2\u015b\u015d\3\2\2\2\u015c\u0151\3\2\2\2\u015c\u0152"+
		"\3\2\2\2\u015c\u0153\3\2\2\2\u015c\u0154\3\2\2\2\u015c\u0155\3\2\2\2\u015c"+
		"\u0156\3\2\2\2\u015c\u0157\3\2\2\2\u015d\r\3\2\2\2\u015e\u0163\5\30\r"+
		"\2\u015f\u0160\7\6\2\2\u0160\u0162\5\20\t\2\u0161\u015f\3\2\2\2\u0162"+
		"\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0187\3\2"+
		"\2\2\u0165\u0163\3\2\2\2\u0166\u016b\5\26\f\2\u0167\u0168\7\6\2\2\u0168"+
		"\u016a\5\20\t\2\u0169\u0167\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3"+
		"\2\2\2\u016b\u016c\3\2\2\2\u016c\u0187\3\2\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u0173\5\24\13\2\u016f\u0170\7\6\2\2\u0170\u0172\5\20\t\2\u0171\u016f"+
		"\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0187\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u017b\5\22\n\2\u0177\u0178\7"+
		"\6\2\2\u0178\u017a\5\20\t\2\u0179\u0177\3\2\2\2\u017a\u017d\3\2\2\2\u017b"+
		"\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u0187\3\2\2\2\u017d\u017b\3\2"+
		"\2\2\u017e\u0183\5\20\t\2\u017f\u0180\7\6\2\2\u0180\u0182\5\20\t\2\u0181"+
		"\u017f\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2"+
		"\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u015e\3\2\2\2\u0186"+
		"\u0166\3\2\2\2\u0186\u016e\3\2\2\2\u0186\u0176\3\2\2\2\u0186\u017e\3\2"+
		"\2\2\u0187\17\3\2\2\2\u0188\u018d\5\30\r\2\u0189\u018a\7\7\2\2\u018a\u018c"+
		"\5\22\n\2\u018b\u0189\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2"+
		"\u018d\u018e\3\2\2\2\u018e\u01a9\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0195"+
		"\5\26\f\2\u0191\u0192\7\7\2\2\u0192\u0194\5\22\n\2\u0193\u0191\3\2\2\2"+
		"\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u01a9"+
		"\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u019d\5\24\13\2\u0199\u019a\7\7\2\2"+
		"\u019a\u019c\5\22\n\2\u019b\u0199\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b"+
		"\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a9\3\2\2\2\u019f\u019d\3\2\2\2\u01a0"+
		"\u01a5\5\22\n\2\u01a1\u01a2\7\7\2\2\u01a2\u01a4\5\22\n\2\u01a3\u01a1\3"+
		"\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u0188\3\2\2\2\u01a8\u0190\3\2"+
		"\2\2\u01a8\u0198\3\2\2\2\u01a8\u01a0\3\2\2\2\u01a9\21\3\2\2\2\u01aa\u01af"+
		"\5\30\r\2\u01ab\u01ac\7\b\2\2\u01ac\u01ae\5\24\13\2\u01ad\u01ab\3\2\2"+
		"\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01c3"+
		"\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b7\5\26\f\2\u01b3\u01b4\7\b\2\2"+
		"\u01b4\u01b6\5\24\13\2\u01b5\u01b3\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5"+
		"\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01c3\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba"+
		"\u01bf\5\24\13\2\u01bb\u01bc\7\b\2\2\u01bc\u01be\5\24\13\2\u01bd\u01bb"+
		"\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01aa\3\2\2\2\u01c2\u01b2\3\2"+
		"\2\2\u01c2\u01ba\3\2\2\2\u01c3\23\3\2\2\2\u01c4\u01c9\5\30\r\2\u01c5\u01c6"+
		"\5\26\f\2\u01c6\u01c7\7\t\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c4\3\2\2\2"+
		"\u01c8\u01c5\3\2\2\2\u01c9\25\3\2\2\2\u01ca\u01d0\5\30\r\2\u01cb\u01cc"+
		"\7#\2\2\u01cc\u01cd\5\16\b\2\u01cd\u01ce\7$\2\2\u01ce\u01d0\3\2\2\2\u01cf"+
		"\u01ca\3\2\2\2\u01cf\u01cb\3\2\2\2\u01d0\27\3\2\2\2\u01d1\u01d4\t\2\2"+
		"\2\u01d2\u01d4\5$\23\2\u01d3\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4\31"+
		"\3\2\2\2\u01d5\u01d6\7\n\2\2\u01d6\u01d7\7\37\2\2\u01d7\u01d8\7(\2\2\u01d8"+
		"\33\3\2\2\2\u01d9\u01da\7\f\2\2\u01da\u01db\7\13\2\2\u01db\u01dc\7!\2"+
		"\2\u01dc\u01dd\7\"\2\2\u01dd\u01de\7\r\2\2\u01de\u01df\7\34\2\2\u01df"+
		"\u01e0\5(\25\2\u01e0\35\3\2\2\2\u01e1\u01e2\7\f\2\2\u01e2\u01e3\7\35\2"+
		"\2\u01e3\u01e4\5 \21\2\u01e4\u01e5\7\r\2\2\u01e5\u01e6\7\34\2\2\u01e6"+
		"\u01e7\5(\25\2\u01e7\37\3\2\2\2\u01e8\u01e9\7!\2\2\u01e9\u01ee\5\"\22"+
		"\2\u01ea\u01eb\7\'\2\2\u01eb\u01ed\5\"\22\2\u01ec\u01ea\3\2\2\2\u01ed"+
		"\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2"+
		"\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f2\7\"\2\2\u01f2\u01f6\3\2\2\2\u01f3"+
		"\u01f4\7!\2\2\u01f4\u01f6\7\"\2\2\u01f5\u01e8\3\2\2\2\u01f5\u01f3\3\2"+
		"\2\2\u01f6!\3\2\2\2\u01f7\u01f8\7\34\2\2\u01f8\u01f9\7\35\2\2\u01f9#\3"+
		"\2\2\2\u01fa\u01fb\7\35\2\2\u01fb\u01fc\7!\2\2\u01fc\u01fd\5&\24\2\u01fd"+
		"\u01fe\7\"\2\2\u01fe%\3\2\2\2\u01ff\u0201\5\64\33\2\u0200\u01ff\3\2\2"+
		"\2\u0200\u0201\3\2\2\2\u0201\u020b\3\2\2\2\u0202\u0207\5\64\33\2\u0203"+
		"\u0204\7\'\2\2\u0204\u0206\5\64\33\2\u0205\u0203\3\2\2\2\u0206\u0209\3"+
		"\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020b\3\2\2\2\u0209"+
		"\u0207\3\2\2\2\u020a\u0200\3\2\2\2\u020a\u0202\3\2\2\2\u020b\'\3\2\2\2"+
		"\u020c\u0210\7%\2\2\u020d\u020f\5*\26\2\u020e\u020d\3\2\2\2\u020f\u0212"+
		"\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213\3\2\2\2\u0212"+
		"\u0210\3\2\2\2\u0213\u0214\7&\2\2\u0214)\3\2\2\2\u0215\u021d\5\60\31\2"+
		"\u0216\u021d\5(\25\2\u0217\u021d\5\62\32\2\u0218\u021d\5\66\34\2\u0219"+
		"\u021d\5J&\2\u021a\u021d\5.\30\2\u021b\u021d\5,\27\2\u021c\u0215\3\2\2"+
		"\2\u021c\u0216\3\2\2\2\u021c\u0217\3\2\2\2\u021c\u0218\3\2\2\2\u021c\u0219"+
		"\3\2\2\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2\2\2\u021d+\3\2\2\2\u021e"+
		"\u021f\7\r\2\2\u021f\u0220\5\64\33\2\u0220\u0221\7(\2\2\u0221\u0225\3"+
		"\2\2\2\u0222\u0223\7\r\2\2\u0223\u0225\7(\2\2\u0224\u021e\3\2\2\2\u0224"+
		"\u0222\3\2\2\2\u0225-\3\2\2\2\u0226\u0227\5$\23\2\u0227\u0228\7(\2\2\u0228"+
		"/\3\2\2\2\u0229\u022a\7\23\2\2\u022a\u022b\7\35\2\2\u022b\u022c\7\24\2"+
		"\2\u022c\u022d\7\34\2\2\u022d\u0237\7(\2\2\u022e\u022f\7\23\2\2\u022f"+
		"\u0230\7\35\2\2\u0230\u0231\7\24\2\2\u0231\u0232\7\34\2\2\u0232\u0233"+
		"\7\21\2\2\u0233\u0234\5\64\33\2\u0234\u0235\7(\2\2\u0235\u0237\3\2\2\2"+
		"\u0236\u0229\3\2\2\2\u0236\u022e\3\2\2\2\u0237\61\3\2\2\2\u0238\u0239"+
		"\7\35\2\2\u0239\u023a\7\25\2\2\u023a\u023b\5\64\33\2\u023b\u023c\7(\2"+
		"\2\u023c\63\3\2\2\2\u023d\u0249\5\30\r\2\u023e\u0249\5\26\f\2\u023f\u0249"+
		"\5\24\13\2\u0240\u0249\5\22\n\2\u0241\u0249\5\20\t\2\u0242\u0249\5\16"+
		"\b\2\u0243\u0249\5\f\7\2\u0244\u0249\5\n\6\2\u0245\u0249\5\b\5\2\u0246"+
		"\u0249\5\6\4\2\u0247\u0249\5\4\3\2\u0248\u023d\3\2\2\2\u0248\u023e\3\2"+
		"\2\2\u0248\u023f\3\2\2\2\u0248\u0240\3\2\2\2\u0248\u0241\3\2\2\2\u0248"+
		"\u0242\3\2\2\2\u0248\u0243\3\2\2\2\u0248\u0244\3\2\2\2\u0248\u0245\3\2"+
		"\2\2\u0248\u0246\3\2\2\2\u0248\u0247\3\2\2\2\u0249\65\3\2\2\2\u024a\u024d"+
		"\5B\"\2\u024b\u024d\58\35\2\u024c\u024a\3\2\2\2\u024c\u024b\3\2\2\2\u024d"+
		"\67\3\2\2\2\u024e\u024f\5:\36\2\u024f\u0251\7%\2\2\u0250\u0252\5<\37\2"+
		"\u0251\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254"+
		"\3\2\2\2\u0254\u0256\3\2\2\2\u0255\u0257\5@!\2\u0256\u0255\3\2\2\2\u0256"+
		"\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\7&\2\2\u02599\3\2\2\2\u025a"+
		"\u025b\7\27\2\2\u025b\u025c\7\26\2\2\u025c\u025d\7!\2\2\u025d\u025e\7"+
		"\35\2\2\u025e\u025f\7\"\2\2\u025f;\3\2\2\2\u0260\u0261\7\25\2\2\u0261"+
		"\u0262\5> \2\u0262\u0263\7)\2\2\u0263\u0264\5(\25\2\u0264=\3\2\2\2\u0265"+
		"\u0266\t\3\2\2\u0266?\3\2\2\2\u0267\u0268\7\30\2\2\u0268\u0269\7)\2\2"+
		"\u0269\u026a\5(\25\2\u026aA\3\2\2\2\u026b\u026f\5D#\2\u026c\u026e\5F$"+
		"\2\u026d\u026c\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3\2\2\2\u026f\u0270"+
		"\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0272\u0274\5H%\2\u0273"+
		"\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274C\3\2\2\2\u0275\u0276\7\26\2\2"+
		"\u0276\u0277\7!\2\2\u0277\u0278\5\64\33\2\u0278\u0279\7\"\2\2\u0279\u027a"+
		"\5(\25\2\u027aE\3\2\2\2\u027b\u027c\7\30\2\2\u027c\u027d\7\26\2\2\u027d"+
		"\u027e\7!\2\2\u027e\u027f\5\64\33\2\u027f\u0280\7\"\2\2\u0280\u0281\5"+
		"(\25\2\u0281G\3\2\2\2\u0282\u0283\7\30\2\2\u0283\u0284\5(\25\2\u0284I"+
		"\3\2\2\2\u0285\u0289\5L\'\2\u0286\u0289\5N(\2\u0287\u0289\5P)\2\u0288"+
		"\u0285\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0287\3\2\2\2\u0289K\3\2\2\2"+
		"\u028a\u028b\7\16\2\2\u028b\u028c\5(\25\2\u028c\u028d\7\17\2\2\u028d\u028e"+
		"\7!\2\2\u028e\u028f\5\64\33\2\u028f\u0290\7\"\2\2\u0290\u0291\7(\2\2\u0291"+
		"M\3\2\2\2\u0292\u0293\7\16\2\2\u0293\u0294\7\17\2\2\u0294\u0295\7!\2\2"+
		"\u0295\u0296\5\64\33\2\u0296\u0297\7\"\2\2\u0297\u0298\5(\25\2\u0298O"+
		"\3\2\2\2\u0299\u029a\7\16\2\2\u029a\u029b\7\34\2\2\u029b\u029c\7\35\2"+
		"\2\u029c\u029f\5R*\2\u029d\u029e\7\22\2\2\u029e\u02a0\5\16\b\2\u029f\u029d"+
		"\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\5(\25\2\u02a2"+
		"Q\3\2\2\2\u02a3\u02a4\7\20\2\2\u02a4\u02a5\5\16\b\2\u02a5\u02a6\7\21\2"+
		"\2\u02a6\u02a7\5\16\b\2\u02a7S\3\2\2\2HW]cks{\u0083\u008b\u0093\u009b"+
		"\u00a3\u00ab\u00b3\u00b6\u00bd\u00c5\u00cd\u00d5\u00dd\u00e5\u00ed\u00f5"+
		"\u00fd\u0100\u0107\u010f\u0117\u011f\u0127\u012f\u0137\u013f\u0142\u014f"+
		"\u015c\u0163\u016b\u0173\u017b\u0183\u0186\u018d\u0195\u019d\u01a5\u01a8"+
		"\u01af\u01b7\u01bf\u01c2\u01c8\u01cf\u01d3\u01ee\u01f5\u0200\u0207\u020a"+
		"\u0210\u021c\u0224\u0236\u0248\u024c\u0253\u0256\u026f\u0273\u0288\u029f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}