package com.evoke.threads;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class Servicess implements Callable<String> {
	int i;

	public Servicess(int i) {
		this.i = i;
	}

	@Override
	public String call() throws Exception {
		
		System.out.println(i);
		

		return "printing from future " + i;
	}

}

public class SubmitCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService es = Executors.newFixedThreadPool(2);

		System.out.println(new Date());

		List<Future<String>> futureList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			futureList.add(es.submit(new Servicess(i)));
		}
		es.awaitTermination(10, TimeUnit.SECONDS);

		for (Future<String> future : futureList) {
			System.out.println(future.get()); //values
		}
		System.out.println(new Date());

	}

}
