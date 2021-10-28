package com.evoke.javabasics;

public class TestOfCallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValue c=new CallByValue() ;
		System.out.println("before change: "+c.num);
				c.call(10);
		System.out.println("after change: "+c.num);

	}

}
