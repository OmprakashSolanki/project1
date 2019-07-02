package com.ops.collection.treeset;

public class Student implements Comparable {

	

	private int sno;
	private String sname;
	private String course;
	private double fee;
	private double height;
	
	public Student(int sno, String sname, String course, double fee, double height) {
		this.sno = sno;
		this.sname = sname;
		this.course = course;
		this.fee = fee;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", course=" + course + ", fee=" + fee + ", height=" + height
				+ "]";
	}

	@Override
	public int compareTo(Object o) {

		Student s = (Student) o;

		int fCno = CourseMap.getCourseMap().get(this.course);
		int sCno = CourseMap.getCourseMap().get(s.course);

		if (fCno < sCno) {
			return fCno - sCno;
		}
		if (fCno > sCno) {
			return fCno - sCno;
		} else
			return 0;
	}


	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
