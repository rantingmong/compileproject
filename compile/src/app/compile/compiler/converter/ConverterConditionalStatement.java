package app.compile.compiler.converter;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.compiler.JalCompiler;
import app.compile.parser.codeParser;
import app.compile.parser.codeParser.Conditional_IFContext;
import app.compile.parser.codeParser.Conditional_SWITCHContext;
import app.compile.parser.codeParser.Conditional_statementContext;

public class ConverterConditionalStatement extends Converter
{
    @Override
    public boolean productionValid(ParseTree parseTree)
    {
        return parseTree.getClass().equals(codeParser.Conditional_statementContext.class);
    }

    @Override
    public String process(ParseTree parseTree, JalCompiler compiler)
    {
        Conditional_statementContext csc = (Conditional_statementContext)parseTree;
        
        if      (csc.getChild(0) instanceof Conditional_IFContext)
        {
            
        }
        else if (csc.getChild(0) instanceof Conditional_SWITCHContext)
        {
            
        }
        
        return "";
    }
}
