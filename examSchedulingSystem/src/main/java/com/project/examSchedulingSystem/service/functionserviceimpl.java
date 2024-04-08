package com.project.examSchedulingSystem.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.sqm.tree.domain.AbstractSqmFrom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.examSchedulingSystem.entity.*;
import com.project.examSchedulingSystem.dao.*;

@Service
public class functionserviceimpl implements Functionservice {
	@Autowired
	private StudentDao studentdao;
	
	@Autowired
	private RoomDao roomdao;
	
	@Override
	@Transactional
	public List<String> getstudentexams(String name){
		
		int id = studentdao.getidbyname(name);
		Student s = studentdao.findbyidstudent(id);
		List<Exam> exams = s.getExam_list();
		List<String> names = new ArrayList<String>();
		
		for(int i=0;i<exams.size();i++) {
			Exam e = exams.get(i);
			names.add(e.getSub_name());
		}
		
		return names;
	}
	
	@Override
	@Transactional
	public List<Integer> getstudentrooms(String name){
		int id = studentdao.getidbyname(name);
		Student s = studentdao.findbyidstudent(id);
		List<Room> rooms = s.getRoom_list();
		
		List<Integer> roomno = new ArrayList<>();
		for(int i=0;i<rooms.size();i++) {
			Room r = rooms.get(i);
			roomno.add(r.getRoom_no());
		}
		return roomno;
	}

	@Override
	@Transactional
	public List<String> getroomssupervisor(int rno) {
		// TODO Auto-generated method stub
		int id = roomdao.getidbyno(rno);
		Room r = roomdao.findbyidroom(id);
		
		List<Supervisor> supervisors = r.getSupervisor_list();
		
		List<String> names = new ArrayList<>();
		for(int i=0;i<supervisors.size();i++) {
			Supervisor sup = supervisors.get(i);
			names.add(sup.getName());
		}
		return names;
	}
}
