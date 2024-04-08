package com.project.examSchedulingSystem.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.examSchedulingSystem.dao.*;
import com.project.examSchedulingSystem.entity.*;

@Service
public class studentserviceimpl implements Studentservice {
	
	@Autowired
	private StudentDao studentdao;
	
	@Override
	@Transactional
	public List<Student> findallstudent() {
		return studentdao.findallstudent();
	}
	
	@Override
	@Transactional
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentdao.addStudent(student);
	}
	
	@Override
	@Transactional
	public Student findbyidstudent(int id) {
		// TODO Auto-generated method stub
		return studentdao.findbyidstudent(id);
	}
	
	@Override
	@Transactional
	public void deletestudent(int id) {
		// TODO Auto-generated method stub
		studentdao.deletestudent(id);
	}

}

