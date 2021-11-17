package com.evoke.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;

public class LinkedHashSetEx { // insertion order present,allows null

	// TODO Auto-generated method stub
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random obj = new Random();
		LinkedHashSet<Integer> set = new LinkedHashSet<>();

		for (int i = 0; i < 5; i++) {
			int number = obj.nextInt(10);
			set.add(number);
			System.out.println(number);
		}
		set.add(null);
		System.out.println(set);

		Iterator<Integer> itr = set.iterator();
  
		while (itr.hasNext()) {                 //traverse in the forward direction
			System.out.println(itr.next());

			itr.remove();
		}

		System.out.println(set);

	}

}
