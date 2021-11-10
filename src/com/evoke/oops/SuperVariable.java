package com.evoke.oops;

public class SuperVariable {

	String name = "Evoke"; 

}

class SuperOverride extends SuperVariable {

	String name = "technologies";

	void show() {
		System.out.println(super.name);
		System.out.println(name);

	}

}
