package app.compile.compiler.converter;

import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.compiler.JalCompiler;
import app.compile.core.DataType;
import app.compile.database.SymbolDatabaseEntry;
import app.compile.database.SymbolDatabaseEntryType;
import app.compile.parser.codeParser.Loop_DO_WHILEContext;
import app.compile.parser.codeParser.Loop_WHILEContext;
import app.compile.parser.codeParser.Loop_forContext;
import app.compile.parser.codeParser.Loop_for_controlContext;
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
            Loop_forContext         lfc     = (Loop_forContext)lsc.getChild(0);
            Loop_for_controlContext lfcc    = lfc.loop_for_control();

            String runVal   = "var" + compiler.curFunction.newVariable();
            String checkVal = "var" + compiler.curFunction.newVariable();

            String jumpVal  = "jump" + compiler.curFunction.newJump();

            SymbolDatabaseEntry newRunVal           = new SymbolDatabaseEntry();
                                newRunVal.dataType  = Enum.valueOf(DataType.class, lfc.TYPE().getText().toUpperCase());
                                newRunVal.name      = lfc.ID().toString();
                                newRunVal.ilName    = runVal;
                                newRunVal.entryType = SymbolDatabaseEntryType.VARIABLE;

            compiler.currentScope.entries.add(newRunVal);

            SymbolDatabaseEntry newCheckVal           = new SymbolDatabaseEntry();
                                newCheckVal.dataType  = DataType.TORF;
                                newCheckVal.name      = null;
                                newCheckVal.ilName    = checkVal;
                                newCheckVal.entryType = SymbolDatabaseEntryType.VARIABLE;

            compiler.currentScope.entries.add(newCheckVal);

            // evaluate from and to expressions
            String from = new ConverterLogicalStatement().process(lfcc.expression1().get(0), compiler);
            String to   = new ConverterLogicalStatement().process(lfcc.expression1().get(1), compiler);

            compiler.curFunction.ilCode.add("DEC " + runVal + " " + lfc.TYPE().getText().toUpperCase());
            compiler.curFunction.ilCode.add("DEC " + checkVal + " TORF");

            compiler.curFunction.ilCode.add("ASG " + runVal + " " + from);

            compiler.curFunction.ilCode.add(jumpVal + ":");

            new ConverterGroupStatement().process(lfc.group_statement(), compiler);

            compiler.curFunction.ilCode.add("ADD 1 " + runVal + " " + runVal);
            compiler.curFunction.ilCode.add("LT " + runVal + " " + to + " " + checkVal);

            compiler.curFunction.ilCode.add("JMP " + checkVal + " " + jumpVal);
        }
        else if (lsc.getChild(0) instanceof Loop_WHILEContext)
        {
            Loop_WHILEContext       lwc     = (Loop_WHILEContext)lsc.getChild(0);
            
            String checkVar = "var" + compiler.curFunction.newVariable();
            String jump1var = "jump" + compiler.curFunction.newJump();
            String jump2var = "jump" + compiler.curFunction.newJump();

            SymbolDatabaseEntry newCheckVal           = new SymbolDatabaseEntry();
                                newCheckVal.dataType  = DataType.TORF;
                                newCheckVal.name      = null;
                                newCheckVal.ilName    = checkVar;
                                newCheckVal.entryType = SymbolDatabaseEntryType.VARIABLE;

            compiler.currentScope.entries.add(newCheckVal);

            compiler.curFunction.ilCode.add("DEC " + checkVar + " TORF");
            compiler.curFunction.ilCode.add(jump1var + ":");

            compiler.curFunction.ilCode.add("PSH");

            String result = new ConverterLogicalStatement().process(lwc.logical_statement(), compiler);

            // TODO: check if result is TORF

            compiler.curFunction.ilCode.add("ASG " + checkVar + " " + result);

            compiler.curFunction.ilCode.add("POP");

            compiler.curFunction.ilCode.add("NOT " + checkVar);
            compiler.curFunction.ilCode.add("JMP " + checkVar + " " + jump2var);

            new ConverterGroupStatement().process(lwc.group_statement(), compiler);

            compiler.curFunction.ilCode.add("JMP TRUE " + jump1var);
            compiler.curFunction.ilCode.add(jump2var + ":");
        }
        else if (lsc.getChild(0) instanceof Loop_DO_WHILEContext)
        {
            Loop_DO_WHILEContext    ldwc    = (Loop_DO_WHILEContext)lsc.getChild(0);

            String checkVar = "var"  + compiler.curFunction.newVariable();
            String jumpVar  = "jump" + compiler.curFunction.newJump();

            SymbolDatabaseEntry newCheckVal           = new SymbolDatabaseEntry();
                                newCheckVal.dataType  = DataType.TORF;
                                newCheckVal.name      = null;
                                newCheckVal.ilName    = checkVar;
                                newCheckVal.entryType = SymbolDatabaseEntryType.VARIABLE;

            compiler.currentScope.entries.add(newCheckVal);

            compiler.curFunction.ilCode.add("DEC " + checkVar + " TORF");
            compiler.curFunction.ilCode.add(jumpVar + ":");

            new ConverterGroupStatement().process(ldwc.group_statement(), compiler);

            compiler.curFunction.ilCode.add("PSH");

            String result = new ConverterLogicalStatement().process(ldwc.logical_statement(), compiler);

            // TODO: check if result is of type TORF

            compiler.curFunction.ilCode.add("ASG " + checkVar + " " + result);
            compiler.curFunction.ilCode.add("POP");

            compiler.curFunction.ilCode.add("JMP " + checkVar + " " + jumpVar);
        }

        return "";
    }
}
