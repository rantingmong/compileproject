package app.compile.productions;

import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import app.compile.Main;
import app.compile.util.stateMachine;

public class productionTerminal extends production
{

    @Override
    public boolean alsoReadChildren()
    {
        return false;
    }

    @Override
    public boolean isProductionValid(ParseTree pt)
    {
        return pt.getClass() == TerminalNodeImpl.class;
    }

    @Override
    public void process(ParseTree pt, int level, stateMachine state)
    {
        CommonToken pload = (CommonToken)pt.getPayload();
        
        Main.printLine("Terminal symbol: " + pt.getText() + " with type " + inferType(pload.getType()), level);
    }
    
    private String inferType(int input)
    {
        switch (input)
        {
        case 9:
            return "SEMICOLON";
        case 36:
            return "DATA_TYPE";
        case 38:
            return "NUMBER";
        case 39:
            return "STRING";
        default:
            return Integer.toString(input);
        }
    }
}
