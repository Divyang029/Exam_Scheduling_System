package com.project.examSchedulingSystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import com.project.examSchedulingSystem.entity.*;

@Repository
public class StudentDaoimpl implements StudentDao {
	
	@Autowired
	private EntityManager entityManager;

	
	@Override
	public List<Student> findallstudent() {
		
		TypedQuery<Student> theQuery = entityManager.createQuery("from Student", Student.class);
		List<Student> student = theQuery.getResultList();		
		return student;
	}

	@Override
	public Student findbyidstudent(int id) {
		// get employee
		Student student = entityManager.find(Student.class, id);
		return student;
	}

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		Student newstudent = entityManager.merge(student);
		return newstudent;
	}

	@Override
	public void deletestudent(int id) {
		Student student = entityManager.find(Student.class, id);
		entityManager.remove(student);
	}
	
	@Override
	public int getidbyname(String name) {
		TypedQuery<Student> theQuery = entityManager.createQuery("select s from Student s where s.name=:n", Student.class);
		theQuery.setParameter("n",name);
		Student student = theQuery.getSingleResult();
		return student.getSid();
	}

}
