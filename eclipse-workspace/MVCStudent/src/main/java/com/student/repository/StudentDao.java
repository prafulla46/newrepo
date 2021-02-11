package com.student.repository;

import java.util.List;


import com.student.entity.StudentEntity;

public interface StudentDao {
	public List<StudentEntity> findAllStudents();
	public StudentEntity findStudent(int studentId);
	public void deleteStudent(int studentId);
	public void saveStudent(StudentEntity studentEntity);
	public void updateStudent(StudentEntity studentEntity);
	public StudentEntity authentication(String emailId, String password);
}
