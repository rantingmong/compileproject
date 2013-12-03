package app.compile.compiler.converter;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.compiler.JalCompiler;
import app.compile.database.SymbolDatabase;
import app.compile.parser.codeParser;
import app.compile.parser.codeParser.Assignment_statementContext;

public class ConverterAssignment extends Converter
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
        return parseTree.getClass().equals(codeParser.Assignment_statementContext.class);
    }

    @Override
    public String process(ParseTree parseTree, JalCompiler compiler, SymbolDatabase scope)
    {
        Assignment_statementContext asc = (Assignment_statementContext)parseTree;

        // ID IS <logical statement>
        String var                      = "var" + compiler.curFunction.newVariable();
        String logicalStatementResult   = new ConverterLogicalStatement().process(asc.logical_statement(), compiler, scope);

        compiler.curFunction.ilCode.add("ASG " + var + logicalStatementResult);

        return "";
    }
}
