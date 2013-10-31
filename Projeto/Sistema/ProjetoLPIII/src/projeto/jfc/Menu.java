package projeto.jfc;

import java.awt.*;

import javax.swing.*;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
 
public class Menu {
    final static String CADASTROFUNCIONARIOPANEL = "Cadastro de Funcionário";
    final static String FUNCIONARIOSPANEL = "Tabela de Funcionários";
    final static int extraWindowWidth = 100;
 
    public void addComponentToPane(Container pane) {
        JTabbedPane tabbedPane = new JTabbedPane();
 
        //Create the "cards".
        JPanel card1 = new JPanel() {
            //Make the panel wider than it really needs, so
            //the window's wide enough for the tabs to stay
            //in one row.
            public Dimension getPreferredSize() {
                Dimension size = super.getPreferredSize();
                size.width += extraWindowWidth;
                return size;
            }
        };
        card1.add(new CadastroFuncionarioPanel());
        
 
        JPanel card2 = new JPanel();
        card2.add(new FuncionariosPanel());
 
        tabbedPane.addTab(CADASTROFUNCIONARIOPANEL, card1);
        tabbedPane.addTab(FUNCIONARIOSPANEL, card2);
 
        pane.add(tabbedPane, BorderLayout.CENTER);
    }
 
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("CONTROLE DE FUNCIONÁRIOS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        Menu menu = new Menu();
        menu.addComponentToPane(frame.getContentPane());
 
        
        JMenuBar mb = new JMenuBar();
        frame.setJMenuBar(mb);
        
        JMenu arquivo = new JMenu("Arquivo");
        arquivo.setMnemonic(KeyEvent.VK_A);
        mb.add(arquivo);
        
        JMenu ajuda = new JMenu("Ajuda");
        ajuda.setMnemonic(KeyEvent.VK_J);
        mb.add(ajuda);
        
        JMenuItem sair = new JMenuItem(new SairAction());
        sair.setMnemonic(KeyEvent.VK_S);
        arquivo.add(sair);
        
        JMenuItem sobre = new JMenuItem(new SobreAction(frame));
        sobre.setMnemonic(KeyEvent.VK_O);
        ajuda.add(sobre);
        
       
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
         
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
