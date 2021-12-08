package com.evoke.sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateEx {

	public static void main(String[] args) throws SQLException {
		
		Connection con = Connections.getConnection();
		Statement stmt=null;
		
		try {
			stmt=con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		  String sql2="update student set marks3 = 67 where id = 3";
		   
	       try {
			stmt.execute(sql2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	       stmt.close();
	       con.close();

	}

}
