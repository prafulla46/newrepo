package com.student.repository;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.student.entity.StudentEntity;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	@Qualifier("pkdataSource")
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate; 
	
	public StudentDaoImpl() {
		
	}
	@PostConstruct
	public void init() {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public List<StudentEntity> findAllStudents() {
		List<StudentEntity> students = jdbcTemplate.query("select * from student", new BeanPropertyRowMapper<>());
		System.out.println("students----"+students.size());
		return students; 
	}
	@Override
	public StudentEntity findStudent(int studentId) {
		StudentEntity student = jdbcTemplate.queryForObject("select * from student where student_id=?",new Object[] {studentId} ,new BeanPropertyRowMapper<>(StudentEntity.class));
		
		return student;
	}
	@Override
	public void deleteStudent(int studentId) {
		jdbcTemplate.update("delete from student where student_id=?", studentId);
	}
	@Override
	public void saveStudent(StudentEntity studentEntity) {
		Object[] args = {studentEntity.getStudentName(),studentEntity.getCourse(),studentEntity.getFirstName(),studentEntity.getLastName(),studentEntity.getAddLine1(),studentEntity.getAddLine2(),studentEntity.getCity(),studentEntity.getState(),studentEntity.getPin(),studentEntity.getMobileNumber(),studentEntity.getEmailId(),studentEntity.getPassword()};
		jdbcTemplate.update("insert into student (STUDENTNAME, COURSE, FIRST_NAME,LAST_NAME, ADD_LINE1, ADD_LINE2, CITY, STATE, PIN,MOBILE_NUMBER, EMAIL_ID, PASSWORD) values(?,?,?,?,?,?,?,?,?,?,?,?)", args);
	}
	@Override
	public void updateStudent(StudentEntity studentEntity) {
		Object[] args = {studentEntity.getStudentName(),studentEntity.getCourse(),studentEntity.getFirstName(),studentEntity.getLastName(),studentEntity.getAddLine1(),studentEntity.getAddLine2(),studentEntity.getCity(),studentEntity.getState(),studentEntity.getPin(),studentEntity.getMobileNumber(),studentEntity.getEmailId(),studentEntity.getPassword(),studentEntity.getStudentId()};
		jdbcTemplate.update("update student set STUDENTNAME=?, COURSE=?, FIRST_NAME=?,LAST_NAME=?, ADD_LINE1=?, ADD_LINE2=?, CITY=?, STATE=?, PIN=?,MOBILE_NUMBER=?, EMAIL_ID=?, PASSWORD=? where STUDENT_ID=?", args);
		
	}
	@Override
	public StudentEntity authentication(String emailId, String password) {
		
		List<StudentEntity> students = jdbcTemplate.query("select * from student where email_id=? and password=?",new Object[] {emailId,password} ,new BeanPropertyRowMapper<>(StudentEntity.class));
		if(students.size() == 0) {
			return null;
		}else {
			return students.get(0);
		}
	}

}
