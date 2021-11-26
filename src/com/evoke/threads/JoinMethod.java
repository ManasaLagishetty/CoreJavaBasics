package com.evoke.threads;

public class JoinMethod extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinMethod thread1 = new JoinMethod();
		JoinMethod thread2 = new JoinMethod();
		JoinMethod thread3 = new JoinMethod();
		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		thread2.start();
		thread3.start();

	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.print(i+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
