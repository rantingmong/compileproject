package app.compile;

import java.io.IOException;

import org.antlr.v4.runtime.*;

import app.compile.compiler.JalCompiler;
import app.compile.compiler.converter.ConverterProgram;
import app.compile.core.FunctionInformation;
import app.compile.parser.*;

public class Main
{
    public static void 	            printLine       (String message, int indent) {
        
        for (int i = 0; i < indent; i++) {
            
            System.out.print("   ");
        }
        
        System.out.println(message);
    }
    
    public static void 	            main            (String[] args) throws IOException {
        
        new Main().process("input.jal");
    }

    public void process	        	(String input) throws IOException {

        codeLexer               lx      = new codeLexer         (new ANTLRFileStream(input));
        codeParser              cp      = new codeParser        (new CommonTokenStream (lx));
        
                                cp.setBuildParseTree(true);
                                cp.setTrimParseTree(true);

        codeParser.SContext     pt      = cp.s();

        JalCompiler            cmp      = new JalCompiler();
        
        ConverterProgram       cxp      = new ConverterProgram();
                               cxp.process(pt, cmp);

        for (FunctionInformation finfo : cmp.functionList)
        {
            for (String line : finfo.ilCode)
            {
                System.out.println(line);
            }
        }
                               
        System.out.println(cmp.functionList.size());
    }
}
