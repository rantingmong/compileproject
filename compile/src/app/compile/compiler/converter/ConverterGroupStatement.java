package app.compile.compiler.converter;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.compiler.JalCompiler;
import app.compile.parser.codeParser;
import app.compile.parser.codeParser.Group_statementContext;
import app.compile.parser.codeParser.StatementContext;

public class ConverterGroupStatement extends Converter
{
    @Override
    public boolean productionValid(ParseTree parseTree)
    {
        // TODO Auto-generated method stub
        return parseTree.getClass().equals(codeParser.Group_statementContext.class);
    }

    @Override
    public String process(ParseTree parseTree, JalCompiler compiler)
    {
        Group_statementContext gsc = (Group_statementContext)parseTree;
        
        for (StatementContext statement : new ArrayList<StatementContext>(gsc.statement()))
        {
            new ConverterStatement().process(statement, compiler);
        }
        
        return "";
    }
}
