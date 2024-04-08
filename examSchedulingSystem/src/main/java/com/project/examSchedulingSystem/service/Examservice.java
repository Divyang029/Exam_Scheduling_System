package com.project.examSchedulingSystem.service;

import java.util.List;
import com.project.examSchedulingSystem.entity.*;

public interface Examservice {
	public List<Exam> findallexam();
	public Exam findbyidexam(int id);
	public Exam addexam(Exam exam);
	public void deleteexam(int id);
}
 