// Generated from E:\Code\compileproject\code.g4 by ANTLR 4.1
package app.compile.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link codeParser}.
 */
public interface codeListener extends ParseTreeListener
{
    /**
     * Enter a parse tree produced by {@link codeParser#conditional_CASE}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterConditional_CASE(@NotNull codeParser.Conditional_CASEContext ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#conditional_CASE}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitConditional_CASE(@NotNull codeParser.Conditional_CASEContext ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#loop_statement}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterLoop_statement(@NotNull codeParser.Loop_statementContext ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#loop_statement}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitLoop_statement(@NotNull codeParser.Loop_statementContext ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#conditional_ELSEIF}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterConditional_ELSEIF(@NotNull codeParser.Conditional_ELSEIFContext ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#conditional_ELSEIF}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitConditional_ELSEIF(@NotNull codeParser.Conditional_ELSEIFContext ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#conditional_DEFAULT}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterConditional_DEFAULT(@NotNull codeParser.Conditional_DEFAULTContext ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#conditional_DEFAULT}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitConditional_DEFAULT(@NotNull codeParser.Conditional_DEFAULTContext ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#parameter}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterParameter(@NotNull codeParser.ParameterContext ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#parameter}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitParameter(@NotNull codeParser.ParameterContext ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#logical_statement}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterLogical_statement(@NotNull codeParser.Logical_statementContext ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#logical_statement}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitLogical_statement(@NotNull codeParser.Logical_statementContext ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#conditional_statement}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterConditional_statement(@NotNull codeParser.Conditional_statementContext ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#conditional_statement}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitConditional_statement(@NotNull codeParser.Conditional_statementContext ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#package_declaration}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterPackage_declaration(@NotNull codeParser.Package_declarationContext ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#package_declaration}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitPackage_declaration(@NotNull codeParser.Package_declarationContext ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#main_function}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterMain_function(@NotNull codeParser.Main_functionContext ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#main_function}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitMain_function(@NotNull codeParser.Main_functionContext ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#operator_bool4}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterOperator_bool4(@NotNull codeParser.Operator_bool4Context ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#operator_bool4}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitOperator_bool4(@NotNull codeParser.Operator_bool4Context ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#operator_bool3}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterOperator_bool3(@NotNull codeParser.Operator_bool3Context ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#operator_bool3}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitOperator_bool3(@NotNull codeParser.Operator_bool3Context ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#operator_bool2}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterOperator_bool2(@NotNull codeParser.Operator_bool2Context ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#operator_bool2}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitOperator_bool2(@NotNull codeParser.Operator_bool2Context ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#function_declaration}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterFunction_declaration(@NotNull codeParser.Function_declarationContext ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#function_declaration}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitFunction_declaration(@NotNull codeParser.Function_declarationContext ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#operator_bool1}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterOperator_bool1(@NotNull codeParser.Operator_bool1Context ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#operator_bool1}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitOperator_bool1(@NotNull codeParser.Operator_bool1Context ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#conditional_ELSE}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterConditional_ELSE(@NotNull codeParser.Conditional_ELSEContext ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#conditional_ELSE}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitConditional_ELSE(@NotNull codeParser.Conditional_ELSEContext ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#expression1}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterExpression1(@NotNull codeParser.Expression1Context ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#expression1}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitExpression1(@NotNull codeParser.Expression1Context ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#expression2}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterExpression2(@NotNull codeParser.Expression2Context ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#expression2}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitExpression2(@NotNull codeParser.Expression2Context ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#group_statement}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterGroup_statement(@NotNull codeParser.Group_statementContext ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#group_statement}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitGroup_statement(@NotNull codeParser.Group_statementContext ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#assignment_statement}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterAssignment_statement(@NotNull codeParser.Assignment_statementContext ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#assignment_statement}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitAssignment_statement(@NotNull codeParser.Assignment_statementContext ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#expression_final}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterExpression_final(@NotNull codeParser.Expression_finalContext ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#expression_final}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitExpression_final(@NotNull codeParser.Expression_finalContext ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#expression3}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterExpression3(@NotNull codeParser.Expression3Context ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#expression3}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitExpression3(@NotNull codeParser.Expression3Context ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#expression4}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterExpression4(@NotNull codeParser.Expression4Context ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#expression4}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitExpression4(@NotNull codeParser.Expression4Context ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#expression5}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterExpression5(@NotNull codeParser.Expression5Context ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#expression5}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitExpression5(@NotNull codeParser.Expression5Context ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#declare_statement}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterDeclare_statement(@NotNull codeParser.Declare_statementContext ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#declare_statement}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitDeclare_statement(@NotNull codeParser.Declare_statementContext ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#statement}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterStatement(@NotNull codeParser.StatementContext ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#statement}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitStatement(@NotNull codeParser.StatementContext ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#s}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterS(@NotNull codeParser.SContext ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#s}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitS(@NotNull codeParser.SContext ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#function_call}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterFunction_call(@NotNull codeParser.Function_callContext ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#function_call}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitFunction_call(@NotNull codeParser.Function_callContext ctx);

    /**
     * Enter a parse tree produced by {@link codeParser#operator_bool5}.
     * 
     * @param ctx
     *            the parse tree
     */
    void enterOperator_bool5(@NotNull codeParser.Operator_bool5Context ctx);

    /**
     * Exit a parse tree produced by {@link codeParser#operator_bool5}.
     * 
     * @param ctx
     *            the parse tree
     */
    void exitOperator_bool5(@NotNull codeParser.Operator_bool5Context ctx);
}