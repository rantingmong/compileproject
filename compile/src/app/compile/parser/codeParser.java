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

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class codeParser extends Parser
{
    protected static final DFA[]                  _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
    public static final int                       LOGIC_1             = 1,
            LOGIC_2 = 2, LOGIC_3 = 3, ARTH_1 = 4, ARTH_2 = 5, ARTH_3 = 6,
            ARTH_4 = 7, TOKEN_GRAB = 8, TOKEN_MAIN = 9, TOKEN_FUNCTION = 10,
            TOKEN_RETURNING = 11, TOKEN_REPEAT = 12, TOKEN_UNTIL = 13,
            TOKEN_FROM = 14, TOKEN_TO = 15, TOKEN_WITH = 16,
            TOKEN_DECLARE = 17, TOKEN_AS = 18, TOKEN_IS = 19, TOKEN_IF = 20,
            TOKEN_CHECK = 21, TOKEN_ELSE = 22, TOKEN_TORF = 23,
            TOKEN_NO_PARAM = 24, TOKEN_NOT = 25, TYPE = 26, ID = 27, NUM = 28,
            STRING = 29, WS = 30, TOKEN_OPEN_B = 31, TOKEN_CLOS_B = 32,
            TOKEN_OPEN_P = 33, TOKEN_CLOS_P = 34, TOKEN_OPEN_S = 35,
            TOKEN_CLOS_S = 36, TOKEN_COMMA = 37, TOKEN_SEMICOLON = 38,
            TOKEN_COLON = 39;
    public static final String[]                  tokenNames          = { "<INVALID>", "LOGIC_1", "LOGIC_2", "LOGIC_3", "ARTH_1", "ARTH_2", "ARTH_3", "ARTH_4", "TOKEN_GRAB", "TOKEN_MAIN", "TOKEN_FUNCTION", "TOKEN_RETURNING", "TOKEN_REPEAT", "TOKEN_UNTIL", "TOKEN_FROM", "TOKEN_TO", "TOKEN_WITH", "TOKEN_DECLARE", "TOKEN_AS", "TOKEN_IS", "TOKEN_IF", "TOKEN_CHECK", "TOKEN_ELSE", "TOKEN_TORF", "TOKEN_NO_PARAM", "TOKEN_NOT", "TYPE", "ID", "NUM", "STRING", "WS", "'['", "']'", "'('", "')'", "'<<'", "'>>'", "','", "';'", "':'" };
    public static final int                       RULE_s              = 0,
            RULE_operator_bool1 = 1, RULE_operator_bool2 = 2,
            RULE_operator_bool3 = 3, RULE_operator_bool4 = 4,
            RULE_operator_bool5 = 5, RULE_expression1 = 6,
            RULE_expression2 = 7, RULE_expression3 = 8, RULE_expression4 = 9,
            RULE_expression5 = 10, RULE_expression_final = 11,
            RULE_package_declaration = 12, RULE_main_function = 13,
            RULE_function_declaration = 14, RULE_parameter = 15,
            RULE_function_call = 16, RULE_group_statement = 17,
            RULE_statement = 18, RULE_declare_statement = 19,
            RULE_assignment_statement = 20, RULE_logical_statement = 21,
            RULE_conditional_statement = 22, RULE_conditional_CASE = 23,
            RULE_conditional_DEFAULT = 24, RULE_conditional_ELSEIF = 25,
            RULE_conditional_ELSE = 26, RULE_loop_statement = 27;
    public static final String[]                  ruleNames           = { "s", "operator_bool1", "operator_bool2", "operator_bool3", "operator_bool4", "operator_bool5", "expression1", "expression2", "expression3", "expression4", "expression5", "expression_final", "package_declaration", "main_function", "function_declaration", "parameter", "function_call", "group_statement", "statement", "declare_statement", "assignment_statement", "logical_statement", "conditional_statement", "conditional_CASE", "conditional_DEFAULT", "conditional_ELSEIF", "conditional_ELSE", "loop_statement" };

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
    public ATN getATN()
    {
        return _ATN;
    }

    public codeParser(TokenStream input)
    {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class SContext extends ParserRuleContext
    {
        public List<Function_declarationContext> function_declaration()
        {
            return getRuleContexts(Function_declarationContext.class);
        }

        public List<Main_functionContext> main_function()
        {
            return getRuleContexts(Main_functionContext.class);
        }

        public Function_declarationContext function_declaration(int i)
        {
            return getRuleContext(Function_declarationContext.class, i);
        }

        public Main_functionContext main_function(int i)
        {
            return getRuleContext(Main_functionContext.class, i);
        }

        public Package_declarationContext package_declaration(int i)
        {
            return getRuleContext(Package_declarationContext.class, i);
        }

        public List<Package_declarationContext> package_declaration()
        {
            return getRuleContexts(Package_declarationContext.class);
        }

        public SContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_s;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterS(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitS(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitS(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final SContext s() throws RecognitionException
    {
        SContext _localctx = new SContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_s);
        int _la;
        try
        {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(59);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == TOKEN_GRAB)
                {
                    {
                        {
                            setState(56);
                            package_declaration();
                        }
                    }
                    setState(61);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(65);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
                while (_alt != 2 && _alt != -1)
                {
                    if (_alt == 1)
                    {
                        {
                            {
                                setState(62);
                                function_declaration();
                            }
                        }
                    }
                    setState(67);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
                }
                setState(71);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == TOKEN_FUNCTION)
                {
                    {
                        {
                            setState(68);
                            main_function();
                        }
                    }
                    setState(73);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Operator_bool1Context extends ParserRuleContext
    {
        public Expression5Context expression5()
        {
            return getRuleContext(Expression5Context.class, 0);
        }

        public List<Operator_bool2Context> operator_bool2()
        {
            return getRuleContexts(Operator_bool2Context.class);
        }

        public Expression3Context expression3()
        {
            return getRuleContext(Expression3Context.class, 0);
        }

        public TerminalNode LOGIC_1(int i)
        {
            return getToken(codeParser.LOGIC_1, i);
        }

        public Expression4Context expression4()
        {
            return getRuleContext(Expression4Context.class, 0);
        }

        public Operator_bool5Context operator_bool5()
        {
            return getRuleContext(Operator_bool5Context.class, 0);
        }

        public Expression2Context expression2()
        {
            return getRuleContext(Expression2Context.class, 0);
        }

        public Expression1Context expression1()
        {
            return getRuleContext(Expression1Context.class, 0);
        }

        public Expression_finalContext expression_final()
        {
            return getRuleContext(Expression_finalContext.class, 0);
        }

        public Operator_bool3Context operator_bool3()
        {
            return getRuleContext(Operator_bool3Context.class, 0);
        }

        public List<TerminalNode> LOGIC_1()
        {
            return getTokens(codeParser.LOGIC_1);
        }

        public Operator_bool4Context operator_bool4()
        {
            return getRuleContext(Operator_bool4Context.class, 0);
        }

        public Operator_bool2Context operator_bool2(int i)
        {
            return getRuleContext(Operator_bool2Context.class, i);
        }

        public Operator_bool1Context(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_operator_bool1;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterOperator_bool1(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitOperator_bool1(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitOperator_bool1(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Operator_bool1Context operator_bool1() throws RecognitionException
    {
        Operator_bool1Context _localctx = new Operator_bool1Context(_ctx, getState());
        enterRule(_localctx, 2, RULE_operator_bool1);
        int _la;
        try
        {
            setState(154);
            switch (getInterpreter().adaptivePredict(_input, 13, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(74);
                    expression_final();
                    setState(79);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_1)
                    {
                        {
                            {
                                setState(75);
                                match(LOGIC_1);
                                setState(76);
                                operator_bool2();
                            }
                        }
                        setState(81);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(82);
                    expression5();
                    setState(87);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_1)
                    {
                        {
                            {
                                setState(83);
                                match(LOGIC_1);
                                setState(84);
                                operator_bool2();
                            }
                        }
                        setState(89);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 3:
                enterOuterAlt(_localctx, 3);
                {
                    setState(90);
                    expression4();
                    setState(95);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_1)
                    {
                        {
                            {
                                setState(91);
                                match(LOGIC_1);
                                setState(92);
                                operator_bool2();
                            }
                        }
                        setState(97);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 4:
                enterOuterAlt(_localctx, 4);
                {
                    setState(98);
                    expression3();
                    setState(103);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_1)
                    {
                        {
                            {
                                setState(99);
                                match(LOGIC_1);
                                setState(100);
                                operator_bool2();
                            }
                        }
                        setState(105);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 5:
                enterOuterAlt(_localctx, 5);
                {
                    setState(106);
                    expression2();
                    setState(111);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_1)
                    {
                        {
                            {
                                setState(107);
                                match(LOGIC_1);
                                setState(108);
                                operator_bool2();
                            }
                        }
                        setState(113);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 6:
                enterOuterAlt(_localctx, 6);
                {
                    setState(114);
                    expression1();
                    setState(119);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_1)
                    {
                        {
                            {
                                setState(115);
                                match(LOGIC_1);
                                setState(116);
                                operator_bool2();
                            }
                        }
                        setState(121);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 7:
                enterOuterAlt(_localctx, 7);
                {
                    setState(122);
                    operator_bool5();
                    setState(127);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_1)
                    {
                        {
                            {
                                setState(123);
                                match(LOGIC_1);
                                setState(124);
                                operator_bool2();
                            }
                        }
                        setState(129);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 8:
                enterOuterAlt(_localctx, 8);
                {
                    setState(130);
                    operator_bool4();
                    setState(135);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_1)
                    {
                        {
                            {
                                setState(131);
                                match(LOGIC_1);
                                setState(132);
                                operator_bool2();
                            }
                        }
                        setState(137);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 9:
                enterOuterAlt(_localctx, 9);
                {
                    setState(138);
                    operator_bool3();
                    setState(143);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_1)
                    {
                        {
                            {
                                setState(139);
                                match(LOGIC_1);
                                setState(140);
                                operator_bool2();
                            }
                        }
                        setState(145);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 10:
                enterOuterAlt(_localctx, 10);
                {
                    setState(146);
                    operator_bool2();
                    setState(151);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_1)
                    {
                        {
                            {
                                setState(147);
                                match(LOGIC_1);
                                setState(148);
                                operator_bool2();
                            }
                        }
                        setState(153);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Operator_bool2Context extends ParserRuleContext
    {
        public Expression_finalContext expression_final()
        {
            return getRuleContext(Expression_finalContext.class, 0);
        }

        public Expression5Context expression5()
        {
            return getRuleContext(Expression5Context.class, 0);
        }

        public List<Operator_bool3Context> operator_bool3()
        {
            return getRuleContexts(Operator_bool3Context.class);
        }

        public Operator_bool3Context operator_bool3(int i)
        {
            return getRuleContext(Operator_bool3Context.class, i);
        }

        public Expression3Context expression3()
        {
            return getRuleContext(Expression3Context.class, 0);
        }

        public Operator_bool4Context operator_bool4()
        {
            return getRuleContext(Operator_bool4Context.class, 0);
        }

        public Operator_bool5Context operator_bool5()
        {
            return getRuleContext(Operator_bool5Context.class, 0);
        }

        public Expression4Context expression4()
        {
            return getRuleContext(Expression4Context.class, 0);
        }

        public TerminalNode LOGIC_2(int i)
        {
            return getToken(codeParser.LOGIC_2, i);
        }

        public List<TerminalNode> LOGIC_2()
        {
            return getTokens(codeParser.LOGIC_2);
        }

        public Expression1Context expression1()
        {
            return getRuleContext(Expression1Context.class, 0);
        }

        public Expression2Context expression2()
        {
            return getRuleContext(Expression2Context.class, 0);
        }

        public Operator_bool2Context(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_operator_bool2;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterOperator_bool2(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitOperator_bool2(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitOperator_bool2(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Operator_bool2Context operator_bool2() throws RecognitionException
    {
        Operator_bool2Context _localctx = new Operator_bool2Context(_ctx, getState());
        enterRule(_localctx, 4, RULE_operator_bool2);
        int _la;
        try
        {
            setState(228);
            switch (getInterpreter().adaptivePredict(_input, 23, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(156);
                    expression_final();
                    setState(161);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_2)
                    {
                        {
                            {
                                setState(157);
                                match(LOGIC_2);
                                setState(158);
                                operator_bool3();
                            }
                        }
                        setState(163);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(164);
                    expression5();
                    setState(169);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_2)
                    {
                        {
                            {
                                setState(165);
                                match(LOGIC_2);
                                setState(166);
                                operator_bool3();
                            }
                        }
                        setState(171);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 3:
                enterOuterAlt(_localctx, 3);
                {
                    setState(172);
                    expression4();
                    setState(177);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_2)
                    {
                        {
                            {
                                setState(173);
                                match(LOGIC_2);
                                setState(174);
                                operator_bool3();
                            }
                        }
                        setState(179);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 4:
                enterOuterAlt(_localctx, 4);
                {
                    setState(180);
                    expression3();
                    setState(185);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_2)
                    {
                        {
                            {
                                setState(181);
                                match(LOGIC_2);
                                setState(182);
                                operator_bool3();
                            }
                        }
                        setState(187);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 5:
                enterOuterAlt(_localctx, 5);
                {
                    setState(188);
                    expression2();
                    setState(193);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_2)
                    {
                        {
                            {
                                setState(189);
                                match(LOGIC_2);
                                setState(190);
                                operator_bool3();
                            }
                        }
                        setState(195);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 6:
                enterOuterAlt(_localctx, 6);
                {
                    setState(196);
                    expression1();
                    setState(201);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_2)
                    {
                        {
                            {
                                setState(197);
                                match(LOGIC_2);
                                setState(198);
                                operator_bool3();
                            }
                        }
                        setState(203);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 7:
                enterOuterAlt(_localctx, 7);
                {
                    setState(204);
                    operator_bool5();
                    setState(209);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_2)
                    {
                        {
                            {
                                setState(205);
                                match(LOGIC_2);
                                setState(206);
                                operator_bool3();
                            }
                        }
                        setState(211);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 8:
                enterOuterAlt(_localctx, 8);
                {
                    setState(212);
                    operator_bool4();
                    setState(217);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_2)
                    {
                        {
                            {
                                setState(213);
                                match(LOGIC_2);
                                setState(214);
                                operator_bool3();
                            }
                        }
                        setState(219);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 9:
                enterOuterAlt(_localctx, 9);
                {
                    setState(220);
                    operator_bool3();
                    setState(225);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_2)
                    {
                        {
                            {
                                setState(221);
                                match(LOGIC_2);
                                setState(222);
                                operator_bool3();
                            }
                        }
                        setState(227);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Operator_bool3Context extends ParserRuleContext
    {
        public Expression_finalContext expression_final()
        {
            return getRuleContext(Expression_finalContext.class, 0);
        }

        public Expression5Context expression5()
        {
            return getRuleContext(Expression5Context.class, 0);
        }

        public TerminalNode LOGIC_3(int i)
        {
            return getToken(codeParser.LOGIC_3, i);
        }

        public Expression3Context expression3()
        {
            return getRuleContext(Expression3Context.class, 0);
        }

        public Operator_bool4Context operator_bool4(int i)
        {
            return getRuleContext(Operator_bool4Context.class, i);
        }

        public List<Operator_bool4Context> operator_bool4()
        {
            return getRuleContexts(Operator_bool4Context.class);
        }

        public Operator_bool5Context operator_bool5()
        {
            return getRuleContext(Operator_bool5Context.class, 0);
        }

        public Expression4Context expression4()
        {
            return getRuleContext(Expression4Context.class, 0);
        }

        public List<TerminalNode> LOGIC_3()
        {
            return getTokens(codeParser.LOGIC_3);
        }

        public Expression1Context expression1()
        {
            return getRuleContext(Expression1Context.class, 0);
        }

        public Expression2Context expression2()
        {
            return getRuleContext(Expression2Context.class, 0);
        }

        public Operator_bool3Context(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_operator_bool3;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterOperator_bool3(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitOperator_bool3(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitOperator_bool3(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Operator_bool3Context operator_bool3() throws RecognitionException
    {
        Operator_bool3Context _localctx = new Operator_bool3Context(_ctx, getState());
        enterRule(_localctx, 6, RULE_operator_bool3);
        int _la;
        try
        {
            setState(294);
            switch (getInterpreter().adaptivePredict(_input, 32, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(230);
                    expression_final();
                    setState(235);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_3)
                    {
                        {
                            {
                                setState(231);
                                match(LOGIC_3);
                                setState(232);
                                operator_bool4();
                            }
                        }
                        setState(237);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(238);
                    expression5();
                    setState(243);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_3)
                    {
                        {
                            {
                                setState(239);
                                match(LOGIC_3);
                                setState(240);
                                operator_bool4();
                            }
                        }
                        setState(245);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 3:
                enterOuterAlt(_localctx, 3);
                {
                    setState(246);
                    expression4();
                    setState(251);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_3)
                    {
                        {
                            {
                                setState(247);
                                match(LOGIC_3);
                                setState(248);
                                operator_bool4();
                            }
                        }
                        setState(253);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 4:
                enterOuterAlt(_localctx, 4);
                {
                    setState(254);
                    expression3();
                    setState(259);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_3)
                    {
                        {
                            {
                                setState(255);
                                match(LOGIC_3);
                                setState(256);
                                operator_bool4();
                            }
                        }
                        setState(261);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 5:
                enterOuterAlt(_localctx, 5);
                {
                    setState(262);
                    expression2();
                    setState(267);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_3)
                    {
                        {
                            {
                                setState(263);
                                match(LOGIC_3);
                                setState(264);
                                operator_bool4();
                            }
                        }
                        setState(269);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 6:
                enterOuterAlt(_localctx, 6);
                {
                    setState(270);
                    expression1();
                    setState(275);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_3)
                    {
                        {
                            {
                                setState(271);
                                match(LOGIC_3);
                                setState(272);
                                operator_bool4();
                            }
                        }
                        setState(277);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 7:
                enterOuterAlt(_localctx, 7);
                {
                    setState(278);
                    operator_bool5();
                    setState(283);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_3)
                    {
                        {
                            {
                                setState(279);
                                match(LOGIC_3);
                                setState(280);
                                operator_bool4();
                            }
                        }
                        setState(285);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 8:
                enterOuterAlt(_localctx, 8);
                {
                    setState(286);
                    operator_bool4();
                    setState(291);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_3)
                    {
                        {
                            {
                                setState(287);
                                match(LOGIC_3);
                                setState(288);
                                operator_bool4();
                            }
                        }
                        setState(293);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Operator_bool4Context extends ParserRuleContext
    {
        public Expression_finalContext expression_final()
        {
            return getRuleContext(Expression_finalContext.class, 0);
        }

        public TerminalNode TOKEN_CLOS_P()
        {
            return getToken(codeParser.TOKEN_CLOS_P, 0);
        }

        public Expression5Context expression5()
        {
            return getRuleContext(Expression5Context.class, 0);
        }

        public TerminalNode TOKEN_OPEN_P()
        {
            return getToken(codeParser.TOKEN_OPEN_P, 0);
        }

        public Expression3Context expression3()
        {
            return getRuleContext(Expression3Context.class, 0);
        }

        public Operator_bool1Context operator_bool1()
        {
            return getRuleContext(Operator_bool1Context.class, 0);
        }

        public Operator_bool5Context operator_bool5()
        {
            return getRuleContext(Operator_bool5Context.class, 0);
        }

        public Expression4Context expression4()
        {
            return getRuleContext(Expression4Context.class, 0);
        }

        public Expression1Context expression1()
        {
            return getRuleContext(Expression1Context.class, 0);
        }

        public Expression2Context expression2()
        {
            return getRuleContext(Expression2Context.class, 0);
        }

        public Operator_bool4Context(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_operator_bool4;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterOperator_bool4(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitOperator_bool4(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitOperator_bool4(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Operator_bool4Context operator_bool4() throws RecognitionException
    {
        Operator_bool4Context _localctx = new Operator_bool4Context(_ctx, getState());
        enterRule(_localctx, 8, RULE_operator_bool4);
        try
        {
            setState(307);
            switch (getInterpreter().adaptivePredict(_input, 33, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(296);
                    expression_final();
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(297);
                    expression5();
                }
                break;

            case 3:
                enterOuterAlt(_localctx, 3);
                {
                    setState(298);
                    expression4();
                }
                break;

            case 4:
                enterOuterAlt(_localctx, 4);
                {
                    setState(299);
                    expression3();
                }
                break;

            case 5:
                enterOuterAlt(_localctx, 5);
                {
                    setState(300);
                    expression2();
                }
                break;

            case 6:
                enterOuterAlt(_localctx, 6);
                {
                    setState(301);
                    expression1();
                }
                break;

            case 7:
                enterOuterAlt(_localctx, 7);
                {
                    setState(302);
                    operator_bool5();
                }
                break;

            case 8:
                enterOuterAlt(_localctx, 8);
                {
                    setState(303);
                    match(TOKEN_OPEN_P);
                    setState(304);
                    operator_bool1();
                    setState(305);
                    match(TOKEN_CLOS_P);
                }
                break;
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Operator_bool5Context extends ParserRuleContext
    {
        public Expression_finalContext expression_final()
        {
            return getRuleContext(Expression_finalContext.class, 0);
        }

        public TerminalNode TOKEN_CLOS_P()
        {
            return getToken(codeParser.TOKEN_CLOS_P, 0);
        }

        public TerminalNode TOKEN_NOT()
        {
            return getToken(codeParser.TOKEN_NOT, 0);
        }

        public Expression5Context expression5()
        {
            return getRuleContext(Expression5Context.class, 0);
        }

        public TerminalNode TOKEN_OPEN_P()
        {
            return getToken(codeParser.TOKEN_OPEN_P, 0);
        }

        public Expression3Context expression3()
        {
            return getRuleContext(Expression3Context.class, 0);
        }

        public Operator_bool1Context operator_bool1()
        {
            return getRuleContext(Operator_bool1Context.class, 0);
        }

        public Expression4Context expression4()
        {
            return getRuleContext(Expression4Context.class, 0);
        }

        public Expression1Context expression1()
        {
            return getRuleContext(Expression1Context.class, 0);
        }

        public Expression2Context expression2()
        {
            return getRuleContext(Expression2Context.class, 0);
        }

        public Operator_bool5Context(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_operator_bool5;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterOperator_bool5(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitOperator_bool5(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitOperator_bool5(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Operator_bool5Context operator_bool5() throws RecognitionException
    {
        Operator_bool5Context _localctx = new Operator_bool5Context(_ctx, getState());
        enterRule(_localctx, 10, RULE_operator_bool5);
        try
        {
            setState(320);
            switch (getInterpreter().adaptivePredict(_input, 34, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(309);
                    expression_final();
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(310);
                    expression5();
                }
                break;

            case 3:
                enterOuterAlt(_localctx, 3);
                {
                    setState(311);
                    expression4();
                }
                break;

            case 4:
                enterOuterAlt(_localctx, 4);
                {
                    setState(312);
                    expression3();
                }
                break;

            case 5:
                enterOuterAlt(_localctx, 5);
                {
                    setState(313);
                    expression2();
                }
                break;

            case 6:
                enterOuterAlt(_localctx, 6);
                {
                    setState(314);
                    expression1();
                }
                break;

            case 7:
                enterOuterAlt(_localctx, 7);
                {
                    setState(315);
                    match(TOKEN_NOT);
                    setState(316);
                    match(TOKEN_OPEN_P);
                    setState(317);
                    operator_bool1();
                    setState(318);
                    match(TOKEN_CLOS_P);
                }
                break;
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Expression1Context extends ParserRuleContext
    {
        public Expression_finalContext expression_final()
        {
            return getRuleContext(Expression_finalContext.class, 0);
        }

        public Expression5Context expression5()
        {
            return getRuleContext(Expression5Context.class, 0);
        }

        public TerminalNode ARTH_1(int i)
        {
            return getToken(codeParser.ARTH_1, i);
        }

        public Expression3Context expression3()
        {
            return getRuleContext(Expression3Context.class, 0);
        }

        public List<TerminalNode> ARTH_1()
        {
            return getTokens(codeParser.ARTH_1);
        }

        public Expression4Context expression4()
        {
            return getRuleContext(Expression4Context.class, 0);
        }

        public Expression2Context expression2(int i)
        {
            return getRuleContext(Expression2Context.class, i);
        }

        public List<Expression2Context> expression2()
        {
            return getRuleContexts(Expression2Context.class);
        }

        public Expression1Context(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_expression1;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterExpression1(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitExpression1(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitExpression1(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Expression1Context expression1() throws RecognitionException
    {
        Expression1Context _localctx = new Expression1Context(_ctx, getState());
        enterRule(_localctx, 12, RULE_expression1);
        int _la;
        try
        {
            setState(362);
            switch (getInterpreter().adaptivePredict(_input, 40, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(322);
                    expression_final();
                    setState(327);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == ARTH_1)
                    {
                        {
                            {
                                setState(323);
                                match(ARTH_1);
                                setState(324);
                                expression2();
                            }
                        }
                        setState(329);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(330);
                    expression5();
                    setState(335);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == ARTH_1)
                    {
                        {
                            {
                                setState(331);
                                match(ARTH_1);
                                setState(332);
                                expression2();
                            }
                        }
                        setState(337);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 3:
                enterOuterAlt(_localctx, 3);
                {
                    setState(338);
                    expression4();
                    setState(343);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == ARTH_1)
                    {
                        {
                            {
                                setState(339);
                                match(ARTH_1);
                                setState(340);
                                expression2();
                            }
                        }
                        setState(345);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 4:
                enterOuterAlt(_localctx, 4);
                {
                    setState(346);
                    expression3();
                    setState(351);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == ARTH_1)
                    {
                        {
                            {
                                setState(347);
                                match(ARTH_1);
                                setState(348);
                                expression2();
                            }
                        }
                        setState(353);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 5:
                enterOuterAlt(_localctx, 5);
                {
                    setState(354);
                    expression2();
                    setState(359);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == ARTH_1)
                    {
                        {
                            {
                                setState(355);
                                match(ARTH_1);
                                setState(356);
                                expression2();
                            }
                        }
                        setState(361);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Expression2Context extends ParserRuleContext
    {
        public Expression_finalContext expression_final()
        {
            return getRuleContext(Expression_finalContext.class, 0);
        }

        public Expression5Context expression5()
        {
            return getRuleContext(Expression5Context.class, 0);
        }

        public List<Expression3Context> expression3()
        {
            return getRuleContexts(Expression3Context.class);
        }

        public List<TerminalNode> ARTH_2()
        {
            return getTokens(codeParser.ARTH_2);
        }

        public Expression3Context expression3(int i)
        {
            return getRuleContext(Expression3Context.class, i);
        }

        public Expression4Context expression4()
        {
            return getRuleContext(Expression4Context.class, 0);
        }

        public TerminalNode ARTH_2(int i)
        {
            return getToken(codeParser.ARTH_2, i);
        }

        public Expression2Context(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_expression2;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterExpression2(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitExpression2(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitExpression2(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Expression2Context expression2() throws RecognitionException
    {
        Expression2Context _localctx = new Expression2Context(_ctx, getState());
        enterRule(_localctx, 14, RULE_expression2);
        int _la;
        try
        {
            setState(396);
            switch (getInterpreter().adaptivePredict(_input, 45, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(364);
                    expression_final();
                    setState(369);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == ARTH_2)
                    {
                        {
                            {
                                setState(365);
                                match(ARTH_2);
                                setState(366);
                                expression3();
                            }
                        }
                        setState(371);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(372);
                    expression5();
                    setState(377);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == ARTH_2)
                    {
                        {
                            {
                                setState(373);
                                match(ARTH_2);
                                setState(374);
                                expression3();
                            }
                        }
                        setState(379);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 3:
                enterOuterAlt(_localctx, 3);
                {
                    setState(380);
                    expression4();
                    setState(385);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == ARTH_2)
                    {
                        {
                            {
                                setState(381);
                                match(ARTH_2);
                                setState(382);
                                expression3();
                            }
                        }
                        setState(387);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 4:
                enterOuterAlt(_localctx, 4);
                {
                    setState(388);
                    expression3();
                    setState(393);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == ARTH_2)
                    {
                        {
                            {
                                setState(389);
                                match(ARTH_2);
                                setState(390);
                                expression3();
                            }
                        }
                        setState(395);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Expression3Context extends ParserRuleContext
    {
        public Expression_finalContext expression_final()
        {
            return getRuleContext(Expression_finalContext.class, 0);
        }

        public Expression5Context expression5()
        {
            return getRuleContext(Expression5Context.class, 0);
        }

        public List<TerminalNode> ARTH_3()
        {
            return getTokens(codeParser.ARTH_3);
        }

        public Expression4Context expression4(int i)
        {
            return getRuleContext(Expression4Context.class, i);
        }

        public List<Expression4Context> expression4()
        {
            return getRuleContexts(Expression4Context.class);
        }

        public TerminalNode ARTH_3(int i)
        {
            return getToken(codeParser.ARTH_3, i);
        }

        public Expression3Context(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_expression3;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterExpression3(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitExpression3(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitExpression3(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Expression3Context expression3() throws RecognitionException
    {
        Expression3Context _localctx = new Expression3Context(_ctx, getState());
        enterRule(_localctx, 16, RULE_expression3);
        int _la;
        try
        {
            setState(422);
            switch (getInterpreter().adaptivePredict(_input, 49, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(398);
                    expression_final();
                    setState(403);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == ARTH_3)
                    {
                        {
                            {
                                setState(399);
                                match(ARTH_3);
                                setState(400);
                                expression4();
                            }
                        }
                        setState(405);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(406);
                    expression5();
                    setState(411);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == ARTH_3)
                    {
                        {
                            {
                                setState(407);
                                match(ARTH_3);
                                setState(408);
                                expression4();
                            }
                        }
                        setState(413);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;

            case 3:
                enterOuterAlt(_localctx, 3);
                {
                    setState(414);
                    expression4();
                    setState(419);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == ARTH_3)
                    {
                        {
                            {
                                setState(415);
                                match(ARTH_3);
                                setState(416);
                                expression4();
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
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Expression4Context extends ParserRuleContext
    {
        public Expression_finalContext expression_final()
        {
            return getRuleContext(Expression_finalContext.class, 0);
        }

        public Expression5Context expression5()
        {
            return getRuleContext(Expression5Context.class, 0);
        }

        public TerminalNode ARTH_4()
        {
            return getToken(codeParser.ARTH_4, 0);
        }

        public Expression4Context(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_expression4;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterExpression4(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitExpression4(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitExpression4(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Expression4Context expression4() throws RecognitionException
    {
        Expression4Context _localctx = new Expression4Context(_ctx, getState());
        enterRule(_localctx, 18, RULE_expression4);
        try
        {
            setState(428);
            switch (getInterpreter().adaptivePredict(_input, 50, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(424);
                    expression_final();
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(425);
                    expression5();
                    setState(426);
                    match(ARTH_4);
                }
                break;
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Expression5Context extends ParserRuleContext
    {
        public Expression_finalContext expression_final()
        {
            return getRuleContext(Expression_finalContext.class, 0);
        }

        public TerminalNode TOKEN_CLOS_P()
        {
            return getToken(codeParser.TOKEN_CLOS_P, 0);
        }

        public TerminalNode TOKEN_OPEN_P()
        {
            return getToken(codeParser.TOKEN_OPEN_P, 0);
        }

        public Expression1Context expression1()
        {
            return getRuleContext(Expression1Context.class, 0);
        }

        public Expression5Context(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_expression5;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterExpression5(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitExpression5(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitExpression5(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Expression5Context expression5() throws RecognitionException
    {
        Expression5Context _localctx = new Expression5Context(_ctx, getState());
        enterRule(_localctx, 20, RULE_expression5);
        try
        {
            setState(435);
            switch (_input.LA(1))
            {
            case TOKEN_TORF:
            case ID:
            case NUM:
            case STRING:
                enterOuterAlt(_localctx, 1);
                {
                    setState(430);
                    expression_final();
                }
                break;
            case TOKEN_OPEN_P:
                enterOuterAlt(_localctx, 2);
                {
                    setState(431);
                    match(TOKEN_OPEN_P);
                    setState(432);
                    expression1();
                    setState(433);
                    match(TOKEN_CLOS_P);
                }
                break;
            default:
                throw new NoViableAltException(this);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Expression_finalContext extends ParserRuleContext
    {
        public TerminalNode TOKEN_TORF()
        {
            return getToken(codeParser.TOKEN_TORF, 0);
        }

        public Function_callContext function_call()
        {
            return getRuleContext(Function_callContext.class, 0);
        }

        public TerminalNode ID()
        {
            return getToken(codeParser.ID, 0);
        }

        public TerminalNode STRING()
        {
            return getToken(codeParser.STRING, 0);
        }

        public TerminalNode NUM()
        {
            return getToken(codeParser.NUM, 0);
        }

        public Expression_finalContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_expression_final;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterExpression_final(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitExpression_final(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitExpression_final(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Expression_finalContext expression_final() throws RecognitionException
    {
        Expression_finalContext _localctx = new Expression_finalContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_expression_final);
        int _la;
        try
        {
            setState(439);
            switch (getInterpreter().adaptivePredict(_input, 52, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(437);
                    _la = _input.LA(1);
                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_TORF) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)))
                    {
                        _errHandler.recoverInline(this);
                    }
                    consume();
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(438);
                    function_call();
                }
                break;
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Package_declarationContext extends ParserRuleContext
    {
        public TerminalNode TOKEN_GRAB()
        {
            return getToken(codeParser.TOKEN_GRAB, 0);
        }

        public TerminalNode STRING()
        {
            return getToken(codeParser.STRING, 0);
        }

        public TerminalNode TOKEN_SEMICOLON()
        {
            return getToken(codeParser.TOKEN_SEMICOLON, 0);
        }

        public Package_declarationContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_package_declaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterPackage_declaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitPackage_declaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitPackage_declaration(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Package_declarationContext package_declaration() throws RecognitionException
    {
        Package_declarationContext _localctx = new Package_declarationContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_package_declaration);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(441);
                match(TOKEN_GRAB);
                setState(442);
                match(STRING);
                setState(443);
                match(TOKEN_SEMICOLON);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Main_functionContext extends ParserRuleContext
    {
        public TerminalNode TOKEN_MAIN()
        {
            return getToken(codeParser.TOKEN_MAIN, 0);
        }

        public TerminalNode TOKEN_RETURNING()
        {
            return getToken(codeParser.TOKEN_RETURNING, 0);
        }

        public TerminalNode TOKEN_CLOS_B()
        {
            return getToken(codeParser.TOKEN_CLOS_B, 0);
        }

        public TerminalNode TOKEN_OPEN_B()
        {
            return getToken(codeParser.TOKEN_OPEN_B, 0);
        }

        public TerminalNode TOKEN_FUNCTION()
        {
            return getToken(codeParser.TOKEN_FUNCTION, 0);
        }

        public Group_statementContext group_statement()
        {
            return getRuleContext(Group_statementContext.class, 0);
        }

        public TerminalNode TYPE()
        {
            return getToken(codeParser.TYPE, 0);
        }

        public Main_functionContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_main_function;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterMain_function(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitMain_function(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitMain_function(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Main_functionContext main_function() throws RecognitionException
    {
        Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_main_function);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(445);
                match(TOKEN_FUNCTION);
                setState(446);
                match(TOKEN_MAIN);
                setState(447);
                match(TOKEN_OPEN_B);
                setState(448);
                match(TOKEN_CLOS_B);
                setState(449);
                match(TOKEN_RETURNING);
                setState(450);
                match(TYPE);
                setState(451);
                group_statement();
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Function_declarationContext extends ParserRuleContext
    {
        public TerminalNode TOKEN_RETURNING()
        {
            return getToken(codeParser.TOKEN_RETURNING, 0);
        }

        public TerminalNode TOKEN_CLOS_B()
        {
            return getToken(codeParser.TOKEN_CLOS_B, 0);
        }

        public TerminalNode TOKEN_OPEN_B()
        {
            return getToken(codeParser.TOKEN_OPEN_B, 0);
        }

        public TerminalNode TOKEN_FUNCTION()
        {
            return getToken(codeParser.TOKEN_FUNCTION, 0);
        }

        public Group_statementContext group_statement()
        {
            return getRuleContext(Group_statementContext.class, 0);
        }

        public TerminalNode ID()
        {
            return getToken(codeParser.ID, 0);
        }

        public List<ParameterContext> parameter()
        {
            return getRuleContexts(ParameterContext.class);
        }

        public ParameterContext parameter(int i)
        {
            return getRuleContext(ParameterContext.class, i);
        }

        public TerminalNode TYPE()
        {
            return getToken(codeParser.TYPE, 0);
        }

        public Function_declarationContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_function_declaration;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterFunction_declaration(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitFunction_declaration(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitFunction_declaration(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Function_declarationContext function_declaration() throws RecognitionException
    {
        Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_function_declaration);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(453);
                match(TOKEN_FUNCTION);
                setState(454);
                match(ID);
                setState(455);
                match(TOKEN_OPEN_B);
                setState(459);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == TOKEN_NO_PARAM || _la == TYPE)
                {
                    {
                        {
                            setState(456);
                            parameter();
                        }
                    }
                    setState(461);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(462);
                match(TOKEN_CLOS_B);
                setState(463);
                match(TOKEN_RETURNING);
                setState(464);
                match(TYPE);
                setState(465);
                group_statement();
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class ParameterContext extends ParserRuleContext
    {
        public List<TerminalNode> ID()
        {
            return getTokens(codeParser.ID);
        }

        public TerminalNode TOKEN_NO_PARAM()
        {
            return getToken(codeParser.TOKEN_NO_PARAM, 0);
        }

        public List<TerminalNode> TOKEN_COMMA()
        {
            return getTokens(codeParser.TOKEN_COMMA);
        }

        public TerminalNode TYPE(int i)
        {
            return getToken(codeParser.TYPE, i);
        }

        public TerminalNode TOKEN_COMMA(int i)
        {
            return getToken(codeParser.TOKEN_COMMA, i);
        }

        public List<TerminalNode> TYPE()
        {
            return getTokens(codeParser.TYPE);
        }

        public TerminalNode ID(int i)
        {
            return getToken(codeParser.ID, i);
        }

        public ParameterContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_parameter;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterParameter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitParameter(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitParameter(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ParameterContext parameter() throws RecognitionException
    {
        ParameterContext _localctx = new ParameterContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_parameter);
        int _la;
        try
        {
            setState(479);
            switch (_input.LA(1))
            {
            case TYPE:
                enterOuterAlt(_localctx, 1);
                {
                    {
                        setState(467);
                        match(TYPE);
                        setState(468);
                        match(ID);
                    }
                    setState(475);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == TOKEN_COMMA)
                    {
                        {
                            {
                                setState(470);
                                match(TOKEN_COMMA);
                                setState(471);
                                match(TYPE);
                                setState(472);
                                match(ID);
                            }
                        }
                        setState(477);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
            case TOKEN_NO_PARAM:
                enterOuterAlt(_localctx, 2);
                {
                    setState(478);
                    match(TOKEN_NO_PARAM);
                }
                break;
            default:
                throw new NoViableAltException(this);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Function_callContext extends ParserRuleContext
    {
        public TerminalNode TOKEN_CLOS_B()
        {
            return getToken(codeParser.TOKEN_CLOS_B, 0);
        }

        public TerminalNode TOKEN_OPEN_B()
        {
            return getToken(codeParser.TOKEN_OPEN_B, 0);
        }

        public TerminalNode ID()
        {
            return getToken(codeParser.ID, 0);
        }

        public List<TerminalNode> TOKEN_COMMA()
        {
            return getTokens(codeParser.TOKEN_COMMA);
        }

        public Expression1Context expression1(int i)
        {
            return getRuleContext(Expression1Context.class, i);
        }

        public TerminalNode TOKEN_COMMA(int i)
        {
            return getToken(codeParser.TOKEN_COMMA, i);
        }

        public List<Expression1Context> expression1()
        {
            return getRuleContexts(Expression1Context.class);
        }

        public Function_callContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_function_call;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterFunction_call(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitFunction_call(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitFunction_call(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Function_callContext function_call() throws RecognitionException
    {
        Function_callContext _localctx = new Function_callContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_function_call);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(481);
                match(ID);
                setState(482);
                match(TOKEN_OPEN_B);
                setState(483);
                expression1();
                setState(488);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == TOKEN_COMMA)
                {
                    {
                        {
                            setState(484);
                            match(TOKEN_COMMA);
                            setState(485);
                            expression1();
                        }
                    }
                    setState(490);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(491);
                match(TOKEN_CLOS_B);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Group_statementContext extends ParserRuleContext
    {
        public List<StatementContext> statement()
        {
            return getRuleContexts(StatementContext.class);
        }

        public TerminalNode TOKEN_CLOS_S()
        {
            return getToken(codeParser.TOKEN_CLOS_S, 0);
        }

        public TerminalNode TOKEN_OPEN_S()
        {
            return getToken(codeParser.TOKEN_OPEN_S, 0);
        }

        public StatementContext statement(int i)
        {
            return getRuleContext(StatementContext.class, i);
        }

        public Group_statementContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_group_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterGroup_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitGroup_statement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitGroup_statement(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Group_statementContext group_statement() throws RecognitionException
    {
        Group_statementContext _localctx = new Group_statementContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_group_statement);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(493);
                match(TOKEN_OPEN_S);
                setState(497);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_RETURNING) | (1L << TOKEN_REPEAT) | (1L << TOKEN_DECLARE) | (1L << TOKEN_IF) | (1L << TOKEN_CHECK) | (1L << ID) | (1L << TOKEN_OPEN_S))) != 0))
                {
                    {
                        {
                            setState(494);
                            statement();
                        }
                    }
                    setState(499);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(500);
                match(TOKEN_CLOS_S);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class StatementContext extends ParserRuleContext
    {
        public Loop_statementContext loop_statement()
        {
            return getRuleContext(Loop_statementContext.class, 0);
        }

        public TerminalNode TOKEN_RETURNING()
        {
            return getToken(codeParser.TOKEN_RETURNING, 0);
        }

        public Assignment_statementContext assignment_statement()
        {
            return getRuleContext(Assignment_statementContext.class, 0);
        }

        public Function_callContext function_call()
        {
            return getRuleContext(Function_callContext.class, 0);
        }

        public Group_statementContext group_statement()
        {
            return getRuleContext(Group_statementContext.class, 0);
        }

        public Conditional_statementContext conditional_statement()
        {
            return getRuleContext(Conditional_statementContext.class, 0);
        }

        public Declare_statementContext declare_statement()
        {
            return getRuleContext(Declare_statementContext.class, 0);
        }

        public Expression1Context expression1()
        {
            return getRuleContext(Expression1Context.class, 0);
        }

        public TerminalNode TOKEN_SEMICOLON()
        {
            return getToken(codeParser.TOKEN_SEMICOLON, 0);
        }

        public StatementContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitStatement(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final StatementContext statement() throws RecognitionException
    {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_statement);
        try
        {
            setState(514);
            switch (getInterpreter().adaptivePredict(_input, 58, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(502);
                    declare_statement();
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(503);
                    group_statement();
                }
                break;

            case 3:
                enterOuterAlt(_localctx, 3);
                {
                    setState(504);
                    assignment_statement();
                }
                break;

            case 4:
                enterOuterAlt(_localctx, 4);
                {
                    setState(505);
                    conditional_statement();
                }
                break;

            case 5:
                enterOuterAlt(_localctx, 5);
                {
                    setState(506);
                    loop_statement();
                }
                break;

            case 6:
                enterOuterAlt(_localctx, 6);
                {
                    setState(507);
                    function_call();
                    setState(508);
                    match(TOKEN_SEMICOLON);
                }
                break;

            case 7:
                enterOuterAlt(_localctx, 7);
                {
                    setState(510);
                    match(TOKEN_RETURNING);
                    setState(511);
                    expression1();
                    setState(512);
                    match(TOKEN_SEMICOLON);
                }
                break;
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Declare_statementContext extends ParserRuleContext
    {
        public TerminalNode TOKEN_AS()
        {
            return getToken(codeParser.TOKEN_AS, 0);
        }

        public TerminalNode TOKEN_DECLARE()
        {
            return getToken(codeParser.TOKEN_DECLARE, 0);
        }

        public TerminalNode ID()
        {
            return getToken(codeParser.ID, 0);
        }

        public TerminalNode TOKEN_TO()
        {
            return getToken(codeParser.TOKEN_TO, 0);
        }

        public Expression1Context expression1()
        {
            return getRuleContext(Expression1Context.class, 0);
        }

        public TerminalNode TYPE()
        {
            return getToken(codeParser.TYPE, 0);
        }

        public TerminalNode TOKEN_SEMICOLON()
        {
            return getToken(codeParser.TOKEN_SEMICOLON, 0);
        }

        public Declare_statementContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_declare_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterDeclare_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitDeclare_statement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitDeclare_statement(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Declare_statementContext declare_statement() throws RecognitionException
    {
        Declare_statementContext _localctx = new Declare_statementContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_declare_statement);
        try
        {
            setState(529);
            switch (getInterpreter().adaptivePredict(_input, 59, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(516);
                    match(TOKEN_DECLARE);
                    setState(517);
                    match(ID);
                    setState(518);
                    match(TOKEN_AS);
                    setState(519);
                    match(TYPE);
                    setState(520);
                    match(TOKEN_SEMICOLON);
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(521);
                    match(TOKEN_DECLARE);
                    setState(522);
                    match(ID);
                    setState(523);
                    match(TOKEN_AS);
                    setState(524);
                    match(TYPE);
                    setState(525);
                    match(TOKEN_TO);
                    setState(526);
                    expression1();
                    setState(527);
                    match(TOKEN_SEMICOLON);
                }
                break;
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Assignment_statementContext extends ParserRuleContext
    {
        public TerminalNode ID()
        {
            return getToken(codeParser.ID, 0);
        }

        public Expression1Context expression1()
        {
            return getRuleContext(Expression1Context.class, 0);
        }

        public TerminalNode TOKEN_IS()
        {
            return getToken(codeParser.TOKEN_IS, 0);
        }

        public TerminalNode TOKEN_SEMICOLON()
        {
            return getToken(codeParser.TOKEN_SEMICOLON, 0);
        }

        public Assignment_statementContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_assignment_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterAssignment_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitAssignment_statement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitAssignment_statement(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Assignment_statementContext assignment_statement() throws RecognitionException
    {
        Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_assignment_statement);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(531);
                match(ID);
                setState(532);
                match(TOKEN_IS);
                setState(533);
                expression1();
                setState(534);
                match(TOKEN_SEMICOLON);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Logical_statementContext extends ParserRuleContext
    {
        public Expression_finalContext expression_final()
        {
            return getRuleContext(Expression_finalContext.class, 0);
        }

        public Expression5Context expression5()
        {
            return getRuleContext(Expression5Context.class, 0);
        }

        public Operator_bool2Context operator_bool2()
        {
            return getRuleContext(Operator_bool2Context.class, 0);
        }

        public Operator_bool3Context operator_bool3()
        {
            return getRuleContext(Operator_bool3Context.class, 0);
        }

        public Expression3Context expression3()
        {
            return getRuleContext(Expression3Context.class, 0);
        }

        public Operator_bool4Context operator_bool4()
        {
            return getRuleContext(Operator_bool4Context.class, 0);
        }

        public Operator_bool1Context operator_bool1()
        {
            return getRuleContext(Operator_bool1Context.class, 0);
        }

        public Operator_bool5Context operator_bool5()
        {
            return getRuleContext(Operator_bool5Context.class, 0);
        }

        public Expression4Context expression4()
        {
            return getRuleContext(Expression4Context.class, 0);
        }

        public Expression1Context expression1()
        {
            return getRuleContext(Expression1Context.class, 0);
        }

        public Expression2Context expression2()
        {
            return getRuleContext(Expression2Context.class, 0);
        }

        public Logical_statementContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_logical_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterLogical_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitLogical_statement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitLogical_statement(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Logical_statementContext logical_statement() throws RecognitionException
    {
        Logical_statementContext _localctx = new Logical_statementContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_logical_statement);
        try
        {
            setState(547);
            switch (getInterpreter().adaptivePredict(_input, 60, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(536);
                    expression_final();
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(537);
                    expression5();
                }
                break;

            case 3:
                enterOuterAlt(_localctx, 3);
                {
                    setState(538);
                    expression4();
                }
                break;

            case 4:
                enterOuterAlt(_localctx, 4);
                {
                    setState(539);
                    expression3();
                }
                break;

            case 5:
                enterOuterAlt(_localctx, 5);
                {
                    setState(540);
                    expression2();
                }
                break;

            case 6:
                enterOuterAlt(_localctx, 6);
                {
                    setState(541);
                    expression1();
                }
                break;

            case 7:
                enterOuterAlt(_localctx, 7);
                {
                    setState(542);
                    operator_bool5();
                }
                break;

            case 8:
                enterOuterAlt(_localctx, 8);
                {
                    setState(543);
                    operator_bool4();
                }
                break;

            case 9:
                enterOuterAlt(_localctx, 9);
                {
                    setState(544);
                    operator_bool3();
                }
                break;

            case 10:
                enterOuterAlt(_localctx, 10);
                {
                    setState(545);
                    operator_bool2();
                }
                break;

            case 11:
                enterOuterAlt(_localctx, 11);
                {
                    setState(546);
                    operator_bool1();
                }
                break;
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Conditional_statementContext extends ParserRuleContext
    {
        public List<Conditional_ELSEIFContext> conditional_ELSEIF()
        {
            return getRuleContexts(Conditional_ELSEIFContext.class);
        }

        public TerminalNode TOKEN_OPEN_B()
        {
            return getToken(codeParser.TOKEN_OPEN_B, 0);
        }

        public TerminalNode ID()
        {
            return getToken(codeParser.ID, 0);
        }

        public TerminalNode TOKEN_OPEN_S()
        {
            return getToken(codeParser.TOKEN_OPEN_S, 0);
        }

        public Conditional_CASEContext conditional_CASE(int i)
        {
            return getRuleContext(Conditional_CASEContext.class, i);
        }

        public Conditional_ELSEContext conditional_ELSE()
        {
            return getRuleContext(Conditional_ELSEContext.class, 0);
        }

        public TerminalNode TOKEN_CHECK()
        {
            return getToken(codeParser.TOKEN_CHECK, 0);
        }

        public TerminalNode TOKEN_CLOS_S()
        {
            return getToken(codeParser.TOKEN_CLOS_S, 0);
        }

        public Conditional_ELSEIFContext conditional_ELSEIF(int i)
        {
            return getRuleContext(Conditional_ELSEIFContext.class, i);
        }

        public TerminalNode TOKEN_CLOS_B()
        {
            return getToken(codeParser.TOKEN_CLOS_B, 0);
        }

        public List<Conditional_CASEContext> conditional_CASE()
        {
            return getRuleContexts(Conditional_CASEContext.class);
        }

        public Group_statementContext group_statement()
        {
            return getRuleContext(Group_statementContext.class, 0);
        }

        public Conditional_DEFAULTContext conditional_DEFAULT()
        {
            return getRuleContext(Conditional_DEFAULTContext.class, 0);
        }

        public TerminalNode TOKEN_IF()
        {
            return getToken(codeParser.TOKEN_IF, 0);
        }

        public Logical_statementContext logical_statement()
        {
            return getRuleContext(Logical_statementContext.class, 0);
        }

        public Conditional_statementContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_conditional_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterConditional_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitConditional_statement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitConditional_statement(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Conditional_statementContext conditional_statement() throws RecognitionException
    {
        Conditional_statementContext _localctx = new Conditional_statementContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_conditional_statement);
        int _la;
        try
        {
            int _alt;
            setState(579);
            switch (_input.LA(1))
            {
            case TOKEN_IF:
                enterOuterAlt(_localctx, 1);
                {
                    setState(549);
                    match(TOKEN_IF);
                    setState(550);
                    match(TOKEN_OPEN_B);
                    {
                        setState(551);
                        logical_statement();
                    }
                    setState(552);
                    match(TOKEN_CLOS_B);
                    setState(553);
                    group_statement();
                    setState(557);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 61, _ctx);
                    while (_alt != 2 && _alt != -1)
                    {
                        if (_alt == 1)
                        {
                            {
                                {
                                    setState(554);
                                    conditional_ELSEIF();
                                }
                            }
                        }
                        setState(559);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 61, _ctx);
                    }
                    setState(561);
                    _la = _input.LA(1);
                    if (_la == TOKEN_ELSE)
                    {
                        {
                            setState(560);
                            conditional_ELSE();
                        }
                    }

                }
                break;
            case TOKEN_CHECK:
                enterOuterAlt(_localctx, 2);
                {
                    setState(563);
                    match(TOKEN_CHECK);
                    setState(564);
                    match(TOKEN_IF);
                    setState(565);
                    match(TOKEN_OPEN_B);
                    setState(566);
                    match(ID);
                    setState(567);
                    match(TOKEN_CLOS_B);
                    setState(568);
                    match(TOKEN_OPEN_S);
                    setState(570);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do
                    {
                        {
                            {
                                setState(569);
                                conditional_CASE();
                            }
                        }
                        setState(572);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    } while (_la == TOKEN_IS);
                    setState(575);
                    _la = _input.LA(1);
                    if (_la == TOKEN_ELSE)
                    {
                        {
                            setState(574);
                            conditional_DEFAULT();
                        }
                    }

                    setState(577);
                    match(TOKEN_CLOS_S);
                }
                break;
            default:
                throw new NoViableAltException(this);
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Conditional_CASEContext extends ParserRuleContext
    {
        public TerminalNode TOKEN_COLON()
        {
            return getToken(codeParser.TOKEN_COLON, 0);
        }

        public TerminalNode TOKEN_TORF()
        {
            return getToken(codeParser.TOKEN_TORF, 0);
        }

        public Group_statementContext group_statement()
        {
            return getRuleContext(Group_statementContext.class, 0);
        }

        public TerminalNode ID()
        {
            return getToken(codeParser.ID, 0);
        }

        public TerminalNode STRING()
        {
            return getToken(codeParser.STRING, 0);
        }

        public TerminalNode TOKEN_IS()
        {
            return getToken(codeParser.TOKEN_IS, 0);
        }

        public TerminalNode NUM()
        {
            return getToken(codeParser.NUM, 0);
        }

        public Conditional_CASEContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_conditional_CASE;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterConditional_CASE(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitConditional_CASE(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitConditional_CASE(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Conditional_CASEContext conditional_CASE() throws RecognitionException
    {
        Conditional_CASEContext _localctx = new Conditional_CASEContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_conditional_CASE);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(581);
                match(TOKEN_IS);
                setState(582);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_TORF) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)))
                {
                    _errHandler.recoverInline(this);
                }
                consume();
                setState(583);
                match(TOKEN_COLON);
                setState(584);
                group_statement();
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Conditional_DEFAULTContext extends ParserRuleContext
    {
        public TerminalNode TOKEN_COLON()
        {
            return getToken(codeParser.TOKEN_COLON, 0);
        }

        public TerminalNode TOKEN_ELSE()
        {
            return getToken(codeParser.TOKEN_ELSE, 0);
        }

        public Group_statementContext group_statement()
        {
            return getRuleContext(Group_statementContext.class, 0);
        }

        public Conditional_DEFAULTContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_conditional_DEFAULT;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterConditional_DEFAULT(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitConditional_DEFAULT(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitConditional_DEFAULT(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Conditional_DEFAULTContext conditional_DEFAULT() throws RecognitionException
    {
        Conditional_DEFAULTContext _localctx = new Conditional_DEFAULTContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_conditional_DEFAULT);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(586);
                match(TOKEN_ELSE);
                setState(587);
                match(TOKEN_COLON);
                setState(588);
                group_statement();
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Conditional_ELSEIFContext extends ParserRuleContext
    {
        public TerminalNode TOKEN_CLOS_B()
        {
            return getToken(codeParser.TOKEN_CLOS_B, 0);
        }

        public TerminalNode TOKEN_OPEN_B()
        {
            return getToken(codeParser.TOKEN_OPEN_B, 0);
        }

        public TerminalNode TOKEN_ELSE()
        {
            return getToken(codeParser.TOKEN_ELSE, 0);
        }

        public Group_statementContext group_statement()
        {
            return getRuleContext(Group_statementContext.class, 0);
        }

        public Logical_statementContext logical_statement()
        {
            return getRuleContext(Logical_statementContext.class, 0);
        }

        public TerminalNode TOKEN_IF()
        {
            return getToken(codeParser.TOKEN_IF, 0);
        }

        public Conditional_ELSEIFContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_conditional_ELSEIF;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterConditional_ELSEIF(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitConditional_ELSEIF(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitConditional_ELSEIF(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Conditional_ELSEIFContext conditional_ELSEIF() throws RecognitionException
    {
        Conditional_ELSEIFContext _localctx = new Conditional_ELSEIFContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_conditional_ELSEIF);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(590);
                match(TOKEN_ELSE);
                setState(591);
                match(TOKEN_IF);
                setState(592);
                match(TOKEN_OPEN_B);
                setState(593);
                logical_statement();
                setState(594);
                match(TOKEN_CLOS_B);
                setState(595);
                group_statement();
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Conditional_ELSEContext extends ParserRuleContext
    {
        public TerminalNode TOKEN_ELSE()
        {
            return getToken(codeParser.TOKEN_ELSE, 0);
        }

        public Group_statementContext group_statement()
        {
            return getRuleContext(Group_statementContext.class, 0);
        }

        public Conditional_ELSEContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_conditional_ELSE;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterConditional_ELSE(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitConditional_ELSE(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitConditional_ELSE(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Conditional_ELSEContext conditional_ELSE() throws RecognitionException
    {
        Conditional_ELSEContext _localctx = new Conditional_ELSEContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_conditional_ELSE);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(597);
                match(TOKEN_ELSE);
                setState(598);
                group_statement();
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Loop_statementContext extends ParserRuleContext
    {
        public TerminalNode TOKEN_WITH()
        {
            return getToken(codeParser.TOKEN_WITH, 0);
        }

        public TerminalNode TOKEN_CLOS_B()
        {
            return getToken(codeParser.TOKEN_CLOS_B, 0);
        }

        public TerminalNode TOKEN_OPEN_B()
        {
            return getToken(codeParser.TOKEN_OPEN_B, 0);
        }

        public Group_statementContext group_statement()
        {
            return getRuleContext(Group_statementContext.class, 0);
        }

        public TerminalNode TOKEN_FROM()
        {
            return getToken(codeParser.TOKEN_FROM, 0);
        }

        public TerminalNode ID()
        {
            return getToken(codeParser.ID, 0);
        }

        public TerminalNode TOKEN_TO()
        {
            return getToken(codeParser.TOKEN_TO, 0);
        }

        public TerminalNode TOKEN_REPEAT()
        {
            return getToken(codeParser.TOKEN_REPEAT, 0);
        }

        public Expression1Context expression1(int i)
        {
            return getRuleContext(Expression1Context.class, i);
        }

        public Logical_statementContext logical_statement()
        {
            return getRuleContext(Logical_statementContext.class, 0);
        }

        public TerminalNode TOKEN_UNTIL()
        {
            return getToken(codeParser.TOKEN_UNTIL, 0);
        }

        public List<Expression1Context> expression1()
        {
            return getRuleContexts(Expression1Context.class);
        }

        public TerminalNode TYPE()
        {
            return getToken(codeParser.TYPE, 0);
        }

        public Loop_statementContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_loop_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).enterLoop_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof codeListener)
                ((codeListener) listener).exitLoop_statement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor)
        {
            if (visitor instanceof codeVisitor)
                return ((codeVisitor<? extends T>) visitor).visitLoop_statement(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final Loop_statementContext loop_statement() throws RecognitionException
    {
        Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_loop_statement);
        try
        {
            setState(634);
            switch (getInterpreter().adaptivePredict(_input, 66, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(600);
                    match(TOKEN_REPEAT);
                    setState(601);
                    group_statement();
                    setState(602);
                    match(TOKEN_UNTIL);
                    setState(603);
                    match(TOKEN_OPEN_B);
                    setState(604);
                    logical_statement();
                    setState(605);
                    match(TOKEN_CLOS_B);
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(607);
                    match(TOKEN_REPEAT);
                    setState(608);
                    match(TOKEN_UNTIL);
                    setState(609);
                    match(TOKEN_OPEN_B);
                    setState(610);
                    logical_statement();
                    setState(611);
                    match(TOKEN_CLOS_B);
                    setState(612);
                    group_statement();
                }
                break;

            case 3:
                enterOuterAlt(_localctx, 3);
                {
                    setState(614);
                    match(TOKEN_REPEAT);
                    setState(615);
                    match(TYPE);
                    setState(616);
                    match(ID);
                    setState(617);
                    match(TOKEN_FROM);
                    setState(618);
                    expression1();
                    setState(619);
                    match(TOKEN_TO);
                    setState(620);
                    expression1();
                    setState(621);
                    group_statement();
                }
                break;

            case 4:
                enterOuterAlt(_localctx, 4);
                {
                    setState(623);
                    match(TOKEN_REPEAT);
                    setState(624);
                    match(TYPE);
                    setState(625);
                    match(ID);
                    setState(626);
                    match(TOKEN_FROM);
                    setState(627);
                    expression1();
                    setState(628);
                    match(TOKEN_TO);
                    setState(629);
                    expression1();
                    setState(630);
                    match(TOKEN_WITH);
                    setState(631);
                    expression1();
                    setState(632);
                    group_statement();
                }
                break;
            }
        }
        catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3)\u027f\4\2\t\2\4" + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" + "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" + "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\7\2<\n\2\f\2\16\2?\13\2\3" + "\2\7\2B\n\2\f\2\16\2E\13\2\3\2\7\2H\n\2\f\2\16\2K\13\2\3\3\3\3\3\3\7\3" + "P\n\3\f\3\16\3S\13\3\3\3\3\3\3\3\7\3X\n\3\f\3\16\3[\13\3\3\3\3\3\3\3\7" + "\3`\n\3\f\3\16\3c\13\3\3\3\3\3\3\3\7\3h\n\3\f\3\16\3k\13\3\3\3\3\3\3\3" + "\7\3p\n\3\f\3\16\3s\13\3\3\3\3\3\3\3\7\3x\n\3\f\3\16\3{\13\3\3\3\3\3\3" + "\3\7\3\u0080\n\3\f\3\16\3\u0083\13\3\3\3\3\3\3\3\7\3\u0088\n\3\f\3\16" + "\3\u008b\13\3\3\3\3\3\3\3\7\3\u0090\n\3\f\3\16\3\u0093\13\3\3\3\3\3\3" + "\3\7\3\u0098\n\3\f\3\16\3\u009b\13\3\5\3\u009d\n\3\3\4\3\4\3\4\7\4\u00a2" + "\n\4\f\4\16\4\u00a5\13\4\3\4\3\4\3\4\7\4\u00aa\n\4\f\4\16\4\u00ad\13\4" + "\3\4\3\4\3\4\7\4\u00b2\n\4\f\4\16\4\u00b5\13\4\3\4\3\4\3\4\7\4\u00ba\n" + "\4\f\4\16\4\u00bd\13\4\3\4\3\4\3\4\7\4\u00c2\n\4\f\4\16\4\u00c5\13\4\3" + "\4\3\4\3\4\7\4\u00ca\n\4\f\4\16\4\u00cd\13\4\3\4\3\4\3\4\7\4\u00d2\n\4" + "\f\4\16\4\u00d5\13\4\3\4\3\4\3\4\7\4\u00da\n\4\f\4\16\4\u00dd\13\4\3\4" + "\3\4\3\4\7\4\u00e2\n\4\f\4\16\4\u00e5\13\4\5\4\u00e7\n\4\3\5\3\5\3\5\7" + "\5\u00ec\n\5\f\5\16\5\u00ef\13\5\3\5\3\5\3\5\7\5\u00f4\n\5\f\5\16\5\u00f7" + "\13\5\3\5\3\5\3\5\7\5\u00fc\n\5\f\5\16\5\u00ff\13\5\3\5\3\5\3\5\7\5\u0104" + "\n\5\f\5\16\5\u0107\13\5\3\5\3\5\3\5\7\5\u010c\n\5\f\5\16\5\u010f\13\5" + "\3\5\3\5\3\5\7\5\u0114\n\5\f\5\16\5\u0117\13\5\3\5\3\5\3\5\7\5\u011c\n" + "\5\f\5\16\5\u011f\13\5\3\5\3\5\3\5\7\5\u0124\n\5\f\5\16\5\u0127\13\5\5" + "\5\u0129\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0136\n\6" + "\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0143\n\7\3\b\3\b\3\b" + "\7\b\u0148\n\b\f\b\16\b\u014b\13\b\3\b\3\b\3\b\7\b\u0150\n\b\f\b\16\b" + "\u0153\13\b\3\b\3\b\3\b\7\b\u0158\n\b\f\b\16\b\u015b\13\b\3\b\3\b\3\b" + "\7\b\u0160\n\b\f\b\16\b\u0163\13\b\3\b\3\b\3\b\7\b\u0168\n\b\f\b\16\b" + "\u016b\13\b\5\b\u016d\n\b\3\t\3\t\3\t\7\t\u0172\n\t\f\t\16\t\u0175\13" + "\t\3\t\3\t\3\t\7\t\u017a\n\t\f\t\16\t\u017d\13\t\3\t\3\t\3\t\7\t\u0182" + "\n\t\f\t\16\t\u0185\13\t\3\t\3\t\3\t\7\t\u018a\n\t\f\t\16\t\u018d\13\t" + "\5\t\u018f\n\t\3\n\3\n\3\n\7\n\u0194\n\n\f\n\16\n\u0197\13\n\3\n\3\n\3" + "\n\7\n\u019c\n\n\f\n\16\n\u019f\13\n\3\n\3\n\3\n\7\n\u01a4\n\n\f\n\16" + "\n\u01a7\13\n\5\n\u01a9\n\n\3\13\3\13\3\13\3\13\5\13\u01af\n\13\3\f\3" + "\f\3\f\3\f\3\f\5\f\u01b6\n\f\3\r\3\r\5\r\u01ba\n\r\3\16\3\16\3\16\3\16" + "\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u01cc" + "\n\20\f\20\16\20\u01cf\13\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3" + "\21\3\21\3\21\7\21\u01dc\n\21\f\21\16\21\u01df\13\21\3\21\5\21\u01e2\n" + "\21\3\22\3\22\3\22\3\22\3\22\7\22\u01e9\n\22\f\22\16\22\u01ec\13\22\3" + "\22\3\22\3\23\3\23\7\23\u01f2\n\23\f\23\16\23\u01f5\13\23\3\23\3\23\3" + "\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0205" + "\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25" + "\5\25\u0214\n\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27" + "\3\27\3\27\3\27\3\27\3\27\5\27\u0226\n\27\3\30\3\30\3\30\3\30\3\30\3\30" + "\7\30\u022e\n\30\f\30\16\30\u0231\13\30\3\30\5\30\u0234\n\30\3\30\3\30" + "\3\30\3\30\3\30\3\30\3\30\6\30\u023d\n\30\r\30\16\30\u023e\3\30\5\30\u0242" + "\n\30\3\30\3\30\5\30\u0246\n\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32" + "\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35" + "\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35" + "\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35" + "\3\35\3\35\3\35\5\35\u027d\n\35\3\35\2\36\2\4\6\b\n\f\16\20\22\24\26\30" + "\32\34\36 \"$&(*,.\60\62\64\668\2\3\4\2\31\31\35\37\u02db\2=\3\2\2\2\4" + "\u009c\3\2\2\2\6\u00e6\3\2\2\2\b\u0128\3\2\2\2\n\u0135\3\2\2\2\f\u0142" + "\3\2\2\2\16\u016c\3\2\2\2\20\u018e\3\2\2\2\22\u01a8\3\2\2\2\24\u01ae\3" + "\2\2\2\26\u01b5\3\2\2\2\30\u01b9\3\2\2\2\32\u01bb\3\2\2\2\34\u01bf\3\2" + "\2\2\36\u01c7\3\2\2\2 \u01e1\3\2\2\2\"\u01e3\3\2\2\2$\u01ef\3\2\2\2&\u0204" + "\3\2\2\2(\u0213\3\2\2\2*\u0215\3\2\2\2,\u0225\3\2\2\2.\u0245\3\2\2\2\60" + "\u0247\3\2\2\2\62\u024c\3\2\2\2\64\u0250\3\2\2\2\66\u0257\3\2\2\28\u027c" + "\3\2\2\2:<\5\32\16\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>C\3\2\2\2" + "?=\3\2\2\2@B\5\36\20\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DI\3\2\2" + "\2EC\3\2\2\2FH\5\34\17\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\3\3" + "\2\2\2KI\3\2\2\2LQ\5\30\r\2MN\7\3\2\2NP\5\6\4\2OM\3\2\2\2PS\3\2\2\2QO" + "\3\2\2\2QR\3\2\2\2R\u009d\3\2\2\2SQ\3\2\2\2TY\5\26\f\2UV\7\3\2\2VX\5\6" + "\4\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\u009d\3\2\2\2[Y\3\2\2\2" + "\\a\5\24\13\2]^\7\3\2\2^`\5\6\4\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2" + "\2\2b\u009d\3\2\2\2ca\3\2\2\2di\5\22\n\2ef\7\3\2\2fh\5\6\4\2ge\3\2\2\2" + "hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\u009d\3\2\2\2ki\3\2\2\2lq\5\20\t\2mn\7" + "\3\2\2np\5\6\4\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\u009d\3\2\2" + "\2sq\3\2\2\2ty\5\16\b\2uv\7\3\2\2vx\5\6\4\2wu\3\2\2\2x{\3\2\2\2yw\3\2" + "\2\2yz\3\2\2\2z\u009d\3\2\2\2{y\3\2\2\2|\u0081\5\f\7\2}~\7\3\2\2~\u0080" + "\5\6\4\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082" + "\3\2\2\2\u0082\u009d\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0089\5\n\6\2\u0085" + "\u0086\7\3\2\2\u0086\u0088\5\6\4\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2" + "\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u009d\3\2\2\2\u008b" + "\u0089\3\2\2\2\u008c\u0091\5\b\5\2\u008d\u008e\7\3\2\2\u008e\u0090\5\6" + "\4\2\u008f\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091" + "\u0092\3\2\2\2\u0092\u009d\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0099\5\6" + "\4\2\u0095\u0096\7\3\2\2\u0096\u0098\5\6\4\2\u0097\u0095\3\2\2\2\u0098" + "\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009d\3\2" + "\2\2\u009b\u0099\3\2\2\2\u009cL\3\2\2\2\u009cT\3\2\2\2\u009c\\\3\2\2\2" + "\u009cd\3\2\2\2\u009cl\3\2\2\2\u009ct\3\2\2\2\u009c|\3\2\2\2\u009c\u0084" + "\3\2\2\2\u009c\u008c\3\2\2\2\u009c\u0094\3\2\2\2\u009d\5\3\2\2\2\u009e" + "\u00a3\5\30\r\2\u009f\u00a0\7\4\2\2\u00a0\u00a2\5\b\5\2\u00a1\u009f\3" + "\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4" + "\u00e7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00ab\5\26\f\2\u00a7\u00a8\7" + "\4\2\2\u00a8\u00aa\5\b\5\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab" + "\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00e7\3\2\2\2\u00ad\u00ab\3\2" + "\2\2\u00ae\u00b3\5\24\13\2\u00af\u00b0\7\4\2\2\u00b0\u00b2\5\b\5\2\u00b1" + "\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2" + "\2\2\u00b4\u00e7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00bb\5\22\n\2\u00b7" + "\u00b8\7\4\2\2\u00b8\u00ba\5\b\5\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2" + "\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00e7\3\2\2\2\u00bd" + "\u00bb\3\2\2\2\u00be\u00c3\5\20\t\2\u00bf\u00c0\7\4\2\2\u00c0\u00c2\5" + "\b\5\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3" + "\u00c4\3\2\2\2\u00c4\u00e7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00cb\5\16" + "\b\2\u00c7\u00c8\7\4\2\2\u00c8\u00ca\5\b\5\2\u00c9\u00c7\3\2\2\2\u00ca" + "\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00e7\3\2" + "\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d3\5\f\7\2\u00cf\u00d0\7\4\2\2\u00d0" + "\u00d2\5\b\5\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2" + "\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00e7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6" + "\u00db\5\n\6\2\u00d7\u00d8\7\4\2\2\u00d8\u00da\5\b\5\2\u00d9\u00d7\3\2" + "\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc" + "\u00e7\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e3\5\b\5\2\u00df\u00e0\7\4" + "\2\2\u00e0\u00e2\5\b\5\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3" + "\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2" + "\2\2\u00e6\u009e\3\2\2\2\u00e6\u00a6\3\2\2\2\u00e6\u00ae\3\2\2\2\u00e6" + "\u00b6\3\2\2\2\u00e6\u00be\3\2\2\2\u00e6\u00c6\3\2\2\2\u00e6\u00ce\3\2" + "\2\2\u00e6\u00d6\3\2\2\2\u00e6\u00de\3\2\2\2\u00e7\7\3\2\2\2\u00e8\u00ed" + "\5\30\r\2\u00e9\u00ea\7\5\2\2\u00ea\u00ec\5\n\6\2\u00eb\u00e9\3\2\2\2" + "\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u0129" + "\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f5\5\26\f\2\u00f1\u00f2\7\5\2\2" + "\u00f2\u00f4\5\n\6\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3" + "\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u0129\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8" + "\u00fd\5\24\13\2\u00f9\u00fa\7\5\2\2\u00fa\u00fc\5\n\6\2\u00fb\u00f9\3" + "\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe" + "\u0129\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0105\5\22\n\2\u0101\u0102\7" + "\5\2\2\u0102\u0104\5\n\6\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105" + "\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0129\3\2\2\2\u0107\u0105\3\2" + "\2\2\u0108\u010d\5\20\t\2\u0109\u010a\7\5\2\2\u010a\u010c\5\n\6\2\u010b" + "\u0109\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2" + "\2\2\u010e\u0129\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0115\5\16\b\2\u0111" + "\u0112\7\5\2\2\u0112\u0114\5\n\6\2\u0113\u0111\3\2\2\2\u0114\u0117\3\2" + "\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0129\3\2\2\2\u0117" + "\u0115\3\2\2\2\u0118\u011d\5\f\7\2\u0119\u011a\7\5\2\2\u011a\u011c\5\n" + "\6\2\u011b\u0119\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d" + "\u011e\3\2\2\2\u011e\u0129\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0125\5\n" + "\6\2\u0121\u0122\7\5\2\2\u0122\u0124\5\n\6\2\u0123\u0121\3\2\2\2\u0124" + "\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0129\3\2" + "\2\2\u0127\u0125\3\2\2\2\u0128\u00e8\3\2\2\2\u0128\u00f0\3\2\2\2\u0128" + "\u00f8\3\2\2\2\u0128\u0100\3\2\2\2\u0128\u0108\3\2\2\2\u0128\u0110\3\2" + "\2\2\u0128\u0118\3\2\2\2\u0128\u0120\3\2\2\2\u0129\t\3\2\2\2\u012a\u0136" + "\5\30\r\2\u012b\u0136\5\26\f\2\u012c\u0136\5\24\13\2\u012d\u0136\5\22" + "\n\2\u012e\u0136\5\20\t\2\u012f\u0136\5\16\b\2\u0130\u0136\5\f\7\2\u0131" + "\u0132\7#\2\2\u0132\u0133\5\4\3\2\u0133\u0134\7$\2\2\u0134\u0136\3\2\2" + "\2\u0135\u012a\3\2\2\2\u0135\u012b\3\2\2\2\u0135\u012c\3\2\2\2\u0135\u012d" + "\3\2\2\2\u0135\u012e\3\2\2\2\u0135\u012f\3\2\2\2\u0135\u0130\3\2\2\2\u0135" + "\u0131\3\2\2\2\u0136\13\3\2\2\2\u0137\u0143\5\30\r\2\u0138\u0143\5\26" + "\f\2\u0139\u0143\5\24\13\2\u013a\u0143\5\22\n\2\u013b\u0143\5\20\t\2\u013c" + "\u0143\5\16\b\2\u013d\u013e\7\33\2\2\u013e\u013f\7#\2\2\u013f\u0140\5" + "\4\3\2\u0140\u0141\7$\2\2\u0141\u0143\3\2\2\2\u0142\u0137\3\2\2\2\u0142" + "\u0138\3\2\2\2\u0142\u0139\3\2\2\2\u0142\u013a\3\2\2\2\u0142\u013b\3\2" + "\2\2\u0142\u013c\3\2\2\2\u0142\u013d\3\2\2\2\u0143\r\3\2\2\2\u0144\u0149" + "\5\30\r\2\u0145\u0146\7\6\2\2\u0146\u0148\5\20\t\2\u0147\u0145\3\2\2\2" + "\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u016d" + "\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u0151\5\26\f\2\u014d\u014e\7\6\2\2" + "\u014e\u0150\5\20\t\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f" + "\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u016d\3\2\2\2\u0153\u0151\3\2\2\2\u0154" + "\u0159\5\24\13\2\u0155\u0156\7\6\2\2\u0156\u0158\5\20\t\2\u0157\u0155" + "\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a" + "\u016d\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u0161\5\22\n\2\u015d\u015e\7" + "\6\2\2\u015e\u0160\5\20\t\2\u015f\u015d\3\2\2\2\u0160\u0163\3\2\2\2\u0161" + "\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u016d\3\2\2\2\u0163\u0161\3\2" + "\2\2\u0164\u0169\5\20\t\2\u0165\u0166\7\6\2\2\u0166\u0168\5\20\t\2\u0167" + "\u0165\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2" + "\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u0144\3\2\2\2\u016c" + "\u014c\3\2\2\2\u016c\u0154\3\2\2\2\u016c\u015c\3\2\2\2\u016c\u0164\3\2" + "\2\2\u016d\17\3\2\2\2\u016e\u0173\5\30\r\2\u016f\u0170\7\7\2\2\u0170\u0172" + "\5\22\n\2\u0171\u016f\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2" + "\u0173\u0174\3\2\2\2\u0174\u018f\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u017b" + "\5\26\f\2\u0177\u0178\7\7\2\2\u0178\u017a\5\22\n\2\u0179\u0177\3\2\2\2" + "\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u018f" + "\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0183\5\24\13\2\u017f\u0180\7\7\2\2" + "\u0180\u0182\5\22\n\2\u0181\u017f\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181" + "\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u018f\3\2\2\2\u0185\u0183\3\2\2\2\u0186" + "\u018b\5\22\n\2\u0187\u0188\7\7\2\2\u0188\u018a\5\22\n\2\u0189\u0187\3" + "\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c" + "\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u016e\3\2\2\2\u018e\u0176\3\2" + "\2\2\u018e\u017e\3\2\2\2\u018e\u0186\3\2\2\2\u018f\21\3\2\2\2\u0190\u0195" + "\5\30\r\2\u0191\u0192\7\b\2\2\u0192\u0194\5\24\13\2\u0193\u0191\3\2\2" + "\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u01a9" + "\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u019d\5\26\f\2\u0199\u019a\7\b\2\2" + "\u019a\u019c\5\24\13\2\u019b\u0199\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b" + "\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a9\3\2\2\2\u019f\u019d\3\2\2\2\u01a0" + "\u01a5\5\24\13\2\u01a1\u01a2\7\b\2\2\u01a2\u01a4\5\24\13\2\u01a3\u01a1" + "\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6" + "\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u0190\3\2\2\2\u01a8\u0198\3\2" + "\2\2\u01a8\u01a0\3\2\2\2\u01a9\23\3\2\2\2\u01aa\u01af\5\30\r\2\u01ab\u01ac" + "\5\26\f\2\u01ac\u01ad\7\t\2\2\u01ad\u01af\3\2\2\2\u01ae\u01aa\3\2\2\2" + "\u01ae\u01ab\3\2\2\2\u01af\25\3\2\2\2\u01b0\u01b6\5\30\r\2\u01b1\u01b2" + "\7#\2\2\u01b2\u01b3\5\16\b\2\u01b3\u01b4\7$\2\2\u01b4\u01b6\3\2\2\2\u01b5" + "\u01b0\3\2\2\2\u01b5\u01b1\3\2\2\2\u01b6\27\3\2\2\2\u01b7\u01ba\t\2\2" + "\2\u01b8\u01ba\5\"\22\2\u01b9\u01b7\3\2\2\2\u01b9\u01b8\3\2\2\2\u01ba" + "\31\3\2\2\2\u01bb\u01bc\7\n\2\2\u01bc\u01bd\7\37\2\2\u01bd\u01be\7(\2" + "\2\u01be\33\3\2\2\2\u01bf\u01c0\7\f\2\2\u01c0\u01c1\7\13\2\2\u01c1\u01c2" + "\7!\2\2\u01c2\u01c3\7\"\2\2\u01c3\u01c4\7\r\2\2\u01c4\u01c5\7\34\2\2\u01c5" + "\u01c6\5$\23\2\u01c6\35\3\2\2\2\u01c7\u01c8\7\f\2\2\u01c8\u01c9\7\35\2" + "\2\u01c9\u01cd\7!\2\2\u01ca\u01cc\5 \21\2\u01cb\u01ca\3\2\2\2\u01cc\u01cf" + "\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf" + "\u01cd\3\2\2\2\u01d0\u01d1\7\"\2\2\u01d1\u01d2\7\r\2\2\u01d2\u01d3\7\34" + "\2\2\u01d3\u01d4\5$\23\2\u01d4\37\3\2\2\2\u01d5\u01d6\7\34\2\2\u01d6\u01d7" + "\7\35\2\2\u01d7\u01dd\3\2\2\2\u01d8\u01d9\7\'\2\2\u01d9\u01da\7\34\2\2" + "\u01da\u01dc\7\35\2\2\u01db\u01d8\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db" + "\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e2\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0" + "\u01e2\7\32\2\2\u01e1\u01d5\3\2\2\2\u01e1\u01e0\3\2\2\2\u01e2!\3\2\2\2" + "\u01e3\u01e4\7\35\2\2\u01e4\u01e5\7!\2\2\u01e5\u01ea\5\16\b\2\u01e6\u01e7" + "\7\'\2\2\u01e7\u01e9\5\16\b\2\u01e8\u01e6\3\2\2\2\u01e9\u01ec\3\2\2\2" + "\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ea" + "\3\2\2\2\u01ed\u01ee\7\"\2\2\u01ee#\3\2\2\2\u01ef\u01f3\7%\2\2\u01f0\u01f2" + "\5&\24\2\u01f1\u01f0\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3" + "\u01f4\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f7\7&" + "\2\2\u01f7%\3\2\2\2\u01f8\u0205\5(\25\2\u01f9\u0205\5$\23\2\u01fa\u0205" + "\5*\26\2\u01fb\u0205\5.\30\2\u01fc\u0205\58\35\2\u01fd\u01fe\5\"\22\2" + "\u01fe\u01ff\7(\2\2\u01ff\u0205\3\2\2\2\u0200\u0201\7\r\2\2\u0201\u0202" + "\5\16\b\2\u0202\u0203\7(\2\2\u0203\u0205\3\2\2\2\u0204\u01f8\3\2\2\2\u0204" + "\u01f9\3\2\2\2\u0204\u01fa\3\2\2\2\u0204\u01fb\3\2\2\2\u0204\u01fc\3\2" + "\2\2\u0204\u01fd\3\2\2\2\u0204\u0200\3\2\2\2\u0205\'\3\2\2\2\u0206\u0207" + "\7\23\2\2\u0207\u0208\7\35\2\2\u0208\u0209\7\24\2\2\u0209\u020a\7\34\2" + "\2\u020a\u0214\7(\2\2\u020b\u020c\7\23\2\2\u020c\u020d\7\35\2\2\u020d" + "\u020e\7\24\2\2\u020e\u020f\7\34\2\2\u020f\u0210\7\21\2\2\u0210\u0211" + "\5\16\b\2\u0211\u0212\7(\2\2\u0212\u0214\3\2\2\2\u0213\u0206\3\2\2\2\u0213" + "\u020b\3\2\2\2\u0214)\3\2\2\2\u0215\u0216\7\35\2\2\u0216\u0217\7\25\2" + "\2\u0217\u0218\5\16\b\2\u0218\u0219\7(\2\2\u0219+\3\2\2\2\u021a\u0226" + "\5\30\r\2\u021b\u0226\5\26\f\2\u021c\u0226\5\24\13\2\u021d\u0226\5\22" + "\n\2\u021e\u0226\5\20\t\2\u021f\u0226\5\16\b\2\u0220\u0226\5\f\7\2\u0221" + "\u0226\5\n\6\2\u0222\u0226\5\b\5\2\u0223\u0226\5\6\4\2\u0224\u0226\5\4" + "\3\2\u0225\u021a\3\2\2\2\u0225\u021b\3\2\2\2\u0225\u021c\3\2\2\2\u0225" + "\u021d\3\2\2\2\u0225\u021e\3\2\2\2\u0225\u021f\3\2\2\2\u0225\u0220\3\2" + "\2\2\u0225\u0221\3\2\2\2\u0225\u0222\3\2\2\2\u0225\u0223\3\2\2\2\u0225" + "\u0224\3\2\2\2\u0226-\3\2\2\2\u0227\u0228\7\26\2\2\u0228\u0229\7!\2\2" + "\u0229\u022a\5,\27\2\u022a\u022b\7\"\2\2\u022b\u022f\5$\23\2\u022c\u022e" + "\5\64\33\2\u022d\u022c\3\2\2\2\u022e\u0231\3\2\2\2\u022f\u022d\3\2\2\2" + "\u022f\u0230\3\2\2\2\u0230\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0232\u0234" + "\5\66\34\2\u0233\u0232\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0246\3\2\2\2" + "\u0235\u0236\7\27\2\2\u0236\u0237\7\26\2\2\u0237\u0238\7!\2\2\u0238\u0239" + "\7\35\2\2\u0239\u023a\7\"\2\2\u023a\u023c\7%\2\2\u023b\u023d\5\60\31\2" + "\u023c\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f" + "\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u0242\5\62\32\2\u0241\u0240\3\2\2\2" + "\u0241\u0242\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\7&\2\2\u0244\u0246" + "\3\2\2\2\u0245\u0227\3\2\2\2\u0245\u0235\3\2\2\2\u0246/\3\2\2\2\u0247" + "\u0248\7\25\2\2\u0248\u0249\t\2\2\2\u0249\u024a\7)\2\2\u024a\u024b\5$" + "\23\2\u024b\61\3\2\2\2\u024c\u024d\7\30\2\2\u024d\u024e\7)\2\2\u024e\u024f" + "\5$\23\2\u024f\63\3\2\2\2\u0250\u0251\7\30\2\2\u0251\u0252\7\26\2\2\u0252" + "\u0253\7!\2\2\u0253\u0254\5,\27\2\u0254\u0255\7\"\2\2\u0255\u0256\5$\23" + "\2\u0256\65\3\2\2\2\u0257\u0258\7\30\2\2\u0258\u0259\5$\23\2\u0259\67" + "\3\2\2\2\u025a\u025b\7\16\2\2\u025b\u025c\5$\23\2\u025c\u025d\7\17\2\2" + "\u025d\u025e\7!\2\2\u025e\u025f\5,\27\2\u025f\u0260\7\"\2\2\u0260\u027d" + "\3\2\2\2\u0261\u0262\7\16\2\2\u0262\u0263\7\17\2\2\u0263\u0264\7!\2\2" + "\u0264\u0265\5,\27\2\u0265\u0266\7\"\2\2\u0266\u0267\5$\23\2\u0267\u027d" + "\3\2\2\2\u0268\u0269\7\16\2\2\u0269\u026a\7\34\2\2\u026a\u026b\7\35\2" + "\2\u026b\u026c\7\20\2\2\u026c\u026d\5\16\b\2\u026d\u026e\7\21\2\2\u026e" + "\u026f\5\16\b\2\u026f\u0270\5$\23\2\u0270\u027d\3\2\2\2\u0271\u0272\7" + "\16\2\2\u0272\u0273\7\34\2\2\u0273\u0274\7\35\2\2\u0274\u0275\7\20\2\2" + "\u0275\u0276\5\16\b\2\u0276\u0277\7\21\2\2\u0277\u0278\5\16\b\2\u0278" + "\u0279\7\22\2\2\u0279\u027a\5\16\b\2\u027a\u027b\5$\23\2\u027b\u027d\3" + "\2\2\2\u027c\u025a\3\2\2\2\u027c\u0261\3\2\2\2\u027c\u0268\3\2\2\2\u027c" + "\u0271\3\2\2\2\u027d9\3\2\2\2E=CIQYaiqy\u0081\u0089\u0091\u0099\u009c" + "\u00a3\u00ab\u00b3\u00bb\u00c3\u00cb\u00d3\u00db\u00e3\u00e6\u00ed\u00f5" + "\u00fd\u0105\u010d\u0115\u011d\u0125\u0128\u0135\u0142\u0149\u0151\u0159" + "\u0161\u0169\u016c\u0173\u017b\u0183\u018b\u018e\u0195\u019d\u01a5\u01a8" + "\u01ae\u01b5\u01b9\u01cd\u01dd\u01e1\u01ea\u01f3\u0204\u0213\u0225\u022f" + "\u0233\u023e\u0241\u0245\u027c";
    public static final ATN    _ATN           = ATNSimulator.deserialize(_serializedATN.toCharArray());
    static
    {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++)
        {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
