package com.ops.collection.treeset;

import java.util.TreeSet;

public class School {

	public static void main(String[] args) {
		
		TreeSet<Student> ts=new TreeSet<>(new StudentRevNatSOComparator());
		
		ts.add(new Student(101,"Manoj","CRT",1000,5));
		ts.add(new Student(101,"Ramu","Restful",1000,5.9));
		ts.add(new Student(102,"Manish","Core Java",1000,7));
		ts.add(new Student(103,"Praveen","Oracle",1000,5.6));
		ts.add(new Student(104,"Pradeep","Hibernate",1000,5));
		System.out.println(ts);
		
		//student height comparator
		
TreeSet<Student> ts1=new TreeSet<>(new StudentHeightComparator());
		
		ts1.add(new Student(101,"Manoj","CRT",1000,6));

		ts1.add(new Student(102,"Ramu","CRT",1000,5));

		ts1.add(new Student(107,"Manish","Core Java",1500,7));

		ts1.add(new Student(103,"Praveen","Oracle",1600,5));

		ts1.add(new Student(104,"Pradeep","Hibernate",1000,5));
		System.out.println(ts1);
		
	}
}
