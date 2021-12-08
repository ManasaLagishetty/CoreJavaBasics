package com.evoke.sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AlterEx {

	public static void main(String[] args) throws SQLException {
		
		Connection con = Connections.getConnection();
		Statement stmt=null;
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
		}  

           String sql="alter table student add FeesDue Int";
    

         try {
			stmt.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
         stmt.close();
         con.close();
   
   

	}

}
