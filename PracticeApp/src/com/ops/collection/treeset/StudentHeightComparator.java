package com.ops.collection.treeset;

import java.util.Comparator;

public class StudentHeightComparator implements Comparator<Student> {

	
	@Override
	public int compare(Student s1, Student s2) {
	int fCno=CourseMap.getCourseMap().get(s1.getCourse());
	int sCno=CourseMap.getCourseMap().get(s2.getCourse());

	int diff=fCno-sCno;
	
	if(diff!=0) {
		return diff;
	}
	else if(s1.getHeight()>s2.getHeight()) {
		return (int) (s1.getHeight()-s2.getHeight());
	}
	else if(s1.getHeight()<s2.getHeight()) {
		return (int) (s1.getHeight()-s2.getHeight());
	}
	else
		return s1.getSno()-s2.getSno();
				
	}

}
