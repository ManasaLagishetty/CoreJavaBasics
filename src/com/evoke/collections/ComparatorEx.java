package com.evoke.collections;

import java.util.Comparator;

public class ComparatorEx implements Comparator <Integer>{

	
	public int compare(Integer obj1, Integer obj2) {
		
		if(obj1%10 > obj2%10)
			return 1;
		
		return -1;
		
	}

}
