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

class Servicee implements Callable<String> {
	int i;

	public Servicee(int i) {
		this.i = i;
	}

	@Override
	public String call() throws Exception {

		System.out.println(i);

		return "invokes only" + i;
	}

}

public class InvokeAnyEx {

	public static void main(String[] args) throws InterruptedException, ExecutionException  {
		ExecutorService es = Executors.newFixedThreadPool(2);

		System.out.println(new Date());

		List<Callable<String>> futureList = new ArrayList<>();
		futureList.add(new Servicee(1));
		futureList.add(new Servicee(2));
		futureList.add(new Servicee(3));
		futureList.add(new Servicee(4));
		futureList.add(new Servicee(5));
		
		String str = es.invokeAny(futureList);  //invokes any one object and  return it
		
		
     
		es.awaitTermination(10, TimeUnit.SECONDS);
		System.out.println(str);

		System.out.println(new Date());
	}

}
