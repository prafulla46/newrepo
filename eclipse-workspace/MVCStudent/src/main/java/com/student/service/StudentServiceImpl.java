package com.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.controller.dto.StudentDTO;
import com.student.entity.StudentEntity;
import com.student.repository.StudentDao;
import com.student.repository.StudentDaoImpl;

// to make any java class as service 
@Service
@Transactional
public class StudentServiceImpl implements StudentService{

	@Autowired
	@Qualifier("StudentORMDaoImpl")
	private StudentDao studentDao;
	
	public List<StudentDTO> getAllStudents() {
		List<StudentDTO> studentDto = new ArrayList<StudentDTO>();
		List<StudentEntity> studentEntity = studentDao.findAllStudents();
		for(StudentEntity student :studentEntity) {
			StudentDTO dto = new StudentDTO();
			BeanUtils.copyProperties(student, dto);
			studentDto.add(dto);
			
		}
		
		return studentDto;
	}

	@Override
	public StudentDTO getStudent(int studentId) {
		StudentDTO studentDto = new StudentDTO();
		StudentEntity studentEntity = studentDao.findStudent(studentId);
		BeanUtils.copyProperties(studentEntity,studentDto);
		return studentDto;
	}

	@Override
	public void deleteStudent(int studentId) {
		studentDao.deleteStudent(studentId);
	}

	@Override
	public void saveStudent(StudentDTO studentDto) {
		StudentEntity studentEntity = new StudentEntity();
		BeanUtils.copyProperties(studentDto, studentEntity);
		studentDao.saveStudent(studentEntity);
	}

	@Override
	public void updateStudent(StudentDTO studentDto) {
		StudentEntity studentEntity = new StudentEntity();
		BeanUtils.copyProperties(studentDto, studentEntity);
		studentDao.updateStudent(studentEntity);
	}

	@Override
	public StudentDTO authentication(String emailId, String password) {
		StudentEntity studentEntity = studentDao.authentication(emailId, password);
		StudentDTO studentDto = new StudentDTO(); 
		if(studentEntity !=null) {
			BeanUtils.copyProperties(studentEntity, studentDto);
		}else {
			studentDto = null;
		}
		
		return studentDto;
	}

}
