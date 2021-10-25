package com.evoke.javabasics;

public class WrapperInt {
	public static void main(String args[]) {
		int num=10;
		
		Integer objOfNum=Integer.valueOf(num); //converting into Integer Explicitly ,
		                                        //by using Integer.valueOf method
		Integer objOfNum2 = num;  //  compiler will write the valueOf method internally,
		                         //which is known as Auto boxing
		
		System.out.println("object of int "+objOfNum);
		
		System.out.println("object of int "+objOfNum2);
		
		Integer digit=new Integer(3);
		 int intOfDigit=digit.intValue();//converting into int explicitly by using intValue() method
		 int intOfDigit2=digit;     //compiler will write the method internally, Un boxing
		 
		System.out.println("int value of objec t"+intOfDigit);
		System.out.println("int value of objact "+intOfDigit2);
		
		
		
	}

}
