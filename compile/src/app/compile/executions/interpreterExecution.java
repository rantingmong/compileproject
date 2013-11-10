package app.compile.executions;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.core.functionInformation;
import app.compile.core.parameterInformation;
import app.compile.core.programDatabase;
import app.compile.core.database.symbolDatabase;
import app.compile.core.database.symbolDatabaseEntry;
import app.compile.core.database.symbolEntryType;
import app.compile.core.database.symbolEntryValue;
import app.compile.intermediate.intermediateEntry;
import app.compile.productions.production;
import app.compile.productions.productionEntryManager;

public class interpreterExecution extends executionNode
{
    private     functionInformation     functionInformaion;
    
    private     symbolDatabase          functionSymbolDatabase  = null;
    
    private     List<intermediateEntry> intermediateCode        = new ArrayList<intermediateEntry>();
    
    public      interpreterExecution    (functionInformation function)
    {
        this.functionInformaion     = function;
        this.functionSymbolDatabase = new symbolDatabase(this.functionInformaion.functionName, null);
    }
    
    @Override
    public void convert                 (ParseTree pt)
    {
        // get from 1 to (child count - 1)
        for (int i = 0; i < pt.getChildCount(); i++)
        {
            boolean found = false;
            ParseTree entry = pt.getChild(i);

            System.out.println(entry.getClass().getName());
            System.out.println(entry.getText());
            System.out.println("");
            
            // convert each micro-statement to IL code. the productions will be the one who will do that.
            for (production production : productionEntryManager.getInstance().productions)
            {
                if (production.isProductionValid(entry))
                {
                    found = true;
                    intermediateCode.addAll(production.produceProduction(functionInformaion, entry, functionSymbolDatabase));

                    if (production.checkChildren())
                        convert(entry);

                    break;
                }
            }
            
            if (found == false)
            {
                convert(entry);
            }
        }
    }

    @Override
    public void run                     (List<parameterInformation> paramInfo, symbolDatabase capturedScope, programDatabase program)
    {
        
    }
}
