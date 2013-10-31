package projeto.dao;

import projeto.pojo.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;



public class ProjetoDAO {

	public Funcionario findFuncByCPF(int cpf) {
		Funcionario func = null;
		String cmd = "SELECT * FROM funcionario WHERE cpf= ?";

		Connection db = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			// ABRIR CONEXÃO
			Properties props = new Properties();
			props.load(new FileInputStream("projeto.properties"));
			String url = props.getProperty("url");

			db = DriverManager.getConnection(url, props);

			st = db.prepareStatement(cmd);
			st.setString(1,cpf);
			rs = st.executeQuery();

			while (rs.next()) {
				
				String nome = rs.getString(1);
				String rg = rs.getString(2);
				String cpf = rs.getString("cpf");
				String dataNasc = rs.getString(4);
				String nomeMae = rs.getString(5);
				String endereco = rs.getString(6);
				String cep = rs.getString(7);
				String telefone = rs.getString(8);
				String email = rs.getString(9);
				String conselho= rs.getString(10);
				String matricula= rs.getString(11);
				String secretaria= rs.getString(12);
				String cargo= rs.getString(13);
				String funcao= rs.getString(14);
				int cargaHorariaSemanal = rs.getInt(15);
				func = new Funcionario(nome, rg, cpf, dataNasc, nomeMae, 
						endereco, cep, telefone, email, conselho, matricula, secretaria, cargo, funcao, cargaHorariaSemanal);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return func;
	}

	public void insertFunc(Funcionario func) {
		String cmd = "INSERT INTO funcionario (nome,rg,cpf,dataNasc,nomeMae,endereco,cep,telefone,email,conselho,matricula,secretaria,cargo,funcao,cargaHorariaSemanal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Connection db = null;
		PreparedStatement st = null;

		try {
			// ABRIR CONEXÃO
			Properties props = new Properties();
			props.load(new FileInputStream("projeto.properties"));
			String url = props.getProperty("url");

			db = DriverManager.getConnection(url, props);

			st = db.prepareStatement(cmd);
			st.setString(1, func.getNome());
			st.setString(2, func.getRg());
			st.setString(3, func.getCpf());
			st.setString(4, func.getDataNasc());
			st.setString(5, func.getNomeMae());
			st.setString(6, func.getEndereco());
			st.setString(7, func.getCep());
			st.setString(8, func.getTelefone());
			st.setString(9, func.getEmail());
			st.setString(10, func.getConselho());
			st.setString(11, func.getMatricula());
			st.setString(12, func.getCargo());
			st.setString(13, func.getFuncao());
			st.setString(14,func.getSecretaria());
			st.setInt(15,func.getCargaHorariaSemanal());
			int r = st.executeUpdate();

			if (r != 1) {
				throw new RuntimeException("ERRO AO INSERIR O FUNCIONÁRIO!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public List<Funcionario> findFuncByFuncionario(){
		List<Funcionario> listFunc = new ArrayList<Funcionario>();
		
		Connection db = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
                Properties props = new Properties();
                props.load(new FileInputStream("projeto.properties"));
                String url = props.getProperty("url");

                db = DriverManager.getConnection(url, props);

                st = db.prepareStatement(cmd);
                st.setInt(1,cpf);
                rs = st.executeQuery();

                while (rs.next()) {
                	
                	String nome = rs.getString(1);
    				String rg = rs.getString(2);
    				String cpf = rs.getString(3);
    				String dataNasc = rs.getString(4);
    				String nomeMae = rs.getString(5);
    				String endereco = rs.getString(6);
    				String cep = rs.getString(7);
    				String telefone = rs.getString(8);
    				String email = rs.getString(9);
    				String conselho= rs.getString(10);
    				String matricula= rs.getString(11);
    				String secretaria= rs.getString(12);
    				String cargo= rs.getString(13);
    				String funcao= rs.getString(14);
    				int cargaHorariaSemanal = rs.getInt(15);
    				
                    listFunc.add(new Funcionario (nome, rg, cpf, dataNasc, nomeMae,
                    		endereco, cep, telefone, email, conselho, matricula, secretaria, cargo, funcao, cargaHorariaSemanal));
                }

        } catch (Exception e) {
                e.printStackTrace();
        } finally {
                try {
                        if (rs != null) {
                                rs.close();
                        }
                        if (st != null) {
                                st.close();
                        }
                        if (db != null) {
                                db.close();
                        }
                } catch (Exception e2) {
                        e2.printStackTrace();
                }
        }
        return listFunc;
}
}