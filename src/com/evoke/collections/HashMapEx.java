package com.evoke.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String , Integer> student=new HashMap<>();
		
		student.put("Ram", 30);
		student.put("Sam", 40);
		student.put("Raj", 60);
		student.put("Rohan",80);
		//student.put("Rohan",100); //duplicate key
		student.put("Rahul",80);
		student.put(null, null);  //only one null key allowed, multiple null values allowed
		student.put(null, 90); 
		student.put("Reena", null);
		
		for(Map.Entry m: student.entrySet() ) {
			
			 System.out.println(m.getKey()+" "+m.getValue());
			
		}

	}

}
