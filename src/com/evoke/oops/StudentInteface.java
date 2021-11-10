package com.evoke.oops;

 interface StudentInteface { 
	
	void play();
	void write(); // public abstract methods
	void fee();

}
 
 class StudentPlay implements  StudentInteface{

	@Override
	public void play() {
		System.out.println("students are playing in the grount");
		
	}

	@Override
	public void write() {
		System.out.println("students are reading");
		
	}

	@Override
	public void fee() {
		System.out.println("fees structure are different");
		
	}
	 
 }
