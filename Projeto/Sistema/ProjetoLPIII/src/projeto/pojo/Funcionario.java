package projeto.pojo;

import java.util.Date;

public class Funcionario {
	private String nome;
	private String rg;
	private String cpf;
	private Date dataNasc;
	private String nomeMae;
	private String endereco;
	private String cep;
	private String telefone;
	private String email;
	private String conselho;
	private String matricula;
	private String secretaria;
	private String cargo;
	private String funcao;
	private int cargaHorariaSemanal;

	public Funcionario(String nome, String rg, String cpf, Date dataNasc,String nomeMae,
			String endereco, String cep, String telefone, String email,
			String conselho, String matricula, String secretaria, String cargo,
			String funcao, int cargaHorariaSemanal) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.nomeMae = nomeMae;
		this.endereco = endereco;
		this.cep = cep;
		this.telefone = telefone;
		this.email = email;
		this.conselho = conselho;
		this.matricula = matricula;
		this.secretaria = secretaria;
		this.cargo = cargo;
		this.funcao = funcao;
		this.cargaHorariaSemanal = cargaHorariaSemanal;

	}

	public Funcionario(String nome, String rg, String cpf, Date dataNasc, String nomeMae,
			String endereco, String cep, String telefone, String email,
			String matricula, String secretaria, String cargo, String funcao,
			int cargaHorariaSemanal) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.nomeMae = nomeMae;
		this.endereco = endereco;
		this.cep = cep;
		this.telefone = telefone;
		this.email = email;
		this.matricula = matricula;
		this.secretaria = secretaria;
		this.cargo = cargo;
		this.funcao = funcao;
		this.cargaHorariaSemanal = cargaHorariaSemanal;

	}

		public String getNome() {
			return nome;
		}

		public String getRg() {
			return rg;
		}

		public String getCpf() {
			return cpf;
		}
		
		public Date getDataNasc(){
			return dataNasc;
		}

		public String getNomeMae() {
			return nomeMae;
		}

		public String getEndereco() {
			return endereco;
		}

		public String getCep() {
			return cep;
		}

		public String getTelefone() {
			return telefone;
		}

		public String getEmail() {
			return email;
		}

		public String getConselho() {
			return conselho;
		}

		public String getMatricula() {
			return matricula;
		}

		public String getSecretaria() {
			return secretaria;
		}

		public String getCargo() {
			return cargo;
		}

		public String getFuncao() {
			return funcao;
		}

		public int getCargaHorariaSemanal() {
			return cargaHorariaSemanal;
		}

	@Override
	public String toString() {
		return String.format("Funcionario [nome=%s, rg=%s, cpf=%s, dataNasc=%s, nomeMae=%s, endereco=%s, cep=%s, telefone=%s, email=%s, conselho=%s, matricula=%s, secretaria=%s, cargo=%s,funcao = %s, cargaHorariaSemanal=%s]",
						nome, rg, cpf, dataNasc, nomeMae, endereco, cep, telefone, email,
						conselho, matricula, secretaria, cargo, funcao,
						cargaHorariaSemanal);
	}

}
