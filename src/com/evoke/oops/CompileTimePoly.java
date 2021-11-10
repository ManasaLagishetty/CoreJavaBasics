package com.evoke.oops;

public class CompileTimePoly {
	
	void sum(int num1) {
		int num2=10;
		System.out.println("sum of the integers: "+num1+num2);
	}
	
	void sum(int num1,int num2) {
		System.out.println("sum of the integers: "+num1+num2);
	}
	
	void sum(float num1, float num2) {
		System.out.println("sum of the float values: "+num1+num2);
	}
	
	void sum(float num1,float num2,float num3) {
		System.out.println("sum of the float values: "+num1+num2+num3);
	}

}
