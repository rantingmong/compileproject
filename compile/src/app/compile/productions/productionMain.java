package app.compile.productions;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.Main;
import app.compile.codeParser;

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
        return pt.getPayload().getClass() == codeParser.Main_functionContext.class;
    }

    @Override
    public void process(ParseTree pt, int level)
    {
        Main.printLine("MAIN FUNCTION", level);
    }
}
