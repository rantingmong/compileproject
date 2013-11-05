package app.compile.productions;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.Main;
import app.compile.codeParser;
import app.compile.util.stateMachine;

public class productionPackageDeclaration extends production
{
    @Override
    public boolean alsoReadChildren()
    {
        return true;
    }

    @Override
    public boolean isProductionValid(ParseTree pt)
    {
        return pt.getClass() == codeParser.Package_declarationContext.class;
    }

    @Override
    public void process(ParseTree pt, int level, stateMachine state)
    {
        Main.printLine("PACKAGE DECLARATION: " +  pt.getChild(1).getText(), level);
    }
}
