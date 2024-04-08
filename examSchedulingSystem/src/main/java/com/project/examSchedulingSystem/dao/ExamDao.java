package com.project.examSchedulingSystem.dao;

import java.util.List;
import com.project.examSchedulingSystem.entity.*;

public interface ExamDao {
	public List<Exam> findallexam();
	public Exam findbyidexam(int id);
	public Exam addexam(Exam exam);
	public void deleteexam(int id);
}

