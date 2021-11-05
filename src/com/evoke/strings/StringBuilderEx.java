package com.evoke.strings;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("String");
		sb.append("Builder");
		
		System.out.println(sb);
		System.out.println(sb.insert(2, "yyy"));
		System.out.println(sb.replace(2, 5, "www"));
		
		System.out.println(sb.delete(2,5));
		System.out.println(sb.reverse());
		

	}

}
