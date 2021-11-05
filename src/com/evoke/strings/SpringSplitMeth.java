package com.evoke.strings;

public class SpringSplitMeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome to Evoke Technologies";

		String[] str2 = str.split(" ");

		for (String word : str2) {
			System.out.println(word);
		}

		System.out.println(str2.length);

		String[] str3 = str.split(" ", 2);

		for (String word : str2) {
			System.out.println(word);

		}
		System.out.println(str3.length);

	}
}
