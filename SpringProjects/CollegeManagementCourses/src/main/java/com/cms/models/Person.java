package com.cms.models;

import java.util.Date;

public class Person {

	String personname;
	String email;
	String Phonenumber;
	String fathername;
	String mothername;
	Date  birthdate;
	public Person(){}
	public String getPersonname() {
		return personname;
	}
	public void setPersonname(String personname) {
		this.personname = personname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return Phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		Phonenumber = phonenumber;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	
}
