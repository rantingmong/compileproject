package app.compile.compiler.converter;

import org.antlr.v4.runtime.tree.ParseTree;

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
    public ConverterResult process(ParseTree parseTree, Compiler compiler, SymbolDatabase scope)
    {
        // check if we're dealing with IF statements of SWITCH statements
        
        return null;
    }
}
