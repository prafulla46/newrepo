package com.employee.main;

import java.util.Scanner;

import com.employee.dao.EmployeeDao;
import com.employee.dao.entity.EmployeeEntity;
import com.employee.dao.impl.EmployeeDaoImpl;

public class InsertEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your employee name ");
		String name = sc.next();
		System.out.println("enter your employee age ");
		int age = sc.nextInt();
		System.out.println("enter your employee salary ");
		int salary = sc.nextInt();
		System.out.println("enter your employee dept ");
		String department = sc.next();
		System.out.println("enter your employee experience ");
		int experience = sc.nextInt();
		System.out.println("enter your employee ssn ");
		int ssn = sc.nextInt();
		sc.close();
		
		EmployeeEntity employee = new EmployeeEntity(0, name, age, salary, department, ssn, experience);
		EmployeeDao dao = new EmployeeDaoImpl();
		dao.saveEmployee(employee);
	}

}
