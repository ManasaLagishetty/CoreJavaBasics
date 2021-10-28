package com.evoke.javabasics;

public class CallByReference {
	
int num=10;

  void call(CallByReference c) { //reference variable which points to object
	  c.num=c.num+10;
	  System.out.println(c.num);
  }
}
