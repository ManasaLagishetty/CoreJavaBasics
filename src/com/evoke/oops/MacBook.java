package com.evoke.oops;

public class MacBook {
	void start() {
		System.out.println("start method inside MACBook");
	}

	void shutDown() {
		System.out.println("shut down inside MACBook");
	}

}

class MacBookPro extends MacBook {

	void start() {
		System.out.println("start method inside MACBookPro");
	}

	void shutDown() {
		System.out.println("shutDown inside MACBookPro");
	}
}

class MacBookAir extends MacBook {

	void start() {
		System.out.println("start method inside MACBookAir");
	}

	void shutDown() {
		System.out.println("shutDown inside MACBookAir");
	}

}
