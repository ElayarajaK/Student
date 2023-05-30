package com.student.studentmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentRegistration {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long S_id;
	private String S_name;
	private String S_address;
	private int Marks;
	private int Marks2;
	
	public StudentRegistration() {
		
	}
	
	public StudentRegistration(long s_id, String s_name, String s_address, int marks, int marks2) {
		super();
		S_id = s_id;
		S_name = s_name;
		S_address = s_address;
		Marks = marks;
		Marks2 = marks2;
	}
	public long getS_id() {
		return S_id;
	}
	public void setS_id(long s_id) {
		S_id = s_id;
	}
	public String getS_name() {
		return S_name;
	}
	public void setS_name(String s_name) {
		S_name = s_name;
	}
	public String getS_address() {
		return S_address;
	}
	public void setS_address(String s_address) {
		S_address = s_address;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	public int getMarks2() {
		return Marks2;
	}
	public void setMarks2(int marks2) {
		Marks2 = marks2;
	}

	@Override
	public String toString() {
		return "StudentRegistration [S_id=" + S_id + ", S_name=" + S_name + ", S_address=" + S_address + ", Marks="
				+ Marks + ", Marks2=" + Marks2 + "]";
	}
	
	
	
	
	

}
