package com.evoke.java8features;

import java.util.Arrays;
import java.util.List;

public class WithoutStream {

	public static void main(String[] args) {
	List<Integer> values= Arrays.asList(1,2,3,4,5);
	
	int result=0;
	
	for(int i:values) {
		result = result+i*2;  //mutation is 6 times for result
	}
	System.out.println(result);
	}

}
