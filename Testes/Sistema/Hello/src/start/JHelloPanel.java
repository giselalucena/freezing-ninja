package start;

import java.awt.*;

import javax.swing.*;
 

public class JHelloPanel extends JPanel{
	
	//private static final long serial = 1L;
	
	public JHelloPanel(){
		 //Add the ubiquitous "Hello World" label.
		 JLabel label = new JLabel("Hello World");
	     setLayout(new FlowLayout());
	     
	     add(label);
	        
		JTextField textField = new JTextField("Fill your name here");
        add(textField);

        JButton button = new JButton("Press me!");
        add(button);
		
	}
}
