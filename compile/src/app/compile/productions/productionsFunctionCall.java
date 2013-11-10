package app.compile.productions;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.core.functionInformation;
import app.compile.core.database.symbolDatabase;
import app.compile.intermediate.intermediateEntry;
import app.compile.parser.codeParser;

public class productionsFunctionCall extends production
{
    @Override
    public boolean                  isProductionValid   (ParseTree pt)
    {
        return pt.getClass() == codeParser.Function_callContext.class;
    }

    @Override
    public List<intermediateEntry>  produceProduction   (functionInformation functionInfo, ParseTree pt, symbolDatabase database)
    {
        System.out.println("function call!");
        
        // symbol database checks
        
        // 0 function name
        
        // 2 function parameters
        
        ArrayList<intermediateEntry> entries = new ArrayList<intermediateEntry>();
        
        return entries;
    }

    @Override
    public boolean                  checkChildren       ()
    {
        // TODO Auto-generated method stub
        return false;
    }
}
