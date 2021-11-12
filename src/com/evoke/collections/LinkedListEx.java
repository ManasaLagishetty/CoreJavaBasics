package com.evoke.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List<String> names=new LinkedList<>();
   
   names.add("Manasa");
   names.add("evoke");        // 
   names.add("Book");
   names.add("Salary");
   
   System.out.println(names);
   names.add(null);
   
   System.out.println(names);
   
   
	}

}
