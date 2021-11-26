package com.evoke.threads;

public class TestDeadLock implements Runnable {
	DeadLock1Class  dl1=new DeadLock1Class ();
	DeadLock2Class  dl2=new DeadLock2Class ();

	
	public TestDeadLock() {
		new Thread(this).start();
		dl2.method1(dl1);
		
	}
	public static void main(String[] args) {
		new TestDeadLock();

	}

	@Override
	public void run() {
		dl1.method1(dl2);
		
	}

}
