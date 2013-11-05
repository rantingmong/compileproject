package app.compile;

import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import app.compile.core.programDatabase;

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
        
        CharStream stream = new ANTLRFileStream(input);

        codeLexer   lx = new codeLexer(stream);
        TokenStream ts = new CommonTokenStream(lx);
        codeParser  cp = new codeParser(ts);
        ParseTree   pt = cp.s();

        programDatabase pDB = new programDatabase(pt);
        pDB.run();
    }
}
