package com.project.examSchedulingSystem.dao;

import java.util.List;
import com.project.examSchedulingSystem.entity.*;

public interface StudentDao {
	public List<Student> findallstudent();
	public Student findbyidstudent(int id);
	public Student addStudent(Student student);
	public void deletestudent(int id);
	public int getidbyname(String name);
}
