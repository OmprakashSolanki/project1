package com.ops.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcCollection  {

	public static void main(String[] args) {
	
	ArrayList<String> l= new ArrayList<>();
	
	Scanner sc= new Scanner(System.in);

	List list=Collections.synchronizedList(l);
	
	List l5=new CopyOnWriteArrayList<>();
	List l2=new CopyOnWriteArrayList<>(l);
	l2.add("4");
	String arr[]= {"a","d","c","4","f"};
	
	for (String object : arr) {
		
		System.out.println(object);
	}
	}
}
