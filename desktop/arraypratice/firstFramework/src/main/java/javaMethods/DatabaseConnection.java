package javaMethods;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatabaseConnection {
	WebDriver dr;

	@Test
	public void DatabaseConnect() throws SQLException, ClassNotFoundException {
		
Class.forName("com.mysql.jdbc.Driver");
		Connection connect = DriverManager.getConnection("jdbc mysql //localhost 3306","root", "");
		Statement state = connect.createStatement();
		// boolean result=state.execute(null);
		ResultSet result = state.executeQuery("SELECT username from student where userid=3;");
		boolean firstData = result.next();
		String data=result.getString(1);
		if(data.equalsIgnoreCase("asma")) {
			System.out.println(data );
		}
		System.out.println(firstData);
		System.out.println(result.next());
		while(result.next()) {
System.out.println(result);
state.close();
	}

}}
