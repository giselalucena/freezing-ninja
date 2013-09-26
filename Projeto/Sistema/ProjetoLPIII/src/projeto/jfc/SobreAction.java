package projeto.jfc;
import misc.ActionDemo;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SobreAction extends AbstractAction {
	
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	
	public SobreAction(JFrame frame) {
		super("Sobre");
		this.frame = frame;
      

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Sobre");
		JOptionPane.showMessageDialog(frame, "(c) LAPRO III, FSPOA.",
				"Controle de Funcionário", JOptionPane.INFORMATION_MESSAGE);
	}

}
