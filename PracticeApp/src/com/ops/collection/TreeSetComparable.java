package com.ops.collection;

import java.util.TreeSet;

public class TreeSetComparable {
	public static void main(String[] args) {

		TreeSet<Object> ts = new TreeSet<Object>();

		ts.add(new SAComparator(4));

		ts.add(new SAComparator(3));

		ts.add(new SAComparator(5));

		ts.add(new SAComparator(2));

		ts.add(new SAComparator(2));
		//ts.add("s");

		System.out.println(ts);

	}
}
