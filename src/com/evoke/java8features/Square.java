package com.evoke.java8features;

interface SquareInterface {
	void show();
}
public class Square {

	public static void main(String[] args) {
		
		SquareInterface obj = new SquareInterface() {
			public void show() {
			System.out.println("Iam a square");
		}		
	};
		
	//	SquareInterface obj=() ->System.out.println("Iam a square");
		
			
		obj.show();

	}

}
