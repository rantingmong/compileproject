package app.compile.productions;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.executions.executionNode;
import app.compile.parser.codeParser;

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
	public executionNode produceProduction(ParseTree pt) {
		
		return null;
	}
}
