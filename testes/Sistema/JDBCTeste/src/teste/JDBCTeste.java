package teste;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCTeste {

	public static void main(String[] args) throws SQLException {
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
		
		String cmd = 
	}
}