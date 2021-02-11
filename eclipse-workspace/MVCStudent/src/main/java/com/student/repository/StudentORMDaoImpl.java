package com.student.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.entity.StudentEntity;

@Repository("StudentORMDaoImpl")
public class StudentORMDaoImpl implements StudentDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public List<StudentEntity> findAllStudents() {
		List<StudentEntity> students = getSession().createQuery("from StudentEntity").getResultList();
		return students;
	}

	@Override
	public StudentEntity findStudent(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(int studentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveStudent(StudentEntity studentEntity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(StudentEntity studentEntity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public StudentEntity authentication(String emailId, String password) {
		System.out.println("hibernate call for authentication method");
		 TypedQuery<StudentEntity> query = getSession().createQuery("from StudentEntity t where t.email_id=:pemail and t.password=:ppassword"); //Hibernate Query
		 query.setParameter("pemail", emailId);
		 query.setParameter("ppassword", password);
		 
		 StudentEntity studentEntity =null;
		 studentEntity = query.getSingleResult();
		 return studentEntity;
	}
}
