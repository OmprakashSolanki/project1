package com.ops.java8;

@FunctionalInterface
interface Interf {
	public abstract int squreIt(int n);
	default void m1() {
		
	}
	static void m2() {
		
	}
	//public void m3();
}

/*class Demo implements Interf {

	@Override
	public int squreIt(int n) {

		return n * n;
	}

}*/

public class Test {

	public static void main(String[] args) {
		Interf d= n->  n*n;
		System.out.println(d.squreIt(5));
		
	}

}
