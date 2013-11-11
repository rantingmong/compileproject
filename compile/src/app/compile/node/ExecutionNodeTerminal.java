package app.compile.node;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import app.compile.core.Program;
import app.compile.core.ProgramState;

import app.compile.parser.codeParser;

public class ExecutionNodeTerminal extends ExecutionNode
{
    @Override
    public boolean  IsValid         (ParseTree entry)
    {
        return entry instanceof TerminalNode;
    }

    @Override
    public void     Evaluate        (Program program, ProgramState state, ParseTree parseTree)
    {
        TerminalNode terminal = (TerminalNode)parseTree;

        switch (terminal.getSymbol().getType())
        {
        case codeParser.TOKEN_OPEN_S:
            
            state.programStack.push("STATEMENT");
            
            break;
        case codeParser.TOKEN_CLOS_S:
            
            state.programStack.pop();
            
            break;
        }
    }

    @Override
    public boolean  ProcessChildren ()
    {
        return true;
    }    
}
