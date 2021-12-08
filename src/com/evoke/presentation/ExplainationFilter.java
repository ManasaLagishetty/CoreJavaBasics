package com.evoke.presentation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExplainationFilter {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(12,20,35,46,55,67,75);
		
		Predicate<Integer> p=new Predicate<Integer>() {

		
			public boolean test(Integer i) {
				
				return i%5==0;
			}
			
		};
		
		
		
		System.out.println(list.stream().filter(p).reduce(0,(c,e)->c+e));
	}

}
