package com.simplilearn.op;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private Connection connection;
	public DBConnection(String driver,String url, String username, String password) throws ClassNotFoundException, SQLException {

		Class.forName(driver);	
		connection= DriverManager.getConnection(url, username, password);
	}
	public Connection getConnection() {
		return connection;
	}
	
	public void closeConnection() throws SQLException
	{
		connection.close();
	}
	
}