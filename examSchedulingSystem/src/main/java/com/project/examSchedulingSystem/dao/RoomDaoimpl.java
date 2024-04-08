package com.project.examSchedulingSystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.project.examSchedulingSystem.entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class RoomDaoimpl implements RoomDao {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Room> findallroom() {
		TypedQuery<Room> theQuery = entityManager.createQuery("from Room", Room.class);
		List<Room> room = theQuery.getResultList();		
		return room;
	}

	@Override
	public Room findbyidroom(int id) {
		Room room = entityManager.find(Room.class, id);
		return room;
	}

	@Override
	public Room addroom(Room room) {
		Room newroom = entityManager.merge(room);
		return newroom;
	}

	@Override
	public void deleteroom(int id) {
		Room room = entityManager.find(Room.class, id);
		entityManager.remove(room);
	}

	@Override
	public int getidbyno(int rno) {
		TypedQuery<Room> theQuery = entityManager.createQuery("select s from Room s where s.room_no=:n",Room.class);
		theQuery.setParameter("n",rno);
		Room room = theQuery.getSingleResult();
		return room.getRid();
	}

}
