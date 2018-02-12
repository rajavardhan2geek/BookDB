package com.cms.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cms.models.Courses;
import com.mongodb.client.FindIterable;

/*
 * This Class gets courses details
 * 
 * */
@Component
public class Coursesdao {

	@Autowired
	MongoFactoryClient mongofactory;
	public List<Courses> getAllCourses()
	{
		List<Courses> allcourses = null;
		
		
			allcourses= new ArrayList<Courses>();
			FindIterable<org.bson.Document>  datalist =mongofactory.QueryDocument("CollegeManagementSystem", "Courses");
			for(org.bson.Document doc:datalist)
			{
				Courses c1 = new Courses();
				c1.setCourseid(doc.get("_id").toString());
				c1.setCoursename(doc.get("Coursename").toString());
				c1.setCourselimit(Integer.parseInt(doc.get("CourseStrength").toString()));
				c1.setCoursehod(doc.get("CourseHOD").toString());
				allcourses.add(c1);
			}
			return allcourses;
		
		
	}
}
