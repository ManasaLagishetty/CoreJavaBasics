package com.evoke.strings;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome to Evoke Technologies";

		String str2 = "come";

		System.out.println("length of the String: " + str.length());
		System.out.println("Character at given Index: " + str.charAt(2)); // based on index position 0,1,2

		System.out.println("substring from given index: " + str.substring(3));
		System.out.println("substring from given index to given index: " + str.substring(3, 7));
		System.out.println(str.contains(str2));

		System.out.println(str.equals(str2));

		System.out.println(str.isEmpty()); // return true if length is 0

		System.out.println(str.replace('e', 'E'));

		System.out.println(str2.toUpperCase());

		String str3 = "WELCOME";

		System.out.println(str3.toLowerCase());

	}

}
