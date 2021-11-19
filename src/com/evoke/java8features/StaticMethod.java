package com.evoke.java8features;

interface StaticInterface {
	static void MyMethod() {
		System.out.println("Iam in the static method");
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInterface.MyMethod();
	}

}
