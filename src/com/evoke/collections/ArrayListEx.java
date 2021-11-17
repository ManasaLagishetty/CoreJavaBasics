package com.evoke.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
	
		System.out.println(list);
		
		list.add(2, 100);
		
		System.out.println("after adding at specific index: "+list);
		
		list.set(3, 200);
		System.out.println("after replace at specific index: "+list);
		
		Iterator itr = list.iterator();  
		
		while(itr.hasNext()){  
			
		System.out.println(itr.next()); 

	    }
		list.remove(0);
		System.out.println("after removing 0th index "+list);
		
		System.out.println(list.size());
		
		list.add(50);
		list.add(null);
		
		System.out.println(list);
		
	}
}
