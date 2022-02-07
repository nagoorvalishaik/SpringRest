package com.student.repository;

import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import com.student.entity.Student;

public class CustomStudentRepositoryImpl implements ICustomStudentRepository{

	@Autowired
	EntityManager entityManager; //works as a sessionfactory
	
	@Override
	public List<Student> getStudentByCourse(String course) 
	{
		Session session=entityManager.unwrap(Session.class);
		
		String queryString="from Student s where s.course=:course";
		
		Query<Student> query=session.createQuery(queryString);
		query.setString("course", course);
		
		List<Student> list=query.getResultList();
		
		if(list.size()>0) {
					return list;
		}else {
			return null;
		}
	}

	
	
}
