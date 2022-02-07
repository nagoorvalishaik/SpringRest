package com.student.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class StudentSavePostDTO {
	
	@NotNull(message = "Name is empty")
	private String studentName;
	@NotNull(message = "Course Cannot be empty")
	private String course;
	@Min(message = "Age should be above 16", value = 16)
	private int age;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @param studentName
	 * @param course
	 * @param age
	 */
	public StudentSavePostDTO(@NotNull(message = "Name is empty") String studentName,
			@NotNull(message = "Course Cannot be empty") String course,
			@Min(message = "Age should be above 16", value = 16) int age) {
		this.studentName = studentName;
		this.course = course;
		this.age = age;
	}
	/**
	 * 
	 */
	public StudentSavePostDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
