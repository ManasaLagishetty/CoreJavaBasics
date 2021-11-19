package com.evoke.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class ExplainStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

		Stream s = values.stream(); // we have 1,2,3,4,5

		Stream s1 = s.map(f); // it accepts the object of function

		// in this we have 2,4,6,8,10

		//s1.forEach(System.out::println);

		Integer result = (Integer) s1.reduce(0, b); // accepts the binary operator //it returns integer

		                                           // 0+2=2, 2+4=6,6+6=12,12+8=20,20+10=30
		
		System.out.println(result);

	}

}
