package com.student.util;

import org.springframework.stereotype.Component;

import com.student.dto.StudentBasicInfoDTO;
import com.student.dto.StudentSavePostDTO;
import com.student.entity.Student;

@Component
public class StudentConversionDTO {
	
	public StudentBasicInfoDTO  getStudentBasicDTO(Student s) {
		
		StudentBasicInfoDTO dtObject=new StudentBasicInfoDTO();
		dtObject.setStudentName(s.getStudentName());
		dtObject.setCourse(s.getCourse());
		dtObject.setAge(s.getAge());
		return dtObject;
		
	}
	
	
	public Student getStudentFromPostStudentDTO(StudentSavePostDTO dto) {
		
		Student s=new Student();
		s.setStudentName(dto.getStudentName());
		s.setAge(dto.getAge());
		s.setCourse(dto.getCourse());
		return s;
	}
}
