package com.project.examSchedulingSystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.project.examSchedulingSystem.entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class ExamDaoimpl implements ExamDao {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Exam> findallexam() {
		TypedQuery<Exam> theQuery = entityManager.createQuery("from Exam", Exam.class);
		List<Exam> exam = theQuery.getResultList();		
		return exam;
	}

	@Override
	public Exam findbyidexam(int id) {
		Exam exam = entityManager.find(Exam.class, id);
		return exam;
	}

	@Override
	public Exam addexam(Exam exam) {
		Exam newexam = entityManager.merge(exam);
		return newexam;
	}

	@Override
	public void deleteexam(int id) {
		Exam exam = entityManager.find(Exam.class, id);
		entityManager.remove(exam);
	}

}
