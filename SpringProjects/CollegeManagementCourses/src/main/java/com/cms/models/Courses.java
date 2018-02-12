package com.cms.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="courses")
public class Courses {

	@Id
	String Courseid;
	String Coursename;
	int Courselimit;
	String coursehod;
	public Courses() {}
	public String getCourseid() {
		return Courseid;
	}
	public void setCourseid(String courseid) {
		Courseid = courseid;
	}
	public String getCoursename() {
		return Coursename;
	}
	public void setCoursename(String coursename) {
		Coursename = coursename;
	}
	public int getCourselimit() {
		return Courselimit;
	}
	public void setCourselimit(int courselimit) {
		Courselimit = courselimit;
	}
	public String getCoursehod() {
		return coursehod;
	}
	public void setCoursehod(String coursehod) {
		this.coursehod = coursehod;
	}
}
