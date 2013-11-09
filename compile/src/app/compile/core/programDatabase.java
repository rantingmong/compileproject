package app.compile.core;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.core.database.symbolDatabase;
import app.compile.core.database.symbolDatabaseManager;
import app.compile.executions.executionNode;
import app.compile.parser.codeParser;
import app.compile.productions.production;

public class programDatabase
{
    private final List<String>              packageDeclarations;
    private final List<functionInformation> functionDeclarations;

    private final List<production>          productionList;

    private final ParseTree                 theParseTree;

    private boolean                         mainFunctionFound = false;

    public programDatabase(ParseTree parseTree)
    {
        theParseTree = parseTree;

        productionList = new ArrayList<production>();

        packageDeclarations = new ArrayList<String>();
        functionDeclarations = new ArrayList<functionInformation>();
    }

    public void run()
    {
        process();

        if (mainFunctionFound)
        {
            // run the code
        } else
        {
            // show an error
        }
    }

    private void process()
    {
        for (int i = 0; i < theParseTree.getChildCount(); i++)
        {
            ParseTree entry = theParseTree.getChild(i);

            if (entry.getClass() == codeParser.Package_declarationContext.class)
            {
                packageDeclarations.add(entry.getChild(1).getText());
            } else if (entry.getClass() == codeParser.Function_declarationContext.class)
            {
                functionInformation newFunctionInformation = new functionInformation();

                newFunctionInformation.functionName = entry.getChild(1).getText();
                newFunctionInformation.parameterList = new ArrayList<parameterInformation>();

                ParseTree parseTreeForParameters = entry.getChild(3);

                if (parseTreeForParameters.getChildCount() > 2)
                {
                    for (int p = 0; p < parseTreeForParameters.getChildCount(); p += 3)
                    {
                        ParseTree paramType = parseTreeForParameters.getChild(p);
                        ParseTree paramName = parseTreeForParameters.getChild(p + 1);

                        parameterInformation newParamInformation = new parameterInformation();

                        newParamInformation.parameterName = paramName.getText();
                        newParamInformation.dataType = convertStringToDatatype(paramType.getText());

                        newFunctionInformation.parameterList.add(newParamInformation);
                    }
                }

                functionDeclarations.add(newFunctionInformation);
            } else if (entry.getClass() == codeParser.Main_functionContext.class)
            {
                mainFunctionFound = true;
            }
        }
    }

    private dataTypes convertStringToDatatype(String input)
    {
        switch (input.toLowerCase())
        {
        case "nothing":
            return dataTypes.NOTHING;
        case "whole_number":
            return dataTypes.WHOLE_NUMBER;
        case "real_number":
            return dataTypes.REAL_NUMBER;
        case "symbol":
            return dataTypes.SYMBOL;
        case "characters":
            return dataTypes.CHARACTERS;
        case "torf":
            return dataTypes.TORF;
        }

        return dataTypes.NOTHING;
    }
}
