package com.evoke.threadss;

class Student {
	void standard(int number) {
		for (int i = 1; i < number; i++) {
			System.out.println(i);
		}
	}
}

class myThread1 extends Thread {
	Student s;

	myThread1(Student s) {
		this.s = s;

	}

	public void run() {
		s.standard(5);
	}

}

class myThread2 extends Thread {
	Student s;

	myThread2(Student s) {
		this.s = s;

	}

	public void run() {
		s.standard(5);
	}

}

public class WithoutSynchronization {

	public static void main(String[] args) {
		Student std = new Student();
		myThread1 t1 = new myThread1(std);
		myThread2 t2 = new myThread2(std);

		t1.start();
		t2.start();

	}

}

