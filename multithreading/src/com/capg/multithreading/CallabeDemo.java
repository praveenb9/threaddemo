package com.capg.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallabeDemo {

	public static void main(String[] args) {


		Callable<Integer> task=()->{return Thread.currentThread().getPriority();};

		int coreCount = Runtime.getRuntime().availableProcessors();
		ExecutorService service = Executors.newFixedThreadPool(coreCount);
		Future<Integer> value=service.submit(task);
		try {
			System.out.println(value.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
