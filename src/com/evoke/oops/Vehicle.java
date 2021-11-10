package com.evoke.oops;

public class Vehicle {   //hierarchical
	
	void drive() {
		System.out.println("driving");
	}

}
class Bike extends Vehicle{
	void twoWheeler() {
		System.out.println("two wheeler");
	}
	
}

class Car extends Vehicle{
	void fourWheeler() {
		System.out.println("four wheeler");
	}
}
