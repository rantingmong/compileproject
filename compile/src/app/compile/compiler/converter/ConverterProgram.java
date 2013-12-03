package app.compile.compiler.converter;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.compiler.JalCompiler;
import app.compile.parser.codeParser.Function_declarationContext;
import app.compile.parser.codeParser.Package_declarationContext;
import app.compile.parser.codeParser.SContext;

public class ConverterProgram extends Converter
{
    @Override
    public boolean productionValid(ParseTree parseTree)
    {
        return false;
    }

    @Override
    public String process(ParseTree parseTree, JalCompiler compiler)
    {
        SContext start = (SContext)parseTree;
        
        for (Package_declarationContext packageDec : start.package_declaration())
        {
            new ConverterPackageDeclaration().process(packageDec, compiler);
        }
        
        for (Function_declarationContext functionDec : start.function_declaration())
        {
            new ConverterFunctionDeclaration().process(functionDec, compiler);
        }

        return "";
    }
}
