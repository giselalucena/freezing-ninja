package projeto.jfc;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import projeto.dao.ProjetoDAO;
import projeto.jfc.CadastroFuncionarioPanel;
import projeto.pojo.Funcionario;


public class CadastroFuncionarioCadastrarAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CadastroFuncionarioPanel panel;

	public CadastroFuncionarioCadastrarAction(CadastroFuncionarioPanel panel) {
		super("Cadastrar");
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Funcionario func = panel.getFuncionario();
		//System.out.println(c);
		ProjetoDAO dao = new ProjetoDAO();
		dao.insertFunc(func);
	}
}