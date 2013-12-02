package app.compile.compiler.converter;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.database.SymbolDatabase;
import app.compile.parser.codeParser;

public class ConvertPackageDeclaration extends Converter
{
    @Override
    public boolean          processChildren ()
    {
        return false;
    }

    @Override
    public boolean          productionValid (ParseTree parseTree)
    {
        return parseTree.getClass().equals(codeParser.Package_declarationContext.class);
    }

    @Override
    public ConverterResult  process         (ParseTree parseTree, Compiler compiler, SymbolDatabase scope)
    {
        // just inform the compiler that we also have to compile the file.
        
        return null;
    }
}
