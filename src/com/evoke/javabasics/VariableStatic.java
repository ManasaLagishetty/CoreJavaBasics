package com.evoke.javabasics;

public class VariableStatic {

	  int rollNo;
	  String name;
	  String college="RGUKT";  //used to refer the common property of all the objects
	  VariableStatic(int rollNo, String name){
		  this.rollNo=rollNo;
		  this.name=name;
		  
	  }
	  void details() {
		  System.out.println("Roll number: "+rollNo +"Name: "+name+"College: "+college);
	  }
}
