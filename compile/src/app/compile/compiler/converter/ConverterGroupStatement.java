package app.compile.compiler.converter;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.compiler.JalCompiler;
import app.compile.database.SymbolDatabase;
import app.compile.parser.codeParser;
import app.compile.parser.codeParser.Group_statementContext;
import app.compile.parser.codeParser.StatementContext;

public class ConverterGroupStatement extends Converter
{
    @Override
    public boolean productionValid(ParseTree parseTree)
    {
        return parseTree.getClass().equals(codeParser.Group_statementContext.class);
    }

    @Override
    public String process(ParseTree parseTree, JalCompiler compiler)
    {
        SymbolDatabase  database        = new SymbolDatabase();
                        database.parent = compiler.currentScope;

        Group_statementContext gsc = (Group_statementContext)parseTree;
        
        for (StatementContext statement : gsc.statement())
        {
            new ConverterStatement().process(statement, compiler);
        }

                  compiler.currentScope = database.parent;
        
        return "";
    }
}
