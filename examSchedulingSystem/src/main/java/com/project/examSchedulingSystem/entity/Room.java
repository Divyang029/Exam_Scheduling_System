package com.project.examSchedulingSystem.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Room {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="room_id")
	private int rid;
	
	@Column(name="room_no",nullable = false)
	private int room_no;
	
	@Column(name="room_capacity")
	private int capacity;
	
	@Column(name="block_no",nullable = false)
	private String block_no;
	
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "room_exam",joinColumns = @JoinColumn(name="room_id"),inverseJoinColumns = @JoinColumn(name="exam_id"))
	private List<Exam> exam_list;
	
	@ManyToMany(mappedBy = "room_list",cascade = CascadeType.MERGE)
	List<Student> student_list;
	
//	(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "supervisor_room",joinColumns = @JoinColumn(name="room_id"),inverseJoinColumns = @JoinColumn(name="supervisor_id"))
	private List<Supervisor> supervisor_list;

	
	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public int getRoom_no() {
		return room_no;
	}

	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getBlock_no() {
		return block_no;
	}

	public void setBlock_no(String block_no) {
		this.block_no = block_no;
	}

	public List<Exam> getExam_list() {
		return exam_list;
	}

	public void setExam_list(List<Exam> exam_list) {
		this.exam_list = exam_list;
	}

	public List<Student> getStudent_list() {
		return student_list;
	}

	public void setStudent_list(List<Student> student_list) {
		this.student_list = student_list;
	}

	public List<Supervisor> getSupervisor_list() {
		return supervisor_list;
	}

	public void setSupervisor_list(List<Supervisor> supervisor_list) {
		this.supervisor_list = supervisor_list;
	}

	@Override
	public String toString() {
		return "Room [rid=" + rid + ", room_no=" + room_no + ", capacity=" + capacity + ", block_no=" + block_no
				+ ", exam_list=" + exam_list + ", student_list=" + student_list + ", supervisor_list=" + supervisor_list
				+ "]";
	}

}
