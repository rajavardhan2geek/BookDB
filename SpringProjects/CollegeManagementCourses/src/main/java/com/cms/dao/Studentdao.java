package com.cms.dao;

import java.util.Iterator;
import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cms.models.Student;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;

/*
 
 *This Classes inserts ,updates ,deletes students into Mongo DB
 *
 *
 */

@Component
public class Studentdao {

	
	@Autowired
	MongoFactoryClient mongofactoryclient;
	MongoCollection<Document> studentcollection;
	public Student  insertstudent(Student student)
	{
		
		
		studentcollection=mongofactoryclient.getCollection("CollegeManagementSystem", "Students");
		BasicDBList studentlist;
		
		 
		Document studentobj = new Document();
		studentobj.put("Name", student.getPersonname());
		studentobj.put("Course", student.getCourseid());
		studentobj.put("Email", student.getEmail());
		Document studentaddress = new Document();
		studentaddress.put("City", "WL");
		studentaddress.put("State", "TS");
		studentaddress.put("country","IN");
		
		studentobj.put("Address", studentaddress);
		
		studentcollection.insertOne(studentobj);
		FindIterable<org.bson.Document> datalist= studentcollection.find();
		Iterator dataiterator =datalist.iterator();
		/*while (dataiterator.hasNext()) {
			System.out.println(datalist.iterator().next());
		}*/

		return student;
		
		
	}
	public List<String>  insertstudents(List<Student> student)
	{
		return null;
	}
}
