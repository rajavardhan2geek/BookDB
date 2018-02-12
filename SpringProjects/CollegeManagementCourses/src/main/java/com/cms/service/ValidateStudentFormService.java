package com.cms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cms.dao.Studentdao;
import com.cms.models.Student;

@Component
public class ValidateStudentFormService {

	@Autowired
	Studentdao studentdao;
	public Student validateform(Student student)
	{
		
		
				
		return studentdao.insertstudent(student);
	}
}
