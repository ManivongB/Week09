package recipes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projects.exception.DbException;

public class DbConnection {

	private static String HOST = "localhost";
	private static String PASSWORD = "recipes";
	private static int PORT = 3306;
	private static String SCHEMA = "recipes";
	private static String USER = "recipes";
	

	public static Connection getConnection() {
		String url = 
				String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false", 
				HOST, PORT, SCHEMA, USER,PASSWORD);
		

		try {
			Connection conn = DriverManager.getConnection(url);
			System.out.println("Successfully obtained connection1234!");
			return conn;
		} catch (SQLException e) {
		  throw new DbException(e);
		}
	}

}

