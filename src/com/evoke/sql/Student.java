package com.evoke.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection c = null; 
		Statement stmt = null;
		ResultSet rs =null;
		
	
			Class.forName("org.postgresql.Driver");                                                          //loading the driver and registering
			
			c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","110996");  //establish connection
			
		    stmt = c.createStatement();                                                                       //creating statement
		    
		   // String sql="create table student(name varchar(20),id int,marks1 int,marks2 int, marks3 int)";
		   
		   //  String sql="insert into student values('Ram',1,34,56,78)";
		    
		   // String sql="insert into student values('Sam',2,84,92,63)";                                       //creating query
		   
		    
		        //   String sql="alter table student add grade varchar(10)";
		    
		
		         //  stmt.execute(sql);
		   
		   
		    
		    
			  // String sql2="update student set marks3 = 99 where id = 3";
		   
		     //   stmt.execute(sql2);
			    
			   // String sql3="delete from student where id = 4";
		   
	         //  stmt.execute(sql3);
		   
	           String sql4="update student set email ='ss@123' where id=3";
		          
		        stmt.execute(sql4);
		    
		   rs=stmt.executeQuery("select * from student");
		    
		    while(rs.next()) {
		    System.out.println(rs.getString(1) + "  " + rs.getInt(2) + "  " + rs.getInt(3) + "  " + rs.getInt(4)+ " "+rs.getInt(5));
		    }
		    stmt.close(); 
		    
	}

}
