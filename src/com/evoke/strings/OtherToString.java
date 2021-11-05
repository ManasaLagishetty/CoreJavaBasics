package com.evoke.strings;

public class OtherToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int digit = 10;

		String str = String.valueOf(digit); // str=digit-->Error
		String str1 = "10";

		System.out.println(str1 + str);

		float weight = 12.56f;

		String str3 = String.valueOf(weight);
		String str4 = "manasa";

		System.out.println(str3 + str4);

		boolean isFriday = true;

		String str5 = String.valueOf(isFriday);

		System.out.println(str5);

	}

}
