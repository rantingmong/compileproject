package app.compile.productions;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import app.compile.executions.executionNode;

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
	public executionNode produceProduction(ParseTree pt) {
		
		return null;
	}
}
