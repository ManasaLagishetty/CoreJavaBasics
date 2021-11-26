package com.evoke.threads;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class Services implements Runnable {
	int i;

	public Services(int i) {
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


public class SubmitRunnable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
   ExecutorService es=Executors.newFixedThreadPool(2);
   
   System.out.println(new Date());
   
   List<Future<String>> futureList=new ArrayList<>();
   
   for(int i=0;i<10;i++) {
	   futureList.add((Future<String>)es.submit(new Services(i)));
   }
   es.awaitTermination(10, TimeUnit.SECONDS);
   
   for(Future<String> future: futureList) {
	   System.out.println(future.get()); //null data
   }
   System.out.println(new Date());
	}

}
