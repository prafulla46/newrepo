package com.employee.main;
import java.util.Scanner;

import com.employee.dao.EmployeeDao;
import com.employee.dao.entity.*;
import com.employee.dao.impl.EmployeeDaoImpl;
public class FindEmployee {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your employee id: ");
		int empid = sc.nextInt();
		EmployeeDao dao = new EmployeeDaoImpl();
		EmployeeEntity employee = dao.findByEmpId(empid);
		System.out.println("employee details : "+employee);
		sc.close();
		
				
	}

}
