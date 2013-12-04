package app.compile;

import java.io.IOException;

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
