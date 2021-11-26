package com.evoke.threads;

public class TestDaemonThread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
		DaemonThread daemon = new DaemonThread();
		daemon.setDaemon(true);     //daemon thread,low priority 
		System.out.println(daemon.isDaemon()); //user thread, high priority thread
		daemon.start();
	}

}
