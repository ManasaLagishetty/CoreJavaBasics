package com.evoke.generics;

import java.util.ArrayList;
import java.util.List;

public class Test2GenericsWild {

	public static void main(String[] args) {
		List< Circle> list=new  ArrayList<>();
		list.add(new Circle());
		list.add(new Circle());
		
		List< Square> list2=new ArrayList<>() ;
		list2.add(new Square());
		list2.add(new Square());
		
	 TestWildCard obj=new TestWildCard();

	obj.detailsOfShape(list);
	obj.detailsOfShape(list2);
	
	}
}
