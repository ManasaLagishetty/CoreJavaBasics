package com.evoke.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(102, "kamal");
		map.put(101, "Vijay");
		map.put(100, "arna");
		map.put(103, "Rahul");
		
	//	map.put(null, null);

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}

	}
}
