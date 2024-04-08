package com.project.examSchedulingSystem.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.examSchedulingSystem.dao.*;
import com.project.examSchedulingSystem.entity.*;

@Service
public class examserviceimpl implements Examservice {

	@Autowired
	private ExamDao examdao;
	
	@Override
	@Transactional
	public List<Exam> findallexam() {
		// TODO Auto-generated method stub
		return examdao.findallexam();
	}

	@Override
	@Transactional
	public Exam findbyidexam(int id) {
		// TODO Auto-generated method stub
		return examdao.findbyidexam(id);
	}

	@Override
	@Transactional
	public Exam addexam(Exam exam) {
		// TODO Auto-generated method stub
		return examdao.addexam(exam);
	}

	@Override
	@Transactional
	public void deleteexam(int id) {
		// TODO Auto-generated method stub
		examdao.deleteexam(id);
	}

}
