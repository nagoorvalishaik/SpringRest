package com.student.entity;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Student {
	@Id
	@SequenceGenerator(initialValue=1,allocationSize = 1, name = "mySeq")
	@GeneratedValue(strategy=GenerationType.AUTO,generator = "mySeq")
	private int studentId;
	
	@NotNull(message="student name cannot be empty")
	private String studentName;
	
	private String email;
	
	@Min(value=16,message="age should be greater than 16")
	private int age;
	private LocalDate dateOfBirth;
	
	@NotNull(message="Every student should be enrolled in a course")
	private String course;
	private boolean isCertified;
	private LocalDate certificationDate;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public boolean isCertified() {
		return isCertified;
	}
	public void setCertified(boolean isCertified) {
		this.isCertified = isCertified;
	}
	public LocalDate getCertificationDate() {
		return certificationDate;
	}
	public void setCertificationDate(LocalDate certificationDate) {
		this.certificationDate = certificationDate;
	}
	public Student(int studentId, String studentName, String email, int age, LocalDate dateOfBirth, String course,
			boolean isCertified, LocalDate certificationDate) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.email = email;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.course = course;
		this.isCertified = isCertified;
		this.certificationDate = certificationDate;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, certificationDate, course, dateOfBirth, email, isCertified, studentId, studentName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(certificationDate, other.certificationDate)
				&& Objects.equals(course, other.course) && Objects.equals(dateOfBirth, other.dateOfBirth)
				&& Objects.equals(email, other.email) && isCertified == other.isCertified
				&& studentId == other.studentId && Objects.equals(studentName, other.studentName);
	}
	
	

}
