package com.project.examSchedulingSystem.service;

import java.util.List;
import com.project.examSchedulingSystem.entity.*;

public interface Studentservice {
	public List<Student> findallstudent();
	public Student findbyidstudent(int id);
	public Student addStudent(Student student);
	public void deletestudent(int id);	
}
