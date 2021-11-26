package com.evoke.threads;

public class RunnableExample implements Runnable {

	public static void main(String[] args) {
		RunnableExample runnable=new RunnableExample();
		
		Thread thread = new Thread(runnable);   //creating object to thread class 
		thread.start();
		

	}
	public void run() {
		System.out.println("Iam a thread");
	}

}
