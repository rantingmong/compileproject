package app.compile.productions;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.Main;
import app.compile.codeParser;
import app.compile.core.symbolDatabaseManager;
import app.compile.util.stateMachine;

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
        return pt.getClass() == codeParser.Function_declarationContext.class;
    }

    @Override
    public void process(ParseTree pt, int level, stateMachine state)
    {       
        String functionName = pt.getChild(1).getText();
        String returnType   = pt.getChild(6).toStringTree();
        
        Main.printLine("FUNCTION DECLARATION " + functionName + " WITH RETURN TYPE " + returnType, level);
        
        // SWITCH STATE MACHINE TO FUNCTION
        state.setCurrentState(stateMachine.STATE_FUNCTION);
        state.setCurrentScope("FUNCTION_" + functionName);
        
        // 1 3 6 7
        // 1 == name
        // 3 == parameter information
        // 6 == return type
        // 7 == function instructions
        
        // TODO: add this function to the database
    }
}
