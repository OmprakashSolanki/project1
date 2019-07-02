package com.ops.enume;

public class CallableObj {

	
	public String  getThreadValue() {
		
		return "adad";
	}
	
	public static void main(String[] args) {
		
		MyThread mt=new MyThread(); 
		
		Thread t=new Thread(mt);
		
		String s="hdfj";
		s.toCharArray(); 
				
		t.setPriority(11);
		t.start();
		
		CallableObj clone=new CallableObj ();
		
		clone.getThreadValue();
	}
}

