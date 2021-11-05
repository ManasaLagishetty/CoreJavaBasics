package com.evoke.strings;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer ();
		
		sb.append("My");
		sb.append("Name");
		
		System.out.println(sb);
		
		
		StringBuffer sb2=new StringBuffer("string");
		
		sb2.append("Class");
		
		System.out.println(sb2);
		
		System.out.println(sb2.capacity());
		
		System.out.println(sb2.reverse());
		
	    System.out.println(sb2.length());
		
		System.out.println(sb2.insert(2, "www"));
		
		System.out.println(sb2.replace(2, 5,"yyy"));

		System.out.println(sb2.delete(2, 5));
	}

}
