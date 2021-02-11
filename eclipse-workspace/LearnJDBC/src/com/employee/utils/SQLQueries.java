package com.employee.utils;

public interface SQLQueries {
		String Find_By_ID = "Select * from employee where empid=?";
		String INSERT_INTO_EMPLOYEE= "insert into employee (name,age,salary,department,experience,ssn) values(?,?,?,?,?,?)";
		String FIND_ALL_EMPLOYEES= "select * from employee";
		String DELETE_BY_ID = "delete from employee where empid=?";
		String UPDATE_INTO_EMPLOYEE= "update employee set name=? ,age=?,salary=?,department=?,experience=?,ssn=? where empid=?";
		
}
