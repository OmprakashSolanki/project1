package com.ops.collection;

public class SAComparator implements Comparable {

	int x;

	public SAComparator(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "SA [" + x + "]";
	}

	@Override
	public int compareTo(Object o) { 
		SAComparator s = (SAComparator) o;
		return s.x-this.x;
	}

}
