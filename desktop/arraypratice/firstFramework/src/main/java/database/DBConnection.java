package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	public void databaseConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.driver");
		String url = "";
		Connection connect = DriverManager.getConnection(url);
		Statement state = connect.createStatement();
		ResultSet rs = state.executeQuery("selec");
		rs.getString("firstName").contains("asma");
	String result=	rs.getString("userName");
	System.out.println(result);
	connect.close();
	}

}
