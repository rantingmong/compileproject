package app.compile;

// Generated from E:\Code\COMPILE\code.g4 by ANTLR 4.1
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
            RULE_package_declaration = 9, RULE_main_function = 10,
            RULE_function_declaration = 11, RULE_parameter = 12,
            RULE_function_call = 13, RULE_group_statement = 14,
            RULE_statement = 15, RULE_declare_statement = 16,
            RULE_assignment_statement = 17, RULE_logical_statement = 18,
            RULE_conditional_statement = 19, RULE_conditional_CASE = 20,
            RULE_conditional_DEFAULT = 21, RULE_conditional_ELSEIF = 22,
            RULE_conditional_ELSE = 23, RULE_loop_statement = 24;
    public static final String[] ruleNames = { "s", "operator_bool1", "operator_bool2", "operator_bool3", "expression1", "expression2", "expression3", "expression4", "expression5", "package_declaration", "main_function", "function_declaration", "parameter", "function_call", "group_statement", "statement", "declare_statement", "assignment_statement", "logical_statement", "conditional_statement", "conditional_CASE", "conditional_DEFAULT", "conditional_ELSEIF", "conditional_ELSE", "loop_statement" };

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
                setState(53);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == TOKEN_GRAB)
                {
                    {
                        {
                            setState(50);
                            package_declaration();
                        }
                    }
                    setState(55);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(59);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
                while (_alt != 2 && _alt != -1)
                {
                    if (_alt == 1)
                    {
                        {
                            {
                                setState(56);
                                function_declaration();
                            }
                        }
                    }
                    setState(61);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
                }
                setState(65);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == TOKEN_FUNCTION)
                {
                    {
                        {
                            setState(62);
                            main_function();
                        }
                    }
                    setState(67);
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
            enterOuterAlt(_localctx, 1);
            {
                setState(68);
                operator_bool2();
                setState(73);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == LOGIC_1)
                {
                    {
                        {
                            setState(69);
                            match(LOGIC_1);
                            setState(70);
                            operator_bool2();
                        }
                    }
                    setState(75);
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
                setState(76);
                operator_bool3();
                setState(81);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == LOGIC_2)
                {
                    {
                        {
                            setState(77);
                            match(LOGIC_2);
                            setState(78);
                            operator_bool3();
                        }
                    }
                    setState(83);
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
                setState(84);
                expression1();
                setState(89);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == LOGIC_3)
                {
                    {
                        {
                            setState(85);
                            match(LOGIC_3);
                            setState(86);
                            expression1();
                        }
                    }
                    setState(91);
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
            enterOuterAlt(_localctx, 1);
            {
                setState(92);
                expression2();
                setState(97);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == ARTH_1)
                {
                    {
                        {
                            setState(93);
                            match(ARTH_1);
                            setState(94);
                            expression2();
                        }
                    }
                    setState(99);
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

    public static class Expression2Context extends ParserRuleContext
    {
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
            enterOuterAlt(_localctx, 1);
            {
                setState(100);
                expression3();
                setState(105);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == ARTH_2)
                {
                    {
                        {
                            setState(101);
                            match(ARTH_2);
                            setState(102);
                            expression3();
                        }
                    }
                    setState(107);
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

    public static class Expression3Context extends ParserRuleContext
    {
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
            enterOuterAlt(_localctx, 1);
            {
                setState(108);
                expression4();
                setState(113);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == ARTH_3)
                {
                    {
                        {
                            setState(109);
                            match(ARTH_3);
                            setState(110);
                            expression4();
                        }
                    }
                    setState(115);
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

    public static class Expression4Context extends ParserRuleContext
    {
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
            setState(120);
            switch (getInterpreter().adaptivePredict(_input, 9, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(116);
                    expression5();
                    setState(117);
                    match(ARTH_4);
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(119);
                    expression5();
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
        public TerminalNode TOKEN_CLOS_P()
        {
            return getToken(codeParser.TOKEN_CLOS_P, 0);
        }

        public TerminalNode TOKEN_OPEN_P()
        {
            return getToken(codeParser.TOKEN_OPEN_P, 0);
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

        public Expression1Context expression1()
        {
            return getRuleContext(Expression1Context.class, 0);
        }

        public TerminalNode NUM()
        {
            return getToken(codeParser.NUM, 0);
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
        int _la;
        try
        {
            setState(128);
            switch (getInterpreter().adaptivePredict(_input, 10, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(122);
                    match(TOKEN_OPEN_P);
                    setState(123);
                    expression1();
                    setState(124);
                    match(TOKEN_CLOS_P);
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(126);
                    _la = _input.LA(1);
                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUM) | (1L << STRING))) != 0)))
                    {
                        _errHandler.recoverInline(this);
                    }
                    consume();
                }
                break;

            case 3:
                enterOuterAlt(_localctx, 3);
                {
                    setState(127);
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
        enterRule(_localctx, 18, RULE_package_declaration);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(130);
                match(TOKEN_GRAB);
                setState(131);
                match(STRING);
                setState(132);
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
        enterRule(_localctx, 20, RULE_main_function);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(134);
                match(TOKEN_FUNCTION);
                setState(135);
                match(TOKEN_MAIN);
                setState(136);
                match(TOKEN_OPEN_B);
                setState(137);
                match(TOKEN_CLOS_B);
                setState(138);
                match(TOKEN_RETURNING);
                setState(139);
                match(TYPE);
                setState(140);
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
        enterRule(_localctx, 22, RULE_function_declaration);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(142);
                match(TOKEN_FUNCTION);
                setState(143);
                match(ID);
                setState(144);
                match(TOKEN_OPEN_B);
                setState(148);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == TYPE)
                {
                    {
                        {
                            setState(145);
                            parameter();
                        }
                    }
                    setState(150);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(151);
                match(TOKEN_CLOS_B);
                setState(152);
                match(TOKEN_RETURNING);
                setState(153);
                match(TYPE);
                setState(154);
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
        enterRule(_localctx, 24, RULE_parameter);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(156);
                    match(TYPE);
                    setState(157);
                    match(ID);
                }
                setState(164);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == TOKEN_COMMA)
                {
                    {
                        {
                            setState(159);
                            match(TOKEN_COMMA);
                            setState(160);
                            match(TYPE);
                            setState(161);
                            match(ID);
                        }
                    }
                    setState(166);
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
        enterRule(_localctx, 26, RULE_function_call);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(167);
                match(ID);
                setState(168);
                match(TOKEN_OPEN_B);
                setState(169);
                expression1();
                setState(174);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == TOKEN_COMMA)
                {
                    {
                        {
                            setState(170);
                            match(TOKEN_COMMA);
                            setState(171);
                            expression1();
                        }
                    }
                    setState(176);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(177);
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
        enterRule(_localctx, 28, RULE_group_statement);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(179);
                match(TOKEN_OPEN_S);
                setState(183);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_OPEN_S) | (1L << TOKEN_RETURNING) | (1L << TOKEN_REPEAT) | (1L << TOKEN_DECLARE) | (1L << TOKEN_IF) | (1L << TOKEN_CHECK) | (1L << ID))) != 0))
                {
                    {
                        {
                            setState(180);
                            statement();
                        }
                    }
                    setState(185);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(186);
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
        enterRule(_localctx, 30, RULE_statement);
        try
        {
            setState(200);
            switch (getInterpreter().adaptivePredict(_input, 15, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(188);
                    declare_statement();
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(189);
                    group_statement();
                }
                break;

            case 3:
                enterOuterAlt(_localctx, 3);
                {
                    setState(190);
                    assignment_statement();
                }
                break;

            case 4:
                enterOuterAlt(_localctx, 4);
                {
                    setState(191);
                    conditional_statement();
                }
                break;

            case 5:
                enterOuterAlt(_localctx, 5);
                {
                    setState(192);
                    loop_statement();
                }
                break;

            case 6:
                enterOuterAlt(_localctx, 6);
                {
                    setState(193);
                    function_call();
                    setState(194);
                    match(TOKEN_SEMICOLON);
                }
                break;

            case 7:
                enterOuterAlt(_localctx, 7);
                {
                    setState(196);
                    match(TOKEN_RETURNING);
                    setState(197);
                    expression1();
                    setState(198);
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
        enterRule(_localctx, 32, RULE_declare_statement);
        try
        {
            setState(215);
            switch (getInterpreter().adaptivePredict(_input, 16, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(202);
                    match(TOKEN_DECLARE);
                    setState(203);
                    match(ID);
                    setState(204);
                    match(TOKEN_AS);
                    setState(205);
                    match(TYPE);
                    setState(206);
                    match(TOKEN_SEMICOLON);
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(207);
                    match(TOKEN_DECLARE);
                    setState(208);
                    match(ID);
                    setState(209);
                    match(TOKEN_AS);
                    setState(210);
                    match(TYPE);
                    setState(211);
                    match(TOKEN_TO);
                    setState(212);
                    expression1();
                    setState(213);
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
        enterRule(_localctx, 34, RULE_assignment_statement);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(217);
                match(ID);
                setState(218);
                match(TOKEN_IS);
                setState(219);
                expression1();
                setState(220);
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
        enterRule(_localctx, 36, RULE_logical_statement);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(222);
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
        enterRule(_localctx, 38, RULE_conditional_statement);
        int _la;
        try
        {
            setState(246);
            switch (_input.LA(1))
            {
            case TOKEN_IF:
                enterOuterAlt(_localctx, 1);
                {
                    setState(224);
                    match(TOKEN_IF);
                    setState(225);
                    match(TOKEN_OPEN_B);
                    {
                        setState(226);
                        logical_statement();
                    }
                    setState(227);
                    match(TOKEN_CLOS_B);
                    setState(228);
                    group_statement();
                    setState(229);
                    conditional_ELSEIF();
                    setState(230);
                    conditional_ELSE();
                }
                break;
            case TOKEN_CHECK:
                enterOuterAlt(_localctx, 2);
                {
                    setState(232);
                    match(TOKEN_CHECK);
                    setState(233);
                    match(TOKEN_IF);
                    setState(234);
                    match(TOKEN_OPEN_B);
                    setState(235);
                    match(ID);
                    setState(236);
                    match(TOKEN_CLOS_B);
                    setState(237);
                    match(TOKEN_OPEN_S);
                    setState(239);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do
                    {
                        {
                            {
                                setState(238);
                                conditional_CASE();
                            }
                        }
                        setState(241);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    } while (_la == TOKEN_IS);
                    setState(243);
                    conditional_DEFAULT();
                    setState(244);
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
        enterRule(_localctx, 40, RULE_conditional_CASE);
        try
        {
            setState(260);
            switch (getInterpreter().adaptivePredict(_input, 19, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(248);
                    match(TOKEN_IS);
                    setState(249);
                    match(ID);
                    setState(250);
                    match(TOKEN_COLON);
                    setState(251);
                    group_statement();
                    setState(252);
                    match(TOKEN_SEMICOLON);
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(254);
                    match(TOKEN_IS);
                    setState(255);
                    match(ID);
                    setState(256);
                    match(TOKEN_COLON);
                    setState(257);
                    statement();
                    setState(258);
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
        enterRule(_localctx, 42, RULE_conditional_DEFAULT);
        try
        {
            setState(275);
            switch (getInterpreter().adaptivePredict(_input, 20, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(262);
                    match(TOKEN_OR);
                    setState(263);
                    match(TOKEN_ELSE);
                    setState(264);
                    match(TOKEN_COLON);
                    setState(265);
                    group_statement();
                    setState(266);
                    match(TOKEN_SEMICOLON);
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(268);
                    match(TOKEN_OR);
                    setState(269);
                    match(TOKEN_ELSE);
                    setState(270);
                    match(TOKEN_COLON);
                    setState(271);
                    statement();
                    setState(272);
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
        enterRule(_localctx, 44, RULE_conditional_ELSEIF);
        try
        {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(286);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 21, _ctx);
                while (_alt != 2 && _alt != -1)
                {
                    if (_alt == 1)
                    {
                        {
                            {
                                setState(277);
                                match(TOKEN_ELSE);
                                setState(278);
                                match(TOKEN_IF);
                                setState(279);
                                match(TOKEN_OPEN_B);
                                setState(280);
                                logical_statement();
                                setState(281);
                                match(TOKEN_CLOS_B);
                                setState(282);
                                group_statement();
                            }
                        }
                    }
                    setState(288);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 21, _ctx);
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
        enterRule(_localctx, 46, RULE_conditional_ELSE);
        try
        {
            setState(292);
            switch (_input.LA(1))
            {
            case TOKEN_ELSE:
                enterOuterAlt(_localctx, 1);
                {
                    setState(289);
                    match(TOKEN_ELSE);
                    setState(290);
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
        enterRule(_localctx, 48, RULE_loop_statement);
        try
        {
            setState(328);
            switch (getInterpreter().adaptivePredict(_input, 23, _ctx))
            {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(294);
                    match(TOKEN_REPEAT);
                    setState(295);
                    group_statement();
                    setState(296);
                    match(TOKEN_UNTIL);
                    setState(297);
                    match(TOKEN_OPEN_B);
                    setState(298);
                    logical_statement();
                    setState(299);
                    match(TOKEN_CLOS_B);
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(301);
                    match(TOKEN_REPEAT);
                    setState(302);
                    match(TOKEN_UNTIL);
                    setState(303);
                    match(TOKEN_OPEN_B);
                    setState(304);
                    logical_statement();
                    setState(305);
                    match(TOKEN_CLOS_B);
                    setState(306);
                    group_statement();
                }
                break;

            case 3:
                enterOuterAlt(_localctx, 3);
                {
                    setState(308);
                    match(TOKEN_REPEAT);
                    setState(309);
                    match(TYPE);
                    setState(310);
                    match(ID);
                    setState(311);
                    match(TOKEN_FROM);
                    setState(312);
                    expression1();
                    setState(313);
                    match(TOKEN_TO);
                    setState(314);
                    expression1();
                    setState(315);
                    group_statement();
                }
                break;

            case 4:
                enterOuterAlt(_localctx, 4);
                {
                    setState(317);
                    match(TOKEN_REPEAT);
                    setState(318);
                    match(TYPE);
                    setState(319);
                    match(ID);
                    setState(320);
                    match(TOKEN_FROM);
                    setState(321);
                    expression1();
                    setState(322);
                    match(TOKEN_TO);
                    setState(323);
                    expression1();
                    setState(324);
                    match(TOKEN_WITH);
                    setState(325);
                    expression1();
                    setState(326);
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

    public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\'\u014d\4\2\t\2\4" + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" + "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" + "\4\32\t\32\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3" + "\2\7\2B\n\2\f\2\16\2E\13\2\3\3\3\3\3\3\7\3J\n\3\f\3\16\3M\13\3\3\4\3\4" + "\3\4\7\4R\n\4\f\4\16\4U\13\4\3\5\3\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\6\3" + "\6\3\6\7\6b\n\6\f\6\16\6e\13\6\3\7\3\7\3\7\7\7j\n\7\f\7\16\7m\13\7\3\b" + "\3\b\3\b\7\br\n\b\f\b\16\bu\13\b\3\t\3\t\3\t\3\t\5\t{\n\t\3\n\3\n\3\n" + "\3\n\3\n\3\n\5\n\u0083\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f" + "\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u0095\n\r\f\r\16\r\u0098\13\r\3\r\3\r\3\r" + "\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00a5\n\16\f\16\16\16\u00a8" + "\13\16\3\17\3\17\3\17\3\17\3\17\7\17\u00af\n\17\f\17\16\17\u00b2\13\17" + "\3\17\3\17\3\20\3\20\7\20\u00b8\n\20\f\20\16\20\u00bb\13\20\3\20\3\20" + "\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00cb" + "\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22" + "\5\22\u00da\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25" + "\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\6\25\u00f2\n\25" + "\r\25\16\25\u00f3\3\25\3\25\3\25\5\25\u00f9\n\25\3\26\3\26\3\26\3\26\3" + "\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0107\n\26\3\27\3\27\3\27" + "\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0116\n\27\3\30" + "\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u011f\n\30\f\30\16\30\u0122\13\30" + "\3\31\3\31\3\31\5\31\u0127\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32" + "\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32" + "\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u014b" + "\n\32\3\32\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62" + "\2\3\3\2%\'\u0154\2\67\3\2\2\2\4F\3\2\2\2\6N\3\2\2\2\bV\3\2\2\2\n^\3\2" + "\2\2\ff\3\2\2\2\16n\3\2\2\2\20z\3\2\2\2\22\u0082\3\2\2\2\24\u0084\3\2" + "\2\2\26\u0088\3\2\2\2\30\u0090\3\2\2\2\32\u009e\3\2\2\2\34\u00a9\3\2\2" + "\2\36\u00b5\3\2\2\2 \u00ca\3\2\2\2\"\u00d9\3\2\2\2$\u00db\3\2\2\2&\u00e0" + "\3\2\2\2(\u00f8\3\2\2\2*\u0106\3\2\2\2,\u0115\3\2\2\2.\u0120\3\2\2\2\60" + "\u0126\3\2\2\2\62\u014a\3\2\2\2\64\66\5\24\13\2\65\64\3\2\2\2\669\3\2" + "\2\2\67\65\3\2\2\2\678\3\2\2\28=\3\2\2\29\67\3\2\2\2:<\5\30\r\2;:\3\2" + "\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>C\3\2\2\2?=\3\2\2\2@B\5\26\f\2A@\3" + "\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\3\3\2\2\2EC\3\2\2\2FK\5\6\4\2GH" + "\7\r\2\2HJ\5\6\4\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\5\3\2\2\2" + "MK\3\2\2\2NS\5\b\5\2OP\7\16\2\2PR\5\b\5\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2" + "\2ST\3\2\2\2T\7\3\2\2\2US\3\2\2\2V[\5\n\6\2WX\7\17\2\2XZ\5\n\6\2YW\3\2" + "\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\t\3\2\2\2][\3\2\2\2^c\5\f\7\2_`" + "\7\20\2\2`b\5\f\7\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\13\3\2\2" + "\2ec\3\2\2\2fk\5\16\b\2gh\7\21\2\2hj\5\16\b\2ig\3\2\2\2jm\3\2\2\2ki\3" + "\2\2\2kl\3\2\2\2l\r\3\2\2\2mk\3\2\2\2ns\5\20\t\2op\7\22\2\2pr\5\20\t\2" + "qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\17\3\2\2\2us\3\2\2\2vw\5\22" + "\n\2wx\7\23\2\2x{\3\2\2\2y{\5\22\n\2zv\3\2\2\2zy\3\2\2\2{\21\3\2\2\2|" + "}\7\6\2\2}~\5\n\6\2~\177\7\7\2\2\177\u0083\3\2\2\2\u0080\u0083\t\2\2\2" + "\u0081\u0083\5\34\17\2\u0082|\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081" + "\3\2\2\2\u0083\23\3\2\2\2\u0084\u0085\7\24\2\2\u0085\u0086\7\'\2\2\u0086" + "\u0087\7\13\2\2\u0087\25\3\2\2\2\u0088\u0089\7\26\2\2\u0089\u008a\7\25" + "\2\2\u008a\u008b\7\4\2\2\u008b\u008c\7\5\2\2\u008c\u008d\7\27\2\2\u008d" + "\u008e\7$\2\2\u008e\u008f\5\36\20\2\u008f\27\3\2\2\2\u0090\u0091\7\26" + "\2\2\u0091\u0092\7%\2\2\u0092\u0096\7\4\2\2\u0093\u0095\5\32\16\2\u0094" + "\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2" + "\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\5\2\2\u009a" + "\u009b\7\27\2\2\u009b\u009c\7$\2\2\u009c\u009d\5\36\20\2\u009d\31\3\2" + "\2\2\u009e\u009f\7$\2\2\u009f\u00a0\7%\2\2\u00a0\u00a6\3\2\2\2\u00a1\u00a2" + "\7\n\2\2\u00a2\u00a3\7$\2\2\u00a3\u00a5\7%\2\2\u00a4\u00a1\3\2\2\2\u00a5" + "\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\33\3\2\2" + "\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7%\2\2\u00aa\u00ab\7\4\2\2\u00ab\u00b0" + "\5\n\6\2\u00ac\u00ad\7\n\2\2\u00ad\u00af\5\n\6\2\u00ae\u00ac\3\2\2\2\u00af" + "\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2" + "\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\5\2\2\u00b4\35\3\2\2\2\u00b5\u00b9" + "\7\b\2\2\u00b6\u00b8\5 \21\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9" + "\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2" + "\2\2\u00bc\u00bd\7\t\2\2\u00bd\37\3\2\2\2\u00be\u00cb\5\"\22\2\u00bf\u00cb" + "\5\36\20\2\u00c0\u00cb\5$\23\2\u00c1\u00cb\5(\25\2\u00c2\u00cb\5\62\32" + "\2\u00c3\u00c4\5\34\17\2\u00c4\u00c5\7\13\2\2\u00c5\u00cb\3\2\2\2\u00c6" + "\u00c7\7\27\2\2\u00c7\u00c8\5\n\6\2\u00c8\u00c9\7\13\2\2\u00c9\u00cb\3" + "\2\2\2\u00ca\u00be\3\2\2\2\u00ca\u00bf\3\2\2\2\u00ca\u00c0\3\2\2\2\u00ca" + "\u00c1\3\2\2\2\u00ca\u00c2\3\2\2\2\u00ca\u00c3\3\2\2\2\u00ca\u00c6\3\2" + "\2\2\u00cb!\3\2\2\2\u00cc\u00cd\7\35\2\2\u00cd\u00ce\7%\2\2\u00ce\u00cf" + "\7\36\2\2\u00cf\u00d0\7$\2\2\u00d0\u00da\7\13\2\2\u00d1\u00d2\7\35\2\2" + "\u00d2\u00d3\7%\2\2\u00d3\u00d4\7\36\2\2\u00d4\u00d5\7$\2\2\u00d5\u00d6" + "\7\33\2\2\u00d6\u00d7\5\n\6\2\u00d7\u00d8\7\13\2\2\u00d8\u00da\3\2\2\2" + "\u00d9\u00cc\3\2\2\2\u00d9\u00d1\3\2\2\2\u00da#\3\2\2\2\u00db\u00dc\7" + "%\2\2\u00dc\u00dd\7\37\2\2\u00dd\u00de\5\n\6\2\u00de\u00df\7\13\2\2\u00df" + "%\3\2\2\2\u00e0\u00e1\5\4\3\2\u00e1\'\3\2\2\2\u00e2\u00e3\7 \2\2\u00e3" + "\u00e4\7\4\2\2\u00e4\u00e5\5&\24\2\u00e5\u00e6\7\5\2\2\u00e6\u00e7\5\36" + "\20\2\u00e7\u00e8\5.\30\2\u00e8\u00e9\5\60\31\2\u00e9\u00f9\3\2\2\2\u00ea" + "\u00eb\7!\2\2\u00eb\u00ec\7 \2\2\u00ec\u00ed\7\4\2\2\u00ed\u00ee\7%\2" + "\2\u00ee\u00ef\7\5\2\2\u00ef\u00f1\7\b\2\2\u00f0\u00f2\5*\26\2\u00f1\u00f0" + "\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4" + "\u00f5\3\2\2\2\u00f5\u00f6\5,\27\2\u00f6\u00f7\7\t\2\2\u00f7\u00f9\3\2" + "\2\2\u00f8\u00e2\3\2\2\2\u00f8\u00ea\3\2\2\2\u00f9)\3\2\2\2\u00fa\u00fb" + "\7\37\2\2\u00fb\u00fc\7%\2\2\u00fc\u00fd\7\f\2\2\u00fd\u00fe\5\36\20\2" + "\u00fe\u00ff\7\13\2\2\u00ff\u0107\3\2\2\2\u0100\u0101\7\37\2\2\u0101\u0102" + "\7%\2\2\u0102\u0103\7\f\2\2\u0103\u0104\5 \21\2\u0104\u0105\7\13\2\2\u0105" + "\u0107\3\2\2\2\u0106\u00fa\3\2\2\2\u0106\u0100\3\2\2\2\u0107+\3\2\2\2" + "\u0108\u0109\7\"\2\2\u0109\u010a\7#\2\2\u010a\u010b\7\f\2\2\u010b\u010c" + "\5\36\20\2\u010c\u010d\7\13\2\2\u010d\u0116\3\2\2\2\u010e\u010f\7\"\2" + "\2\u010f\u0110\7#\2\2\u0110\u0111\7\f\2\2\u0111\u0112\5 \21\2\u0112\u0113" + "\7\13\2\2\u0113\u0116\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0108\3\2\2\2" + "\u0115\u010e\3\2\2\2\u0115\u0114\3\2\2\2\u0116-\3\2\2\2\u0117\u0118\7" + "#\2\2\u0118\u0119\7 \2\2\u0119\u011a\7\4\2\2\u011a\u011b\5&\24\2\u011b" + "\u011c\7\5\2\2\u011c\u011d\5\36\20\2\u011d\u011f\3\2\2\2\u011e\u0117\3" + "\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121" + "/\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7#\2\2\u0124\u0127\5\36\20\2" + "\u0125\u0127\3\2\2\2\u0126\u0123\3\2\2\2\u0126\u0125\3\2\2\2\u0127\61" + "\3\2\2\2\u0128\u0129\7\30\2\2\u0129\u012a\5\36\20\2\u012a\u012b\7\31\2" + "\2\u012b\u012c\7\4\2\2\u012c\u012d\5&\24\2\u012d\u012e\7\5\2\2\u012e\u014b" + "\3\2\2\2\u012f\u0130\7\30\2\2\u0130\u0131\7\31\2\2\u0131\u0132\7\4\2\2" + "\u0132\u0133\5&\24\2\u0133\u0134\7\5\2\2\u0134\u0135\5\36\20\2\u0135\u014b" + "\3\2\2\2\u0136\u0137\7\30\2\2\u0137\u0138\7$\2\2\u0138\u0139\7%\2\2\u0139" + "\u013a\7\32\2\2\u013a\u013b\5\n\6\2\u013b\u013c\7\33\2\2\u013c\u013d\5" + "\n\6\2\u013d\u013e\5\36\20\2\u013e\u014b\3\2\2\2\u013f\u0140\7\30\2\2" + "\u0140\u0141\7$\2\2\u0141\u0142\7%\2\2\u0142\u0143\7\32\2\2\u0143\u0144" + "\5\n\6\2\u0144\u0145\7\33\2\2\u0145\u0146\5\n\6\2\u0146\u0147\7\34\2\2" + "\u0147\u0148\5\n\6\2\u0148\u0149\5\36\20\2\u0149\u014b\3\2\2\2\u014a\u0128" + "\3\2\2\2\u014a\u012f\3\2\2\2\u014a\u0136\3\2\2\2\u014a\u013f\3\2\2\2\u014b" + "\63\3\2\2\2\32\67=CKS[cksz\u0082\u0096\u00a6\u00b0\u00b9\u00ca\u00d9\u00f3" + "\u00f8\u0106\u0115\u0120\u0126\u014a";
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