package app.compile;

import java.io.IOException;
import java.util.ArrayList;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import app.compile.productions.production;
import app.compile.productions.productionFunctionDeclaration;
import app.compile.productions.productionMain;
import app.compile.productions.productionPackageDeclaration;
import app.compile.productions.productionRoot;

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

    private ArrayList<production>   productions     = new ArrayList<production>();

    public void process	        	(String input) throws IOException {
        
        productions.add(new productionRoot());
        productions.add(new productionMain());
        productions.add(new productionPackageDeclaration());
        productions.add(new productionFunctionDeclaration());
        
        CharStream stream = new ANTLRFileStream(input);

        codeLexer   lx = new codeLexer(stream);
        TokenStream ts = new CommonTokenStream(lx);
        codeParser  cp = new codeParser(ts);
        ParseTree   pt = cp.s();

        printParseTree(pt, 0);
    }

    public void printParseTree		(ParseTree pt, int level) {

        boolean found = false;
        
        for (production entry : productions) {
            
            if (entry.isProductionValid(pt)) {
                
                found = true;
                entry.process(pt, level);

                if (entry.alsoReadChildren() == false)
                    continue;
                    
                for (int i = 0; i < pt.getChildCount(); i++) {

                    printParseTree(pt.getChild(i), level + 1);
                }
            }
        }
        
        if (found == false) {

            if (pt.getChildCount() == 0)
                printLine(pt.getText(), level);

            for (int i = 0; i < pt.getChildCount(); i++) {

                printParseTree(pt.getChild(i), level + 1);
            }
        }
    }
}
