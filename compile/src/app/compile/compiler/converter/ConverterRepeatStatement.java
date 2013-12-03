package app.compile.compiler.converter;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.compiler.JalCompiler;
import app.compile.database.SymbolDatabase;
import app.compile.parser.codeParser.Loop_DO_WHILEContext;
import app.compile.parser.codeParser.Loop_WHILEContext;
import app.compile.parser.codeParser.Loop_forContext;
import app.compile.parser.codeParser.Loop_statementContext;

public class ConverterRepeatStatement extends Converter
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
        Loop_statementContext lsc = (Loop_statementContext)parseTree;

        if      (lsc.getChild(0) instanceof Loop_forContext)
        {
            
        }
        else if (lsc.getChild(0) instanceof Loop_WHILEContext)
        {
            
        }
        else if (lsc.getChild(0) instanceof Loop_DO_WHILEContext)
        {
            
        }

        return "";
    }
}
