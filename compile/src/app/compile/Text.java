package app.compile;

import javax.swing.*;

import org.antlr.v4.runtime.ANTLRErrorStrategy;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import app.compile.compiler.JalCompiler;
import app.compile.compiler.converter.ConverterProgram;
import app.compile.core.FunctionInformation;
import app.compile.core.Program;
import app.compile.parser.codeLexer;
import app.compile.parser.codeParser;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.*;

public class Text extends JFrame implements ActionListener {
	private TextArea textArea = new TextArea();
	private TextArea console = new TextArea();
	private MenuBar menuBar = new MenuBar(); // first, create a MenuBar item
	private Menu file = new Menu(); // our File menu
	// what's going in File? let's see...
	private MenuItem openFile = new MenuItem();  // an open option
	private MenuItem saveFile = new MenuItem(); // a save option
	private MenuItem compile = new MenuItem();
	private MenuItem close = new MenuItem(); // and a close option!
	
	public Text() {
		redirectSystemStreams();
		
		this.setSize(500, 500); // set the initial size of the window
		this.setTitle("Just Another Compiler"); // set the title of the window
		setDefaultCloseOperation(EXIT_ON_CLOSE); // set the default close operation (exit when it gets closed)
		this.textArea.setFont(new Font("Century Gothic", Font.BOLD, 12)); // set a default font for the TextArea
		
		this.getContentPane().setLayout(new BorderLayout()); // the BorderLayout bit makes it fill it automatically
		this.getContentPane().add(textArea);
		this.getContentPane().add(console, BorderLayout.PAGE_END);
		this.console.setEditable(false);
		
                this.textArea.addKeyListener
              (new KeyAdapter() {
                 /*public void keyPressed(KeyEvent e) {
                      //CALL SYNTAXCHECKER HERE
                        System.out.println(textArea.getText());
                   }*/
                 public void keyReleased(KeyEvent e) {

                     
                 }
                 }
              );

		// add our menu bar into the GUI
		this.setMenuBar(this.menuBar);
		this.menuBar.add(this.file); // we'll configure this later
		
		// first off, the design of the menuBar itself. Pretty simple, all we need to do
		// is add a couple of menus, which will be populated later on
		this.file.setLabel("File");
		
		// now it's time to work with the menu. I'm only going to add a basic File menu
		// but you could add more!
		
		// now we can start working on the content of the menu~ this gets a little repetitive,
		// so please bare with me!
		
		// time for the repetitive stuff. let's add the "Open" option
		this.openFile.setLabel("Open"); // set the label of the menu item
		this.openFile.addActionListener(this); // add an action listener (so we know when it's been clicked
		this.openFile.setShortcut(new MenuShortcut(KeyEvent.VK_O, false)); // set a keyboard shortcut
		this.file.add(this.openFile); // add it to the "File" menu
		
		// and the save...
		this.saveFile.setLabel("Save");
		this.saveFile.addActionListener(this);
		this.saveFile.setShortcut(new MenuShortcut(KeyEvent.VK_S, false));
		this.file.add(this.saveFile);
		
		// compile button
		this.compile.setLabel("Compile");
		this.compile.addActionListener(this);
		this.compile.setShortcut(new MenuShortcut(KeyEvent.VK_F5, false));
		this.file.add(this.compile);
		
		// and finally, the close option
		this.close.setLabel("Close");
		// along with our "CTRL+F4" shortcut to close the window, we also have
		// the default closer, as stated at the beginning of this tutorial.
		// this means that we actually have TWO shortcuts to close:
		// 1) the default close operation (example, Alt+F4 on Windows)
		// 2) CTRL+F4, which we are about to define now: (this one will appear in the label)
		this.close.setShortcut(new MenuShortcut(KeyEvent.VK_F4, false));
		this.close.addActionListener(this);
		this.file.add(this.close);
	}
	
	public void actionPerformed (ActionEvent e) {
		// if the source of the event was our "close" option
		if (e.getSource() == this.close)
			this.dispose(); // dispose all resources and close the application
		
		//compile option
		if (e.getSource() == this.compile) {
			try {
				process(textArea.getText());
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		// if the source was the "open" option
		else if (e.getSource() == this.openFile) {
			JFileChooser open = new JFileChooser(); // open up a file chooser (a dialog for the user to browse files to open)
			int option = open.showOpenDialog(this); // get the option that the user selected (approve or cancel)
			// NOTE: because we are OPENing a file, we call showOpenDialog~
			// if the user clicked OK, we have "APPROVE_OPTION"
			// so we want to open the file
			if (option == JFileChooser.APPROVE_OPTION) {
				this.textArea.setText(""); // clear the TextArea before applying the file contents
				try {
					// create a scanner to read the file (getSelectedFile().getPath() will get the path to the file)
					Scanner scan = new Scanner(new FileReader(open.getSelectedFile().getPath()));
					while (scan.hasNext()) // while there's still something to read
						this.textArea.append(scan.nextLine() + "\n"); // append the line to the TextArea
				} catch (Exception ex) { // catch any exceptions, and...
					// ...write to the debug console
					System.out.println(ex.getMessage());
				}
			}
		}
		
		// and lastly, if the source of the event was the "save" option
		else if (e.getSource() == this.saveFile) {
			JFileChooser save = new JFileChooser(); // again, open a file chooser
			int option = save.showSaveDialog(this); // similar to the open file, only this time we call
			// showSaveDialog instead of showOpenDialog
			// if the user clicked OK (and not cancel)
			if (option == JFileChooser.APPROVE_OPTION) {
				try {
					// create a buffered writer to write to a file
					BufferedWriter out = new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()));
					out.write(this.textArea.getText()); // write the contents of the TextArea to the file
					out.close(); // close the file stream
				} catch (Exception ex) { // again, catch any exceptions and...
					// ...write to the debug console
					System.out.println(ex.getMessage());
				}
			}
		}
	}
	
	public void process	        	(String input) throws IOException {

        codeLexer               lx      = new codeLexer         (new ANTLRInputStream(input));
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
	
	//The following codes set where the text get redirected. In this case, jTextArea1    
	  private void updateTextArea(final String text) {
	    SwingUtilities.invokeLater(new Runnable() {
	      public void run() {
	        console.append(text);
	      }
	    });
	  }
	 
	//Followings are The Methods that do the Redirect, you can simply Ignore them. 
	  private void redirectSystemStreams() {
	    OutputStream out = new OutputStream() {
	      @Override
	      public void write(int b) throws IOException {
	        updateTextArea(String.valueOf((char) b));
	      }
	 
	      @Override
	      public void write(byte[] b, int off, int len) throws IOException {
	        updateTextArea(new String(b, off, len));
	      }
	 
	      @Override
	      public void write(byte[] b) throws IOException {
	        write(b, 0, b.length);
	      }
	    };
	 
	    System.setOut(new PrintStream(out, true));
	    System.setErr(new PrintStream(out, true));
	  }
}