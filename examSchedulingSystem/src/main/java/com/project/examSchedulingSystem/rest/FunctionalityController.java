package com.project.examSchedulingSystem.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.examSchedulingSystem.entity.*;
import com.project.examSchedulingSystem.service.*;

@RestController
@RequestMapping("/api")
public class FunctionalityController {
	@Autowired
	Functionservice functionservice;
	
	@GetMapping("/student/exam/{name}")
	public List<String> getstudentexams(@PathVariable String name){
		List<String> exams = functionservice.getstudentexams(name);
		return exams;
	}
	
	@GetMapping("/student/room/{name}")
	public List<Integer> getstudentrooms(@PathVariable String name){
		List<Integer> roomno = functionservice.getstudentrooms(name);
		return roomno;
	}
	
	@GetMapping("/room/supervisor/{rno}")
	public List<String> getsupervisorrooms(@PathVariable int rno){
		List<String> names = functionservice.getroomssupervisor(rno);
		return names;
	}
	
}
