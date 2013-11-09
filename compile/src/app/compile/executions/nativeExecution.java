package app.compile.executions;

import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.core.parameterInformation;
import app.compile.core.programDatabase;
import app.compile.core.database.symbolDatabase;

public class nativeExecution extends executionNode
{

    @Override
    public void convert (ParseTree pt)
    {
        // left blank as we don't need this bitch.
    }

    @Override
    public void run     (List<parameterInformation> paramInfo, symbolDatabase capturedScope, programDatabase program)
    {
        
    }
}
