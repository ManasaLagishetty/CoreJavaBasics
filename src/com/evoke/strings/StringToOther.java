package com.evoke.strings;

public class StringToOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "123";

		int result = Integer.parseInt(str); 

		System.out.println(str + 10); 

		System.out.println(result + 10); 

		String str1 = "true";

		boolean isCorrect = Boolean.parseBoolean(str1); 

		System.out.println(isCorrect);

		String str2 = "2.22";

		float weight = Float.parseFloat(str2); 

		System.out.println(weight);

	}

}
