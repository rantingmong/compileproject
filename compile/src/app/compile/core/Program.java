package app.compile.core;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import app.compile.database.SymbolDatabase;
import app.compile.node.ExecutionNode;
import app.compile.node.ExecutionNodeFunctionCall;
import app.compile.node.ExecutionNodeTerminal;
import app.compile.parser.*;
import app.compile.parser.codeParser.*;

public class Program
{
    private ParseTree                       parseTree;
    
    public ArrayList<String>                packages                = new ArrayList<String>();
    public ArrayList<FunctionInformation>   functionInformation     = new ArrayList<FunctionInformation>();
    
    public ArrayList<ExecutionNode>         availableExecutions     = new ArrayList<ExecutionNode>();
    
    private Group_statementContext          mainFunctionStatement   = null; 
    
    public                                  Program             (ParseTree parseTree)
    {
        this.parseTree = parseTree;
        
        availableExecutions.add(new ExecutionNodeTerminal());
        availableExecutions.add(new ExecutionNodeFunctionCall());
    }
    
    public void                             run                 ()
    {
        // STEP 1: find all functions and packages
        step1();
        
        // STEP 2: in those functions, process the IL code
        step2();
        
            // during this stage, type check, symbol lookup, and other shizz are made
        
        // STEP 3: optimize the IL code
        step3();
        
        // STEP 4: run the program
        step4();
    }

    public void                             processNode         (ProgramState state, ParseTree pt)
    {
        for(ExecutionNode node : availableExecutions)
        {
            if (node.IsValid(pt))
            {
                node.Evaluate(this, state, pt);
                
                if (node.ProcessChildren())
                {
                    for (int i = 0; i < pt.getChildCount(); i++)
                    {
                        processNode(state, pt.getChild(i));
                    }
                }
                
                return;
            }
        }
        
        System.out.println("Production was not recognized. Maybe that production is not yet captured in the interpreter.\n\t" + pt.getText());
        
        for (int i = 0; i < pt.getChildCount(); i++)
        {
            processNode(state, pt.getChild(i));
        }
    }

    private void                            step1               ()
    {
        // in step 1, we find all functions and packages
        for (int i = 0; i < parseTree.getChildCount(); i++)
        {
            ParseTree entry = parseTree.getChild(i);
            
            if      (entry instanceof Package_declarationContext)
            {
                System.out.println("Package declaration.");
                
                TerminalNode packageName = ((Package_declarationContext) entry).getToken(codeParser.STRING, 0);
                packages.add(packageName.getText());
            }
            else if (entry instanceof Function_declarationContext)
            {
                System.out.println("Function declaration.");
                
                Function_declarationContext funcContext = ((Function_declarationContext) entry);

                TerminalNode                    functionName = funcContext.ID();
                TerminalNode                    returnType   = funcContext.TYPE();
                List<Parameter_entryContext>    parameters   = funcContext.parameter().parameter_entry();
                Group_statementContext          statement    = funcContext.group_statement();
                
                FunctionInformation    newFunction = new FunctionInformation();
                
                newFunction.functionName        = functionName.getText();
                newFunction.functionStatements  = statement;
                newFunction.returnType          = Enum.valueOf(DataType.class, returnType.getText().toUpperCase());
                
                for (Parameter_entryContext param : parameters)
                {
                    if (param.TOKEN_NO_PARAM() != null)
                    {
                        System.out.println("Function has no parameters.");
                        
                        break;
                    }
                    else
                    {
                        ParameterInformation paramInfo = new ParameterInformation();
                        
                        paramInfo.parameterName = param.ID().getText();
                        paramInfo.dataType      = Enum.valueOf(DataType.class, param.TYPE().getText().toUpperCase());
                        
                        newFunction.parameterList.add(paramInfo);
                    }
                }
                
                functionInformation.add(newFunction);
            }
            else if (entry instanceof Main_functionContext)
            {
                System.out.println("Main function.");
                
                mainFunctionStatement = ((Main_functionContext)entry).group_statement();
            }
        }
        
        System.out.println("Function discovery complete! Found " + functionInformation.size() + " functions.");
    }

    private void                            step2               ()
    {
        // in step 2, for now, we run the program :O
        
        // create symbol database for main
        SymbolDatabase  database            = new SymbolDatabase();
        
                        database.parent     = null;
                        database.scopeName  = "main";
                        
        // create the program state
        ProgramState    state               = new ProgramState();
                        state.currentScope  = database;
                        
        for (int i = 0; i < mainFunctionStatement.getChildCount(); i++)
        {
            processNode(state, mainFunctionStatement.getChild(i));
        }
    }
    
    private void                            step3               ()
    {
        
    }
    
    private void                            step4               ()
    {
        
    }
}
