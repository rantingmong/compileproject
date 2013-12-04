package app.compile;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
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

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import app.compile.compiler.JalCompiler;
import app.compile.compiler.converter.ConverterProgram;
import app.compile.core.FunctionInformation;
import app.compile.interpreter.Interpreter;
import app.compile.parser.codeLexer;
import app.compile.parser.codeParser;

public class Text extends JFrame implements ActionListener
{
    private static final long serialVersionUID = 1L;
    
    private JTextArea textArea = new JTextArea();
    private JTextArea console  = new JTextArea();
    private JToolBar  menuBar  = new JToolBar("Toolbar", JToolBar.HORIZONTAL);
    private JButton   openFile = new JButton();
    private JButton   saveFile = new JButton();
    private JButton   compile  = new JButton();
    private JButton   close    = new JButton();

    public Text()
    {
        redirectSystemStreams();

        setSize(800, 600);
        setLocationRelativeTo(null);
        
        setTitle("Just Another Compiler");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        console.setFont (new Font("consolas", Font.PLAIN, 14));
        textArea.setFont(new Font("consolas", Font.PLAIN, 14));

        console.setEditable(false);
        textArea.addKeyListener(new KeyAdapter()
        {
            public void keyReleased(KeyEvent e)
            {
                textProcess(Text.this.textArea.getText());
            }
        });

        menuBar.add(this.openFile);
        menuBar.add(this.saveFile);
        menuBar.add(this.compile);

        openFile.setText("Open");
        openFile.addActionListener(this);

        saveFile.setText("Save");
        saveFile.addActionListener(this);

        compile.setText("Compile");
        compile.addActionListener(this);

        JScrollPane textAreaScroll  = new JScrollPane(textArea);
        JScrollPane consoleScroll   = new JScrollPane(console);
        
        consoleScroll.setPreferredSize(new Dimension(0, 200));
        
        getContentPane().setLayout(new BorderLayout());
        
        getContentPane().add(textAreaScroll,    BorderLayout.CENTER);
        getContentPane().add(consoleScroll,     BorderLayout.PAGE_END);
        getContentPane().add(menuBar,           BorderLayout.PAGE_START);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == this.close)
            this.dispose();

        if (e.getSource() == this.compile)
        {
            console.setText("");
            try
            {
                process(textArea.getText());
            }
            catch (IOException e1)
            {
                e1.printStackTrace();
            }
        }

        else if (e.getSource() == this.openFile)
        {
            JFileChooser open = new JFileChooser();
            int option = open.showOpenDialog(this);

            if (option == JFileChooser.APPROVE_OPTION)
            {
                this.textArea.setText("");
                try
                {
                    Scanner scan = new Scanner(new FileReader(open.getSelectedFile().getPath()));
                    while (scan.hasNext())
                        this.textArea.append(scan.nextLine() + "\n");

                    scan.close();
                }
                catch (Exception ex)
                {
                    System.out.println(ex.getMessage());
                }
            }
        }

        else if (e.getSource() == this.saveFile)
        {
            JFileChooser save = new JFileChooser();
            int option = save.showSaveDialog(this);
            if (option == JFileChooser.APPROVE_OPTION)
            {
                try
                {
                    BufferedWriter out = new BufferedWriter(new FileWriter(save.getSelectedFile().getPath()));
                    out.write(this.textArea.getText());
                    out.close();
                }
                catch (Exception ex)
                {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    public void process(String input) throws IOException
    {
        System.out.println("Compiling...");

        codeLexer lx = new codeLexer(new ANTLRInputStream(input));
        codeParser cp = new codeParser(new CommonTokenStream(lx));

        cp.setBuildParseTree(true);
        cp.setTrimParseTree(true);

        JalCompiler cmp = new JalCompiler();

        ConverterProgram cxp = new ConverterProgram();
        cxp.process(cp.s(), cmp);

        System.out.println("Compilation complete! IL-code is:");

        for (FunctionInformation finfo : cmp.functionList)
        {
            System.out.println(String.format("%s: %d parameters, %s return type", finfo.functionName, finfo.parameterList.size(), finfo.returnType));

            for (String line : finfo.ilCode)
            {
                System.out.println(line);
            }
        }

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Executing...");

        Interpreter ipx = new Interpreter(cmp);
        ipx.execute();
        
        System.out.println("Execution complete!");
    }

    public void textProcess(String input)
    {
        
    }
    
    private void updateTextArea(final String text)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                console.append(text);
            }
        });
    }

    private void redirectSystemStreams()
    {
        OutputStream out = new OutputStream()
        {
            @Override
            public void write(int b) throws IOException
            {
                updateTextArea(String.valueOf((char) b));
            }

            @Override
            public void write(byte[] b, int off, int len) throws IOException
            {
                updateTextArea(new String(b, off, len));
            }

            @Override
            public void write(byte[] b) throws IOException
            {
                write(b, 0, b.length);
            }
        };

        System.setOut(new PrintStream(out, true));
        System.setErr(new PrintStream(out, true));
    }
}
