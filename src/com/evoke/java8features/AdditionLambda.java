package com.evoke.java8features;

@FunctionalInterface                                                   //annotation
interface SumInterface {
	void sum(int a, int b);
	
	//void add1(int x,int y);
}

public class AdditionLambda {
	public static void main(String[] args) {                    // we can also define that using anonymous inner class
		
		SumInterface obj = (a, b) -> System.out.println("addition: " + (a + b));
		obj.sum(10, 20);

	}

}
