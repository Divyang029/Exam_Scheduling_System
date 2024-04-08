package com.project.examSchedulingSystem.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.examSchedulingSystem.entity.*;
import com.project.examSchedulingSystem.service.*;

@RestController
@RequestMapping("/api")
public class RoomController {
	
	@Autowired
	private Roomservice roomservice;
	
	@GetMapping("/room")
	public List<Room> findallroom(){
		return roomservice.findallroom();
	}
	
	@GetMapping("/room/{id}")
	public Room findbyidroom(@PathVariable int id){
		return  roomservice.findbyidroom(id);
	}
	
	@PostMapping("/room")
	public Room addroom(@RequestBody Room room) {
		return  roomservice.addroom(room);	
	}
	
	@PutMapping("/room")
	public Room updateroom(@RequestBody Room room) {
		return roomservice.addroom(room);
	}
	@DeleteMapping("/room/{id}")
	public String deleteroom(@PathVariable int id) {
		
		Room room = roomservice.findbyidroom(id);
		
		// throw exception if null
		
		if (room == null) {
			throw new RuntimeException("room id not found - " + id);
		}
		roomservice.deleteroom(id);
		
		return "Deleted room id - " + id;
	}
}
