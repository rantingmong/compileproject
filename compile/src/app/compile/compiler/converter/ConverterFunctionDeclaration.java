package app.compile.compiler.converter;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.database.SymbolDatabase;
import app.compile.parser.codeParser;
import app.compile.parser.codeParser.Function_declarationContext;
import app.compile.parser.codeParser.Parameter_entryContext;

public class ConverterFunctionDeclaration extends Converter
{

    @Override
    public boolean processChildren()
    {
        return true;
    }

    @Override
    public boolean productionValid(ParseTree parseTree)
    {
        return parseTree.getClass().equals(codeParser.Function_declarationContext.class);
    }

    @Override
    public ConverterResult process(ParseTree parseTree, Compiler compiler, SymbolDatabase scope)
    {
        ArrayList<String>           result              = new ArrayList<String>();
        Function_declarationContext functionDeclaration = (Function_declarationContext)parseTree;
        
        StringBuilder               returnString        = new StringBuilder();
        
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
        
        result.add(returnString.toString());
        
        ConverterResult cr              = new ConverterResult();
                        cr.emmittedCode = result;
        
        return cr;
    }
}
