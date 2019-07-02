package com.ops.multithreading;

class MyRunnable implements Runnable {

	@Override
	public void run() {

		System.out.println("MyRunnable.run()");
	}

}

class MyThread extends Thread {
	public MyThread() {
		super();
	}

	MyThread(Runnable target) {
		super(target);
	}

	@Override
	public void run() {

		System.out.println("MyThread.run()");
	}
}

public class Test03 {
	public static void main(String[] args) {
		 //case1
		System.out.println("Main Method started");
		
		Thread th1=new Thread();
		th1.start();
		System.out.println("=====================");
		
		MyThread mt1=new MyThread();
		mt1.start();
		System.out.println("=======================");
		
		MyRunnable mr=new MyRunnable();
			//mr.start();
		
		Thread th2=new Thread(mr);
		th2.start();
		System.out.println("=====================");
		
		MyThread mt2=new MyThread();
		Thread th3=new Thread(mt2);
		th3.start();
		System.out.println("=====================");
		
		Thread th4=new MyThread();
			
		th4.start();
		//#case7
		System.out.println("=====================");
		
		//Thread th5=new MyRunnable();			
		//th5.start();
		
		//#case8

		Runnable r=new MyRunnable();			
		//r.start();
		System.out.println("=====================");

		//case 9
		Thread th6=new MyThread(r);
		
		th6.start();

	}
}