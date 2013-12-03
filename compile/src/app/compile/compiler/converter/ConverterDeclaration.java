package app.compile.compiler.converter;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.compiler.JalCompiler;
import app.compile.database.SymbolDatabase;

public class ConverterDeclaration extends Converter
{
    @Override
    public boolean processChildren()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean productionValid(ParseTree parseTree)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String process(ParseTree parseTree, JalCompiler compiler, SymbolDatabase scope)
    {
        // TODO Auto-generated method stub
        return null;
    }
}
