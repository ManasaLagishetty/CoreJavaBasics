package com.evoke.java8features;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceEx {

	public static void main(String[] args) {
	
		List<String> names= Arrays.asList("Ram","Sam","John","Roy");
		
		System.out.println("using lambda expressions");
		names.forEach(str -> System.out.println(str));
		
		System.out.println("using method Referencing");
		names.forEach(System.out::println);
		

	}

}
