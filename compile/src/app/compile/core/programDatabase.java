package app.compile.core;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.codeDataTypes;
import app.compile.codeParser;
import app.compile.executions.executionNode;

public class programDatabase
{
    private final   List<String>                packageDeclarations;
    private final   List<functionInformation>   functionDeclarations;
    
    private final   ParseTree                   theParseTree;
    
    private         boolean                     mainFunctionFound           = false;
    
    public          	                       	programDatabase             (ParseTree parseTree)
    {
        theParseTree            = parseTree;
        
        packageDeclarations     = new ArrayList<String>();
        functionDeclarations    = new ArrayList<functionInformation>();
    }
    
    public          void                        run                         ()
    {
        doScouting  ();
        doTypeCheck ();
        
        if (mainFunctionFound)
        {
            // run the code   
        }
        else
        {
            // show an error
        }
    }

    private         void                        doScouting                  ()
    {
        for (int i = 0; i < theParseTree.getChildCount(); i++)
        {
            ParseTree entry = theParseTree.getChild(i);
            
            if      (entry.getClass() == codeParser.Package_declarationContext.class)
            {
                packageDeclarations.add(entry.getChild(1).getText());
            }
            else if (entry.getClass() == codeParser.Function_declarationContext.class)
            {
                functionInformation newFunctionInformation                  = new functionInformation();
                                    newFunctionInformation.functionName     = entry.getChild(1).getText();
                                    newFunctionInformation.parameterList    = new ArrayList<parameterInformation>();
                                    newFunctionInformation.statements       = processNodes(entry.getChild(7));
                                    
                ParseTree parseTreeForParameters = entry.getChild(3);

                if (parseTreeForParameters.getChildCount() > 2)
                {
                    for (int p = 0; p < parseTreeForParameters.getChildCount(); p += 3)
                    {
                        ParseTree paramType = parseTreeForParameters.getChild(p);
                        ParseTree paramName = parseTreeForParameters.getChild(p + 1);
                        
                        parameterInformation    newParamInformation                 = new parameterInformation();
                                                newParamInformation.parameterName   = paramName.getText();
                                                newParamInformation.dataType        = convertStringToDatatype(paramType.getText());
                                                
                        newFunctionInformation.parameterList.add(newParamInformation);
                    }
                        
                }
                
                functionDeclarations.add(newFunctionInformation);
            }
            else if (entry.getClass() == codeParser.Main_functionContext.class)
            {
                mainFunctionFound = true;
            }
        }
    }
    
    private         void                        doTypeCheck                 ()
    {
        
    }

    private         List<executionNode>         processNodes                (ParseTree pt)
    {
        ParseTree statements = pt.getChild(1);

        for (int i = 0; i < statements.getChildCount(); i++)
        {
            ParseTree statement = statements.getChild(i);
            
            // process statement accordingly
            
            // we do matching first
            
            // then we convert from parse tree info to execution node info
        }
        
        return null;
    }
    
    private         codeDataTypes               convertStringToDatatype     (String input)
    {
        switch (input.toLowerCase())
        {
        case "nothing":         return codeDataTypes.NOTHING;
        case "whole_number":    return codeDataTypes.WHOLE_NUMBER;
        case "real_number":     return codeDataTypes.REAL_NUMBER;
        case "symbol":          return codeDataTypes.SYMBOL;
        case "characters":      return codeDataTypes.CHARACTERS;
        case "torf":            return codeDataTypes.TORF;
        }
        
        return codeDataTypes.NOTHING;
    }
}
