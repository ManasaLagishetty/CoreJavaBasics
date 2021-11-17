package com.evoke.collections;

import java.util.HashSet;
import java.util.Random;

public class HashSetEx {     //insertion order absent ,allows null

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random obj = new Random();
		HashSet<Integer> hashset = new HashSet<>();
		
		

		for (int i = 0; i < 5; i++) {
			int number = obj.nextInt(10);
			hashset.add(number);
			System.out.println(number);
		}
          hashset.add(null);
		System.out.println(hashset);
	}

}
