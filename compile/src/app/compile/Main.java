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
        
        Text text = new Text();
        text.setVisible(true);
    }
}
