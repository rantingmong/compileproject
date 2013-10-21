package app.compile.productions;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.Main;
import app.compile.codeParser;

public class productionFunctionDeclaration extends production
{
    @Override
    public boolean alsoReadChildren()
    {
        return true;
    }

    @Override
    public boolean isProductionValid(ParseTree pt)
    {
        return pt.getPayload().getClass() == codeParser.Function_declarationContext.class;
    }

    @Override
    public void process(ParseTree pt, int level)
    {
        Main.printLine("FUNCTION DECLARATION", level);
        
        // 1 3 6 7
        // 1 == name
        // 3 == parameter information
        // 6 == return type
        // 7 == function instructions
        
        // TODO: add this function to the database
    }
}
