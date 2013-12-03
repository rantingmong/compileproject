package app.compile.compiler.converter;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.compiler.JalCompiler;
import app.compile.parser.codeParser;
import app.compile.parser.codeParser.Return_statementContext;

public class ConverterReturnStatement extends Converter
{
    @Override
    public boolean productionValid(ParseTree parseTree)
    {
        return parseTree.getClass().equals(codeParser.Return_statementContext.class);
    }

    @Override
    public String process(ParseTree parseTree, JalCompiler compiler)
    {
        Return_statementContext rst     = (Return_statementContext)parseTree;
        String                  result  = new ConverterLogicalStatement().process(rst.logical_statement(), compiler);
        
        compiler.curFunction.ilCode.add("ASG RET " + result);
        compiler.curFunction.ilCode.add("END");
        
        return "";
    }
}
