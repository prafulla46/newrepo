package com.student.service;

import java.util.List;

import com.student.controller.dto.StudentDTO;

public interface StudentService {

	public List<StudentDTO> getAllStudents();
	public StudentDTO getStudent(int studentId);
	public void deleteStudent(int studentId);
	public void saveStudent(StudentDTO studentDto);
	public void updateStudent(StudentDTO studentDto);
	public StudentDTO authentication(String emailId, String password);
}
