package com.evoke.javabasics;

public class WrapperLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num= 20;
		Long objOfNum=Long.valueOf(num); //explicitly
	    Long objOfNum2= num; //Auto Boxing
		
		System.out.println("object of num"+objOfNum);
		System.out.println("object of num"+objOfNum2);
		
		Long digit=new Long(6);
		long longOfDigit=digit.longValue(); //explicitly
		
		long longOfDigit2=digit; //unBoxing
		
		System.out.println(longOfDigit);
		System.out.println(longOfDigit2);

	}

}
