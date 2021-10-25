package com.evoke.javabasics;

 class Varargs {
	void display(String... names) {
		
		for(String s:names) {
			System.out.println(s);
		}
		
	}
   public int sum(int... digits) {
		 int sum=0;
		for(int i:digits) {
			sum=sum+i;
		}
		return sum;
	}
	
	

}
