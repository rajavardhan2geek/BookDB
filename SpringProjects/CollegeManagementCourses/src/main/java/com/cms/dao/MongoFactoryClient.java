package com.cms.dao;



import org.springframework.stereotype.Component;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Component
public class MongoFactoryClient {

	private MongoClient mongoClient;
	private MongoCollection<org.bson.Document> mongoCollection;
	private DBCollection Collectionname;
	
	private MongoDatabase database;
	public  MongoCollection  getCollection(String dbname,String collection){

		//MongoClientOptions options = MongoClientOptions.builder().sslEnabled(true).sslInvalidHostNameAllowed(true).build();

		
		
		/**Local mongo db connection*/
		 mongoClient = new MongoClient("localhost", 27017);
		/** mongo db database name*/
		
		 database = mongoClient.getDatabase(dbname);
		 mongoCollection=database.getCollection(collection);
		 
		return mongoCollection;
	
		
		}
	public  FindIterable<org.bson.Document> QueryDocument(String database,String Collectionname)
	{
		getCollection(database,Collectionname);
		FindIterable<org.bson.Document> datalist = mongoCollection.find();
		//closeConnection();
		return datalist;
		
	}
	public  void closeConnection()
	{
		mongoClient.close();
	}
}
