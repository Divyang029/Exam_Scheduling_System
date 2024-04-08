package com.project.examSchedulingSystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.project.examSchedulingSystem.entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class SupervisorDaoimpl implements SupervisorDao {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Supervisor> findallsupervisor() {
		TypedQuery<Supervisor> theQuery = entityManager.createQuery("from Supervisor", Supervisor.class);
		List<Supervisor> supervisor = theQuery.getResultList();		
		return supervisor;
	}

	@Override
	public Supervisor findbyidsupervisor(int id) {
		Supervisor supervisor = entityManager.find(Supervisor.class, id);
		return supervisor;
	}

	@Override
	public Supervisor addsupervisor(Supervisor supervisor) {
		Supervisor newsupervisor = entityManager.merge(supervisor);
		return newsupervisor;
	}

	@Override
	public void deletesupervisor(int id) {
		Supervisor supervisor = entityManager.find(Supervisor.class, id);
		entityManager.remove(supervisor);
	}

	@Override
	public int getidbyname(String name) {
		// TODO Auto-generated method stub
		TypedQuery<Supervisor> theQuery = entityManager.createQuery("select s from Supervisor s where s.name=:n", Supervisor.class);
		theQuery.setParameter("n",name);
		Supervisor supervisor = theQuery.getSingleResult();
		return supervisor.getId();
	}

}
