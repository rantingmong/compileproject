package app.compile.compiler.converter;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.compiler.JalCompiler;
import app.compile.parser.codeParser;
import app.compile.parser.codeParser.Package_declarationContext;

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
        Package_declarationContext pdc = (Package_declarationContext)parseTree;
        
        String packageName = pdc.STRING().getText();
        
        if (!packageName.equals("standard")  &&
            !packageName.equals("math")      &&
            !packageName.equals("arrays"))
        {
            
        }

        return null;
    }
}
