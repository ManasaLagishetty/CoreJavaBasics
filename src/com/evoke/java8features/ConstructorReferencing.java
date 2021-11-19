package com.evoke.java8features;

interface MyInterface{
	void student(int i);
}


class myClass{
	myClass(int i){
		System.out.println("student is "+i +"class");
	}
}

public class ConstructorReferencing {
	public static void main (String[] args) {
	
	MyInterface obj=  i -> System.out.println("studying "+i + "class");
	
	obj.student(10);
	
	MyInterface obj2 = myClass::new;
	
	obj2.student(12);

}
}