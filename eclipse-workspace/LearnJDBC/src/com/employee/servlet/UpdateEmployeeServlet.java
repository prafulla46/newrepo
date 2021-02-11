package com.employee.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.dao.EmployeeDao;
import com.employee.dao.entity.EmployeeEntity;
import com.employee.dao.impl.EmployeeDaoImpl;

/**
 * Servlet implementation class UpdateEmployeeServlet
 */
@WebServlet("/updateEmployee")
public class UpdateEmployeeServlet extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empId = Integer.parseInt(request.getParameter("empid"));
		String name = request.getParameter("empName");
		int age = Integer.parseInt(request.getParameter("empAge"));
		int salary = Integer.parseInt(request.getParameter("salary"));
		String department = request.getParameter("department");
		int ssn = Integer.parseInt(request.getParameter("ssn"));
		int exp = Integer.parseInt(request.getParameter("experience"));
		
		EmployeeEntity employee =new EmployeeEntity(empId, name, age, salary, department, ssn, exp);
		EmployeeDao dao = new EmployeeDaoImpl();
		dao.updateEmployee(employee);
		request.setAttribute("message","Employee has been updated successfully ");
		request.getRequestDispatcher("/showEmployees").forward(request, response);
	}

}
