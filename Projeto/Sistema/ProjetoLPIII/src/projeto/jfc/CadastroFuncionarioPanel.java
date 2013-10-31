package projeto.jfc;

import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import projeto.pojo.Funcionario;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CadastroFuncionarioPanel extends JPanel {
	private JTextField textFieldNome;
	private JTextField textFieldRg;
	private JTextField textFieldCpf;
	private JTextField textFieldDataNasc;
	private JTextField textFieldNomeMae;
	private JTextField textFieldEndereco;
	private JTextField textFieldCep;
	private JTextField textFieldTelefone;
	private JTextField textFieldEmail;
	private JTextField textFieldConselho;
	private JTextField textFieldMatricula;
	private JTextField textFieldCargaHorariaSemanal;
	private final CadastroFuncionarioCadastrarAction cadastroFuncionarioCadastrarAction = new CadastroFuncionarioCadastrarAction((CadastroFuncionarioPanel) null);
	private final CadastroFuncionarioCancelarAction cadastroFuncionarioCancelarAction = new CadastroFuncionarioCancelarAction((CadastroFuncionarioPanel) null);

	/**
	 * Create the panel.
	 */
	public CadastroFuncionarioPanel() {
		
		JLabel lblNome = new JLabel("Nome:");
		
		textFieldNome = new JTextField();
		textFieldNome.setColumns(10);
		
		JLabel lblRg = new JLabel("RG:");
		
		textFieldRg = new JTextField();
		textFieldRg.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		
		textFieldCpf = new JTextField();
		textFieldCpf.setColumns(10);
		
		JLabel lblDataNasc = new JLabel("Data de Nascimento:");
		
		textFieldDataNasc = new JTextField();
		textFieldDataNasc.setColumns(10);
		
		JLabel lblNomeMae = new JLabel("Nome da Mãe:");
		
		textFieldNomeMae = new JTextField();
		textFieldNomeMae.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endereço:");
		
		textFieldEndereco = new JTextField();
		textFieldEndereco.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		
		textFieldCep = new JTextField();
		textFieldCep.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		
		textFieldTelefone = new JTextField();
		textFieldTelefone.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		
		JLabel lblConselho = new JLabel("Conselho:");
		
		textFieldConselho = new JTextField();
		textFieldConselho.setColumns(10);
		
		JLabel lblMatricula = new JLabel("Matrícula:");
		
		textFieldMatricula = new JTextField();
		textFieldMatricula.setColumns(10);
		
		JLabel lblSecretaria = new JLabel("Secretária:");
		
		JLabel lblCargo = new JLabel("Cargo:");
		
		JLabel lblFuncao = new JLabel("Função:");
		
		JLabel lblCargaHorariaSemanal = new JLabel("Carga Horária Semanal:");
		
		textFieldCargaHorariaSemanal = new JTextField();
		textFieldCargaHorariaSemanal.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setAction(cadastroFuncionarioCadastrarAction);
		btnCadastrar.setMnemonic(KeyEvent.VK_C);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setAction(cadastroFuncionarioCancelarAction);
		btnCancelar.setMnemonic(KeyEvent.VK_N);
		
		JComboBox comboBoxSecretaria = new JComboBox();
		
		JComboBox comboBoxCargo = new JComboBox();
		comboBoxCargo.setModel(new DefaultComboBoxModel(new String[] {"Selecione........", "Coordenador", "Dentista", "Enfermeiro(a)", "Estagiário", "Médico(a)", "Recepção", "Técnico(a)/Auxilar de Enfermagem"}));
		
		JComboBox comboBoxFuncao = new JComboBox();
		comboBoxFuncao.setModel(new DefaultComboBoxModel(new String[] {"Selecione.......", "Auxiliar de Odontológia", "Buco Facial", "Cirurgião Dentista"}));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblDataNasc)
									.addGap(10)
									.addComponent(textFieldDataNasc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblEndereco)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textFieldEndereco, 348, 348, 348))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblCep)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textFieldCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblTelefone)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textFieldTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblConselho)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textFieldConselho, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
									.addGap(27)
									.addComponent(lblMatricula)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textFieldMatricula, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblSecretaria)
											.addPreferredGap(ComponentPlacement.RELATED))
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblCargo)
												.addComponent(lblFuncao))
											.addGap(18)))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(comboBoxFuncao, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(comboBoxCargo, Alignment.LEADING, 0, 180, Short.MAX_VALUE))
										.addComponent(comboBoxSecretaria, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblEmail)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textFieldEmail, 246, 246, 246))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblCargaHorariaSemanal)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textFieldCargaHorariaSemanal, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addGroup(Alignment.LEADING, groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
											.addComponent(lblNome)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(textFieldNome, GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
										.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
											.addComponent(lblRg)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(textFieldRg, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
											.addGap(41)
											.addComponent(lblCpf)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(textFieldCpf, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)))
									.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
										.addComponent(lblNomeMae)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(textFieldNomeMae, 328, 328, 328)))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(109)
							.addComponent(btnCadastrar)
							.addGap(18)
							.addComponent(btnCancelar)))
					.addGap(161))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(textFieldNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRg)
						.addComponent(textFieldRg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCpf)
						.addComponent(textFieldCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldDataNasc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDataNasc))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNomeMae)
						.addComponent(textFieldNomeMae, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEndereco)
						.addComponent(textFieldEndereco, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCep)
						.addComponent(textFieldCep, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTelefone)
						.addComponent(textFieldTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(textFieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblConselho)
						.addComponent(textFieldConselho, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMatricula)
						.addComponent(textFieldMatricula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSecretaria)
						.addComponent(comboBoxSecretaria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCargo)
						.addComponent(comboBoxCargo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblFuncao)
						.addComponent(comboBoxFuncao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCargaHorariaSemanal)
						.addComponent(textFieldCargaHorariaSemanal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCadastrar)
						.addComponent(btnCancelar))
					.addGap(27))
		);
		setLayout(groupLayout);

	}
}
