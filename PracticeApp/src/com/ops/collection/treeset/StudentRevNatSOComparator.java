package com.ops.collection.treeset;

import java.util.Comparator;

public class StudentRevNatSOComparator implements Comparator<Student> {

	
	@Override
	public int compare(Student s1, Student s2) {

		return s2.compareTo(s1);
	}

	
}
