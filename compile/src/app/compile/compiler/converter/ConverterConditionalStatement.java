package app.compile.compiler.converter;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.compiler.JalCompiler;
import app.compile.database.SymbolDatabase;
import app.compile.parser.codeParser;

public class ConverterConditionalStatement extends Converter
{
    @Override
    public boolean processChildren()
    {
        return false;
    }

    @Override
    public boolean productionValid(ParseTree parseTree)
    {
        return parseTree.getClass().equals(codeParser.Conditional_statementContext.class);
    }

    @Override
    public String process(ParseTree parseTree, JalCompiler compiler, SymbolDatabase scope)
    {
        return null;
    }
}
