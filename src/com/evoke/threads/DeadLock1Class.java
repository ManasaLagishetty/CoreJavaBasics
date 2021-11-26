package com.evoke.threads;

public class DeadLock1Class {

	public synchronized void method1(DeadLock2Class dl1) {
		System.out.println("in side method 1, in deadlock 1 class");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("invoking method2 in dead lock2");
		dl1.method2();
	}
	

	
	public synchronized void method2() {
		System.out.println("in side method 2, in deadlock 1 class");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
