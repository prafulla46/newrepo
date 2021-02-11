<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Detail</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
		<h1>Welcome to employee detail page</h1>
		<div class="panel-body">
			<div class="row">
				<div class="col-md-3"><Strong>Empid</Strong></div><div class="col-md-9">${employeeDetail.empid }</div>
			</div>
			<div class="row">
				<div class="col-md-3"><Strong>name</Strong></div><div class="col-md-9">${employeeDetail.name }</div>
			</div>
			<div class="row">
				<div class="col-md-3"><Strong>age</Strong></div><div class="col-md-9">${employeeDetail.age }</div>
			</div>
			<div class="row">
				<div class="col-md-3"><Strong>salary</Strong></div><div class="col-md-9">${employeeDetail.salary }</div>
			</div>
			<div class="row">
				<div class="col-md-3"><Strong>department</Strong></div><div class="col-md-9">${employeeDetail.department }</div>
			</div>
			<div class="row">
				<div class="col-md-3"><Strong>SSN</Strong></div><div class="col-md-9">${employeeDetail.ssn }</div>
			</div>
			
		</div>
	</div>
</body>
</html>