package start;

import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.*;



public class JHelloPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	private JTextField textField;


	public JHelloPanel(){
		 //Add the ubiquitous "Hello World" label.
		 JLabel label = new JLabel("Hello World");
	     setLayout(new FlowLayout());
	     
	     add(label);
	        
		textField = new JTextField("Fill your name here");
        add(textField);

       // JButton button = new JButton("Press me!");
        JButton button = new JButton(new JHelloAction());
        button.setToolTipText("Aperte este bot�o");
        button.setMnemonic(KeyEvent.VK_C);
        
        add(button);
		
	}
}
