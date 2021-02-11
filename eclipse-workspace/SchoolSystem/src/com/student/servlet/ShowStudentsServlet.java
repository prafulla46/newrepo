package com.student.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.dao.StudentDao;
import com.student.dao.impl.StudentDaoImpl;
import com.student.entity.StudentEntity;

/**
 * Servlet implementation class ShowStudentsServlet
 */
@WebServlet("/showStudents")
public class ShowStudentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowStudentsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get all the students from database
		StudentDao dao = new StudentDaoImpl();
		List<StudentEntity> students = dao.findAllStudents();
		System.out.println("student count---"+students.size());
		System.out.println(students);
		//set students in request 
		request.setAttribute("students", students);
		//call jsp to display the student list
		request.getRequestDispatcher("showStudents.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
