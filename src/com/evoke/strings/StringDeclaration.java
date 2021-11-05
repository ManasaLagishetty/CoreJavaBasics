package com.evoke.strings;

public class StringDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Manasa"; //literal
		
		String str2=new String("Sravani"); //creating reference variable for String class using new keyword
		
	    char ch[]= {'E','V','O','K','E'};
	    
	    String str3=new String(ch);
	    
	    
        byte bt[]= {65,66,67};
	    
	    String str4=new String(bt);
	    
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		

	}

}
