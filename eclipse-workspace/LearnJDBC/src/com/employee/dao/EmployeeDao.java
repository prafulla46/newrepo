package com.employee.dao;

import java.util.List;

import com.employee.dao.entity.EmployeeEntity;

public interface EmployeeDao {
	//pass employee id and get employee 
		public EmployeeEntity findByEmpId(int empid);
		//Set the employee data in db 
		public void saveEmployee(EmployeeEntity employee);
		//Find all the employees present in db
		public List<EmployeeEntity> findAll();
		//Delete employee by empid
		public  void deleteEmployee(int empid);
		public void updateEmployee(EmployeeEntity employee);
}
