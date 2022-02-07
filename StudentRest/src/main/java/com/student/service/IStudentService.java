package com.student.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.student.dto.StudentBasicInfoDTO;
import com.student.dto.StudentSavePostDTO;
import com.student.entity.Student;

@Service
public interface IStudentService{
	
	public List<Student> getAllStudents();
	public Student getStudentById(int id);
	public boolean deleteStudent(int id);
	public StudentBasicInfoDTO saveStudent(StudentSavePostDTO studentDTO);
	public List<Student> getStudentByCourse(String course);
}
