package com.ops.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.sound.midi.Soundbank;

public class ArrayTest {

	public static void main(String[] args) {

		//int b=13,c;
		//ArrayList l=new ArrayList<>();
		//l.add(10);
		float f=0,m=2;
		
		int [] a[]= new int[4][8],b=new int[4];
	
		a[0][1]=10;
		a[1][2]=20;
		a[2][1]=20;
		a[3][0]=20;
		
		System.out.println(a[3]);
			
		System.out.println(a.length);
		//System.out.println(b);
		System.out.println("..........................");
		Map map=new HashMap<>();
		
		map.put(null, null);
		map.put(1, 3);
		
		System.out.println(map);
		map.put(null, 3);
		map.put(1, 3);

		System.out.println(map);
		System.out.println("..........................");

		
		//Set<Object> set=new HashSet<Object>();
		CopyOnWriteArraySet<Object> set= new CopyOnWriteArraySet<>();
		set.add(null);
		
		System.out.println(set.add(2));
		set.add(null);
		System.out.println(set.add(5));

		//set.add(20);

		//System.out.println(set);
		
		Iterator itr=set.iterator();
		
		while(itr.hasNext()) {
			Object obj=itr.next();
			System.out.print(obj+"  " );
			set.add(20);
		}
		System.out.println(set);

		
		Map map1= new ConcurrentHashMap<Object, Object>();
		
		map1.put("a", 1);

		map1.put("b", 2);
		map1.put("c", 4);
		map1.put("d", 5);
		System.out.println(map1);
		
		Set keys=map1.keySet();
		
		Iterator itr1=keys.iterator();
		
		itr1.forEachRemaining(obj->{
			
			System.out.println(obj);
		});
		System.out.println("......................");
	Map map2= new HashMap<>();
		
		System.out.println(	map2.put("a", 1));
		System.out.println(map2.put("f", "gfsjfgva"));
		System.out.println(map2.put("f", "dsgfkgfkas"));
		System.out.println(map2.put("f", "3333333333333"));

		System.out.println(map2.put("b", 2));
		System.out.println(map2.put("b", 2));
 
		map2.put("c", 4);
		map2.put("d", 5);
		
		Set sets=map2.keySet();
		
		System.out.println(map2);
		Iterator itr2=sets.iterator();
		
		sets.forEach(obj->{
			System.out.println(obj);
		});
	String bs[]=new String[4];	
	String as[]=new String [4];
	//bs=as;
	//String s1="AA";
	//System.out.println(s1.hashCode());

	String s2= new String("AA");
	String s3=new String ("AA");
	
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());

	System.out.println(as.hashCode());
	System.out.println(bs.hashCode());

		
		/*Vector vector=new Vector<>();
		vector.add("e");
		
		vector.add("f");
		vector.add("4");
		
		System.out.println(vector);
		
		vector.forEach(vec->{
			System.out.println(vec);
		});*/

	}

}
