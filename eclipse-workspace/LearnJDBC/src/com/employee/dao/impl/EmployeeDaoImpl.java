package com.employee.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.employee.dao.EmployeeDao;
import com.employee.dao.entity.EmployeeEntity;
import com.employee.utils.DBConnectionUtil;
import com.employee.utils.SQLQueries;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public EmployeeEntity findByEmpId(int empid) {
		EmployeeEntity employee = new EmployeeEntity();
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DBConnectionUtil.getConnection();
			stmt = con.prepareStatement(SQLQueries.Find_By_ID);
			stmt.setInt(1, empid);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				employee.setEmpid(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setAge(rs.getInt(3));
				employee.setSalary(rs.getInt(4));
				employee.setDepartment(rs.getString(5));
				employee.setSsn(rs.getInt(6));
				employee.setExperience(rs.getInt(7));

			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return employee;
	}

	@Override
	public void saveEmployee(EmployeeEntity employee) {
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DBConnectionUtil.getConnection();
			stmt = con.prepareStatement(SQLQueries.INSERT_INTO_EMPLOYEE);
			// (name,age,salary,department,experience,ssn) values(?,?,?,?,?,?)

			stmt.setString(1, employee.getName());
			stmt.setInt(2, employee.getAge());
			stmt.setInt(3, employee.getSalary());
			stmt.setString(4, employee.getDepartment());
			stmt.setInt(5, employee.getExperience());
			stmt.setInt(6, employee.getSsn());

			int row = stmt.executeUpdate();

			if (row > 0) {
				System.out.println("insert successfull");
			} else {
				System.out.println("insert not successfull");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public List<EmployeeEntity> findAll() {
		List<EmployeeEntity> employees = new ArrayList<EmployeeEntity>();

		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DBConnectionUtil.getConnection();
			stmt = con.prepareStatement(SQLQueries.FIND_ALL_EMPLOYEES);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				EmployeeEntity emp = new EmployeeEntity(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4),
						rs.getString(5), rs.getInt(6), rs.getInt(7));
				employees.add(emp);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return employees;
	}

	@Override
	public void deleteEmployee(int empid) {
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DBConnectionUtil.getConnection();
			stmt = con.prepareStatement(SQLQueries.DELETE_BY_ID);
			stmt.setInt(1, empid);

			int row = stmt.executeUpdate();

			if (row > 0) {
				System.out.println("delete successfull");
			} else {
				System.out.println("delete not successfull");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void updateEmployee(EmployeeEntity employee) {

		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DBConnectionUtil.getConnection();
			stmt = con.prepareStatement(SQLQueries.UPDATE_INTO_EMPLOYEE);
			// (name,age,salary,department,experience,ssn) values(?,?,?,?,?,?)
			System.out.println("just kidding");
			stmt.setString(1, employee.getName());
			stmt.setInt(2, employee.getAge());
			stmt.setInt(3, employee.getSalary());
			stmt.setString(4, employee.getDepartment());
			stmt.setInt(5, employee.getExperience());
			stmt.setInt(6, employee.getSsn());
			stmt.setInt(7, employee.getEmpid());
			int row = stmt.executeUpdate();

			if (row > 0) {
				System.out.println("insert successfull");
			} else {
				System.out.println("insert not successfull");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
