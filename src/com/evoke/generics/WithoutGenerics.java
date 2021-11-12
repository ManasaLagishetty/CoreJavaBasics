package com.evoke.generics;

import java.util.ArrayList;
import java.util.List;

public class WithoutGenerics {

	public static void main(String[] args) {
	
		List names=new ArrayList();
		
		names.add("manasa");
		names.add("evoke");
		names.add(123);
		
		String name1= (String) names.get(0);  //type casting
		String name2= (String) names.get(1);
		String name3= (String) names.get(2);
		
		System.out.println(name1+" "+name2+" "+name3);

	}

}
