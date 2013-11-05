package app.compile.productions;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.Main;
import app.compile.codeParser;
import app.compile.util.stateMachine;

public class productionMain extends production
{
    @Override
    public boolean alsoReadChildren()
    {
        return true;
    }

    @Override
    public boolean isProductionValid(ParseTree pt)
    {
        return pt.getClass() == codeParser.Main_functionContext.class;
    }

    @Override
    public void process(ParseTree pt, int level, stateMachine state)
    {
        Main.printLine("MAIN FUNCTION", level);
    }
}
