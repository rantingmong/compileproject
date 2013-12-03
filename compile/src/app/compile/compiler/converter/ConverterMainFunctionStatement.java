package app.compile.compiler.converter;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.compiler.JalCompiler;
import app.compile.core.DataType;
import app.compile.core.FunctionInformation;
import app.compile.database.SymbolDatabase;
import app.compile.parser.codeParser;
import app.compile.parser.codeParser.Main_functionContext;

public class ConverterMainFunctionStatement extends Converter
{
    @Override
    public boolean productionValid(ParseTree parseTree)
    {
        return parseTree.getClass().equals(codeParser.Main_functionContext.class);
    }

    @Override
    public String process(ParseTree parseTree, JalCompiler compiler)
    {
        Main_functionContext functionDeclaration = (Main_functionContext)parseTree;

        SymbolDatabase              functionDatabase            = new SymbolDatabase();
                                    functionDatabase.parent     = compiler.currentScope;

        FunctionInformation         newFunction                 = new FunctionInformation();
                                    newFunction.functionName    = "main";
                                    newFunction.isNative        = false;
                                    newFunction.returnType      = DataType.NOTHING;

        StringBuilder               returnString                = new StringBuilder();

        compiler.currentScope       = functionDatabase;
        compiler.curFunction        = newFunction;

        compiler.functionList.add(newFunction);

        returnString.append("FUNCTION main [] " + DataType.NOTHING);

        compiler.curFunction.ilCode.add(returnString.toString());

        new ConverterGroupStatement().process(functionDeclaration.group_statement(), compiler);

        compiler.curFunction.ilCode.add("END");
        compiler.currentScope = functionDatabase.parent;

        return "";
    }
}
