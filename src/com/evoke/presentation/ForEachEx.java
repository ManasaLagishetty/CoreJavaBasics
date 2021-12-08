package com.evoke.presentation;

import java.util.Arrays;
import java.util.List;

public class ForEachEx {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(23,34,56,87,9,88,6);
		list.forEach(i -> System.out.println(i));
	}

}
