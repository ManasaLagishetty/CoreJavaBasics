package com.evoke.generics;

public class GenericsClass<T> {// string,Integer ,character T-->any type of data it will accept ,which passes
								// in main method
	T obj;                       // String name;

	GenericsClass(T obj) {
		this.obj = obj;
	}

	T getObjectValue() {

		return obj;
	}
	

}
