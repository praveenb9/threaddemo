package com.capg.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {

		Runnable task1 = () -> System.out.println(Thread.currentThread().getName());
		// ExecutorService service = Executors.newSingleThreadExecutor();

		int coreCount = Runtime.getRuntime().availableProcessors();
		// System.out.println(coreCount);

		ExecutorService service = Executors.newFixedThreadPool(coreCount);

		for (int i = 1; i <= 10; i++) {
			service.execute(task1);
		}
	}

}

/*
 * class Task implements Runnable {
 * 
 * @Override public void run() {
 * 
 * System.out.println(Thread.currentThread().getName());
 * 
 * }
 * 
 * }
 */