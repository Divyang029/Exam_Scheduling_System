package com.project.examSchedulingSystem.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Supervisor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="supervisor_id")
	private int id;
	
	@Column(name="supervisor_name",nullable = false)
	private String name;
	
	@ManyToMany(mappedBy = "supervisor_list",cascade = CascadeType.MERGE)
	List<Room> room_list;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Room> getRoom_list() {
		return room_list;
	}

	public void setRoom_list(List<Room> room_list) {
		this.room_list = room_list;
	}

	@Override
	public String toString() {
		return "Supervisor [id=" + id + ", name=" + name + ", room_list=" + room_list + "]";
	}
	
}
