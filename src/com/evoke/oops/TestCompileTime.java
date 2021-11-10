package com.evoke.oops;

public class TestCompileTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileTimePoly obj=new CompileTimePoly();
		obj.sum(12);
		obj.sum(20,10);
		obj.sum(20.7f,30.7f);
		obj.sum(1.2f,4.6f,5.7f);

	}

}
