package com.evoke.threads;

public class SleepMethod extends Thread {

	public static void main(String[] args) {

		SleepMethod obj = new SleepMethod();
		obj.start();

		for (int j = 1; j <= 10; j++) {
			System.out.print("J:" + j + "\t");
		}
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.print("i:" + i + "\t");

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}
}
