package com.evoke.strings;

public class WordReverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My Name is Manasa";
		String[] str2 = str.split(" ");

		String reverseStr = "";
		for (String word : str2) {

			// System.out.println(word);

			StringBuffer sb = new StringBuffer(word);

			sb.reverse();

			reverseStr += sb.toString();

		}
		System.out.println(reverseStr);

	}
}