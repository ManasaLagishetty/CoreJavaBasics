package com.evoke.strings;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub D
		String str ="Hello";
		String str2="world";
		
		System.out.println("Before concate:  \nstr: " +str+"\n" +"str2: "+str2);
		
		str=str.concat(str2);
		
		System.out.println("after concate:  \nstr: " +str+"\n" +"str2: "+str2);
		
		
		String str3=str+str2;
		System.out.println(str3);
		

	}

}
