package app.compile;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import app.compile.compiler.JalCompiler;
import app.compile.compiler.converter.ConverterProgram;
import app.compile.core.FunctionInformation;
import app.compile.parser.codeLexer;
import app.compile.parser.codeParser;

import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.*;

public class Text extends JFrame implements ActionListener {
	private TextArea textArea = new TextArea();
	private TextArea console = new TextArea();
	private MenuBar menuBar = new MenuBar();
	private Menu file = new Menu();
	private MenuItem openFile = new MenuItem();
	private MenuItem saveFile = new MenuItem();
	private MenuItem compile = new MenuItem();
	private MenuItem close = new MenuItem();
	
	public Text() {
		redirectSystemStreams();
		
		this.setSize(500, 500);
		this.setTitle("Just Another Compiler");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.textArea.setFont(new Font("Consolas", Font.PLAIN, 12));
		this.getContentPane().setLayout(new BorderLayout());
		this.getContentPane().add(textArea);
		this.getContentPane().add(console, BorderLayout.PAGE_END);
		this.console.setEditable(false);
		
                this.textArea.addKeyListener
              (new KeyAdapter() {
                 public void keyReleased(KeyEvent e) {

                     
                 }
                 }
              );

		this.setMenuBar(this.menuBar);
		this.menuBar.add(this.file);
		
		this.file.setLabel("File");
		this.openFile.setLabel("Open");
		this.openFile.addActionListener(this);
		this.openFile.setShortcut(new MenuShortcut(KeyEvent.VK_O, false));
		this.file.add(this.openFile);
		
		this.saveFile.setLabel("Save");
		this.saveFile.addActionListener(this);
		this.saveFile.setShortcut(new MenuShortcut(KeyEvent.VK_S, false));
		this.file.add(this.saveFile);
		
		this.compile.setLabel("Compile");
		this.compile.addActionListener(this);
		this.compile.setShortcut(new MenuShortcut(KeyEvent.VK_F5, false));
		this.file.add(this.compile);
		
		
		this.close.setLabel("Close");
		this.close.setShortcut(new MenuShortcut(KeyEvent.VK_F4, false));
		this.close.addActionListener(this);
		this.file.add(this.close);
	}
	
	public void actionPerformed (ActionEvent e) {
		if (e.getSource() == this.close)
			this.dispose();
		
		if (e.getSource() == this.compile) {
			console.setText("");
			try {
				process(textArea.getText());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
		else if (e.getSource() == this.openFile) {
			JFileChooser open = new JFileChooser();
			int option = open.showOpenDialog(this);
			
			if (option == JFileChooser.APPROVE_OPTION) {
				this.textArea.setText("");
				try {
					Scanner scan = new Scanner(new FileReader(open.getSelectedFile().getPath()));
					while (scan.hasNext())
						this.textArea.append(scan.nextLine() + "\n");
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
			}
		}
		
		else if (e.getSource() == this.saveFile) {
			JFileChooser save = new JFileChooser();
			int option = save.showSaveDialog(this);
			if (option == JFileChooser.APPROVE_OPTION) {
				try {
					BufferedWriter out = new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()));
					out.write(this.textArea.getText());
					out.close();
				} catch (Exception ex) {
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
            System.out.println(String.format("%s: %d parameters, %s return type", finfo.functionName, finfo.parameterList.size(), finfo.returnType));
            
            for (String line : finfo.ilCode)
            {
                System.out.println(line);
            }
        }

        System.out.println(cmp.functionList.size());
    }
	
	  private void updateTextArea(final String text) {
	    SwingUtilities.invokeLater(new Runnable() {
	      public void run() {
	        console.append(text);
	      }
	    });
	  }
	 
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
