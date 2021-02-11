package com.employee.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.dao.EmployeeDao;
import com.employee.dao.entity.EmployeeEntity;
import com.employee.dao.impl.EmployeeDaoImpl;

/**
 * Servlet implementation class GetAllEmployeeServlet
 */
@WebServlet("/showEmployees")
public class GetAllEmployeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDao dao = new EmployeeDaoImpl();
		List<EmployeeEntity> employees = dao.findAll(); //get all employees from db
		request.setAttribute("employeeList", employees); //pass emp list to jsp
		request.getRequestDispatcher("showEmployee.jsp").forward(request, response); //rander the jsp
	}

	/**v
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDao dao = new EmployeeDaoImpl();
		List<EmployeeEntity> employees = dao.findAll(); //get all employees from db
		request.setAttribute("employeeList", employees); //pass emp list to jsp
		request.getRequestDispatcher("showEmployee.jsp").forward(request, response); 
	}

}
