package com.evoke.javabasics;

public class TestOfUserDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 UserDefinedData obj=new  UserDefinedData(1,"Manasa",300000);
		 
		 UserDefinedData obj2=new  UserDefinedData(2,"Sravani",40000);
		 
		 System.out.println(obj.toString());
		 System.out.println(obj2.toString());
		 
		obj.setId(500000);
		System.out.println( obj.getId());
		 
		
		 
		 

	}

}
