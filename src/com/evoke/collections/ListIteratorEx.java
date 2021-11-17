package com.evoke.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();

		list.add("manasa");
		list.add("evoke");
		list.add("technologies");
		list.add("employee");

		ListIterator<String> itr = list.listIterator();

		System.out.println("list elements in the forward direction");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("list elements from backward direction");

		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}
