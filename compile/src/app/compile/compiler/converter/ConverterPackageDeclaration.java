package app.compile.compiler.converter;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.compiler.JalCompiler;
import app.compile.parser.codeParser;

public class ConverterPackageDeclaration extends Converter
{
    @Override
    public boolean          productionValid (ParseTree parseTree)
    {
        return parseTree.getClass().equals(codeParser.Package_declarationContext.class);
    }

    @Override
    public String           process         (ParseTree parseTree, JalCompiler compiler)
    {
        // just inform the compiler that we also have to compile the file.
        
        return null;
    }
}
