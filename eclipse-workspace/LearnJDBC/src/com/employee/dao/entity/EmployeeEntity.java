package com.employee.dao.entity;

public class EmployeeEntity {
	 private int empid;
	 private String name;
	 private int age;
	 private int salary;
	 private String department;
	 private int ssn;
	 private int experience;
	 
	 public EmployeeEntity() {};
	 
	public EmployeeEntity(int empid, String name, int age, int salary, String department, int ssn, int experience) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.department = department;
		this.ssn = ssn;
		this.experience = experience;
	}
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [empid=" + empid + ", name=" + name + ", age=" + age + ", salary=" + salary
				+ ", department=" + department + ", ssn=" + ssn + ", experience=" + experience + "]";
	}
	
	
	 
}
