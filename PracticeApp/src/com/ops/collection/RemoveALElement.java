package com.ops.collection;

import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class RemoveALElement {
	public static void main(String[] args) throws InterruptedException {
		List<Integer> a = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 });
		List<Integer> b = Arrays.asList(new Integer[] { 2, 3, 4 });
		// Collection<Integer> aMinusB = CollectionUtils.subtract(a, b);
		// System.out.println(aMinusB);
		Stack stack = new Stack();
		stack.push("1");
		stack.pop();
		Vector<String> vector = new Vector();

		vector.addElement("b");
		vector.add("a");
		vector.add("c");
		Enumeration<String> num = vector.elements();

		while (num.hasMoreElements()) {

			String obj = num.nextElement();
			System.out.println(obj);
			// vector.remove("a");
			// vector.add("y");
		}

		System.out.println("....................");
		List<String> l = new ArrayList<String>();
		l.add("2");
		l.add("4");
		l.add("3");

		// Enumeration et= vector.elements();
		Iterator<String> itr = l.iterator();
		//System.out.println(l);

		while (itr.hasNext()) {
			// itr.remove();
			l.add("7");
			System.out.println(itr.next());
			//itr.remove();
			// System.out.println(l);

		}
		System.out.println(l);

		/*
		 * ListIterator<String> itr = l.listIterator(); System.out.println(l);
		 * 
		 * while (itr.hasNext()) { // itr.remove(); itr.add("8");
		 * 
		 * System.out.println(itr.next()); itr.set("7");
		 * 
		 * // itr.remove(); // System.out.println(l);
		 * 
		 * } ListIterator<String> litr = l.listIterator(); System.out.println(l);
		 * 
		 * while (litr.hasPrevious()) { // itr.remove(); // litr.add("8");
		 * 
		 * System.out.println(itr.previous()); // litr.set("7");
		 * 
		 * // itr.remove(); // System.out.println(l);
		 * 
		 * }
		 * 
		 * System.out.println(l); for (String s : l) { System.out.println(s); } Iterable
		 * itb; AbstractList al; AbstractSequentialList<String> abslist; ArrayList al2;
		 * HashSet hs; TreeSet<String> ts; LinkedHashSet<String> lhs; LinkedList ll;
		 * Vector v; Stack s; // EnumSet<Enum<EnumSet.E>> es;
		 * 
		 * List sl = Collections.synchronizedList(l); System.out.println(l);
		 * System.out.println(sl); sl.add("1");
		 * 
		 * System.out.println(l.hashCode());
		 * System.out.println(System.identityHashCode(l));
		 * System.out.println(sl.hashCode());
		 * System.out.println(System.identityHashCode(sl));
		 * 
		 * String str = "z"; String sw = "z"; System.out.println(str.hashCode());
		 * System.out.println(System.identityHashCode(str)); System.out.println(sw);
		 * System.out.println(System.identityHashCode(sw));
		 * 
		 * vector = null;
		 * 
		 * System.gc();
		 * 
		 * System.out.println("..........................."); Map<String, Object> mp =
		 * new HashMap<>();
		 * 
		 * System.out.println(mp.put("aman", 500));
		 * 
		 * //System.out.println("null".hashCode()); System.out.println(mp.put("suman",
		 * 1000)); System.out.println(mp.put("suman", 1000));
		 * System.out.println(mp.put("suman", 1000)); System.out.println(mp.put("suman",
		 * 3000));
		 * 
		 * //System.out.println("null".hashCode()); System.out.println(mp.put("Tarun",
		 * 2000));
		 */

	}

}
