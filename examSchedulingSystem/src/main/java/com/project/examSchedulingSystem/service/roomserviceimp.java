package com.project.examSchedulingSystem.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.examSchedulingSystem.dao.*;
import com.project.examSchedulingSystem.entity.*;

@Service
public class roomserviceimp implements Roomservice {

	@Autowired
	private RoomDao roomdao;
	
	@Override
	@Transactional
	public List<Room> findallroom() {
		// TODO Auto-generated method stub
		return roomdao.findallroom();
	}

	@Override
	@Transactional
	public Room findbyidroom(int id) {
		// TODO Auto-generated method stub
		return roomdao.findbyidroom(id);
	}

	@Override
	@Transactional
	public Room addroom(Room room) {
		// TODO Auto-generated method stub
		return roomdao.addroom(room);
	}

	@Override
	@Transactional
	public void deleteroom(int id) {
		// TODO Auto-generated method stub
		roomdao.deleteroom(id);
	}

}
