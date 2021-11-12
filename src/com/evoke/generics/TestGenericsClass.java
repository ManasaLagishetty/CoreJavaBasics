package com.evoke.generics;

public class TestGenericsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericsClass<String> name = new GenericsClass<>("Manasa");
	
		System.out.println(name.getObjectValue());

		GenericsClass<Integer> num = new GenericsClass<>(1234);
	
		System.out.println(num.getObjectValue());

		GenericsClass<Character> ch = new GenericsClass<>('c');
	
		System.out.println(ch.getObjectValue());

	}

}
