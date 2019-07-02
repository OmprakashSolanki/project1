package com.ops.collection;

import java.util.TreeSet;

public class TreeSetComparableName {
	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();

		ts.add(new String("Shyam"));
		//System.out.println("4    " + ts);

		ts.add(new String("Ram"));
		//System.out.println("3    " + ts);

		ts.add(new String("Mohan"));
		//System.out.println("5    " + ts);
		ts.add(new String("Mahan"));

		System.out.println(ts.add(new String("RamNath")) + "  2    " + ts);

		System.out.println(ts.add(new String("RamNath")) + "   2    " + ts);

		System.out.println(ts);

	}
}
