package app.compile.compiler.converter;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.database.SymbolDatabase;
import app.compile.parser.codeParser;
import app.compile.parser.codeParser.Function_callContext;
import app.compile.parser.codeParser.Logical_statementContext;

public class ConverterFunctionCall extends Converter
{
    @Override
    public boolean processChildren()
    {
        return false;
    }

    @Override
    public boolean productionValid(ParseTree parseTree)
    {
        return parseTree.getClass().equals(codeParser.Function_callContext.class);
    }

    @Override
    public ConverterResult process(ParseTree parseTree, Compiler compiler, SymbolDatabase scope)
    {
        // TODO: check if function exists
        
        // TODO: check for parameter correctness
        
        // TODO: get return type of function
        
        ArrayList<String>                   result  = new ArrayList<String>();
        Function_callContext                fcc     = (Function_callContext) parseTree;
        ArrayList<Logical_statementContext> args    = new ArrayList<codeParser.Logical_statementContext>(fcc.function_arguments().logical_statement());

        // for each parameter, do ASG param(n) <result of param>
        int i = 0;
        for (Logical_statementContext arg : args)
        {
            ConverterResult value = new ConverterLogicalStatement().process(arg, compiler, scope);
            result.add("ASG param" + (i++) + " " + value.variableHandle);
        }
        
        result.add("CAL " + fcc.ID().getText());

        // we're doing this just in case there's multiple function calls going
        // back and forth.
        // obviously i'll add an if statement here if the function returns
        // nothing.
        result.add("ASG temp0 RET"); // TODO: define what variable this would
                                     // return

        ConverterResult cr = new ConverterResult();
        cr.emmittedCode = result;

        cr.variableHandle = "temp0"; // TODO: define what variable this would
                                     // return
        return cr;
    }
}
