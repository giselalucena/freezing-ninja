package projeto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCProjeto {

	// http://jdbc.postgresql.org/documentation/head/connect.html
	public static void main(String[] args) throws SQLException,
			FileNotFoundException, IOException {
		Properties props = new Properties();
		props.load(new FileInputStream("projeto.properties"));
		String url = props.getProperty("url");

		Connection db = DriverManager.getConnection(url, props);
		System.out.println("Conectado!");

		String cpf = "79854731469";
		String cmd = "SELECT * FROM funcionario WHERE cpf = ?";
		PreparedStatement st = db.prepareStatement(cmd);
		st.setString(1, cpf);
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
		    System.out.println(rs.getString(1));
		    System.out.println(rs.getString(2));
			System.out.println(rs.getString("cpf"));
			System.out.println(rs.getString(4));
			System.out.println(rs.getString(5));
			System.out.println(rs.getString(6));
			System.out.println(rs.getString(7));
			System.out.println(rs.getString(8));
			System.out.println(rs.getString(9));
			System.out.println(rs.getString(10));
			System.out.println(rs.getString(11));
			System.out.println(rs.getString(12));
			System.out.println(rs.getString(13));
			System.out.println(rs.getString(14));
			System.out.println(rs.getString(15));
		}		

		rs.close();
		st.close();
	}
}
