package app.compile.productions;

import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.core.functionInformation;
import app.compile.core.database.symbolDatabase;
import app.compile.intermediate.intermediateEntry;

/**
 * What this does is to convert micro-expressions (eg: if statements) to IL code.
 * 
 * A production captures IF-ELSEIF-ELSE, CHOOSE, REPEAT, FUNCTION_CALL, DECLARATION, ASSIGNMENT statements.
 * Serialization of logical and arithmetic expressions will be handled to another class
 * (and that is I dunno yet.)
 * 
 */
public abstract class production
{
    public abstract boolean                 checkChildren           ();
    
    /**
     * Checks if this production entry should process the parse tree given.
     * 
     * @param pt The parse tree to check.
     * @return True if this production will process the parse tree. Otherwise, false.
     */
    public abstract boolean                 isProductionValid       (ParseTree pt);
   
    /**
     * Converts the production to IL code.
     * 
     * @param pt The parse tree to check.
     * @param database The symbol database for the function.
     * @return The IL code emitted.
     */
    public abstract List<intermediateEntry> produceProduction       (functionInformation functioInfo, ParseTree pt, symbolDatabase database);
}
