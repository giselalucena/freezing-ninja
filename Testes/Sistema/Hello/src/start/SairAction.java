package start;
import misc.ActionDemo;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class SairAction extends AbstractAction {
	
	private static final long serialVersionUID = 1L;
	
	public SairAction() {
		super("Sair");
       

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Sair");
		System.exit(0);
	}

}
