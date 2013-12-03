package app.compile.compiler.converter;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.compiler.JalCompiler;
import app.compile.core.DataType;
import app.compile.core.FunctionInformation;
import app.compile.core.ParameterInformation;
import app.compile.database.SymbolDatabase;
import app.compile.database.SymbolDatabaseEntry;
import app.compile.parser.codeParser;
import app.compile.parser.codeParser.Function_declarationContext;
import app.compile.parser.codeParser.Parameter_entryContext;

public class ConverterFunctionDeclaration extends Converter
{
    @Override
    public boolean productionValid(ParseTree parseTree)
    {
        return parseTree.getClass().equals(codeParser.Function_declarationContext.class);
    }

    @Override
    public String process(ParseTree parseTree, JalCompiler compiler)
    {
        Function_declarationContext functionDeclaration = (Function_declarationContext)parseTree;

        SymbolDatabase              functionDatabase            = new SymbolDatabase();
                                    functionDatabase.parent     = compiler.currentScope;

        FunctionInformation         newFunction                 = new FunctionInformation();
                                    newFunction.functionName    = functionDeclaration.ID().getText();
                                    newFunction.isNative        = false;
                                    newFunction.returnType      = Enum.valueOf(DataType.class, functionDeclaration.TYPE().getText().toUpperCase());

        StringBuilder               returnString                = new StringBuilder();

        compiler.currentScope       = functionDatabase;
        compiler.curFunction        = newFunction;

        compiler.functionList.add(newFunction);

        returnString.append("FUNCTION ");
        returnString.append(functionDeclaration.ID().getText());
        
        returnString.append("[");
        
        // param list
        ArrayList<Parameter_entryContext> paramList = new ArrayList<codeParser.Parameter_entryContext>(functionDeclaration.parameter().parameter_entry());

        for (int i = 0; i < paramList.size(); i++)
        {
            returnString.append(paramList.get(i).TYPE().getText());
            
            if (i < (paramList.size() - 1))
            {
                returnString.append(", ");
            }
            
            // add to scope the arguments
            SymbolDatabaseEntry argEntry            = new SymbolDatabaseEntry();
                                
                                argEntry.ilName     = "arg" + i;
                                argEntry.name       = paramList.get(i).ID().getText();
                                argEntry.dataType   = Enum.valueOf(DataType.class, paramList.get(i).TYPE().getText().toUpperCase());
                                
            functionDatabase.entries.add(argEntry);
            
            ParameterInformation paramInfo                  = new ParameterInformation();
            
                                 paramInfo.dataType         = argEntry.dataType;
                                 paramInfo.parameterName    = argEntry.name;
                                 
             newFunction.parameterList.add(paramInfo);
        }
        
        returnString.append("] " + functionDeclaration.TYPE().getText());

        compiler.curFunction.ilCode.add(returnString.toString());

        new ConverterGroupStatement().process(functionDeclaration.group_statement(), compiler);

        compiler.curFunction.ilCode.add("END");
        compiler.currentScope = functionDatabase.parent;

        return "";
    }
}
