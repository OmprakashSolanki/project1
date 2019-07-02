package com.ops.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class DuplicateStringHashSet {

	public static void main(String[] args) {

		// System.out.println(str3.charAt(3));

		// System.out.println(str3.indexOf(" "));

		// System.out.println(str3.lastIndexOf('a'));

		// System.out.println(str3.indexOf("m",5));

		// System.out.println(str3.lastIndexOf("ro",42));

		// System.out.println("bc".compareTo("bcdfjfjfg"));

		// System.out.println("bc ".contains(" "));

		//System.out.println("bccd".startsWith("cd"));

		//System.out.println("bccd".endsWith("cd"));

		//System.out.println();
		//System.out.println("bcdbc".startsWith("bc", 1));
		//no offset for ends With
		//System.out.println("bccd".endsWith("cd",3));
		String str3 = "Java Programming LANGUAGE";
		String []st5=str3.split("n",4);
		System.out.println(st5);
		for(String s:st5) {
			System.out.println(s.trim());
		}
String s9="";
System.out.println(s9+"a");
		//substring
		System.out.println(str3.substring(7));

		System.out.println();

		StringBuffer sb1 = new StringBuffer("abc");
		System.out.println(sb1);

		System.out.println(sb1.hashCode());

		sb1 = sb1.append("abc");

		System.out.println(sb1.hashCode());
		System.out.println(sb1);
		sb1.hashCode();

		System.out.println("..........................");
		String arr[] = { "abc", "xyz", "abc", "123" };

		List<String> list = new ArrayList<>();

		// List list= Arrays.asList(l);
		list.add("a");
		list.add("a");
		list.add("b");

		Stream st = list.stream();

		// println(Object obj::st);
		System.out.println(list);
		Set<String> uniSet = new HashSet<>(list);

		System.out.println(uniSet);

		for (String obj : arr) {

			Boolean isAdded = uniSet.add(obj);
			if (!isAdded) {
				System.out.println(obj);
				obj.concat("fjf");
			}
		}
		System.out.println(uniSet);
	}

}
