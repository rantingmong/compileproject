package app.compile.compiler.converter;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.database.SymbolDatabase;

/**
 * 
 * This class convert AST tree provided by ANTLR to IL-code. This also checks for variables if it is within constraint.
 * 
 * @author micha_000
 *
 */
public abstract class Converter
{
    /**
     * 
     * Indicates if this production should also process child nodes.
     * 
     * @return
     */
    public abstract boolean             processChildren ();
    
    /**
     * 
     * Checks whether a production is for this converter.
     * 
     * @return
     */
    public abstract boolean             productionValid ();
    
    public abstract ArrayList<String>   process         (ParseTree parseTree, Compiler compiler, SymbolDatabase scope);
}
