package app.compile.compiler.converter;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.compiler.JalCompiler;
import app.compile.core.DataType;
import app.compile.database.SymbolDatabaseEntry;
import app.compile.database.SymbolDatabaseEntryType;
import app.compile.parser.codeParser;
import app.compile.parser.codeParser.Declare_statementContext;

public class ConverterDeclaration extends Converter
{
    @Override
    public boolean productionValid(ParseTree parseTree)
    {
        // TODO Auto-generated method stub
        return parseTree.getClass().equals(codeParser.Declare_statementContext.class);
    }

    @Override
    public String process(ParseTree parseTree, JalCompiler compiler)
    {
        Declare_statementContext dsc = (Declare_statementContext)parseTree;

        String var = "var" + compiler.curFunction.newVariable();
        String typ = dsc.TYPE().getText();
        
        if (compiler.currentScope.find(dsc.ID().getText()) != null)
        {
            // TODO: error handling
            return null;
        }
        
        SymbolDatabaseEntry newEntry = new SymbolDatabaseEntry();
        
        newEntry.name       = dsc.ID().getText();
        newEntry.dataType   = Enum.valueOf(DataType.class, typ.toUpperCase());
        
        newEntry.entryType  = SymbolDatabaseEntryType.VARIABLE;
        
        newEntry.ilName     = var;

        compiler.currentScope.entries.add(newEntry);

        compiler.curFunction.ilCode.add("DEC " + var + " " + typ);

        if (dsc.logical_statement() != null)
        {
            String res = new ConverterLogicalStatement().process(dsc.logical_statement(), compiler);
            compiler.curFunction.ilCode.add("ASG " + var + " " + res);
        }
        
        return "";
    }
}
