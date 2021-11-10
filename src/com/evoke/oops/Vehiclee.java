package com.evoke.oops;

public abstract class Vehiclee {

	void drive() {
		System.out.println("vehcles are used for driving");
	}

	abstract void brake();

}

class Bikee extends Vehiclee {

	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	void drive() {
		System.out.println("bike driving speed.." + speed);
	}

	void brake() {
		System.out.println("braking..");
	}
	
	void brake(int speed) {
		System.out.println("speed at the time of braking:"+speed);
	}

}
