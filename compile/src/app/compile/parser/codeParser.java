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
		RULE_statement = 20, RULE_declare_statement = 21, RULE_assignment_statement = 22, 
		RULE_logical_statement = 23, RULE_conditional_statement = 24, RULE_conditional_IF = 25, 
		RULE_conditional_SWITCH = 26, RULE_conditional_SWITCH_H = 27, RULE_conditional_CASE = 28, 
		RULE_conditional_DEFAULT = 29, RULE_conditional_ELSEIF = 30, RULE_conditional_ELSE = 31, 
		RULE_loop_statement = 32, RULE_loop_DO_WHILE = 33, RULE_loop_WHILE = 34, 
		RULE_loop_for = 35;
	public static final String[] ruleNames = {
		"s", "operator_bool1", "operator_bool2", "operator_bool3", "operator_bool4", 
		"operator_bool5", "expression1", "expression2", "expression3", "expression4", 
		"expression5", "expression_final", "package_declaration", "main_function", 
		"function_declaration", "parameter", "parameter_entry", "function_call", 
		"function_arguments", "group_statement", "statement", "declare_statement", 
		"assignment_statement", "logical_statement", "conditional_statement", 
		"conditional_IF", "conditional_SWITCH", "conditional_SWITCH_H", "conditional_CASE", 
		"conditional_DEFAULT", "conditional_ELSEIF", "conditional_ELSE", "loop_statement", 
		"loop_DO_WHILE", "loop_WHILE", "loop_for"
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
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_GRAB) {
				{
				{
				setState(72); package_declaration();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(78); function_declaration();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_FUNCTION) {
				{
				{
				setState(84); main_function();
				}
				}
				setState(89);
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
			setState(170);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90); expression_final();
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(91); match(LOGIC_1);
					setState(92); operator_bool2();
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98); expression5();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(99); match(LOGIC_1);
					setState(100); operator_bool2();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106); expression4();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(107); match(LOGIC_1);
					setState(108); operator_bool2();
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114); expression3();
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(115); match(LOGIC_1);
					setState(116); operator_bool2();
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(122); expression2();
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(123); match(LOGIC_1);
					setState(124); operator_bool2();
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(130); expression1();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(131); match(LOGIC_1);
					setState(132); operator_bool2();
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(138); operator_bool5();
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(139); match(LOGIC_1);
					setState(140); operator_bool2();
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(146); operator_bool4();
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(147); match(LOGIC_1);
					setState(148); operator_bool2();
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(154); operator_bool3();
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(155); match(LOGIC_1);
					setState(156); operator_bool2();
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(162); operator_bool2();
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_1) {
					{
					{
					setState(163); match(LOGIC_1);
					setState(164); operator_bool2();
					}
					}
					setState(169);
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
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172); expression_final();
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(173); match(LOGIC_2);
					setState(174); operator_bool3();
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180); expression5();
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(181); match(LOGIC_2);
					setState(182); operator_bool3();
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188); expression4();
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(189); match(LOGIC_2);
					setState(190); operator_bool3();
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(196); expression3();
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(197); match(LOGIC_2);
					setState(198); operator_bool3();
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(204); expression2();
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(205); match(LOGIC_2);
					setState(206); operator_bool3();
					}
					}
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(212); expression1();
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(213); match(LOGIC_2);
					setState(214); operator_bool3();
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(220); operator_bool5();
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(221); match(LOGIC_2);
					setState(222); operator_bool3();
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(228); operator_bool4();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(229); match(LOGIC_2);
					setState(230); operator_bool3();
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(236); operator_bool3();
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_2) {
					{
					{
					setState(237); match(LOGIC_2);
					setState(238); operator_bool3();
					}
					}
					setState(243);
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
			setState(310);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246); expression_final();
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_3) {
					{
					{
					setState(247); match(LOGIC_3);
					setState(248); operator_bool4();
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254); expression5();
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_3) {
					{
					{
					setState(255); match(LOGIC_3);
					setState(256); operator_bool4();
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(262); expression4();
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_3) {
					{
					{
					setState(263); match(LOGIC_3);
					setState(264); operator_bool4();
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(270); expression3();
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_3) {
					{
					{
					setState(271); match(LOGIC_3);
					setState(272); operator_bool4();
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(278); expression2();
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_3) {
					{
					{
					setState(279); match(LOGIC_3);
					setState(280); operator_bool4();
					}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(286); expression1();
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_3) {
					{
					{
					setState(287); match(LOGIC_3);
					setState(288); operator_bool4();
					}
					}
					setState(293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(294); operator_bool5();
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_3) {
					{
					{
					setState(295); match(LOGIC_3);
					setState(296); operator_bool4();
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(302); operator_bool4();
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGIC_3) {
					{
					{
					setState(303); match(LOGIC_3);
					setState(304); operator_bool4();
					}
					}
					setState(309);
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
			setState(323);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312); expression_final();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313); expression5();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314); expression4();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(315); expression3();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(316); expression2();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(317); expression1();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(318); operator_bool5();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(319); match(TOKEN_OPEN_P);
				setState(320); operator_bool1();
				setState(321); match(TOKEN_CLOS_P);
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
			setState(336);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325); expression_final();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326); expression5();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(327); expression4();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(328); expression3();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(329); expression2();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(330); expression1();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(331); match(TOKEN_NOT);
				setState(332); match(TOKEN_OPEN_P);
				setState(333); logical_statement();
				setState(334); match(TOKEN_CLOS_P);
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
			setState(378);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338); expression_final();
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_1) {
					{
					{
					setState(339); match(ARTH_1);
					setState(340); expression2();
					}
					}
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346); expression5();
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_1) {
					{
					{
					setState(347); match(ARTH_1);
					setState(348); expression2();
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(354); expression4();
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_1) {
					{
					{
					setState(355); match(ARTH_1);
					setState(356); expression2();
					}
					}
					setState(361);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(362); expression3();
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_1) {
					{
					{
					setState(363); match(ARTH_1);
					setState(364); expression2();
					}
					}
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(370); expression2();
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_1) {
					{
					{
					setState(371); match(ARTH_1);
					setState(372); expression2();
					}
					}
					setState(377);
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
			setState(412);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(380); expression_final();
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_2) {
					{
					{
					setState(381); match(ARTH_2);
					setState(382); expression3();
					}
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(388); expression5();
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_2) {
					{
					{
					setState(389); match(ARTH_2);
					setState(390); expression3();
					}
					}
					setState(395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(396); expression4();
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_2) {
					{
					{
					setState(397); match(ARTH_2);
					setState(398); expression3();
					}
					}
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(404); expression3();
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_2) {
					{
					{
					setState(405); match(ARTH_2);
					setState(406); expression3();
					}
					}
					setState(411);
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
			setState(438);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414); expression_final();
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_3) {
					{
					{
					setState(415); match(ARTH_3);
					setState(416); expression4();
					}
					}
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422); expression5();
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_3) {
					{
					{
					setState(423); match(ARTH_3);
					setState(424); expression4();
					}
					}
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(430); expression4();
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARTH_3) {
					{
					{
					setState(431); match(ARTH_3);
					setState(432); expression4();
					}
					}
					setState(437);
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
			setState(444);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440); expression_final();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(441); expression5();
				setState(442); match(ARTH_4);
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
			setState(451);
			switch (_input.LA(1)) {
			case TOKEN_TORF:
			case ID:
			case NUM:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(446); expression_final();
				}
				break;
			case TOKEN_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(447); match(TOKEN_OPEN_P);
				setState(448); expression1();
				setState(449); match(TOKEN_CLOS_P);
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
			setState(455);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
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
				setState(454); function_call();
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
			setState(457); match(TOKEN_GRAB);
			setState(458); match(STRING);
			setState(459); match(TOKEN_SEMICOLON);
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
			setState(461); match(TOKEN_FUNCTION);
			setState(462); match(TOKEN_MAIN);
			setState(463); match(TOKEN_OPEN_B);
			setState(464); match(TOKEN_CLOS_B);
			setState(465); match(TOKEN_RETURNING);
			setState(466); match(TYPE);
			setState(467); group_statement();
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
			setState(469); match(TOKEN_FUNCTION);
			setState(470); match(ID);
			setState(471); match(TOKEN_OPEN_B);
			setState(472); parameter();
			setState(473); match(TOKEN_CLOS_B);
			setState(474); match(TOKEN_RETURNING);
			setState(475); match(TYPE);
			setState(476); group_statement();
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
			setState(478); parameter_entry();
			}
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMMA) {
				{
				{
				setState(479); match(TOKEN_COMMA);
				setState(480); parameter_entry();
				}
				}
				setState(485);
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
			setState(489);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(486); match(TYPE);
				setState(487); match(ID);
				}
				break;
			case TOKEN_NO_PARAM:
				enterOuterAlt(_localctx, 2);
				{
				setState(488); match(TOKEN_NO_PARAM);
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
			setState(491); match(ID);
			setState(492); match(TOKEN_OPEN_B);
			setState(493); function_arguments();
			setState(494); match(TOKEN_CLOS_B);
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
			setState(507);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_TORF) | (1L << TOKEN_NOT) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << TOKEN_OPEN_P))) != 0)) {
					{
					setState(496); logical_statement();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(499); logical_statement();
				}
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_COMMA) {
					{
					{
					setState(500); match(TOKEN_COMMA);
					setState(501); logical_statement();
					}
					}
					setState(506);
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
			setState(509); match(TOKEN_OPEN_S);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_RETURNING) | (1L << TOKEN_REPEAT) | (1L << TOKEN_DECLARE) | (1L << TOKEN_IF) | (1L << TOKEN_CHECK) | (1L << ID) | (1L << TOKEN_OPEN_S))) != 0)) {
				{
				{
				setState(510); statement();
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(516); match(TOKEN_CLOS_S);
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
		public TerminalNode TOKEN_RETURNING() { return getToken(codeParser.TOKEN_RETURNING, 0); }
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Group_statementContext group_statement() {
			return getRuleContext(Group_statementContext.class,0);
		}
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public Logical_statementContext logical_statement() {
			return getRuleContext(Logical_statementContext.class,0);
		}
		public Declare_statementContext declare_statement() {
			return getRuleContext(Declare_statementContext.class,0);
		}
		public TerminalNode TOKEN_SEMICOLON() { return getToken(codeParser.TOKEN_SEMICOLON, 0); }
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
			setState(530);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(518); declare_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519); group_statement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(520); assignment_statement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(521); conditional_statement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(522); loop_statement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(523); function_call();
				setState(524); match(TOKEN_SEMICOLON);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(526); match(TOKEN_RETURNING);
				setState(527); logical_statement();
				setState(528); match(TOKEN_SEMICOLON);
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
		enterRule(_localctx, 42, RULE_declare_statement);
		try {
			setState(545);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(532); match(TOKEN_DECLARE);
				setState(533); match(ID);
				setState(534); match(TOKEN_AS);
				setState(535); match(TYPE);
				setState(536); match(TOKEN_SEMICOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(537); match(TOKEN_DECLARE);
				setState(538); match(ID);
				setState(539); match(TOKEN_AS);
				setState(540); match(TYPE);
				setState(541); match(TOKEN_TO);
				setState(542); logical_statement();
				setState(543); match(TOKEN_SEMICOLON);
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
		enterRule(_localctx, 44, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547); match(ID);
			setState(548); match(TOKEN_IS);
			setState(549); logical_statement();
			setState(550); match(TOKEN_SEMICOLON);
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
		enterRule(_localctx, 46, RULE_logical_statement);
		try {
			setState(563);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(552); expression_final();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(553); expression5();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(554); expression4();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(555); expression3();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(556); expression2();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(557); expression1();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(558); operator_bool5();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(559); operator_bool4();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(560); operator_bool3();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(561); operator_bool2();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(562); operator_bool1();
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
		enterRule(_localctx, 48, RULE_conditional_statement);
		try {
			setState(567);
			switch (_input.LA(1)) {
			case TOKEN_IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(565); conditional_IF();
				}
				break;
			case TOKEN_CHECK:
				enterOuterAlt(_localctx, 2);
				{
				setState(566); conditional_SWITCH();
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
		enterRule(_localctx, 50, RULE_conditional_IF);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(569); match(TOKEN_IF);
			setState(570); match(TOKEN_OPEN_B);
			{
			setState(571); logical_statement();
			}
			setState(572); match(TOKEN_CLOS_B);
			setState(573); group_statement();
			setState(577);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(574); conditional_ELSEIF();
					}
					} 
				}
				setState(579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(581);
			_la = _input.LA(1);
			if (_la==TOKEN_ELSE) {
				{
				setState(580); conditional_ELSE();
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
		enterRule(_localctx, 52, RULE_conditional_SWITCH);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583); conditional_SWITCH_H();
			setState(584); match(TOKEN_OPEN_S);
			setState(586); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(585); conditional_CASE();
				}
				}
				setState(588); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TOKEN_IS );
			setState(591);
			_la = _input.LA(1);
			if (_la==TOKEN_ELSE) {
				{
				setState(590); conditional_DEFAULT();
				}
			}

			setState(593); match(TOKEN_CLOS_S);
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
		enterRule(_localctx, 54, RULE_conditional_SWITCH_H);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595); match(TOKEN_CHECK);
			setState(596); match(TOKEN_IF);
			setState(597); match(TOKEN_OPEN_B);
			setState(598); match(ID);
			setState(599); match(TOKEN_CLOS_B);
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
		enterRule(_localctx, 56, RULE_conditional_CASE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601); match(TOKEN_IS);
			setState(602);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_TORF) | (1L << NUM) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(603); match(TOKEN_COLON);
			setState(604); group_statement();
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
		enterRule(_localctx, 58, RULE_conditional_DEFAULT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606); match(TOKEN_ELSE);
			setState(607); match(TOKEN_COLON);
			setState(608); group_statement();
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
		enterRule(_localctx, 60, RULE_conditional_ELSEIF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610); match(TOKEN_ELSE);
			setState(611); match(TOKEN_IF);
			setState(612); match(TOKEN_OPEN_B);
			setState(613); logical_statement();
			setState(614); match(TOKEN_CLOS_B);
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
		enterRule(_localctx, 62, RULE_conditional_ELSE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617); match(TOKEN_ELSE);
			setState(618); group_statement();
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
		enterRule(_localctx, 64, RULE_loop_statement);
		try {
			setState(623);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(620); loop_DO_WHILE();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(621); loop_WHILE();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(622); loop_for();
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
		enterRule(_localctx, 66, RULE_loop_DO_WHILE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625); match(TOKEN_REPEAT);
			setState(626); group_statement();
			setState(627); match(TOKEN_UNTIL);
			setState(628); match(TOKEN_OPEN_B);
			setState(629); logical_statement();
			setState(630); match(TOKEN_CLOS_B);
			setState(631); match(TOKEN_SEMICOLON);
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
		enterRule(_localctx, 68, RULE_loop_WHILE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633); match(TOKEN_REPEAT);
			setState(634); match(TOKEN_UNTIL);
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

	public static class Loop_forContext extends ParserRuleContext {
		public TerminalNode TOKEN_WITH() { return getToken(codeParser.TOKEN_WITH, 0); }
		public Group_statementContext group_statement() {
			return getRuleContext(Group_statementContext.class,0);
		}
		public TerminalNode TOKEN_FROM() { return getToken(codeParser.TOKEN_FROM, 0); }
		public TerminalNode ID() { return getToken(codeParser.ID, 0); }
		public TerminalNode TOKEN_TO() { return getToken(codeParser.TOKEN_TO, 0); }
		public TerminalNode TOKEN_REPEAT() { return getToken(codeParser.TOKEN_REPEAT, 0); }
		public Expression1Context expression1(int i) {
			return getRuleContext(Expression1Context.class,i);
		}
		public List<Expression1Context> expression1() {
			return getRuleContexts(Expression1Context.class);
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
		enterRule(_localctx, 70, RULE_loop_for);
		try {
			setState(660);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(640); match(TOKEN_REPEAT);
				setState(641); match(TYPE);
				setState(642); match(ID);
				setState(643); match(TOKEN_FROM);
				setState(644); expression1();
				setState(645); match(TOKEN_TO);
				setState(646); expression1();
				setState(647); group_statement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(649); match(TOKEN_REPEAT);
				setState(650); match(TYPE);
				setState(651); match(ID);
				setState(652); match(TOKEN_FROM);
				setState(653); expression1();
				setState(654); match(TOKEN_TO);
				setState(655); expression1();
				setState(656); match(TOKEN_WITH);
				setState(657); expression1();
				setState(658); group_statement();
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3)\u0299\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\7\2R\n\2"+
		"\f\2\16\2U\13\2\3\2\7\2X\n\2\f\2\16\2[\13\2\3\3\3\3\3\3\7\3`\n\3\f\3\16"+
		"\3c\13\3\3\3\3\3\3\3\7\3h\n\3\f\3\16\3k\13\3\3\3\3\3\3\3\7\3p\n\3\f\3"+
		"\16\3s\13\3\3\3\3\3\3\3\7\3x\n\3\f\3\16\3{\13\3\3\3\3\3\3\3\7\3\u0080"+
		"\n\3\f\3\16\3\u0083\13\3\3\3\3\3\3\3\7\3\u0088\n\3\f\3\16\3\u008b\13\3"+
		"\3\3\3\3\3\3\7\3\u0090\n\3\f\3\16\3\u0093\13\3\3\3\3\3\3\3\7\3\u0098\n"+
		"\3\f\3\16\3\u009b\13\3\3\3\3\3\3\3\7\3\u00a0\n\3\f\3\16\3\u00a3\13\3\3"+
		"\3\3\3\3\3\7\3\u00a8\n\3\f\3\16\3\u00ab\13\3\5\3\u00ad\n\3\3\4\3\4\3\4"+
		"\7\4\u00b2\n\4\f\4\16\4\u00b5\13\4\3\4\3\4\3\4\7\4\u00ba\n\4\f\4\16\4"+
		"\u00bd\13\4\3\4\3\4\3\4\7\4\u00c2\n\4\f\4\16\4\u00c5\13\4\3\4\3\4\3\4"+
		"\7\4\u00ca\n\4\f\4\16\4\u00cd\13\4\3\4\3\4\3\4\7\4\u00d2\n\4\f\4\16\4"+
		"\u00d5\13\4\3\4\3\4\3\4\7\4\u00da\n\4\f\4\16\4\u00dd\13\4\3\4\3\4\3\4"+
		"\7\4\u00e2\n\4\f\4\16\4\u00e5\13\4\3\4\3\4\3\4\7\4\u00ea\n\4\f\4\16\4"+
		"\u00ed\13\4\3\4\3\4\3\4\7\4\u00f2\n\4\f\4\16\4\u00f5\13\4\5\4\u00f7\n"+
		"\4\3\5\3\5\3\5\7\5\u00fc\n\5\f\5\16\5\u00ff\13\5\3\5\3\5\3\5\7\5\u0104"+
		"\n\5\f\5\16\5\u0107\13\5\3\5\3\5\3\5\7\5\u010c\n\5\f\5\16\5\u010f\13\5"+
		"\3\5\3\5\3\5\7\5\u0114\n\5\f\5\16\5\u0117\13\5\3\5\3\5\3\5\7\5\u011c\n"+
		"\5\f\5\16\5\u011f\13\5\3\5\3\5\3\5\7\5\u0124\n\5\f\5\16\5\u0127\13\5\3"+
		"\5\3\5\3\5\7\5\u012c\n\5\f\5\16\5\u012f\13\5\3\5\3\5\3\5\7\5\u0134\n\5"+
		"\f\5\16\5\u0137\13\5\5\5\u0139\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u0146\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u0153\n\7\3\b\3\b\3\b\7\b\u0158\n\b\f\b\16\b\u015b\13\b\3\b\3\b\3\b\7"+
		"\b\u0160\n\b\f\b\16\b\u0163\13\b\3\b\3\b\3\b\7\b\u0168\n\b\f\b\16\b\u016b"+
		"\13\b\3\b\3\b\3\b\7\b\u0170\n\b\f\b\16\b\u0173\13\b\3\b\3\b\3\b\7\b\u0178"+
		"\n\b\f\b\16\b\u017b\13\b\5\b\u017d\n\b\3\t\3\t\3\t\7\t\u0182\n\t\f\t\16"+
		"\t\u0185\13\t\3\t\3\t\3\t\7\t\u018a\n\t\f\t\16\t\u018d\13\t\3\t\3\t\3"+
		"\t\7\t\u0192\n\t\f\t\16\t\u0195\13\t\3\t\3\t\3\t\7\t\u019a\n\t\f\t\16"+
		"\t\u019d\13\t\5\t\u019f\n\t\3\n\3\n\3\n\7\n\u01a4\n\n\f\n\16\n\u01a7\13"+
		"\n\3\n\3\n\3\n\7\n\u01ac\n\n\f\n\16\n\u01af\13\n\3\n\3\n\3\n\7\n\u01b4"+
		"\n\n\f\n\16\n\u01b7\13\n\5\n\u01b9\n\n\3\13\3\13\3\13\3\13\5\13\u01bf"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u01c6\n\f\3\r\3\r\5\r\u01ca\n\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u01e4\n\21\f\21\16\21\u01e7"+
		"\13\21\3\22\3\22\3\22\5\22\u01ec\n\22\3\23\3\23\3\23\3\23\3\23\3\24\5"+
		"\24\u01f4\n\24\3\24\3\24\3\24\7\24\u01f9\n\24\f\24\16\24\u01fc\13\24\5"+
		"\24\u01fe\n\24\3\25\3\25\7\25\u0202\n\25\f\25\16\25\u0205\13\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0215"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0224\n\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u0236\n\31\3\32\3\32\5\32\u023a\n\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\7\33\u0242\n\33\f\33\16\33\u0245\13\33\3"+
		"\33\5\33\u0248\n\33\3\34\3\34\3\34\6\34\u024d\n\34\r\34\16\34\u024e\3"+
		"\34\5\34\u0252\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3\""+
		"\3\"\3\"\5\"\u0272\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0297\n"+
		"%\3%\2&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFH\2\4\4\2\31\31\35\37\4\2\31\31\36\37\u02ee\2M\3\2\2\2\4\u00ac\3"+
		"\2\2\2\6\u00f6\3\2\2\2\b\u0138\3\2\2\2\n\u0145\3\2\2\2\f\u0152\3\2\2\2"+
		"\16\u017c\3\2\2\2\20\u019e\3\2\2\2\22\u01b8\3\2\2\2\24\u01be\3\2\2\2\26"+
		"\u01c5\3\2\2\2\30\u01c9\3\2\2\2\32\u01cb\3\2\2\2\34\u01cf\3\2\2\2\36\u01d7"+
		"\3\2\2\2 \u01e0\3\2\2\2\"\u01eb\3\2\2\2$\u01ed\3\2\2\2&\u01fd\3\2\2\2"+
		"(\u01ff\3\2\2\2*\u0214\3\2\2\2,\u0223\3\2\2\2.\u0225\3\2\2\2\60\u0235"+
		"\3\2\2\2\62\u0239\3\2\2\2\64\u023b\3\2\2\2\66\u0249\3\2\2\28\u0255\3\2"+
		"\2\2:\u025b\3\2\2\2<\u0260\3\2\2\2>\u0264\3\2\2\2@\u026b\3\2\2\2B\u0271"+
		"\3\2\2\2D\u0273\3\2\2\2F\u027b\3\2\2\2H\u0296\3\2\2\2JL\5\32\16\2KJ\3"+
		"\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NS\3\2\2\2OM\3\2\2\2PR\5\36\20\2Q"+
		"P\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TY\3\2\2\2US\3\2\2\2VX\5\34\17"+
		"\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\3\3\2\2\2[Y\3\2\2\2\\a\5\30"+
		"\r\2]^\7\3\2\2^`\5\6\4\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\u00ad"+
		"\3\2\2\2ca\3\2\2\2di\5\26\f\2ef\7\3\2\2fh\5\6\4\2ge\3\2\2\2hk\3\2\2\2"+
		"ig\3\2\2\2ij\3\2\2\2j\u00ad\3\2\2\2ki\3\2\2\2lq\5\24\13\2mn\7\3\2\2np"+
		"\5\6\4\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\u00ad\3\2\2\2sq\3\2"+
		"\2\2ty\5\22\n\2uv\7\3\2\2vx\5\6\4\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3"+
		"\2\2\2z\u00ad\3\2\2\2{y\3\2\2\2|\u0081\5\20\t\2}~\7\3\2\2~\u0080\5\6\4"+
		"\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2"+
		"\2\2\u0082\u00ad\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0089\5\16\b\2\u0085"+
		"\u0086\7\3\2\2\u0086\u0088\5\6\4\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u00ad\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u0091\5\f\7\2\u008d\u008e\7\3\2\2\u008e\u0090\5\6"+
		"\4\2\u008f\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u00ad\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0099\5\n"+
		"\6\2\u0095\u0096\7\3\2\2\u0096\u0098\5\6\4\2\u0097\u0095\3\2\2\2\u0098"+
		"\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00ad\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009c\u00a1\5\b\5\2\u009d\u009e\7\3\2\2\u009e"+
		"\u00a0\5\6\4\2\u009f\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00ad\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a9\5\6\4\2\u00a5\u00a6\7\3\2\2\u00a6\u00a8\5\6\4\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\\\3\2\2\2\u00acd\3\2\2\2\u00ac"+
		"l\3\2\2\2\u00act\3\2\2\2\u00ac|\3\2\2\2\u00ac\u0084\3\2\2\2\u00ac\u008c"+
		"\3\2\2\2\u00ac\u0094\3\2\2\2\u00ac\u009c\3\2\2\2\u00ac\u00a4\3\2\2\2\u00ad"+
		"\5\3\2\2\2\u00ae\u00b3\5\30\r\2\u00af\u00b0\7\4\2\2\u00b0\u00b2\5\b\5"+
		"\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00f7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00bb\5\26\f\2"+
		"\u00b7\u00b8\7\4\2\2\u00b8\u00ba\5\b\5\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00f7\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00c3\5\24\13\2\u00bf\u00c0\7\4\2\2\u00c0\u00c2\5"+
		"\b\5\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00f7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00cb\5\22"+
		"\n\2\u00c7\u00c8\7\4\2\2\u00c8\u00ca\5\b\5\2\u00c9\u00c7\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00f7\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d3\5\20\t\2\u00cf\u00d0\7\4\2\2\u00d0"+
		"\u00d2\5\b\5\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00f7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00db\5\16\b\2\u00d7\u00d8\7\4\2\2\u00d8\u00da\5\b\5\2\u00d9\u00d7\3"+
		"\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00f7\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e3\5\f\7\2\u00df\u00e0\7\4"+
		"\2\2\u00e0\u00e2\5\b\5\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00f7\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e6\u00eb\5\n\6\2\u00e7\u00e8\7\4\2\2\u00e8\u00ea\5\b\5\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00f7\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f3\5\b\5\2\u00ef"+
		"\u00f0\7\4\2\2\u00f0\u00f2\5\b\5\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u00ae\3\2\2\2\u00f6\u00b6\3\2\2\2\u00f6\u00be\3\2"+
		"\2\2\u00f6\u00c6\3\2\2\2\u00f6\u00ce\3\2\2\2\u00f6\u00d6\3\2\2\2\u00f6"+
		"\u00de\3\2\2\2\u00f6\u00e6\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f7\7\3\2\2\2"+
		"\u00f8\u00fd\5\30\r\2\u00f9\u00fa\7\5\2\2\u00fa\u00fc\5\n\6\2\u00fb\u00f9"+
		"\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u0139\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0105\5\26\f\2\u0101\u0102\7"+
		"\5\2\2\u0102\u0104\5\n\6\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0139\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0108\u010d\5\24\13\2\u0109\u010a\7\5\2\2\u010a\u010c\5\n\6\2\u010b"+
		"\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u0139\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0115\5\22\n\2\u0111"+
		"\u0112\7\5\2\2\u0112\u0114\5\n\6\2\u0113\u0111\3\2\2\2\u0114\u0117\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0139\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0118\u011d\5\20\t\2\u0119\u011a\7\5\2\2\u011a\u011c\5"+
		"\n\6\2\u011b\u0119\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u0139\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0125\5\16"+
		"\b\2\u0121\u0122\7\5\2\2\u0122\u0124\5\n\6\2\u0123\u0121\3\2\2\2\u0124"+
		"\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0139\3\2"+
		"\2\2\u0127\u0125\3\2\2\2\u0128\u012d\5\f\7\2\u0129\u012a\7\5\2\2\u012a"+
		"\u012c\5\n\6\2\u012b\u0129\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\u0139\3\2\2\2\u012f\u012d\3\2\2\2\u0130"+
		"\u0135\5\n\6\2\u0131\u0132\7\5\2\2\u0132\u0134\5\n\6\2\u0133\u0131\3\2"+
		"\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u00f8\3\2\2\2\u0138\u0100\3\2"+
		"\2\2\u0138\u0108\3\2\2\2\u0138\u0110\3\2\2\2\u0138\u0118\3\2\2\2\u0138"+
		"\u0120\3\2\2\2\u0138\u0128\3\2\2\2\u0138\u0130\3\2\2\2\u0139\t\3\2\2\2"+
		"\u013a\u0146\5\30\r\2\u013b\u0146\5\26\f\2\u013c\u0146\5\24\13\2\u013d"+
		"\u0146\5\22\n\2\u013e\u0146\5\20\t\2\u013f\u0146\5\16\b\2\u0140\u0146"+
		"\5\f\7\2\u0141\u0142\7#\2\2\u0142\u0143\5\4\3\2\u0143\u0144\7$\2\2\u0144"+
		"\u0146\3\2\2\2\u0145\u013a\3\2\2\2\u0145\u013b\3\2\2\2\u0145\u013c\3\2"+
		"\2\2\u0145\u013d\3\2\2\2\u0145\u013e\3\2\2\2\u0145\u013f\3\2\2\2\u0145"+
		"\u0140\3\2\2\2\u0145\u0141\3\2\2\2\u0146\13\3\2\2\2\u0147\u0153\5\30\r"+
		"\2\u0148\u0153\5\26\f\2\u0149\u0153\5\24\13\2\u014a\u0153\5\22\n\2\u014b"+
		"\u0153\5\20\t\2\u014c\u0153\5\16\b\2\u014d\u014e\7\33\2\2\u014e\u014f"+
		"\7#\2\2\u014f\u0150\5\60\31\2\u0150\u0151\7$\2\2\u0151\u0153\3\2\2\2\u0152"+
		"\u0147\3\2\2\2\u0152\u0148\3\2\2\2\u0152\u0149\3\2\2\2\u0152\u014a\3\2"+
		"\2\2\u0152\u014b\3\2\2\2\u0152\u014c\3\2\2\2\u0152\u014d\3\2\2\2\u0153"+
		"\r\3\2\2\2\u0154\u0159\5\30\r\2\u0155\u0156\7\6\2\2\u0156\u0158\5\20\t"+
		"\2\u0157\u0155\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a"+
		"\3\2\2\2\u015a\u017d\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u0161\5\26\f\2"+
		"\u015d\u015e\7\6\2\2\u015e\u0160\5\20\t\2\u015f\u015d\3\2\2\2\u0160\u0163"+
		"\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u017d\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0164\u0169\5\24\13\2\u0165\u0166\7\6\2\2\u0166\u0168\5"+
		"\20\t\2\u0167\u0165\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u017d\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u0171\5\22"+
		"\n\2\u016d\u016e\7\6\2\2\u016e\u0170\5\20\t\2\u016f\u016d\3\2\2\2\u0170"+
		"\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u017d\3\2"+
		"\2\2\u0173\u0171\3\2\2\2\u0174\u0179\5\20\t\2\u0175\u0176\7\6\2\2\u0176"+
		"\u0178\5\20\t\2\u0177\u0175\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3"+
		"\2\2\2\u0179\u017a\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017c"+
		"\u0154\3\2\2\2\u017c\u015c\3\2\2\2\u017c\u0164\3\2\2\2\u017c\u016c\3\2"+
		"\2\2\u017c\u0174\3\2\2\2\u017d\17\3\2\2\2\u017e\u0183\5\30\r\2\u017f\u0180"+
		"\7\7\2\2\u0180\u0182\5\22\n\2\u0181\u017f\3\2\2\2\u0182\u0185\3\2\2\2"+
		"\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u019f\3\2\2\2\u0185\u0183"+
		"\3\2\2\2\u0186\u018b\5\26\f\2\u0187\u0188\7\7\2\2\u0188\u018a\5\22\n\2"+
		"\u0189\u0187\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c"+
		"\3\2\2\2\u018c\u019f\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0193\5\24\13\2"+
		"\u018f\u0190\7\7\2\2\u0190\u0192\5\22\n\2\u0191\u018f\3\2\2\2\u0192\u0195"+
		"\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u019f\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0196\u019b\5\22\n\2\u0197\u0198\7\7\2\2\u0198\u019a\5"+
		"\22\n\2\u0199\u0197\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u017e\3\2"+
		"\2\2\u019e\u0186\3\2\2\2\u019e\u018e\3\2\2\2\u019e\u0196\3\2\2\2\u019f"+
		"\21\3\2\2\2\u01a0\u01a5\5\30\r\2\u01a1\u01a2\7\b\2\2\u01a2\u01a4\5\24"+
		"\13\2\u01a3\u01a1\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5"+
		"\u01a6\3\2\2\2\u01a6\u01b9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01ad\5\26"+
		"\f\2\u01a9\u01aa\7\b\2\2\u01aa\u01ac\5\24\13\2\u01ab\u01a9\3\2\2\2\u01ac"+
		"\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b9\3\2"+
		"\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b5\5\24\13\2\u01b1\u01b2\7\b\2\2\u01b2"+
		"\u01b4\5\24\13\2\u01b3\u01b1\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3"+
		"\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8"+
		"\u01a0\3\2\2\2\u01b8\u01a8\3\2\2\2\u01b8\u01b0\3\2\2\2\u01b9\23\3\2\2"+
		"\2\u01ba\u01bf\5\30\r\2\u01bb\u01bc\5\26\f\2\u01bc\u01bd\7\t\2\2\u01bd"+
		"\u01bf\3\2\2\2\u01be\u01ba\3\2\2\2\u01be\u01bb\3\2\2\2\u01bf\25\3\2\2"+
		"\2\u01c0\u01c6\5\30\r\2\u01c1\u01c2\7#\2\2\u01c2\u01c3\5\16\b\2\u01c3"+
		"\u01c4\7$\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c0\3\2\2\2\u01c5\u01c1\3\2"+
		"\2\2\u01c6\27\3\2\2\2\u01c7\u01ca\t\2\2\2\u01c8\u01ca\5$\23\2\u01c9\u01c7"+
		"\3\2\2\2\u01c9\u01c8\3\2\2\2\u01ca\31\3\2\2\2\u01cb\u01cc\7\n\2\2\u01cc"+
		"\u01cd\7\37\2\2\u01cd\u01ce\7(\2\2\u01ce\33\3\2\2\2\u01cf\u01d0\7\f\2"+
		"\2\u01d0\u01d1\7\13\2\2\u01d1\u01d2\7!\2\2\u01d2\u01d3\7\"\2\2\u01d3\u01d4"+
		"\7\r\2\2\u01d4\u01d5\7\34\2\2\u01d5\u01d6\5(\25\2\u01d6\35\3\2\2\2\u01d7"+
		"\u01d8\7\f\2\2\u01d8\u01d9\7\35\2\2\u01d9\u01da\7!\2\2\u01da\u01db\5 "+
		"\21\2\u01db\u01dc\7\"\2\2\u01dc\u01dd\7\r\2\2\u01dd\u01de\7\34\2\2\u01de"+
		"\u01df\5(\25\2\u01df\37\3\2\2\2\u01e0\u01e5\5\"\22\2\u01e1\u01e2\7\'\2"+
		"\2\u01e2\u01e4\5\"\22\2\u01e3\u01e1\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5"+
		"\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6!\3\2\2\2\u01e7\u01e5\3\2\2\2"+
		"\u01e8\u01e9\7\34\2\2\u01e9\u01ec\7\35\2\2\u01ea\u01ec\7\32\2\2\u01eb"+
		"\u01e8\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ec#\3\2\2\2\u01ed\u01ee\7\35\2\2"+
		"\u01ee\u01ef\7!\2\2\u01ef\u01f0\5&\24\2\u01f0\u01f1\7\"\2\2\u01f1%\3\2"+
		"\2\2\u01f2\u01f4\5\60\31\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4"+
		"\u01fe\3\2\2\2\u01f5\u01fa\5\60\31\2\u01f6\u01f7\7\'\2\2\u01f7\u01f9\5"+
		"\60\31\2\u01f8\u01f6\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa"+
		"\u01fb\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u01f3\3\2"+
		"\2\2\u01fd\u01f5\3\2\2\2\u01fe\'\3\2\2\2\u01ff\u0203\7%\2\2\u0200\u0202"+
		"\5*\26\2\u0201\u0200\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0206\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0207\7&"+
		"\2\2\u0207)\3\2\2\2\u0208\u0215\5,\27\2\u0209\u0215\5(\25\2\u020a\u0215"+
		"\5.\30\2\u020b\u0215\5\62\32\2\u020c\u0215\5B\"\2\u020d\u020e\5$\23\2"+
		"\u020e\u020f\7(\2\2\u020f\u0215\3\2\2\2\u0210\u0211\7\r\2\2\u0211\u0212"+
		"\5\60\31\2\u0212\u0213\7(\2\2\u0213\u0215\3\2\2\2\u0214\u0208\3\2\2\2"+
		"\u0214\u0209\3\2\2\2\u0214\u020a\3\2\2\2\u0214\u020b\3\2\2\2\u0214\u020c"+
		"\3\2\2\2\u0214\u020d\3\2\2\2\u0214\u0210\3\2\2\2\u0215+\3\2\2\2\u0216"+
		"\u0217\7\23\2\2\u0217\u0218\7\35\2\2\u0218\u0219\7\24\2\2\u0219\u021a"+
		"\7\34\2\2\u021a\u0224\7(\2\2\u021b\u021c\7\23\2\2\u021c\u021d\7\35\2\2"+
		"\u021d\u021e\7\24\2\2\u021e\u021f\7\34\2\2\u021f\u0220\7\21\2\2\u0220"+
		"\u0221\5\60\31\2\u0221\u0222\7(\2\2\u0222\u0224\3\2\2\2\u0223\u0216\3"+
		"\2\2\2\u0223\u021b\3\2\2\2\u0224-\3\2\2\2\u0225\u0226\7\35\2\2\u0226\u0227"+
		"\7\25\2\2\u0227\u0228\5\60\31\2\u0228\u0229\7(\2\2\u0229/\3\2\2\2\u022a"+
		"\u0236\5\30\r\2\u022b\u0236\5\26\f\2\u022c\u0236\5\24\13\2\u022d\u0236"+
		"\5\22\n\2\u022e\u0236\5\20\t\2\u022f\u0236\5\16\b\2\u0230\u0236\5\f\7"+
		"\2\u0231\u0236\5\n\6\2\u0232\u0236\5\b\5\2\u0233\u0236\5\6\4\2\u0234\u0236"+
		"\5\4\3\2\u0235\u022a\3\2\2\2\u0235\u022b\3\2\2\2\u0235\u022c\3\2\2\2\u0235"+
		"\u022d\3\2\2\2\u0235\u022e\3\2\2\2\u0235\u022f\3\2\2\2\u0235\u0230\3\2"+
		"\2\2\u0235\u0231\3\2\2\2\u0235\u0232\3\2\2\2\u0235\u0233\3\2\2\2\u0235"+
		"\u0234\3\2\2\2\u0236\61\3\2\2\2\u0237\u023a\5\64\33\2\u0238\u023a\5\66"+
		"\34\2\u0239\u0237\3\2\2\2\u0239\u0238\3\2\2\2\u023a\63\3\2\2\2\u023b\u023c"+
		"\7\26\2\2\u023c\u023d\7!\2\2\u023d\u023e\5\60\31\2\u023e\u023f\7\"\2\2"+
		"\u023f\u0243\5(\25\2\u0240\u0242\5> \2\u0241\u0240\3\2\2\2\u0242\u0245"+
		"\3\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0247\3\2\2\2\u0245"+
		"\u0243\3\2\2\2\u0246\u0248\5@!\2\u0247\u0246\3\2\2\2\u0247\u0248\3\2\2"+
		"\2\u0248\65\3\2\2\2\u0249\u024a\58\35\2\u024a\u024c\7%\2\2\u024b\u024d"+
		"\5:\36\2\u024c\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024c\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024f\u0251\3\2\2\2\u0250\u0252\5<\37\2\u0251\u0250\3\2"+
		"\2\2\u0251\u0252\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\7&\2\2\u0254"+
		"\67\3\2\2\2\u0255\u0256\7\27\2\2\u0256\u0257\7\26\2\2\u0257\u0258\7!\2"+
		"\2\u0258\u0259\7\35\2\2\u0259\u025a\7\"\2\2\u025a9\3\2\2\2\u025b\u025c"+
		"\7\25\2\2\u025c\u025d\t\3\2\2\u025d\u025e\7)\2\2\u025e\u025f\5(\25\2\u025f"+
		";\3\2\2\2\u0260\u0261\7\30\2\2\u0261\u0262\7)\2\2\u0262\u0263\5(\25\2"+
		"\u0263=\3\2\2\2\u0264\u0265\7\30\2\2\u0265\u0266\7\26\2\2\u0266\u0267"+
		"\7!\2\2\u0267\u0268\5\60\31\2\u0268\u0269\7\"\2\2\u0269\u026a\5(\25\2"+
		"\u026a?\3\2\2\2\u026b\u026c\7\30\2\2\u026c\u026d\5(\25\2\u026dA\3\2\2"+
		"\2\u026e\u0272\5D#\2\u026f\u0272\5F$\2\u0270\u0272\5H%\2\u0271\u026e\3"+
		"\2\2\2\u0271\u026f\3\2\2\2\u0271\u0270\3\2\2\2\u0272C\3\2\2\2\u0273\u0274"+
		"\7\16\2\2\u0274\u0275\5(\25\2\u0275\u0276\7\17\2\2\u0276\u0277\7!\2\2"+
		"\u0277\u0278\5\60\31\2\u0278\u0279\7\"\2\2\u0279\u027a\7(\2\2\u027aE\3"+
		"\2\2\2\u027b\u027c\7\16\2\2\u027c\u027d\7\17\2\2\u027d\u027e\7!\2\2\u027e"+
		"\u027f\5\60\31\2\u027f\u0280\7\"\2\2\u0280\u0281\5(\25\2\u0281G\3\2\2"+
		"\2\u0282\u0283\7\16\2\2\u0283\u0284\7\34\2\2\u0284\u0285\7\35\2\2\u0285"+
		"\u0286\7\20\2\2\u0286\u0287\5\16\b\2\u0287\u0288\7\21\2\2\u0288\u0289"+
		"\5\16\b\2\u0289\u028a\5(\25\2\u028a\u0297\3\2\2\2\u028b\u028c\7\16\2\2"+
		"\u028c\u028d\7\34\2\2\u028d\u028e\7\35\2\2\u028e\u028f\7\20\2\2\u028f"+
		"\u0290\5\16\b\2\u0290\u0291\7\21\2\2\u0291\u0292\5\16\b\2\u0292\u0293"+
		"\7\22\2\2\u0293\u0294\5\16\b\2\u0294\u0295\5(\25\2\u0295\u0297\3\2\2\2"+
		"\u0296\u0282\3\2\2\2\u0296\u028b\3\2\2\2\u0297I\3\2\2\2GMSYaiqy\u0081"+
		"\u0089\u0091\u0099\u00a1\u00a9\u00ac\u00b3\u00bb\u00c3\u00cb\u00d3\u00db"+
		"\u00e3\u00eb\u00f3\u00f6\u00fd\u0105\u010d\u0115\u011d\u0125\u012d\u0135"+
		"\u0138\u0145\u0152\u0159\u0161\u0169\u0171\u0179\u017c\u0183\u018b\u0193"+
		"\u019b\u019e\u01a5\u01ad\u01b5\u01b8\u01be\u01c5\u01c9\u01e5\u01eb\u01f3"+
		"\u01fa\u01fd\u0203\u0214\u0223\u0235\u0239\u0243\u0247\u024e\u0251\u0271"+
		"\u0296";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}