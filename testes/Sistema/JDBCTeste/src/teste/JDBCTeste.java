package teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCTeste {

	// http://jdbc.postgresql.org/documentation/head/connect.html
	public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {
		//String url = "jdbc:postgresql://localhost:5432/Teste";
		//String username = "postgres";
		//String password = "senacrs";
		
		Properties props = new Properties();
		props.load(new FileInputStream("teste.properties"));
		String url = props.getProperty("url");
		
		//props.setProperty("user","postgres");
		//props.setProperty("password","senacrs");

		Connection db = DriverManager.getConnection(url, props);
		
		//Connection db = DriverManager.getConnection(url, username, password);
		System.out.println("Conectado!");
		
		String cpf = "123";
		String cmd = "SELECT * FROM pdr_contas WHERE cpf = ?";
		PreparedStatement st  = db.prepareStatement(cmd);
		st.setString(1,cpf);
		ResultSet rs = st.executeQuery();
		
			while(rs.next()){
				System.out.println(rs.getString(1));
				System.out.println(rs.getString("cpf"));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				
			}
		
		rs.close();
		st.close();
		
	}
}