package com.ops.multithreading;

class A{
	
}
class MT extends Thread {

	@Override
	public void run() {
		
		
		exceute();
		this.setPriority(2);
		this.setName("majs");
		System.out.println(this.getName()+"   "+this.getPriority());
		System.out.println("Thread Excecution started");
		
	}

	private synchronized   void exceute() {

			try {
			 this.wait(1000);
				
				System.out.println("Wait started");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(2000);
				System.out.println("wait Ended");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
}

public class MTTest {

	public static void main(String[] args) throws InterruptedException {
		MT t = new MT();
		MT t2 = new MT();

		t.setPriority(9);
		t2.setPriority(8);

		System.out.println("main started");
		t.start();
		t.yield();
		t2.start();
		t2.setPriority(4);
		Thread.sleep(1000); 
		System.out.println(t.getName());
		
		System.out.println(t2.getName());
		System.out.println("main ended");
		
	}
}
