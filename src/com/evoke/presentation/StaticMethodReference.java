package com.evoke.presentation;

interface furniture {
	void table(String s);
}

class tableClass {

	static void tableMethod(String s) {
		System.out.println(" we are in table class: " + s);
	}
}

public class StaticMethodReference {

	public static void main(String[] args) {

		furniture obj2 = s -> System.out.println(s);
		obj2.table("chair");

		furniture obj = tableClass::tableMethod;
		obj.table(" Furtinure ");
	}

}
