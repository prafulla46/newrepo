package com.student.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.dao.StudentDao;
import com.student.dao.impl.StudentDaoImpl;
import com.student.entity.StudentEntity;

/**
 * Servlet implementation class StudentDetailServlet
 */
@WebServlet("/studentDetail")
public class StudentDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get student id
		int studentId = Integer.parseInt(request.getParameter("student_id"));
		String action = request.getParameter("action");
		//get student details from db
		StudentDao dao = new StudentDaoImpl();
		StudentEntity student = dao.findStudentById(studentId);
		//set details in request 
		request.setAttribute("student", student);
		//call jsp to display the student list
		if(action.equalsIgnoreCase("detail"))
			request.getRequestDispatcher("showStudentDetail.jsp").forward(request, response);
		else
			request.getRequestDispatcher("updateStudent.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
