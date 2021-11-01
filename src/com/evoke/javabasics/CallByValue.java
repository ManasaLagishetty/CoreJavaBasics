package com.evoke.javabasics;

public class CallByValue {
	int num=10;
	
	void call(int num) {
		
		num=num+10; //changes will be in the method 
		System.out.println("in the method: "+num);
	}

}

