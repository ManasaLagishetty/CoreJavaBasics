package com.evoke.strings;

public class CompareString {

	public static void main(String[] args) {

		String str = "Hello";
		String str2 = "hello";

		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));

		System.out.println(str == str2);

		String str3 = "Friendss";

		String str4 = "Hello";

		System.out.println(str.compareTo(str4)); // 0 because both are equal

		System.out.println(str.compareTo(str3));

		System.out.println(str3.compareTo(str));

	}

}
