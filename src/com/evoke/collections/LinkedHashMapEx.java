package com.evoke.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new LinkedHashMap<>();
		map.put(20, "Sugar");
		map.put(40, "Salt");
		map.put(100, "rice");
		map.put(80, "fruits");
		map.put(null, null);
		map.put(100, null);  //one null key allowed and multiple null values allowed
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
