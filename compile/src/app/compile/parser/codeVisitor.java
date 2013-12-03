// Generated from E:\Code\compileproject\code.g4 by ANTLR 4.1
package app.compile.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link codeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface codeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link codeParser#loop_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_for(@NotNull codeParser.Loop_forContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#conditional_CASE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_CASE(@NotNull codeParser.Conditional_CASEContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#conditionl_SWITCH}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionl_SWITCH(@NotNull codeParser.Conditionl_SWITCHContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(@NotNull codeParser.Loop_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#conditional_ELSEIF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_ELSEIF(@NotNull codeParser.Conditional_ELSEIFContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#conditional_DEFAULT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_DEFAULT(@NotNull codeParser.Conditional_DEFAULTContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#conditional_IF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_IF(@NotNull codeParser.Conditional_IFContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull codeParser.ParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#logical_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_statement(@NotNull codeParser.Logical_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#conditional_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_statement(@NotNull codeParser.Conditional_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#package_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_declaration(@NotNull codeParser.Package_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#main_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_function(@NotNull codeParser.Main_functionContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#operator_bool4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_bool4(@NotNull codeParser.Operator_bool4Context ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#operator_bool3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_bool3(@NotNull codeParser.Operator_bool3Context ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#operator_bool2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_bool2(@NotNull codeParser.Operator_bool2Context ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(@NotNull codeParser.Function_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#operator_bool1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_bool1(@NotNull codeParser.Operator_bool1Context ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#conditional_ELSE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_ELSE(@NotNull codeParser.Conditional_ELSEContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#expression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression1(@NotNull codeParser.Expression1Context ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#expression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression2(@NotNull codeParser.Expression2Context ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#group_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_statement(@NotNull codeParser.Group_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(@NotNull codeParser.Assignment_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#expression_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_final(@NotNull codeParser.Expression_finalContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#expression3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression3(@NotNull codeParser.Expression3Context ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#expression4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression4(@NotNull codeParser.Expression4Context ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#function_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_arguments(@NotNull codeParser.Function_argumentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#expression5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression5(@NotNull codeParser.Expression5Context ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#declare_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_statement(@NotNull codeParser.Declare_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull codeParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#parameter_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_entry(@NotNull codeParser.Parameter_entryContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(@NotNull codeParser.SContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(@NotNull codeParser.Function_callContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#loop_WHILE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_WHILE(@NotNull codeParser.Loop_WHILEContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#loop_DO_WHILE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_DO_WHILE(@NotNull codeParser.Loop_DO_WHILEContext ctx);

	/**
	 * Visit a parse tree produced by {@link codeParser#operator_bool5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_bool5(@NotNull codeParser.Operator_bool5Context ctx);
}