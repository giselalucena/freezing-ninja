 //package teste;

import java.sql.*;

public class JDBCTeste {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/pindorama";
		String username = "postgres";
		String password = "senacrs";

		Connection db = DriverManager.getConnection(url, username, password);
		System.out.println("Conectado!");
	}
}