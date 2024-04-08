package com.project.examSchedulingSystem.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.project.examSchedulingSystem.entity.*;

public interface Functionservice {
	public List<String> getstudentexams(String name);
	public List<Integer> getstudentrooms(String name);
	public List<String> getroomssupervisor(int rno);
}
