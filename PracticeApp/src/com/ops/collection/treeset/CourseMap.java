package com.ops.collection.treeset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CourseMap {
	
	public static HashMap<String,Integer> courseMap=new HashMap<>();
	

          
	public static HashMap<String, Integer> getCourseMap() {
		return courseMap;
	}


	static {
		System.out.println(courseMap.put("CRT", 1));
		System.out.println(courseMap.put("CRT", 9));
		System.out.println(courseMap.put("CRT", 9));
		System.out.println(courseMap.put("CRT", 0));
		System.out.println(courseMap.put("CRT", 9));


		courseMap.put("Core Java", 2);
		courseMap.put("Oracle", 3);
		courseMap.put("Spring", 4);
		courseMap.put("Hibernate", 5);
		courseMap.put("Web Services", 6);
		courseMap.put("Restful", 7);
	}


	public static void setCourseMap(HashMap<String, Integer> courseMap) {
		CourseMap.courseMap = courseMap;
		
	}
	public static void main(String[] args) {
		System.out.println(getCourseMap());

	}
}
