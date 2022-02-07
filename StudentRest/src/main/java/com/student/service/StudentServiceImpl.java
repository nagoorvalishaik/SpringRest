package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.student.dto.StudentBasicInfoDTO;
import com.student.dto.StudentSavePostDTO;
import com.student.entity.Student;
import com.student.repository.IStudentRepository;
import com.student.util.StudentConversionDTO;

@Service
public class StudentServiceImpl implements IStudentService{
	
	@Autowired
	IStudentRepository studentrepo;
	
	@Autowired
	StudentConversionDTO dtoConversion;

	@Override
	public List<Student> getAllStudents() {
		
		return (List<Student>) studentrepo.findAll();
	}

	@Override
	public Student getStudentById(int id){
	
		Student s=studentrepo.findById(id).get();
	
			return s;
	}

	@Override
	public boolean deleteStudent(int id) {
		
		studentrepo.deleteById(id);
		return true;
	}

	@Override
	public StudentBasicInfoDTO saveStudent(StudentSavePostDTO studentDTO) {

		Student s=dtoConversion.getStudentFromPostStudentDTO(studentDTO);
		
		Student saveObj=studentrepo.save(s);
		
		StudentBasicInfoDTO dtoObj=dtoConversion.getStudentBasicDTO(saveObj);
		return dtoObj;
	}

	@Override
	public List<Student> getStudentByCourse(String course) {
		
		return studentrepo.getStudentByCourse(course);
	}

}
