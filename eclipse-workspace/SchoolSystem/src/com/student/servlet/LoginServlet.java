package com.student.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.student.dao.StudentDao;
import com.student.dao.impl.StudentDaoImpl;
import com.student.entity.StudentEntity;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/authication")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String emailId = request.getParameter("emailId");
		String password = request.getParameter("password");
		StudentDao dao = new StudentDaoImpl();
		StudentEntity student = dao.findLoginUser(emailId, password);
		
		if(student != null) {
			System.out.println("logged in");
			HttpSession session = request.getSession();
			session.setAttribute("student", student); //session scope
			request.getRequestDispatcher("showStudentDetail.jsp").forward(request, response);
		}else {
			System.out.println("NOT logged in");
			request.setAttribute("message", "sorry your credentials doesn't match"); //request scope
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
