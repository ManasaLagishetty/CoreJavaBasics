package com.evoke.strings;

public class WordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My Name is Manasa";
		String[] str2 = str.split(" ");

		String reverse = "";

		for (String word : str2) {

			char[] ch = word.toCharArray();
			
			for (int i = ch.length - 1; i >= 0; i--) {

				reverse = reverse + ch[i];

			}

		}

		System.out.println(reverse);

	}

}
