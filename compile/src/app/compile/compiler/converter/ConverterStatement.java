package app.compile.compiler.converter;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.compiler.JalCompiler;
import app.compile.parser.codeParser;

public class ConverterStatement extends Converter
{
    @Override
    public boolean productionValid(ParseTree parseTree)
    {
        return parseTree.getClass().equals(codeParser.StatementContext.class);
    }

    @Override
    public String process(ParseTree parseTree, JalCompiler compiler)
    {
        ParseTree statement = parseTree.getChild(0);
        
        if      (statement instanceof codeParser.Declare_statementContext)
        {
            new ConverterDeclaration().process(statement, compiler);
        }
        else if (statement instanceof codeParser.Group_statementContext)
        {
            new ConverterGroupStatement().process(statement, compiler);
        }
        else if (statement instanceof codeParser.Assignment_statementContext)
        {
            new ConverterAssignment().process(statement, compiler);
        }
        else if (statement instanceof codeParser.Conditional_statementContext)
        {
            new ConverterConditionalStatement().process(statement, compiler);
        }
        else if (statement instanceof codeParser.Loop_statementContext)
        {
            new ConverterRepeatStatement().process(statement, compiler);
        }
        else if (statement instanceof codeParser.Function_call_statementContext)
        {
            new ConverterFunctionCallStatement().process(statement, compiler);
        }
        else if (statement instanceof codeParser.Return_statementContext)
        {
            new ConverterReturnStatement().process(statement, compiler);
        }
        
        return "";
    }
}
