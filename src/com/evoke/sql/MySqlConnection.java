package com.evoke.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySqlConnection {

	public static void main(String[] args) {

		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "110996");

			stmt = c.createStatement();
		//	String sql = "CREATE TABLE COMPANY (ID INT PRIMARY KEY NOT NULL, NAME VARCHAR(20) NOT NULL, AGE INT NOT NULL )";
			String sql = "insert into company values (3,'Rajesh',35)";
			stmt.executeUpdate(sql);
			stmt.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
	}

}
