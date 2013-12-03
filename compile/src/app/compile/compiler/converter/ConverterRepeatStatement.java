package app.compile.compiler.converter;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.compiler.JalCompiler;
import app.compile.database.SymbolDatabase;
import app.compile.parser.codeParser.Loop_DO_WHILEContext;
import app.compile.parser.codeParser.Loop_WHILEContext;
import app.compile.parser.codeParser.Loop_forContext;
import app.compile.parser.codeParser.Loop_statementContext;

public class ConverterRepeatStatement extends Converter
{
    @Override
    public boolean productionValid(ParseTree parseTree)
    {
        return parseTree.getClass().equals(Loop_statementContext.class);
    }

    @Override
    public String process(ParseTree parseTree, JalCompiler compiler)
    {
        Loop_statementContext lsc = (Loop_statementContext)parseTree;

        if      (lsc.getChild(0) instanceof Loop_forContext)
        {
            
        }
        else if (lsc.getChild(0) instanceof Loop_WHILEContext)
        {
            
        }
        else if (lsc.getChild(0) instanceof Loop_DO_WHILEContext)
        {
            Loop_DO_WHILEContext ldwc = (Loop_DO_WHILEContext)lsc.getChild(0);
            
            String chk = "var" + compiler.curFunction.newVariable();
            compiler.curFunction.ilCode.add("DEC " + chk + " TORF");
            
            String jmp = "jmp" + compiler.curFunction.newJump();
            
            compiler.curFunction.ilCode.add(jmp + ":");
            
            SymbolDatabase  database        = new SymbolDatabase();
                            database.parent = compiler.currentScope;

            new ConverterGroupStatement().process(ldwc.group_statement(), compiler);

            compiler.currentScope = database.parent;
            
            String ret = new ConverterLogicalStatement().process(ldwc.logical_statement(), compiler);

            compiler.curFunction.ilCode.add("ASG " + chk + " " + ret);
            compiler.curFunction.ilCode.add("JMP " + chk + " " + jmp);
        }

        return "";
    }
}
