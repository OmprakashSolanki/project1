package com.ops.collection;

import java.util.TreeSet;

public class TSWithStringObj {

	public static void main(String[] args) {
		 TreeSet<String> ts=new TreeSet<String>(new StringComparator());
		 
		 ts.add("a");
		 ts.add("b");
		 ts.add("e");
		 System.out.println(ts);
	}

}
