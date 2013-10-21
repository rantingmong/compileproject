package app.compile;

// Generated from E:\Code\compileproject\code.g4 by ANTLR 4.1
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
    public static final String[] tokenNames = { "<INVALID>", "WS", "'['", "']'", "'('", "')'", "'<<'", "'>>'", "','", "';'", "':'", "LOGIC_1", "LOGIC_2", "LOGIC_3", "ARTH_1", "ARTH_2", "ARTH_3", "ARTH_4", "TOKEN_GRAB", "TOKEN_MAIN", "TOKEN_FUNCTION", "TOKEN_RETURNING", "TOKEN_REPEAT", "TOKEN_UNTIL", "TOKEN_FROM", "TOKEN_TO", "TOKEN_WITH", "TOKEN_DECLARE", "TOKEN_AS", "TOKEN_IS", "TOKEN_IF", "TOKEN_CHECK", "TOKEN_OR", "TOKEN_ELSE", "TYPE", "ID", "NUM", "STRING" };
    public static final int RULE_s = 0, RULE_operator_bool1 = 1,
            RULE_operator_bool2 = 2, RULE_operator_bool3 = 3,
            RULE_expression1 = 4, RULE_expression2 = 5, RULE_expression3 = 6,
            RULE_expression4 = 7, RULE_expression5 = 8,
            RULE_expression_final = 9, RULE_package_declaration = 10,
            RULE_main_function = 11, RULE_function_declaration = 12,
            RULE_parameter = 13, RULE_function_call = 14,
            RULE_group_statement = 15, RULE_statement = 16,
            RULE_declare_statement = 17, RULE_assignment_statement = 18,
            RULE_logical_statement = 19, RULE_conditional_statement = 20,
            RULE_conditional_CASE = 21, RULE_conditional_DEFAULT = 22,
            RULE_conditional_ELSEIF = 23, RULE_conditional_ELSE = 24,
            RULE_loop_statement = 25;
    public static final String[] ruleNames = { "s", "operator_bool1", "operator_bool2", "operator_bool3", "expression1", "expression2", "expression3", "expression4", "expression5", "expression_final", "package_declaration", "main_function", "function_declaration", "parameter", "function_call", "group_statement", "statement", "declare_statement", "assignment_statement", "logical_statement", "conditional_statement", "conditional_CASE", "conditional_DEFAULT", "conditional_ELSEIF", "conditional_ELSE", "loop_statement" };

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
                setState(55);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == TOKEN_GRAB)
                {
                    {
                        {
                            setState(52);
                            package_declaration();
                        }
                    }
                    setState(57);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(61);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
                while (_alt != 2 && _alt != -1)
                {
                    if (_alt == 1)
                    {
                        {
                            {
                                setState(58);
                                function_declaration();
                            }
                        }
                    }
                    setState(63);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
                }
                setState(67);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == TOKEN_FUNCTION)
                {
                    {
                        {
                            setState(64);
                            main_function();
                        }
                    }
                    setState(69);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Operator_bool1Context extends ParserRuleContext
    {
        public List<TerminalNode> LOGIC_1()
        {
            return getTokens(codeParser.LOGIC_1);
        }

        public List<Operator_bool2Context> operator_bool2()
        {
            return getRuleContexts(Operator_bool2Context.class);
        }

        public Operator_bool3Context operator_bool3()
        {
            return getRuleContext(Operator_bool3Context.class, 0);
        }

        public TerminalNode LOGIC_1(int i)
        {
            return getToken(codeParser.LOGIC_1, i);
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
            setState(79);
            switch (getInterpreter().adaptivePredict(_input, 4, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(70);
                    operator_bool3();
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(71);
                    operator_bool2();
                    setState(76);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LOGIC_1)
                    {
                        {
                            {
                                setState(72);
                                match(LOGIC_1);
                                setState(73);
                                operator_bool2();
                            }
                        }
                        setState(78);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Operator_bool2Context extends ParserRuleContext
    {
        public List<Operator_bool3Context> operator_bool3()
        {
            return getRuleContexts(Operator_bool3Context.class);
        }

        public Operator_bool3Context operator_bool3(int i)
        {
            return getRuleContext(Operator_bool3Context.class, i);
        }

        public TerminalNode LOGIC_2(int i)
        {
            return getToken(codeParser.LOGIC_2, i);
        }

        public List<TerminalNode> LOGIC_2()
        {
            return getTokens(codeParser.LOGIC_2);
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
            enterOuterAlt(_localctx, 1);
            {
                setState(81);
                operator_bool3();
                setState(86);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == LOGIC_2)
                {
                    {
                        {
                            setState(82);
                            match(LOGIC_2);
                            setState(83);
                            operator_bool3();
                        }
                    }
                    setState(88);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Operator_bool3Context extends ParserRuleContext
    {
        public TerminalNode LOGIC_3(int i)
        {
            return getToken(codeParser.LOGIC_3, i);
        }

        public Expression1Context expression1(int i)
        {
            return getRuleContext(Expression1Context.class, i);
        }

        public List<TerminalNode> LOGIC_3()
        {
            return getTokens(codeParser.LOGIC_3);
        }

        public List<Expression1Context> expression1()
        {
            return getRuleContexts(Expression1Context.class);
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
            enterOuterAlt(_localctx, 1);
            {
                setState(89);
                expression1();
                setState(94);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == LOGIC_3)
                {
                    {
                        {
                            setState(90);
                            match(LOGIC_3);
                            setState(91);
                            expression1();
                        }
                    }
                    setState(96);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
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

        public TerminalNode ARTH_1(int i)
        {
            return getToken(codeParser.ARTH_1, i);
        }

        public List<TerminalNode> ARTH_1()
        {
            return getTokens(codeParser.ARTH_1);
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
        enterRule(_localctx, 8, RULE_expression1);
        int _la;
        try
        {
            setState(106);
            switch (getInterpreter().adaptivePredict(_input, 8, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(97);
                    expression_final();
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(98);
                    expression2();
                    setState(103);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == ARTH_1)
                    {
                        {
                            {
                                setState(99);
                                match(ARTH_1);
                                setState(100);
                                expression2();
                            }
                        }
                        setState(105);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
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
        enterRule(_localctx, 10, RULE_expression2);
        int _la;
        try
        {
            setState(117);
            switch (getInterpreter().adaptivePredict(_input, 10, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(108);
                    expression_final();
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(109);
                    expression3();
                    setState(114);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == ARTH_2)
                    {
                        {
                            {
                                setState(110);
                                match(ARTH_2);
                                setState(111);
                                expression3();
                            }
                        }
                        setState(116);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
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
        enterRule(_localctx, 12, RULE_expression3);
        int _la;
        try
        {
            setState(128);
            switch (getInterpreter().adaptivePredict(_input, 12, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(119);
                    expression_final();
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(120);
                    expression4();
                    setState(125);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == ARTH_3)
                    {
                        {
                            {
                                setState(121);
                                match(ARTH_3);
                                setState(122);
                                expression4();
                            }
                        }
                        setState(127);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
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
        enterRule(_localctx, 14, RULE_expression4);
        try
        {
            setState(134);
            switch (getInterpreter().adaptivePredict(_input, 13, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(130);
                    expression_final();
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(131);
                    expression5();
                    setState(132);
                    match(ARTH_4);
                }
                break;
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
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
        enterRule(_localctx, 16, RULE_expression5);
        try
        {
            setState(141);
            switch (_input.LA(1))
            {
            case TOKEN_OPEN_P:
                enterOuterAlt(_localctx, 1);
                {
                    setState(136);
                    match(TOKEN_OPEN_P);
                    setState(137);
                    expression1();
                    setState(138);
                    match(TOKEN_CLOS_P);
                }
                break;
            case ID:
            case NUM:
            case STRING:
                enterOuterAlt(_localctx, 2);
                {
                    setState(140);
                    expression_final();
                }
                break;
            default:
                throw new NoViableAltException(this);
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Expression_finalContext extends ParserRuleContext
    {
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
        enterRule(_localctx, 18, RULE_expression_final);
        int _la;
        try
        {
            setState(145);
            switch (getInterpreter().adaptivePredict(_input, 15, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(143);
                    _la = _input.LA(1);
                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUM) | (1L << STRING))) != 0)))
                    {
                        _errHandler.recoverInline(this);
                    }
                    consume();
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(144);
                    function_call();
                }
                break;
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
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
        enterRule(_localctx, 20, RULE_package_declaration);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(147);
                match(TOKEN_GRAB);
                setState(148);
                match(STRING);
                setState(149);
                match(TOKEN_SEMICOLON);
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
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
        enterRule(_localctx, 22, RULE_main_function);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(151);
                match(TOKEN_FUNCTION);
                setState(152);
                match(TOKEN_MAIN);
                setState(153);
                match(TOKEN_OPEN_B);
                setState(154);
                match(TOKEN_CLOS_B);
                setState(155);
                match(TOKEN_RETURNING);
                setState(156);
                match(TYPE);
                setState(157);
                group_statement();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
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
        enterRule(_localctx, 24, RULE_function_declaration);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(159);
                match(TOKEN_FUNCTION);
                setState(160);
                match(ID);
                setState(161);
                match(TOKEN_OPEN_B);
                setState(165);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == TYPE)
                {
                    {
                        {
                            setState(162);
                            parameter();
                        }
                    }
                    setState(167);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(168);
                match(TOKEN_CLOS_B);
                setState(169);
                match(TOKEN_RETURNING);
                setState(170);
                match(TYPE);
                setState(171);
                group_statement();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
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
        enterRule(_localctx, 26, RULE_parameter);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(173);
                    match(TYPE);
                    setState(174);
                    match(ID);
                }
                setState(181);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == TOKEN_COMMA)
                {
                    {
                        {
                            setState(176);
                            match(TOKEN_COMMA);
                            setState(177);
                            match(TYPE);
                            setState(178);
                            match(ID);
                        }
                    }
                    setState(183);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
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
        enterRule(_localctx, 28, RULE_function_call);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(184);
                match(ID);
                setState(185);
                match(TOKEN_OPEN_B);
                setState(186);
                expression1();
                setState(191);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == TOKEN_COMMA)
                {
                    {
                        {
                            setState(187);
                            match(TOKEN_COMMA);
                            setState(188);
                            expression1();
                        }
                    }
                    setState(193);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(194);
                match(TOKEN_CLOS_B);
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
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
        enterRule(_localctx, 30, RULE_group_statement);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(196);
                match(TOKEN_OPEN_S);
                setState(200);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_OPEN_S) | (1L << TOKEN_RETURNING) | (1L << TOKEN_REPEAT) | (1L << TOKEN_DECLARE) | (1L << TOKEN_IF) | (1L << TOKEN_CHECK) | (1L << ID))) != 0))
                {
                    {
                        {
                            setState(197);
                            statement();
                        }
                    }
                    setState(202);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(203);
                match(TOKEN_CLOS_S);
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
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
        enterRule(_localctx, 32, RULE_statement);
        try
        {
            setState(217);
            switch (getInterpreter().adaptivePredict(_input, 20, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(205);
                    declare_statement();
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(206);
                    group_statement();
                }
                break;

            case 3:
                enterOuterAlt(_localctx, 3);
                {
                    setState(207);
                    assignment_statement();
                }
                break;

            case 4:
                enterOuterAlt(_localctx, 4);
                {
                    setState(208);
                    conditional_statement();
                }
                break;

            case 5:
                enterOuterAlt(_localctx, 5);
                {
                    setState(209);
                    loop_statement();
                }
                break;

            case 6:
                enterOuterAlt(_localctx, 6);
                {
                    setState(210);
                    function_call();
                    setState(211);
                    match(TOKEN_SEMICOLON);
                }
                break;

            case 7:
                enterOuterAlt(_localctx, 7);
                {
                    setState(213);
                    match(TOKEN_RETURNING);
                    setState(214);
                    expression1();
                    setState(215);
                    match(TOKEN_SEMICOLON);
                }
                break;
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
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
        enterRule(_localctx, 34, RULE_declare_statement);
        try
        {
            setState(232);
            switch (getInterpreter().adaptivePredict(_input, 21, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(219);
                    match(TOKEN_DECLARE);
                    setState(220);
                    match(ID);
                    setState(221);
                    match(TOKEN_AS);
                    setState(222);
                    match(TYPE);
                    setState(223);
                    match(TOKEN_SEMICOLON);
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(224);
                    match(TOKEN_DECLARE);
                    setState(225);
                    match(ID);
                    setState(226);
                    match(TOKEN_AS);
                    setState(227);
                    match(TYPE);
                    setState(228);
                    match(TOKEN_TO);
                    setState(229);
                    expression1();
                    setState(230);
                    match(TOKEN_SEMICOLON);
                }
                break;
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
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
        enterRule(_localctx, 36, RULE_assignment_statement);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(234);
                match(ID);
                setState(235);
                match(TOKEN_IS);
                setState(236);
                expression1();
                setState(237);
                match(TOKEN_SEMICOLON);
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Logical_statementContext extends ParserRuleContext
    {
        public Operator_bool1Context operator_bool1()
        {
            return getRuleContext(Operator_bool1Context.class, 0);
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
        enterRule(_localctx, 38, RULE_logical_statement);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(239);
                operator_bool1();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Conditional_statementContext extends ParserRuleContext
    {
        public Conditional_ELSEIFContext conditional_ELSEIF()
        {
            return getRuleContext(Conditional_ELSEIFContext.class, 0);
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
        enterRule(_localctx, 40, RULE_conditional_statement);
        int _la;
        try
        {
            setState(263);
            switch (_input.LA(1))
            {
            case TOKEN_IF:
                enterOuterAlt(_localctx, 1);
                {
                    setState(241);
                    match(TOKEN_IF);
                    setState(242);
                    match(TOKEN_OPEN_B);
                    {
                        setState(243);
                        logical_statement();
                    }
                    setState(244);
                    match(TOKEN_CLOS_B);
                    setState(245);
                    group_statement();
                    setState(246);
                    conditional_ELSEIF();
                    setState(247);
                    conditional_ELSE();
                }
                break;
            case TOKEN_CHECK:
                enterOuterAlt(_localctx, 2);
                {
                    setState(249);
                    match(TOKEN_CHECK);
                    setState(250);
                    match(TOKEN_IF);
                    setState(251);
                    match(TOKEN_OPEN_B);
                    setState(252);
                    match(ID);
                    setState(253);
                    match(TOKEN_CLOS_B);
                    setState(254);
                    match(TOKEN_OPEN_S);
                    setState(256);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do
                    {
                        {
                            {
                                setState(255);
                                conditional_CASE();
                            }
                        }
                        setState(258);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    } while (_la == TOKEN_IS);
                    setState(260);
                    conditional_DEFAULT();
                    setState(261);
                    match(TOKEN_CLOS_S);
                }
                break;
            default:
                throw new NoViableAltException(this);
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Conditional_CASEContext extends ParserRuleContext
    {
        public StatementContext statement()
        {
            return getRuleContext(StatementContext.class, 0);
        }

        public TerminalNode TOKEN_COLON()
        {
            return getToken(codeParser.TOKEN_COLON, 0);
        }

        public Group_statementContext group_statement()
        {
            return getRuleContext(Group_statementContext.class, 0);
        }

        public TerminalNode ID()
        {
            return getToken(codeParser.ID, 0);
        }

        public TerminalNode TOKEN_IS()
        {
            return getToken(codeParser.TOKEN_IS, 0);
        }

        public TerminalNode TOKEN_SEMICOLON()
        {
            return getToken(codeParser.TOKEN_SEMICOLON, 0);
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
        enterRule(_localctx, 42, RULE_conditional_CASE);
        try
        {
            setState(277);
            switch (getInterpreter().adaptivePredict(_input, 24, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(265);
                    match(TOKEN_IS);
                    setState(266);
                    match(ID);
                    setState(267);
                    match(TOKEN_COLON);
                    setState(268);
                    group_statement();
                    setState(269);
                    match(TOKEN_SEMICOLON);
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(271);
                    match(TOKEN_IS);
                    setState(272);
                    match(ID);
                    setState(273);
                    match(TOKEN_COLON);
                    setState(274);
                    statement();
                    setState(275);
                    match(TOKEN_SEMICOLON);
                }
                break;
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Conditional_DEFAULTContext extends ParserRuleContext
    {
        public StatementContext statement()
        {
            return getRuleContext(StatementContext.class, 0);
        }

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

        public TerminalNode TOKEN_OR()
        {
            return getToken(codeParser.TOKEN_OR, 0);
        }

        public TerminalNode TOKEN_SEMICOLON()
        {
            return getToken(codeParser.TOKEN_SEMICOLON, 0);
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
        enterRule(_localctx, 44, RULE_conditional_DEFAULT);
        try
        {
            setState(292);
            switch (getInterpreter().adaptivePredict(_input, 25, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(279);
                    match(TOKEN_OR);
                    setState(280);
                    match(TOKEN_ELSE);
                    setState(281);
                    match(TOKEN_COLON);
                    setState(282);
                    group_statement();
                    setState(283);
                    match(TOKEN_SEMICOLON);
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(285);
                    match(TOKEN_OR);
                    setState(286);
                    match(TOKEN_ELSE);
                    setState(287);
                    match(TOKEN_COLON);
                    setState(288);
                    statement();
                    setState(289);
                    match(TOKEN_SEMICOLON);
                }
                break;

            case 3:
                enterOuterAlt(_localctx, 3);
                {
                }
                break;
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Conditional_ELSEIFContext extends ParserRuleContext
    {
        public TerminalNode TOKEN_OPEN_B(int i)
        {
            return getToken(codeParser.TOKEN_OPEN_B, i);
        }

        public TerminalNode TOKEN_ELSE(int i)
        {
            return getToken(codeParser.TOKEN_ELSE, i);
        }

        public List<TerminalNode> TOKEN_CLOS_B()
        {
            return getTokens(codeParser.TOKEN_CLOS_B);
        }

        public Logical_statementContext logical_statement(int i)
        {
            return getRuleContext(Logical_statementContext.class, i);
        }

        public List<TerminalNode> TOKEN_OPEN_B()
        {
            return getTokens(codeParser.TOKEN_OPEN_B);
        }

        public List<TerminalNode> TOKEN_ELSE()
        {
            return getTokens(codeParser.TOKEN_ELSE);
        }

        public List<Group_statementContext> group_statement()
        {
            return getRuleContexts(Group_statementContext.class);
        }

        public TerminalNode TOKEN_CLOS_B(int i)
        {
            return getToken(codeParser.TOKEN_CLOS_B, i);
        }

        public List<Logical_statementContext> logical_statement()
        {
            return getRuleContexts(Logical_statementContext.class);
        }

        public TerminalNode TOKEN_IF(int i)
        {
            return getToken(codeParser.TOKEN_IF, i);
        }

        public List<TerminalNode> TOKEN_IF()
        {
            return getTokens(codeParser.TOKEN_IF);
        }

        public Group_statementContext group_statement(int i)
        {
            return getRuleContext(Group_statementContext.class, i);
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
        enterRule(_localctx, 46, RULE_conditional_ELSEIF);
        try
        {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(303);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
                while (_alt != 2 && _alt != -1)
                {
                    if (_alt == 1)
                    {
                        {
                            {
                                setState(294);
                                match(TOKEN_ELSE);
                                setState(295);
                                match(TOKEN_IF);
                                setState(296);
                                match(TOKEN_OPEN_B);
                                setState(297);
                                logical_statement();
                                setState(298);
                                match(TOKEN_CLOS_B);
                                setState(299);
                                group_statement();
                            }
                        }
                    }
                    setState(305);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 26, _ctx);
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
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
        enterRule(_localctx, 48, RULE_conditional_ELSE);
        try
        {
            setState(309);
            switch (_input.LA(1))
            {
            case TOKEN_ELSE:
                enterOuterAlt(_localctx, 1);
                {
                    setState(306);
                    match(TOKEN_ELSE);
                    setState(307);
                    group_statement();
                }
                break;
            case TOKEN_OPEN_S:
            case TOKEN_CLOS_S:
            case TOKEN_SEMICOLON:
            case TOKEN_RETURNING:
            case TOKEN_REPEAT:
            case TOKEN_DECLARE:
            case TOKEN_IF:
            case TOKEN_CHECK:
            case ID:
                enterOuterAlt(_localctx, 2);
                {
                }
                break;
            default:
                throw new NoViableAltException(this);
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
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
        enterRule(_localctx, 50, RULE_loop_statement);
        try
        {
            setState(345);
            switch (getInterpreter().adaptivePredict(_input, 28, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(311);
                    match(TOKEN_REPEAT);
                    setState(312);
                    group_statement();
                    setState(313);
                    match(TOKEN_UNTIL);
                    setState(314);
                    match(TOKEN_OPEN_B);
                    setState(315);
                    logical_statement();
                    setState(316);
                    match(TOKEN_CLOS_B);
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(318);
                    match(TOKEN_REPEAT);
                    setState(319);
                    match(TOKEN_UNTIL);
                    setState(320);
                    match(TOKEN_OPEN_B);
                    setState(321);
                    logical_statement();
                    setState(322);
                    match(TOKEN_CLOS_B);
                    setState(323);
                    group_statement();
                }
                break;

            case 3:
                enterOuterAlt(_localctx, 3);
                {
                    setState(325);
                    match(TOKEN_REPEAT);
                    setState(326);
                    match(TYPE);
                    setState(327);
                    match(ID);
                    setState(328);
                    match(TOKEN_FROM);
                    setState(329);
                    expression1();
                    setState(330);
                    match(TOKEN_TO);
                    setState(331);
                    expression1();
                    setState(332);
                    group_statement();
                }
                break;

            case 4:
                enterOuterAlt(_localctx, 4);
                {
                    setState(334);
                    match(TOKEN_REPEAT);
                    setState(335);
                    match(TYPE);
                    setState(336);
                    match(ID);
                    setState(337);
                    match(TOKEN_FROM);
                    setState(338);
                    expression1();
                    setState(339);
                    match(TOKEN_TO);
                    setState(340);
                    expression1();
                    setState(341);
                    match(TOKEN_WITH);
                    setState(342);
                    expression1();
                    setState(343);
                    group_statement();
                }
                break;
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\'\u015e\4\2\t\2\4" + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" + "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" + "\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\7\2>\n\2\f\2\16\2" + "A\13\2\3\2\7\2D\n\2\f\2\16\2G\13\2\3\3\3\3\3\3\3\3\7\3M\n\3\f\3\16\3P" + "\13\3\5\3R\n\3\3\4\3\4\3\4\7\4W\n\4\f\4\16\4Z\13\4\3\5\3\5\3\5\7\5_\n" + "\5\f\5\16\5b\13\5\3\6\3\6\3\6\3\6\7\6h\n\6\f\6\16\6k\13\6\5\6m\n\6\3\7" + "\3\7\3\7\3\7\7\7s\n\7\f\7\16\7v\13\7\5\7x\n\7\3\b\3\b\3\b\3\b\7\b~\n\b" + "\f\b\16\b\u0081\13\b\5\b\u0083\n\b\3\t\3\t\3\t\3\t\5\t\u0089\n\t\3\n\3" + "\n\3\n\3\n\3\n\5\n\u0090\n\n\3\13\3\13\5\13\u0094\n\13\3\f\3\f\3\f\3\f" + "\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u00a6\n\16\f" + "\16\16\16\u00a9\13\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17" + "\3\17\7\17\u00b6\n\17\f\17\16\17\u00b9\13\17\3\20\3\20\3\20\3\20\3\20" + "\7\20\u00c0\n\20\f\20\16\20\u00c3\13\20\3\20\3\20\3\21\3\21\7\21\u00c9" + "\n\21\f\21\16\21\u00cc\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3" + "\22\3\22\3\22\3\22\3\22\3\22\5\22\u00dc\n\22\3\23\3\23\3\23\3\23\3\23" + "\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00eb\n\23\3\24\3\24\3\24" + "\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26" + "\3\26\3\26\3\26\3\26\3\26\6\26\u0103\n\26\r\26\16\26\u0104\3\26\3\26\3" + "\26\5\26\u010a\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27" + "\3\27\3\27\5\27\u0118\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30" + "\3\30\3\30\3\30\3\30\5\30\u0127\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31" + "\7\31\u0130\n\31\f\31\16\31\u0133\13\31\3\32\3\32\3\32\5\32\u0138\n\32" + "\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33" + "\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33" + "\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u015c\n\33\3\33\2\34\2\4\6\b\n\f\16" + "\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\3\3\2%\'\u0168\29\3\2\2\2" + "\4Q\3\2\2\2\6S\3\2\2\2\b[\3\2\2\2\nl\3\2\2\2\fw\3\2\2\2\16\u0082\3\2\2" + "\2\20\u0088\3\2\2\2\22\u008f\3\2\2\2\24\u0093\3\2\2\2\26\u0095\3\2\2\2" + "\30\u0099\3\2\2\2\32\u00a1\3\2\2\2\34\u00af\3\2\2\2\36\u00ba\3\2\2\2 " + "\u00c6\3\2\2\2\"\u00db\3\2\2\2$\u00ea\3\2\2\2&\u00ec\3\2\2\2(\u00f1\3" + "\2\2\2*\u0109\3\2\2\2,\u0117\3\2\2\2.\u0126\3\2\2\2\60\u0131\3\2\2\2\62" + "\u0137\3\2\2\2\64\u015b\3\2\2\2\668\5\26\f\2\67\66\3\2\2\28;\3\2\2\29" + "\67\3\2\2\29:\3\2\2\2:?\3\2\2\2;9\3\2\2\2<>\5\32\16\2=<\3\2\2\2>A\3\2" + "\2\2?=\3\2\2\2?@\3\2\2\2@E\3\2\2\2A?\3\2\2\2BD\5\30\r\2CB\3\2\2\2DG\3" + "\2\2\2EC\3\2\2\2EF\3\2\2\2F\3\3\2\2\2GE\3\2\2\2HR\5\b\5\2IN\5\6\4\2JK" + "\7\r\2\2KM\5\6\4\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2\2\2P" + "N\3\2\2\2QH\3\2\2\2QI\3\2\2\2R\5\3\2\2\2SX\5\b\5\2TU\7\16\2\2UW\5\b\5" + "\2VT\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\7\3\2\2\2ZX\3\2\2\2[`\5\n" + "\6\2\\]\7\17\2\2]_\5\n\6\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\t" + "\3\2\2\2b`\3\2\2\2cm\5\24\13\2di\5\f\7\2ef\7\20\2\2fh\5\f\7\2ge\3\2\2" + "\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2ki\3\2\2\2lc\3\2\2\2ld\3\2\2" + "\2m\13\3\2\2\2nx\5\24\13\2ot\5\16\b\2pq\7\21\2\2qs\5\16\b\2rp\3\2\2\2" + "sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2\2\2wn\3\2\2\2wo\3\2\2\2" + "x\r\3\2\2\2y\u0083\5\24\13\2z\177\5\20\t\2{|\7\22\2\2|~\5\20\t\2}{\3\2" + "\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0083\3\2\2\2" + "\u0081\177\3\2\2\2\u0082y\3\2\2\2\u0082z\3\2\2\2\u0083\17\3\2\2\2\u0084" + "\u0089\5\24\13\2\u0085\u0086\5\22\n\2\u0086\u0087\7\23\2\2\u0087\u0089" + "\3\2\2\2\u0088\u0084\3\2\2\2\u0088\u0085\3\2\2\2\u0089\21\3\2\2\2\u008a" + "\u008b\7\6\2\2\u008b\u008c\5\n\6\2\u008c\u008d\7\7\2\2\u008d\u0090\3\2" + "\2\2\u008e\u0090\5\24\13\2\u008f\u008a\3\2\2\2\u008f\u008e\3\2\2\2\u0090" + "\23\3\2\2\2\u0091\u0094\t\2\2\2\u0092\u0094\5\36\20\2\u0093\u0091\3\2" + "\2\2\u0093\u0092\3\2\2\2\u0094\25\3\2\2\2\u0095\u0096\7\24\2\2\u0096\u0097" + "\7\'\2\2\u0097\u0098\7\13\2\2\u0098\27\3\2\2\2\u0099\u009a\7\26\2\2\u009a" + "\u009b\7\25\2\2\u009b\u009c\7\4\2\2\u009c\u009d\7\5\2\2\u009d\u009e\7" + "\27\2\2\u009e\u009f\7$\2\2\u009f\u00a0\5 \21\2\u00a0\31\3\2\2\2\u00a1" + "\u00a2\7\26\2\2\u00a2\u00a3\7%\2\2\u00a3\u00a7\7\4\2\2\u00a4\u00a6\5\34" + "\17\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7" + "\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7\5" + "\2\2\u00ab\u00ac\7\27\2\2\u00ac\u00ad\7$\2\2\u00ad\u00ae\5 \21\2\u00ae" + "\33\3\2\2\2\u00af\u00b0\7$\2\2\u00b0\u00b1\7%\2\2\u00b1\u00b7\3\2\2\2" + "\u00b2\u00b3\7\n\2\2\u00b3\u00b4\7$\2\2\u00b4\u00b6\7%\2\2\u00b5\u00b2" + "\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8" + "\35\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7%\2\2\u00bb\u00bc\7\4\2\2" + "\u00bc\u00c1\5\n\6\2\u00bd\u00be\7\n\2\2\u00be\u00c0\5\n\6\2\u00bf\u00bd" + "\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2" + "\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\5\2\2\u00c5\37\3\2\2" + "\2\u00c6\u00ca\7\b\2\2\u00c7\u00c9\5\"\22\2\u00c8\u00c7\3\2\2\2\u00c9" + "\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2" + "\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\t\2\2\u00ce!\3\2\2\2\u00cf\u00dc" + "\5$\23\2\u00d0\u00dc\5 \21\2\u00d1\u00dc\5&\24\2\u00d2\u00dc\5*\26\2\u00d3" + "\u00dc\5\64\33\2\u00d4\u00d5\5\36\20\2\u00d5\u00d6\7\13\2\2\u00d6\u00dc" + "\3\2\2\2\u00d7\u00d8\7\27\2\2\u00d8\u00d9\5\n\6\2\u00d9\u00da\7\13\2\2" + "\u00da\u00dc\3\2\2\2\u00db\u00cf\3\2\2\2\u00db\u00d0\3\2\2\2\u00db\u00d1" + "\3\2\2\2\u00db\u00d2\3\2\2\2\u00db\u00d3\3\2\2\2\u00db\u00d4\3\2\2\2\u00db" + "\u00d7\3\2\2\2\u00dc#\3\2\2\2\u00dd\u00de\7\35\2\2\u00de\u00df\7%\2\2" + "\u00df\u00e0\7\36\2\2\u00e0\u00e1\7$\2\2\u00e1\u00eb\7\13\2\2\u00e2\u00e3" + "\7\35\2\2\u00e3\u00e4\7%\2\2\u00e4\u00e5\7\36\2\2\u00e5\u00e6\7$\2\2\u00e6" + "\u00e7\7\33\2\2\u00e7\u00e8\5\n\6\2\u00e8\u00e9\7\13\2\2\u00e9\u00eb\3" + "\2\2\2\u00ea\u00dd\3\2\2\2\u00ea\u00e2\3\2\2\2\u00eb%\3\2\2\2\u00ec\u00ed" + "\7%\2\2\u00ed\u00ee\7\37\2\2\u00ee\u00ef\5\n\6\2\u00ef\u00f0\7\13\2\2" + "\u00f0\'\3\2\2\2\u00f1\u00f2\5\4\3\2\u00f2)\3\2\2\2\u00f3\u00f4\7 \2\2" + "\u00f4\u00f5\7\4\2\2\u00f5\u00f6\5(\25\2\u00f6\u00f7\7\5\2\2\u00f7\u00f8" + "\5 \21\2\u00f8\u00f9\5\60\31\2\u00f9\u00fa\5\62\32\2\u00fa\u010a\3\2\2" + "\2\u00fb\u00fc\7!\2\2\u00fc\u00fd\7 \2\2\u00fd\u00fe\7\4\2\2\u00fe\u00ff" + "\7%\2\2\u00ff\u0100\7\5\2\2\u0100\u0102\7\b\2\2\u0101\u0103\5,\27\2\u0102" + "\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2" + "\2\2\u0105\u0106\3\2\2\2\u0106\u0107\5.\30\2\u0107\u0108\7\t\2\2\u0108" + "\u010a\3\2\2\2\u0109\u00f3\3\2\2\2\u0109\u00fb\3\2\2\2\u010a+\3\2\2\2" + "\u010b\u010c\7\37\2\2\u010c\u010d\7%\2\2\u010d\u010e\7\f\2\2\u010e\u010f" + "\5 \21\2\u010f\u0110\7\13\2\2\u0110\u0118\3\2\2\2\u0111\u0112\7\37\2\2" + "\u0112\u0113\7%\2\2\u0113\u0114\7\f\2\2\u0114\u0115\5\"\22\2\u0115\u0116" + "\7\13\2\2\u0116\u0118\3\2\2\2\u0117\u010b\3\2\2\2\u0117\u0111\3\2\2\2" + "\u0118-\3\2\2\2\u0119\u011a\7\"\2\2\u011a\u011b\7#\2\2\u011b\u011c\7\f" + "\2\2\u011c\u011d\5 \21\2\u011d\u011e\7\13\2\2\u011e\u0127\3\2\2\2\u011f" + "\u0120\7\"\2\2\u0120\u0121\7#\2\2\u0121\u0122\7\f\2\2\u0122\u0123\5\"" + "\22\2\u0123\u0124\7\13\2\2\u0124\u0127\3\2\2\2\u0125\u0127\3\2\2\2\u0126" + "\u0119\3\2\2\2\u0126\u011f\3\2\2\2\u0126\u0125\3\2\2\2\u0127/\3\2\2\2" + "\u0128\u0129\7#\2\2\u0129\u012a\7 \2\2\u012a\u012b\7\4\2\2\u012b\u012c" + "\5(\25\2\u012c\u012d\7\5\2\2\u012d\u012e\5 \21\2\u012e\u0130\3\2\2\2\u012f" + "\u0128\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2" + "\2\2\u0132\61\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\7#\2\2\u0135\u0138" + "\5 \21\2\u0136\u0138\3\2\2\2\u0137\u0134\3\2\2\2\u0137\u0136\3\2\2\2\u0138" + "\63\3\2\2\2\u0139\u013a\7\30\2\2\u013a\u013b\5 \21\2\u013b\u013c\7\31" + "\2\2\u013c\u013d\7\4\2\2\u013d\u013e\5(\25\2\u013e\u013f\7\5\2\2\u013f" + "\u015c\3\2\2\2\u0140\u0141\7\30\2\2\u0141\u0142\7\31\2\2\u0142\u0143\7" + "\4\2\2\u0143\u0144\5(\25\2\u0144\u0145\7\5\2\2\u0145\u0146\5 \21\2\u0146" + "\u015c\3\2\2\2\u0147\u0148\7\30\2\2\u0148\u0149\7$\2\2\u0149\u014a\7%" + "\2\2\u014a\u014b\7\32\2\2\u014b\u014c\5\n\6\2\u014c\u014d\7\33\2\2\u014d" + "\u014e\5\n\6\2\u014e\u014f\5 \21\2\u014f\u015c\3\2\2\2\u0150\u0151\7\30" + "\2\2\u0151\u0152\7$\2\2\u0152\u0153\7%\2\2\u0153\u0154\7\32\2\2\u0154" + "\u0155\5\n\6\2\u0155\u0156\7\33\2\2\u0156\u0157\5\n\6\2\u0157\u0158\7" + "\34\2\2\u0158\u0159\5\n\6\2\u0159\u015a\5 \21\2\u015a\u015c\3\2\2\2\u015b" + "\u0139\3\2\2\2\u015b\u0140\3\2\2\2\u015b\u0147\3\2\2\2\u015b\u0150\3\2" + "\2\2\u015c\65\3\2\2\2\379?ENQX`iltw\177\u0082\u0088\u008f\u0093\u00a7" + "\u00b7\u00c1\u00ca\u00db\u00ea\u0104\u0109\u0117\u0126\u0131\u0137\u015b";
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