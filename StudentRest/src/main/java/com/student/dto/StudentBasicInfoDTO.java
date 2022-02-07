package com.student.dto;

public class StudentBasicInfoDTO {
	
	private String studentName;
	private String course;
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
	public StudentBasicInfoDTO(String studentName, String course, int age) {
		this.studentName = studentName;
		this.course = course;
		this.age = age;
	}
	/**
	 * 
	 */
	public StudentBasicInfoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
	