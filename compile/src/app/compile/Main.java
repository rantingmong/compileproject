package app.compile;

import java.io.IOException;

import org.antlr.v4.runtime.*;

import app.compile.parser.*;
import app.compile.parser.codeParser.Conditional_statementContext;

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

        System.out.println(pt.getText());
    }
}
