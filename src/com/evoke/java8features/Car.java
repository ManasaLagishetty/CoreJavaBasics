package com.evoke.java8features;

interface CarInterface{
	default void drive() {
	System.out.println("drive method inside interface");
	}
}

class Benz implements CarInterface{
//	public void drive() {
//		System.out.println("drive method inside Benz class");
//	}
}

public class Car {

	public static void main(String[] args) {

		 CarInterface obj=new  Benz();
		 
		 
		 obj.drive();
		 

	}

}
