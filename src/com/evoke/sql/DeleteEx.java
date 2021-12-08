package com.evoke.sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteEx {

	public static void main(String[] args) throws SQLException {

		Connection con = Connections.getConnection();
		Statement stmt=null;
		
		 try {
			stmt=con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    
		   String sql3="delete from student where id = 5";
	   
        try {
			stmt.execute(sql3);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        stmt.close();
        con.close();

	}

}
