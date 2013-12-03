package app.compile.compiler.converter;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.compiler.JalCompiler;

public class ConverterProgram extends Converter
{
    @Override
    public boolean productionValid(ParseTree parseTree)
    {
        return false;
    }

    @Override
    public String process(ParseTree parseTree, JalCompiler compiler)
    {
        
        
        return "";
    }
}
