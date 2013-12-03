package app.compile.compiler.converter;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.compiler.JalCompiler;
import app.compile.database.SymbolDatabase;
import app.compile.database.SymbolDatabaseEntry;
import app.compile.parser.codeParser;
import app.compile.parser.codeParser.Conditional_CASEContext;
import app.compile.parser.codeParser.Conditional_DEFAULTContext;
import app.compile.parser.codeParser.Conditional_ELSEContext;
import app.compile.parser.codeParser.Conditional_ELSEIFContext;
import app.compile.parser.codeParser.Conditional_IFContext;
import app.compile.parser.codeParser.Conditional_IF_HContext;
import app.compile.parser.codeParser.Conditional_SWITCHContext;
import app.compile.parser.codeParser.Conditional_SWITCH_HContext;
import app.compile.parser.codeParser.Conditional_statementContext;

public class ConverterConditionalStatement extends Converter
{
    @Override
    public boolean productionValid(ParseTree parseTree)
    {
        return parseTree.getClass().equals(codeParser.Conditional_statementContext.class);
    }

    @Override
    public String process(ParseTree parseTree, JalCompiler compiler)
    {
        Conditional_statementContext csc = (Conditional_statementContext)parseTree;
        
        if      (csc.getChild(0) instanceof Conditional_IFContext)
        {
            Conditional_IFContext cic = csc.conditional_IF();
            
            // process the logic for if and else if
            
            // for first if
            Conditional_IF_HContext         one = cic.conditional_IF_H();
            List<Conditional_ELSEIFContext> two = cic.conditional_ELSEIF();
            Conditional_ELSEContext         tri = cic.conditional_ELSE();
            
            String              oneRes = new ConverterLogicalStatement().process(one.logical_statement(), compiler);
            ArrayList<String>   twoRes = new ArrayList<String>(); 
            
            for (Conditional_ELSEIFContext ceifc : two)
            {
                twoRes.add(new ConverterLogicalStatement().process(ceifc.logical_statement(), compiler));
            }
            
            // then lay down the il-code for if statements
            
            compiler.curFunction.ilCode.add("IF " + oneRes);
            
            SymbolDatabase  database        = new SymbolDatabase();
                            database.parent = compiler.currentScope;

            compiler.currentScope = database;
                            
            new ConverterGroupStatement().process(one.group_statement(), compiler);

            compiler.currentScope = database.parent;

            int i = 0;
            
            for (String elseif : twoRes)
            {
                compiler.curFunction.ilCode.add("ELSEIF " + elseif);

                SymbolDatabase  indb        = new SymbolDatabase();
                                indb.parent = compiler.currentScope;

                compiler.currentScope = indb;

                new ConverterGroupStatement().process(two.get(i++).group_statement(), compiler);

                compiler.currentScope = indb.parent;
            }
            
            if (tri != null)
            {
                compiler.curFunction.ilCode.add("ELSE");

                SymbolDatabase  indb        = new SymbolDatabase();
                                indb.parent = compiler.currentScope;

                compiler.currentScope = indb;
                                
                new ConverterGroupStatement().process(tri.group_statement(), compiler);

                compiler.currentScope = indb.parent;
            }
            
            compiler.curFunction.ilCode.add("ENDIF");
        }
        else if (csc.getChild(0) instanceof Conditional_SWITCHContext)
        {
            Conditional_SWITCHContext       cxc = csc.conditional_SWITCH();
            
            Conditional_SWITCH_HContext     one = cxc.conditional_SWITCH_H();
            List<Conditional_CASEContext>   two = cxc.conditional_CASE();
            Conditional_DEFAULTContext      tri = cxc.conditional_DEFAULT();

            SymbolDatabaseEntry entry = compiler.currentScope.find(one.ID().getText());
            
            if (entry == null)
            {
                // TODO: error handling
                
                return null;
            }
            
            String var = "var" + compiler.curFunction.newVariable();
            compiler.curFunction.ilCode.add("DEC " + var + " NOTHING");
            compiler.curFunction.ilCode.add("ASG " + var + " " + entry.ilName);
            
            ArrayList<String> results = new ArrayList<String>();
            
            for (Conditional_CASEContext casec : two)
            {
                String inVar = "var" + compiler.curFunction.newVariable();
                
                compiler.curFunction.ilCode.add("DEC " + inVar + " NOTHING");
                compiler.curFunction.ilCode.add("EQL " + casec.conditional_CASE_CONST().getText() + " " + var + " " + inVar);
                
                results.add(inVar);
            }
            
            compiler.curFunction.ilCode.add("SWITCH");
            
            int i = 0;
            
            for (Conditional_CASEContext casec : two)
            {
                compiler.curFunction.ilCode.add("CASE " + results.get(i++));

                SymbolDatabase  indb        = new SymbolDatabase();
                                indb.parent = compiler.currentScope;

                compiler.currentScope = indb;
                                
                new ConverterGroupStatement().process(casec.group_statement(), compiler);

                compiler.currentScope = indb.parent;
            }
            
            if (tri != null)
            {
                compiler.curFunction.ilCode.add("DEFAULT");

                SymbolDatabase  indb        = new SymbolDatabase();
                                indb.parent = compiler.currentScope;

                compiler.currentScope = indb;
                                
                new ConverterGroupStatement().process(tri.group_statement(), compiler);

                compiler.currentScope = indb.parent;
            }
            
            compiler.curFunction.ilCode.add("ENDSWITCH");
        }
        
        return "";
    }
}
