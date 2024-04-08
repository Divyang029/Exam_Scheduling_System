package com.project.examSchedulingSystem.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.examSchedulingSystem.dao.*;
import com.project.examSchedulingSystem.entity.*;

@Service
public class supervisorserviceimpl implements Supervisorservice {

	@Autowired
	private SupervisorDao supervisordao;
	
	@Override
	@Transactional
	public List<Supervisor> findallsupervisor() {
		// TODO Auto-generated method stub
		return supervisordao.findallsupervisor();
	}

	@Override
	@Transactional
	public Supervisor findbyidsupervisor(int id) {
		// TODO Auto-generated method stub
		return supervisordao.findbyidsupervisor(id);
	}

	@Override
	@Transactional
	public Supervisor addsupervisor(Supervisor supervisor) {
		// TODO Auto-generated method stub
		return supervisordao.addsupervisor(supervisor);
	}

	@Override
	@Transactional
	public void deletesupervisor(int id) {
		// TODO Auto-generated method stub
		supervisordao.deletesupervisor(id);
	}

}
