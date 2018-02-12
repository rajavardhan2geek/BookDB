package com.cms.controllers;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cms.dao.Coursesdao;
import com.cms.models.Courses;

/*
 * Courses Rest Controller
 * */
@RestController
public class CoursesController {

	
	
	@Autowired
	Coursesdao coursesdao;
	@GetMapping("/readall")
	public List<Courses>  getallCourses()
	{
		System.out.println("get all courses");
		return coursesdao.getAllCourses();
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/courses/{name}")
	public String  getCSE(@PathVariable String name)
	{
		System.out.println("get all courses");
		return name;
		
	}
}
