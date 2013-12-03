package app.compile.compiler.converter;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.compiler.JalCompiler;
import app.compile.core.FunctionInformation;
import app.compile.database.SymbolDatabase;
import app.compile.parser.codeParser;
import app.compile.parser.codeParser.Function_declarationContext;
import app.compile.parser.codeParser.Parameter_entryContext;

public class ConverterFunctionDeclaration extends Converter
{
    @Override
    public boolean processChildren()
    {
        return false;
    }

    @Override
    public boolean productionValid(ParseTree parseTree)
    {
        return parseTree.getClass().equals(codeParser.Function_declarationContext.class);
    }

    @Override
    public String process(ParseTree parseTree, JalCompiler compiler, SymbolDatabase scope)
    {
        Function_declarationContext functionDeclaration = (Function_declarationContext)parseTree;
        
        FunctionInformation         newFunction         = new FunctionInformation();
        StringBuilder               returnString        = new StringBuilder();
        
        compiler.curFunction        = newFunction;
        
        returnString.append("FUNCTION");
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
        }
        
        returnString.append("]");
        
        compiler.curFunction.ilCode.add(returnString.toString());
        
        // TODO: emit the code for this function

        compiler.curFunction.ilCode.add("END");

        return "";
    }
}
