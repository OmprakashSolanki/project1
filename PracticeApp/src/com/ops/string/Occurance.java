package com.ops.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Occurance {
	static Map<Character, Integer> charCountmap = new HashMap();
	
	
	
	public static void occurance() {
		String str = "zaavdfaaa";

		char[] ch = str.toCharArray();


		for (int i = 0; i < ch.length; i++) {
			if (!charCountmap.containsKey(ch[i])) {
				
				charCountmap.put(ch[i], 1);

			} 
			else {
				charCountmap.put(ch[i], charCountmap.get(ch[i])+1);
			}

		}
		/*for(int i=0;i<charCountmap.size();i++){
			System.out.println("Occurance of "+ch[i]+"  "+charCountmap.get(ch[i]));
	
		}*/
		
	/*	for (Character key: charCountmap.keySet()) {
			System.out.println("Occurance of "+key+" is "+charCountmap.get(key));
		}*/
		
		/*Iterator<Map.Entry<Character, Integer>> itr=charCountmap.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry< Character, Integer> entry=itr.next();
			System.out.println("Occurance of "+entry.getKey()+" is "+entry.getValue());

		}*/
		
		charCountmap.forEach((k,v)->{
			System.out.println("Occurance of Character :"+k+" "+v);
		});
		
	}
	public static void main(String[] args) {
			
		occurance();
		

		
	}
}
