package com.project.examSchedulingSystem.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.examSchedulingSystem.entity.*;
import com.project.examSchedulingSystem.service.*;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	private Studentservice studentservice;
	
	@GetMapping("/student")
	public List<Student> findallstudent(){
		return studentservice.findallstudent();
	}
	
	@GetMapping("/student/{id}")
	public Student findbyidstudent(@PathVariable int id){
		return studentservice.findbyidstudent(id);
	}
	
	@PostMapping("/student")
	public Student addstudent(@RequestBody Student student) {
		return studentservice.addStudent(student);	
	}
	
	@PutMapping("/student")
	public Student updatestudent(@RequestBody Student student) {
		return studentservice.addStudent(student);
	}
	
	@DeleteMapping("/student/{id}")
	public String deletestudent(@PathVariable int id) {
		
		Student student = studentservice.findbyidstudent(id);
		
		// throw exception if null
		
		if (student == null) {
			throw new RuntimeException("student id not found - " + id);
		}
		studentservice.deletestudent(id);
		return "Deleted student id - " + id;
	}

}
