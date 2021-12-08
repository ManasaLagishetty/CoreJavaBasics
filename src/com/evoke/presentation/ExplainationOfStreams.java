package com.evoke.presentation;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class ExplainationOfStreams {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

		Function<Integer, Integer> f = new Function<Integer, Integer>() {

		 	public Integer apply(Integer t) {

				return t * 2;
			}

		};
		BinaryOperator<Integer> b = new BinaryOperator<Integer>() {

			public Integer apply(Integer t, Integer u) {

				return t + u;
			}

		};
		
		Stream s = values.stream();
		
		Stream s1 = s.map(f);
		
		int result = (int) s1.reduce(0, b);
		  
		System.out.println(result);

	}

}
