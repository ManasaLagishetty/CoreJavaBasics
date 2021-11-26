package com.evoke.threads;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Service implements Runnable {
	int i;

	public Service(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		System.out.println(i + " ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

public class ExecuterServiceEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ExecutorService es = Executors.newFixedThreadPool(5);
		System.out.println(new Date());
		for (int i = 0; i < 25; i++) {
			es.execute(new Service(i));
		}
       //es.shutdown();   //will not wait for the task to complete
    es.awaitTermination(10,TimeUnit.SECONDS);  //shut down the Executor after task completion
     System.out.println(new Date());
	}

}
