package app.compile.node;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.core.FunctionInformation;
import app.compile.core.ParameterInformation;
import app.compile.core.Program;
import app.compile.core.ProgramState;
import app.compile.database.SymbolDatabase;
import app.compile.database.SymbolDatabaseEntry;
import app.compile.database.SymbolDatabaseEntryType;
import app.compile.parser.codeParser.Function_argumentsContext;
import app.compile.parser.codeParser.Function_callContext;
import app.compile.parser.codeParser.Logical_statementContext;

public class ExecutionNodeFunctionCall extends ExecutionNode
{
    @Override
    public boolean  IsValid         (ParseTree entry)
    {
        return entry instanceof Function_callContext;
    }

    @Override
    public void     Evaluate        (Program program, ProgramState state, ParseTree parseTree)
    {
        System.out.println("Evaluating function call.");
        
        Function_callContext functionCall = (Function_callContext)parseTree;
        
        boolean             found           = false;
        FunctionInformation callingFunction = null;
        
        // check if function is in the program
        for (FunctionInformation function : program.functionInformation)
        {
            if (function.functionName.equals(functionCall.ID().getText()))
            {
                found           = true;
                callingFunction = function;
                
                break;
            }
        }
        
        if (found == false)
        {
            System.err.println("Function " + functionCall.ID().getText() + " cannot be found!");
        }
        else
        {
            System.out.println("Function found!");

            // create the symbol database for this function
            SymbolDatabase database = new SymbolDatabase();
            
            database.parent     = state.currentScope;
            database.scopeName  = callingFunction.functionName;
            
            // process any arguments that are in the function call
            Function_argumentsContext               arguments               = functionCall.function_arguments();
            ExecutionNodeLogicalStatementExpression logicalStatementNode    = new ExecutionNodeLogicalStatementExpression();
            
            for(Logical_statementContext logicContext : arguments.logical_statement())
            {
                ParameterInformation paramInfo = callingFunction.parameterList.get(arguments.logical_statement().indexOf(logicContext));
                
                logicalStatementNode.Evaluate(program, state, logicContext);
                
                SymbolDatabaseEntry paramEntry = new SymbolDatabaseEntry();
                
                paramEntry.name         = paramInfo.parameterName;
                
                paramEntry.dataType     = paramInfo.dataType;
                paramEntry.dataValue    = state.returnValue;
                
                paramEntry.entryType    = SymbolDatabaseEntryType.ARGUMENT;
                
                database.entries.add(paramEntry);
            }
            
            state.currentScope  = database;
            state.returnValue   = null;
            
            // get the function's statements and run it here.
            program.processNode(state, callingFunction.functionStatements);
            
            // restore the context before the function call
            if (database.parent == null)
                System.err.println("Parent symbol database is null!");

            // restore scope to parent scope
            state.currentScope = database.parent;
        }
    }

    @Override
    public boolean  ProcessChildren ()
    {
        return false;
    }
}
