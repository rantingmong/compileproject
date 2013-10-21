package app.compile.productions;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.Main;
import app.compile.codeParser;

public class productionPackageDeclaration extends production
{
    @Override
    public boolean alsoReadChildren()
    {
        return false;
    }

    @Override
    public boolean isProductionValid(ParseTree pt)
    {
        return pt.getPayload().getClass() == codeParser.Package_declarationContext.class;
    }

    @Override
    public void process(ParseTree pt, int level)
    {
        Main.printLine("PACKAGE DECLARATION: " +  pt.getChild(1).getText(), level);
    }
}
