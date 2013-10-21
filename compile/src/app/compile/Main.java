package app.compile;

import java.io.IOException;
import java.util.ArrayList;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import app.compile.productions.production;
import app.compile.productions.productionRoot;

public class Main
{

    public static void main(String[] args) throws IOException {
        
        new Main().process("input.jal");
    }

    ArrayList<production> productions = new ArrayList<production>();

    public void process(String input) throws IOException {
        
        productions.add(new productionRoot());
        
        CharStream stream = new ANTLRFileStream(input);

        codeLexer   lx = new codeLexer(stream);
        TokenStream ts = new CommonTokenStream(lx);
        codeParser  cp = new codeParser(ts);
        ParseTree   pt = cp.s();

        printParseTree(pt, 0);
    }

    public void printParseTree(ParseTree pt, int level) {

        for (int i = 0; i < level; i++) {

            System.out.print(" ");
        }
        
        for (production entry : productions) {
            
            if (entry.isProductionValid(pt)) {
                
                entry.process(pt);
            }

            if (entry.alsoReadChildren() == false)
                continue;
                
            for (int i = 0; i < pt.getChildCount(); i++) {

                printParseTree(pt.getChild(i), level + 1);
            }
        }
    }
}
