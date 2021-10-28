package com.evoke.javabasics;

public class TestOfCallByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByReference c=new CallByReference();
		
		System.out.println("before change: "+c.num);
		c.call(c);
		System.out.println("after change: "+c.num);

	}

}
