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
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="student_id")
	private int sid;
	
	@Column(name="student_name",nullable = false)
	private String name;
	
	@Column(name="roll_no",nullable = false,unique = true)
	private int roll_no;
	
	
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "student_exam",joinColumns = @JoinColumn(name="student_id"),inverseJoinColumns = @JoinColumn(name="exam_id"))
	private List<Exam> exam_list;
	
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "student_room",joinColumns = @JoinColumn(name="student_id"),inverseJoinColumns = @JoinColumn(name="room_id"))
	private List<Room> room_list;

	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public List<Exam> getExam_list() {
		return exam_list;
	}

	public void setExam_list(List<Exam> exam_list) {
		this.exam_list = exam_list;
	}

	public List<Room> getRoom_list() {
		return room_list;
	}

	public void setRoom_list(List<Room> room_list) {
		this.room_list = room_list;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", roll_no=" + roll_no + ", exam_list=" + exam_list
				+ ", room_list=" + room_list + "]";
	}

}
