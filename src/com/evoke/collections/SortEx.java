package com.evoke.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortEx  {

	public static void main(String[] args) {
		
		List<String> names=new ArrayList<>();
		names.add("Ram");
		names.add("Alexa");
		names.add("Siri");
		names.add("Google");
	
		
		Collections.sort(names);
		System.out.println(names);
      
	}
	}

	