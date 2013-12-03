package app.compile.compiler.converter;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.compiler.JalCompiler;
import app.compile.database.SymbolDatabaseEntry;
import app.compile.parser.codeParser;
import app.compile.parser.codeParser.Assignment_statementContext;
import app.compile.util.ErrorReporter;

public class ConverterAssignment extends Converter
{
    @Override
    public boolean productionValid(ParseTree parseTree)
    {
        // TODO Auto-generated method stub
        return parseTree.getClass().equals(codeParser.Assignment_statementContext.class);
    }

    @Override
    public String process(ParseTree parseTree, JalCompiler compiler)
    {
        Assignment_statementContext asc     = (Assignment_statementContext)parseTree;
        SymbolDatabaseEntry         entry   = compiler.currentScope.find(asc.ID().getText(), true);

        if (entry == null)
        {
            ErrorReporter.reportError(asc.ID().getSymbol(), "Variable not found: " + asc.ID().getText());
            return null;
        }
        
        // ID IS <logical statement>
        String                      lsr     = new ConverterLogicalStatement().process(asc.logical_statement(), compiler);

        compiler.curFunction.ilCode.add("ASG " + entry.ilName + lsr);

        return "";
    }
}
