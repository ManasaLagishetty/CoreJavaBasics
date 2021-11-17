package com.evoke.java8features;

interface CircleInferface {
	void show();
}

class CircleImpl implements CircleInferface {
	public void show() {
		System.out.println("Iam a circle");

	}
}

public class Circle {
	public static void main(String[] args) {
		CircleInferface obj = new CircleImpl();
		obj.show();

	}
}
