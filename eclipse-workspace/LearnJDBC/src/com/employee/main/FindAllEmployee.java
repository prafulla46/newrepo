package com.employee.main;

import java.util.List;

import com.employee.dao.EmployeeDao;
import com.employee.dao.entity.EmployeeEntity;
import com.employee.dao.impl.EmployeeDaoImpl;

public class FindAllEmployee {
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		List<EmployeeEntity> employees = dao.findAll();
		
		for(EmployeeEntity emp :employees) {
			System.out.println(emp);
		}
		
	}

}
