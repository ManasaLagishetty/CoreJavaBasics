package com.evoke.java8features;

interface AdditionInterface {
	void add(int a, int b);
}

class AdditionImpl implements AdditionInterface {

	public void add(int a, int b) {
		System.out.println(a + b);
	}
}

public class Addition {
	public static void main(String[] args) {
		AdditionInterface obj = new AdditionImpl();
		obj.add(10, 20);
	}
}
