package com.evoke.oops;

public class SuperMethod {

	void write() {
		System.out.println("write method in parent class");

	}

}

class Overridesuper extends SuperMethod {

	void write() {
		System.out.println("write method in child class");
	}

	void read() {
		System.out.println("reading..");
	}

	void actions() {
		super.write();
		read();

	}
}
