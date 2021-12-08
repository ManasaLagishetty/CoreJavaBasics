package com.evoke.presentation;

@FunctionalInterface
interface SumInterface {
	void sum(int a, int b);

	int hashCode(); // object class method

}

class SumClass implements SumInterface {

	public void sum(int a, int b) {

		System.out.println(a + b);
	}

}

public class FunctionalInterfaceEx {

	public static void main(String[] args) {
		SumClass obj = new SumClass();
		obj.sum(2, 3);

	}

}
