package com.evoke.java8features;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethod {
 public static void main(String[] args) {
	 List<Integer> list=new ArrayList<>();
	 list.add(2);
	 list.add(4);
	 list.add(10);
	 list.add(8);
	 
	 
	 System.out.println("using for loop");
	 for(int i=0;i<list.size();i++) {
		 System.out.println(list.get(i));
	 }
	 
	 System.out.println("using enhanced for loop");
	 for(int i:list) {
		 System.out.println(i);
	 }
	 
	 System.out.println("using for each method");
	 list.forEach(i -> System.out.println(i));     //'i' will go to the the accept method of consumer interface , and that will print 
 }
}
