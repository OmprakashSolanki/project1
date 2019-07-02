package com.ops.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingSetNames {
 
	public static void main(String[] args) {
		
		List<String> names=new ArrayList<>();
		
		names.add("om");
		names.add("prakash");
		names.add("aash");
		names.add("mash");

		//Collections.sort(names);
		
		Set<String> s= new TreeSet(names);
		
		for (String string : s) {
			System.out.println(string);
		}
	}
}
