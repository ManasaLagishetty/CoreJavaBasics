package com.evoke.java8features;

interface furniture{
	void table(String s);
}

class tableClass{
	
	 static void tableMethod(String s) {
		System.out.println(" we are in table class but we can be accesed by interface: "+s);
	}
}
public class StaticMethodReferencing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		furniture obj2=s->System.out.println(s);
		obj2.table("chair");
		
	    furniture obj = tableClass::tableMethod;
		obj.table(" Furtinure ");

	}

}
