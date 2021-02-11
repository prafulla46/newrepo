<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Dashboard</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="alert alert-success">
			<strong>Welcome to Employee Dashboard</strong>
		</div>
		<c:if test="${not empty message }">
			<div class="alert alert-warning">
				<strong>${message}</strong>
			</div>
		</c:if>
		<a href="addEmployee.jsp" type="button" class="btn btn-success">Add New Employee</a>
		</br>
		<table class="table table-hover table-bordered">
				<thead>
					<th>Empid</th>
					<th>Name</th>
					<th>Age</th>
					<th>Salary</th>
					<th>Department</th>
					<th>SSN</th>
					<th>Experience</th>
					<th>Action</th>
				</thead>
				<tbody>
				<c:forEach items="${employeeList}" var="employee">
						<tr>
							<td>${employee.empid}</td>
							<td>${employee.name }</td>
							<td>${employee.age }</td>
							<td>${employee.salary }</td>
							<td>${employee.department }</td>
							<td>${employee.ssn }</td>
							<td>${employee.experience }</td>
							<td><a href="employeeDetail?empid=${employee.empid}&action=detail"">Detail</a>
							<a href="deleteEmployee?empid=${employee.empid}">Delete</a>
							<a href="employeeDetail?empid=${employee.empid}&action=edit">Update</a></td>
						</tr>
					</c:forEach>
					</tbody>
			</table>
		</div>

</body>
</html>