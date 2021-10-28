package com.evoke.javabasics;

public class ConceptOfFinal {
	
		 final int speed=90;  //final variable  
		 
		 void drive(){ 
			 System.out.println("Speed of the car"+speed);
			 
		  // speed=400;  //error because of trying to change the final value 
		 }  
		 
}
