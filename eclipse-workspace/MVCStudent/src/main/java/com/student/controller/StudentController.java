package com.student.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.student.controller.dto.StudentDTO;
import com.student.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/showStudents")
	public String getAllStudents(Model model) {
		List<StudentDTO> students = studentService.getAllStudents();
		model.addAttribute("students", students);
		return "showStudents";
	}
	
	@GetMapping("/studentDetail")
	public String getStudentDetail(@RequestParam int student_id,@RequestParam String action ,Model model) {
		StudentDTO student = studentService.getStudent(student_id);
		model.addAttribute("student", student);
		if(action.equals("detail")) {
			return "showStudentDetail";
		}else {
			return "editStudent";
		}
	}
	
	@GetMapping("/updateStudentDetail")
	public String updateStudent(@RequestParam int student_id ,Model model) {
		StudentDTO student = studentService.getStudent(student_id);
		model.addAttribute("student", student);
		return "editStudent";
	}
	
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam int student_id ,Model model) {
		studentService.deleteStudent(student_id);
		model.addAttribute("message", "Student has been deleted");
		return "redirect:/showStudents";
	}
	
	@GetMapping("/studentRegistration")
	public String studentRegistration() {
		return "studentRegistration";
	}
	
	@PostMapping("/registration")
	public String registration(@ModelAttribute StudentDTO studentDto) {
		studentService.saveStudent(studentDto);
		return "redirect:/showStudents";
	}
	
	
	@PostMapping("/updateStudent")
	public String updateStudent(@ModelAttribute StudentDTO studentDto) {
		studentService.updateStudent(studentDto);
		return "redirect:/showStudents";
	}
	
	@GetMapping("/login")
	public String studentLogin() {
		return "login";
	}
	
	
	@PostMapping("/authication")
	public String authication(@RequestParam String emailId,@RequestParam String password ,Model model, HttpSession session) {
		System.out.println("email_id--"+emailId);
		System.out.println("password--"+password);
		StudentDTO student = studentService.authentication(emailId, password);
		if(student != null) {
			session.setAttribute("name", student.getStudentname());
			session.setAttribute("emailId", student.getEmail_id());
			return "redirect:/showStudents";
		}else {
			model.addAttribute("message", "email or password is not correct");
			return "login";
		}
	}
	
}
