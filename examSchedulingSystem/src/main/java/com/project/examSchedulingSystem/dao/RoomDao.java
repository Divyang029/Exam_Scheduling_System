package com.project.examSchedulingSystem.dao;

import java.util.List;
import com.project.examSchedulingSystem.entity.*;

public interface RoomDao {
	public List<Room> findallroom();
	public Room findbyidroom(int id);
	public Room addroom(Room room);
	public void deleteroom(int id);
	public int getidbyno(int rno);
}
