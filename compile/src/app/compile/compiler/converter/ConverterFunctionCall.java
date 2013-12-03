package app.compile.compiler.converter;

import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.compiler.JalCompiler;
import app.compile.core.DataType;
import app.compile.core.FunctionInformation;
import app.compile.database.SymbolDatabaseEntry;
import app.compile.parser.codeParser;
import app.compile.parser.codeParser.Function_callContext;
import app.compile.parser.codeParser.Logical_statementContext;
import app.compile.util.ErrorReporter;
import app.compile.util.ValueGetter;

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
        Function_callContext                fcc     = (Function_callContext) parseTree;
        ArrayList<Logical_statementContext> args    = new ArrayList<codeParser.Logical_statementContext>(fcc.function_arguments().logical_statement());

        FunctionInformation                 fin     = compiler.getFunction(fcc.ID().getText());

        if (!compiler.findFunction(fcc.ID().getText()))
        {
            ErrorReporter.reportError(fcc.ID().getSymbol(), "Function not found: " + fcc.ID().getText());
            return null;
        }

        // TODO: check for parameter correctness
        
        ArrayList<String> result = new ArrayList<String>(); 
        
        int i = 0;
        
        for (Logical_statementContext arg: args)
        {
            // evaluate the statement
            String ret = new ConverterLogicalStatement().process(arg, compiler);
            result.add(ret);
            
            // we then check for parameter correctness
            SymbolDatabaseEntry argEntry = compiler.currentScope.find(ret, true);

            DataType adt = fin.parameterList.get(i).dataType;
            DataType gdt; 
            
            if (argEntry == null)
            {
                // only happens when the value is a constant
                gdt = ValueGetter.inferType(ret);
            }
            else
            {
                gdt = argEntry.dataType;
            }
            
            if (adt != gdt)
            {
                ErrorReporter.reportError(arg.start, "Parameter mismatch! Expecting type " + adt + " but type " + gdt + " was used instead.");
                
                return null;
            }
        }
        
        i = 0;

        // for each parameter, do ASG param(n) <result of param>
        for (String arg : result)
        {
            compiler.curFunction.ilCode.add("ASG param" + i + " " + arg);

            i++;
        }
        
        compiler.curFunction.ilCode.add("CAL " + fcc.ID().getText());

        String retVal = "var" + compiler.curFunction.newVariable();
        
        // we're doing this just in case there's multiple function calls going back and forth.
        // obviously i'll add an if statement here if the function returns nothing.
        if (fin.returnType != DataType.NOTHING)
        {
            compiler.curFunction.ilCode.add("DEC " + retVal + " " + fin.returnType); // TODO: infer type
            compiler.curFunction.ilCode.add("ASG " + retVal + " RET");
            
            SymbolDatabaseEntry newEntry            = new SymbolDatabaseEntry();
                                newEntry.ilName     = retVal;
                                newEntry.dataType   = fin.returnType;
                                
            compiler.currentScope.entries.add(newEntry);
        }

        return retVal;
    }
}
