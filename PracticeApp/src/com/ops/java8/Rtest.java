package com.ops.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class Rtest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		/*
		 * Runnable runnable=()->{
		 * 
		 * for (int i = 0; i < 7; i++) { System.out.println("Child Thread"); } };
		 * 
		 * Thread t=new Thread(runnable); t.start();
		 */

		Callable cal = () -> {

			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
			}
			return Thread.currentThread().getName();

		};

		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);

		List<Future> lf = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			Future f = executor.submit(cal);
			lf.add(f);
		}

		for (Future future : lf) {
			System.out.println(future.get());
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}
}
