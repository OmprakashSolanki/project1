package com.ops.collection;

class Example 
{
	

	int a = 10;
	@Override
	public String toString() {
		return "Example [a=" + a + "]";
	}
	public Example(int a) {
		System.out.println("Example.Example()");
		this.a=a;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Example e=new Example(7);
		System.out.println(e.clone());
	}
	
}
class Example2 extends Example{

	public Example2(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	
}

public class SA extends Example2 {
	
	
	/*
	 * public class SA implements Comparable {
	 * 
	 * int x;
	 * 
	 * public SA(int x) { this.x = x; }
	 * 
	 * @Override public String toString() { return "SA [" + x + "]"; }
	 * 
	 * @Override public int compareTo(Object o) { SA s=(SA)o; return this.x-s.x; }
	 */

	public SA(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Example2 e=new Example2(5);
	
		Example2 e2=(Example2) e.clone();
		System.out.println(e2.toString());
		System.out.println(e2.toString());
		
		SA sa=new SA(9);
		System.out.println(sa);
		System.out.println(sa.clone());
	}

}
