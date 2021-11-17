package com.evoke.collections;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class TreeSetEx { // ascending order ,null not allowed

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random obj = new Random();
		TreeSet<Integer> treeset = new TreeSet<>();

		for (int i = 0; i < 5; i++) {
			int number = obj.nextInt(10);
			treeset.add(number);
			System.out.println(number);
		}

		System.out.println(treeset);

		treeset.add(null);
		System.out.println(treeset);

	}

}
