package com.hotel.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	
	
	

	
	
	
	public Connection getConnection() throws ClassNotFoundException,SQLException{
		Connection connection;

		String url = "jdbc:mysql://localhost:3306/jetroom";
		String username ="root";
		String password = "";
		
			Class.forName("com.mysql.jdbc.Driver");
			connection  = DriverManager.getConnection(url,username,password);
		
		return connection;
	}

}
