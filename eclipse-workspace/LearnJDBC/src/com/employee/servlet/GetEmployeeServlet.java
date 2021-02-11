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

@WebServlet("/employeeDetail")
public class GetEmployeeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int empid = Integer.parseInt(req.getParameter("empid"));
		String action = req.getParameter("action");
		EmployeeDao dao = new EmployeeDaoImpl();
		EmployeeEntity employee = dao.findByEmpId(empid);
		req.setAttribute("employeeDetail", employee); // pass emp list to jsp
		if (action.equals("detail")) {
			req.getRequestDispatcher("employeeDetail.jsp").forward(req, resp); // render the jsp
		} else if (action.equals("edit")) {
			req.getRequestDispatcher("updateEmployee.jsp").forward(req, resp);
		}
	}

}
