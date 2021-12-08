package com.evoke.presentation;

interface CircleInterface {
	void show();
}

/*
 * class CircleClass implements CircleInterface{
 * 
 * public void show() { 
 * System.out.println("Iam Circle");
 * }
 * }
 */

public class LambdaExpressionsEx {

	public static void main(String[] args) {

		// CircleClass obj=new CircleClass();
		// obj.show();
		
		CircleInterface circle = () ->
			
				System.out.println("Iam circle");
			

		
		circle.show();
	}
}
