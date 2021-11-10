package com.evoke.oops;

class Mobile { // Multi level inheritance

	void talk() {
		System.out.println("used for talking");

	}

}

class Oppo extends Mobile {

	

	void message() {
		System.out.println("used for talking and messaging");
	}

}

class OppoProMax extends Oppo {

	void camera() {
		System.out.println("used for talking , messaging and capturing");
	}

}
