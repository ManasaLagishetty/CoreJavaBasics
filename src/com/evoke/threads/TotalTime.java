package com.evoke.threads;

import java.util.Scanner;

public class TotalTime extends Thread {

	static int n;

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();

		TotalTime thread = new TotalTime();
		thread.start();

		long end = System.currentTimeMillis();

		
		System.out.println("the time taken to complete the thread excecution is:  " + (end-start) / 1000 + "Seconds");

	}

	public void run() {
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("up to " + n + "the sum is: " + sum);

	}

}
