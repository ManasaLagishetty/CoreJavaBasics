package com.evoke.threads;

class Studentt {
 synchronized void standard(int number) {
		for (int i = 1; i < number; i++) {
			System.out.println(i);
		}
	}
}
class MyThread1 extends Thread {
	Studentt s;

	MyThread1(Studentt s) {
		this.s = s;

	}

	public void run() {
		s.standard(5);
	}

}
class MyThread2 extends Thread {
	Studentt s;

	MyThread2(Studentt s) {
		this.s = s;

	}

	public void run() {
		s.standard(10);
	}

}
public class SynchronizedMethod {

	public static void main(String[] args) {
		Studentt std = new Studentt();
		MyThread1 t1 = new MyThread1(std);
		MyThread2 t2 = new MyThread2(std);
		
		t1.start();
		t2.start();
	}

}
