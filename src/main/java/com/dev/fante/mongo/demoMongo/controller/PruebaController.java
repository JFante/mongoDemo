/**
 * 
 */
package com.dev.fante.mongo.demoMongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.fante.mongo.demoMongo.model.Student;
import com.dev.fante.mongo.demoMongo.repository.StudentRepository;

/**
 * @author Gera
 *
 */

@RestController
@RequestMapping("/prueba")
public class PruebaController {

	@Autowired
	private StudentRepository studentRepository;

	@GetMapping
	public ResponseEntity<?> prueba() {
		String salida = "prueba";
		List<Student> student = studentRepository.findAll();
		return new ResponseEntity<>(student, HttpStatus.OK);

	}

	@PostMapping
	public ResponseEntity<?> insertar(@RequestBody Student student) {
		studentRepository.save(student);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
