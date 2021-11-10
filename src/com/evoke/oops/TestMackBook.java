package com.evoke.oops;

public class TestMackBook {

	public static void main(String[] args) {

		MacBook obj = new MacBookPro(); //MacBookPro obj = new MacBookPro();
		
		obj.start();
		obj.shutDown();

		MacBook obj2 = new MacBookAir();
		obj2.start();
		obj2.shutDown();

	}

}
