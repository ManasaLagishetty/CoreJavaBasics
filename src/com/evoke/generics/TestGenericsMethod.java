package com.evoke.generics;

public class TestGenericsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray= {1,2,3,4,5,6};
		Character[] charArray= {'e','v','o','k','e'};
	    String[]  stringArray= {"pen","pencil","school","bat"};
	    
	   GenericsMethod obj=new GenericsMethod();
	   
	   obj. printArray(intArray);
	   obj. printArray(charArray);
	   obj. printArray(stringArray);

	}

}
