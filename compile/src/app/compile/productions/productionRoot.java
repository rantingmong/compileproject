package app.compile.productions;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.Main;
import app.compile.codeParser;

public class productionRoot extends production
{
    @Override
    public boolean alsoReadChildren()
    {
        return true;
    }

    @Override
    public boolean isProductionValid(ParseTree pt)
    {
        return pt.getPayload().getClass() == codeParser.SContext.class;
    }

    @Override
    public void process(ParseTree pt, int level)
    {
        Main.printLine("ROOT", level);
    }
}
