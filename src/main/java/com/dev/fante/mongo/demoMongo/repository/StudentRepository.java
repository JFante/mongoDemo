package com.dev.fante.mongo.demoMongo.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.dev.fante.mongo.demoMongo.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
	
	@Value(value = "")
	String algo = "";
	
	@Query(algo)
	Student findById();

	
	
	

}
