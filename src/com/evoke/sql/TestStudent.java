package com.evoke.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		Connection con = Connections.getConnection();
		Statement stmt=null;
		   ResultSet rs=null;
		   try {
				stmt=con.createStatement();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			   
			   try {
				rs=stmt.executeQuery("select * from student");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			    
     List<StudentDetails> list=new ArrayList<>();
    
     try {
		while(rs.next()) {
		 list.add(new StudentDetails(rs.getString(1),rs.getInt(2),rs.getInt(3), rs.getInt(4),rs.getInt(5)));
		
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
     System.out.println(list);

    }
	}

