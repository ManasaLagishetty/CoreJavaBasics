package com.evoke.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {
	
	public static Connection getConnection() {
		Connection con =null;
	try {
		Class.forName("org.postgresql.Driver");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}	
	try {
	 con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","110996");
	} catch (SQLException e) {
		e.printStackTrace();
	}	
	
	return con;
}
}
