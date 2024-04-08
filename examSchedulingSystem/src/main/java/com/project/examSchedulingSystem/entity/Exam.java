package com.project.examSchedulingSystem.entity;

import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Exam {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="exam_id")
	private int eid;
	
	@Column(name="subject_name",nullable = false)
	private String sub_name;
	
	@Column(name="exam_type",nullable = false)
	private String exam_type;
	
	@Temporal(TemporalType.DATE)
	@Column(name="exam_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String date;
	
	@Column(name="exam_duration",nullable = false)
	private int duration;
	
	@ManyToMany(mappedBy = "exam_list",cascade = CascadeType.MERGE)
	private List<Room> room_list;

	@ManyToMany(mappedBy = "exam_list" , cascade = CascadeType.MERGE)
	private List<Student> student_list;
	
	public Exam(int eid, String sub_name, String exam_type, String date, int duration, List<Room> room_list,
			List<Student> student_list) {
		super();
		this.eid = eid;
		this.sub_name = sub_name;
		this.exam_type = exam_type;
		this.date = date;
		this.duration = duration;
		this.room_list = room_list;
		this.student_list = student_list;
	}

	public Exam() {}
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getSub_name() {
		return sub_name;
	}

	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}

	public String getExam_type() {
		return exam_type;
	}

	public void setExam_type(String exam_type) {
		this.exam_type = exam_type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public List<Room> getRoom_list() {
		return room_list;
	}

	public void setRoom_list(List<Room> room_list) {
		this.room_list = room_list;
	}

	public List<Student> getStudent_list() {
		return student_list;
	}

	public void setStudent_list(List<Student> student_list) {
		this.student_list = student_list;
	}

	@Override
	public String toString() {
		return "Exam [eid=" + eid + ", sub_name=" + sub_name + ", exam_type=" + exam_type + ", date=" + date
				+ ", duration=" + duration + ", room_list=" + room_list + ", student_list=" + student_list + "]";
	}
	
}
