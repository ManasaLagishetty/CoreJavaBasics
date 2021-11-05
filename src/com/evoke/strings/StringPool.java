package com.evoke.strings;

public class StringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Manasa";
		String str2 = "Manasa";

		String str3 = new String("Manasa");

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());

		System.out.println(str1 == str2); // compares the memory location
		System.out.println(str1.equals(str2)); // compares the content

		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));


	}

}
