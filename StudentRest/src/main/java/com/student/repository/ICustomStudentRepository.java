package com.student.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.student.entity.Student;

@Repository
public interface ICustomStudentRepository {
	
	public List<Student> getStudentByCourse(String course);
}
