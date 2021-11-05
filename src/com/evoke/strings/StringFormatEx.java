package com.evoke.strings;

public class StringFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        String str1 = String.format("%d", 111);  // Integer value  %d=>format 
	        
	        String str2 = String.format("%s", "Manasa"); // String value  
	        
	        String str3 = String.format("%f", 123.080);       // Float value 
	        
	        String str4 = String.format("%x", 104);          // Hexadecimal value  
	        
	        String str5 = String.format("%c", 'E');          // Char value  
	        
	        System.out.println(str1);
	        System.out.println(str2);  
	        System.out.println(str3);  
	        System.out.println(str4);  
	        System.out.println(str5);  
	}

}
