package com.project.examSchedulingSystem.service;

import java.util.List;
import com.project.examSchedulingSystem.entity.*;

public interface Roomservice {
	public List<Room> findallroom();
	public Room findbyidroom(int id);
	public Room addroom(Room room);
	public void deleteroom(int id);
}
