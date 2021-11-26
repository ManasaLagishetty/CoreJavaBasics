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

class Servce implements Callable<String> {
	int i;

	public Servce(int i) {
		this.i = i;
	}

	@Override
	public String call() throws Exception {

		Thread.sleep(1000);

		System.out.println(i);

		return "invokes" + i;
	}

}

public class InvokeAllEx {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2);

		System.out.println(new Date());

		List<Callable<String>> callableList = new ArrayList<>();
		callableList.add(new Servicee(1));
		callableList.add(new Servicee(2));
		callableList.add(new Servicee(3));
		callableList.add(new Servicee(4));
		callableList.add(new Servicee(5));

		List<Future<String>> futureList = es.invokeAll(callableList); // invokes any one object and return it

		es.awaitTermination(10, TimeUnit.SECONDS);
		for (Future<String> fut : futureList) {
			System.out.println(fut.get());
		}

		System.out.println(new Date());
	}

}
