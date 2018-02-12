package com.cms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cms.dao.Coursesdao;
import com.cms.models.Courses;
import com.cms.models.Student;
import com.cms.service.ValidateStudentFormService;
@RestController
public class StudentController {

	@Autowired
	ValidateStudentFormService studentvalidate;
	@PostMapping("/register")
	public Student  getallCourses()
	{
	
		Student stud= new Student();
		stud.setPersonname("raja");
		stud.setCourseid("CSE");
		stud.setEmail("xyz@abc.net");
		return studentvalidate.validateform(stud);
		
	}

}
