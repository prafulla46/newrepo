package com.employee.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {

	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/employee";
	private static String username = "root";
	private static String password = "root";

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		// to create a db connection //1 .Load the driver
		Class.forName(driver);

		// 2. create connection
		Connection conn = DriverManager.getConnection(url, username, password);
		if (conn != null) {
			System.out.println("connection has been established!");
		}
		return conn;

	}

}
