package com.ops.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList; 
  
public class Concurrent { 
    public static void main(String[] args) 
    { 

    	/*Vector<String> v= new Vector();
    	
    	v.add("1");
    	v.add("2");
    	v.add("3");
    	v.add("4");
    	v.add("5");
    	
    	Enumeration<String> vtr=v.elements();
    	while(vtr.hasMoreElements()) {
    		System.out.println(vtr.nextElement());
    		
    		System.out.println(v.remove("6"));
    	}*/
    	System.out.println("..................");
    	
    	List<String> arrayList= new ArrayList();
    	List<String> cal= new CopyOnWriteArrayList<>();

    	

    	arrayList.add("a");
    	arrayList.add("b");
    	arrayList.add("c");
    	arrayList.add("d");
    	
    	List al= Collections.synchronizedList(arrayList);

    	System.out.println("size is"+arrayList.size());

    	Spliterator<String> itr=al.spliterator();
    	System.out.println(itr.estimateSize());
    	itr.forEachRemaining(t->{
    		al.add("e");
    		System.out.println(t);
    		
    	}); 
    	/*while(itr.hasNext()) {

    		System.out.println(itr.next());
    		itr.remove();
    		itr.
    	
    		//System.out.println(cal.remove("c"));
    	}*/
    	
    	System.out.println("size is"+arrayList.size());
    	System.out.println("..................");

      Map<String, String> cityCode = new ConcurrentHashMap<>();

        cityCode.put("Moscow", "Russia"); 
        cityCode.put("Delhi", "India"); 
        cityCode.put("New York", "USA");


  
        Iterator iterator = cityCode.keySet().iterator(); 
        
       //System.out.println(cityCode.get("Delhi"));
     // System.out.println( cityCode.get(iterator.next()));
       cityCode.put("Istanbul", "Turkey"); 
       //cityCode.put("Istanbul", "Turkey"); 

       System.out.println("size is"+cityCode.size());

       while (iterator.hasNext()) { 

    	   System.out.println(cityCode.get(iterator.next())); 
  
            // adding an element to Map 
            // exception will be thrown on next call 
            // of next() method. 
           //cityCode.put("Colambo", "SRLanka"); 

       		} 
   		System.out.println("size is"+cityCode.size());
    } 
}
