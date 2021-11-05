package com.evoke.strings;

public class MissingWord2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am going to hyderabad tomorrow";
		String str2 = "I going to tomorrow";

		String[] strArr = str.split(" ");

		for (String word : strArr) {

			if (!str2.contains(word))

				System.out.println(word);

		}
	}
}
