package com.project.examSchedulingSystem.dao;

import java.util.List;
import com.project.examSchedulingSystem.entity.*;

public interface SupervisorDao {
	public List<Supervisor> findallsupervisor();
	public Supervisor findbyidsupervisor(int id);
	public Supervisor addsupervisor(Supervisor supervisor);
	public void deletesupervisor(int id);
	public int getidbyname(String name);
}
