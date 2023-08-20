package com.dev.fante.mongo.demoMongo.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Student {

	@Id
	private String id;
	private String firstName;
//	private String lastName;
//	private String email;
//	private Gender genero;
//	private Address address;
//	private List<String> favoritySubjects;
//	private LocalDateTime createdDate;
}
