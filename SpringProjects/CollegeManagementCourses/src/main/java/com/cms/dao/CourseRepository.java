package com.cms.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cms.models.Courses;

public interface CourseRepository extends MongoRepository<Courses, String> {
	
	
	List<Courses> findAll();

}
