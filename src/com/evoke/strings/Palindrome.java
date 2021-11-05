package com.evoke.strings;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str="madam";
	        char[] ch=str.toCharArray();
	        
	        String reverse="";
	        for(int i=ch.length-1;i>=0;i--) {
	        
	          reverse=reverse+ch[i];
	        	
	        }
	        
	        System.out.println(reverse);
	
	
	if(str.equals(reverse)) {
		 System.out.println(str +"is palindrome");
	}

}
}