package com.project.examSchedulingSystem.service;

import java.util.List;
import com.project.examSchedulingSystem.entity.*;

public interface Supervisorservice {
	public List<Supervisor> findallsupervisor();
	public Supervisor findbyidsupervisor(int id);
	public Supervisor addsupervisor(Supervisor supervisor);
	public void deletesupervisor(int id);
}