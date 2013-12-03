package app.compile.compiler.converter;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.compiler.JalCompiler;
import app.compile.parser.codeParser;
import app.compile.parser.codeParser.Function_callContext;
import app.compile.parser.codeParser.Logical_statementContext;

public class ConverterFunctionCall extends Converter
{
    @Override
    public boolean productionValid(ParseTree parseTree)
    {
        return parseTree.getClass().equals(codeParser.Function_callContext.class);
    }

    @Override
    public String process(ParseTree parseTree, JalCompiler compiler)
    {
        // TODO: check if function exists
        
        // TODO: check for parameter correctness
        
        // TODO: get return type of function

        Function_callContext                fcc     = (Function_callContext) parseTree;
        ArrayList<Logical_statementContext> args    = new ArrayList<codeParser.Logical_statementContext>(fcc.function_arguments().logical_statement());

        // for each parameter, do ASG param(n) <result of param>
        int i = 0;
        for (Logical_statementContext arg : args)
        {
            String value = new ConverterLogicalStatement().process(arg, compiler);
            compiler.curFunction.ilCode.add("ASG param" + (i++) + " " + value);
        }
        
        compiler.curFunction.ilCode.add("CAL " + fcc.ID().getText());

        String retVal = "val" + compiler.curFunction.newVariable();
        
        // we're doing this just in case there's multiple function calls going back and forth.
        // obviously i'll add an if statement here if the function returns nothing.
        compiler.curFunction.ilCode.add("ASG " + retVal + " RET");

        return retVal; //TODO: define what variable this would return
    }
}
