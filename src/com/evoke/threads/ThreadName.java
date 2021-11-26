package com.evoke.threads;

public class ThreadName extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this thread name is: " + Thread.currentThread().getName());

		ThreadName thread = new ThreadName();
		thread.start();

	}

	public void run() {
		Thread.currentThread().setName("my thead");

		System.out.println("This thread name is: " + Thread.currentThread().getName());

	}

}
