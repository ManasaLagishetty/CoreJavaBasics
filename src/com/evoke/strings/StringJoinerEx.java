package com.evoke.strings;

import java.util.StringJoiner;

public class StringJoinerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringJoiner sjoiner=new StringJoiner(",");
		
		sjoiner.add("Manasa");
		
		sjoiner.add("Sravani");
		
		sjoiner.add("deepthi");
		
		sjoiner.add("Swetha");
		
		System.out.println(sjoiner);

	}

}
