package com.evoke.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> collection1 = new HashSet<>();
		HashSet<Integer> collection2 = new HashSet<>();

		collection1.add(3);

		collection2.add(3);

		System.out.println(collection1.equals(collection2));

		collection2.add(4);

		System.out.println(collection1.equals(collection2));

		collection1.add(6);

		System.out.println(collection1.equals(collection2));

		System.out.println(collection1.hashCode());

		System.out.println(collection2.hashCode());

		collection1.add(4);

		collection2.add(6);

		System.out.println(collection1.equals(collection2));

		System.out.println(collection1.hashCode());

		System.out.println(collection2.hashCode());

		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(4);
		System.out.println(list.clone());
	}

}
