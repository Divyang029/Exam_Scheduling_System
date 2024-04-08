package com.project.examSchedulingSystem.rest;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
public class ExamController {
	@Autowired
	private Examservice examservice;
	
	@GetMapping("/exam")
	public List<Exam> findallexam(){
		return examservice.findallexam();
	}
	
	@GetMapping("/exam/{id}")
	public Exam findbyidexam(@PathVariable int id){
		return examservice.findbyidexam(id);
	}
	
	@PostMapping("/exam")
	public Exam addexam(@RequestBody Exam exam) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date;
        try {
            date = formatter.parse(exam.getDate());
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid date format. Use yyyy-MM-dd.");
        }
        
        Exam exam1 = new Exam(exam.getEid(),exam.getSub_name(),exam.getExam_type(),exam.getDate(),exam.getDuration(),exam.getRoom_list(),exam.getStudent_list());
		return examservice.addexam(exam1);	
	}
	
	@PutMapping("/exam")
	public Exam updateexam(@RequestBody Exam exam) {
		return examservice.addexam(exam);
	}
	
	@DeleteMapping("/exam/{id}")
	public String deleteexam(@PathVariable int id) {
		
		Exam exam = examservice.findbyidexam(id);
		
		// throw exception if null
		
		if (exam == null) {
			throw new RuntimeException("exam id not found - " + id);
		}
		examservice.deleteexam(id);
		return "Deleted exam id - " + id;
	}
}
