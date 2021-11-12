package com.evoke.generics;

import java.util.ArrayList;
import java.util.List;

public class WithGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();

		names.add("manasa");
		names.add("evoke");
		names.add("technologies");
		//names.add(10);

		String name1 = names.get(0); //no nees of type casting
		String name2 = names.get(1);
		String name3 = names.get(2);

		System.out.println(name1 + " " + name2 + "" + name3);
	}

}
