package com.employee.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.dao.EmployeeDao;
import com.employee.dao.impl.EmployeeDaoImpl;


@WebServlet("/deleteEmployee")
public class DeleteEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empid = Integer.parseInt(request.getParameter("empid"));
		EmployeeDao dao = new EmployeeDaoImpl();
		dao.deleteEmployee(empid);
		request.setAttribute("message","Employee has been deleted successfully");
		request.getRequestDispatcher("/showEmployees").forward(request, response);
	}

}
