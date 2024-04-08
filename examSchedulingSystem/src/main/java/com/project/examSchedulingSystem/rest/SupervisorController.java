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
public class SupervisorController {
	
	@Autowired
	private Supervisorservice supervisorservice;
	
	@GetMapping("/supervisor")
	public List<Supervisor> findallfaculty(){
		return supervisorservice.findallsupervisor();
	}
	
	@GetMapping("/supervisor/{id}")
	public Supervisor findbyidfaculty(@PathVariable int id){
		return supervisorservice.findbyidsupervisor(id);
	}
	
	@PostMapping("/supervisor")
	public Supervisor addfaculty(@RequestBody Supervisor supervisor) {
		return supervisorservice.addsupervisor(supervisor);	
	}
	
	@PutMapping("/supervisor")
	public Supervisor updatefaculty(@RequestBody Supervisor supervisor) {
		return supervisorservice.addsupervisor(supervisor);
	}
	@DeleteMapping("/supervisor/{id}")
	public String deletesupervisor(@PathVariable int id) {
		
		Supervisor faculty = supervisorservice.findbyidsupervisor(id);
		
		// throw exception if null
		
		if (faculty == null) {
			throw new RuntimeException("faculty id not found - " + id);
		}
		supervisorservice.deletesupervisor(id);
		return "Deleted supervisor id - " + id;
	}
}
