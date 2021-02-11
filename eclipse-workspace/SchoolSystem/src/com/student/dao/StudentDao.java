package com.student.dao;

import java.util.List;

import com.student.entity.StudentEntity;

public interface StudentDao {

	public List<StudentEntity> findAllStudents();
	public StudentEntity findStudentById(int studentId);
	public StudentEntity findLoginUser(String emailId, String password);
}
