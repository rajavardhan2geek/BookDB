package com.cms.models;

public class Student  extends Person{
	
	String studentid;
	String Courseid;
    public Student() {
    	super();
    	
    }
	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}
	public String getCourseid() {
		return Courseid;
	}
	public void setCourseid(String courseid) {
		Courseid = courseid;
	}
	

}
