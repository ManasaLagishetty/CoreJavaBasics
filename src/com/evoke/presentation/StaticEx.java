package com.evoke.presentation;

interface StaticInterface {
	static void MyMethod() {
		System.out.println("Iam in the static method");
	}
}

public class StaticEx {

	public static void main(String[] args) {

		StaticInterface.MyMethod();

	}

}
