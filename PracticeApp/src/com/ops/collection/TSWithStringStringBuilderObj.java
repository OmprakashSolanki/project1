package com.ops.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class TSWithStringStringBuilderObj {

	public static void main(String[] args) {
		 TreeSet<StringBuilder> ts=new TreeSet<StringBuilder>(new StringBuilderComprator());
		 
		 ts.add(new StringBuilder("a"));
		 ts.add(new StringBuilder("b"));
		 ts.add(new StringBuilder("e"));
		 System.out.println(ts);
		  
		 Map<String,String> map=new HashMap();
		 map.put("abc", "1");
		 map.put("abc", "123");

		/* System.out.println(map.put("abc", "123"));
		 
		 System.out.println(map.put("abc", "234"));
		 System.out.println(map.put("abc", "123"));
		 System.out.println(map.put("abc", "234"));*/


	}

}
 