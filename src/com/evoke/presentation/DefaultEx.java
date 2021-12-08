package com.evoke.presentation;

interface CarInterface {
	void details();
   default void drive() {
		System.out.println("drive method inside interface");
	}
}

class Benz implements CarInterface {

	public void details() {
		System.out.println("car is a fourwheeler");
	}

//	public void drive() {
//		System.out.println("drive method inside Benz class");
//	}
}

public class DefaultEx {

	public static void main(String[] args) {

		CarInterface obj = new Benz();
		
		obj.details();

		obj.drive();

	}

}
