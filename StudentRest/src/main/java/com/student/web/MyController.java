package com.student.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.student.dto.StudentBasicInfoDTO;
import com.student.dto.StudentSavePostDTO;
import com.student.entity.Student;
import com.student.service.IStudentService;

@RestController
@RequestMapping("/app")
@Validated
public class MyController {
	
	@Autowired
	IStudentService studentservice;
	
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable int id)
	{
		return studentservice.getStudentById(id);
		
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents()
	{
		return studentservice.getAllStudents();
	}
	
	@DeleteMapping("/student")
	public boolean deleteStudent(@RequestParam int id)
	{
		return studentservice.deleteStudent(id);
	}
	
	@GetMapping("/studentslist")
	public List<Student> getStudentByCourse(@RequestParam String course)
	{
		return studentservice.getStudentByCourse(course);
	}
	
	@PostMapping("/student")
	public ResponseEntity<StudentBasicInfoDTO> saveAccount(@RequestBody @Valid StudentSavePostDTO s){
		
		System.out.println(s.getStudentName()+" "+s.getCourse()+" "+s.getAge());
		
		StudentBasicInfoDTO dto=studentservice.saveStudent(s);
		return new ResponseEntity<StudentBasicInfoDTO>(dto,HttpStatus.OK);
	}
}
