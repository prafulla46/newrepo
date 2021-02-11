<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	</br>
	<div class="container">
		
		<div class="panel panel-primary">
		  <div class="panel panel-heading">
		  		<div class="row">
		  			<h3>Welcome to our student portal</h3>
		  		</div>
				
		  </div>
		  <div class="panel panel-body">
		  <form action="registration" method="post">
			<div class="row">
				<div class="col-md-3">StudentName</div><div class="col-md-9"><input type="text" name="studentName"/></div>
			</div>
			<div class="row">
				<div class="col-md-3">First Name</div><div class="col-md-9"><input type="text" name="firstName"/></div>
			</div>
			<div class="row">
				<div class="col-md-3">Last Name</div><div class="col-md-9"><input type="text" name="lastName"/></div>
			</div>
			<div class="row">
				<div class="col-md-3">Course</div><div class="col-md-9"><input type="text" name="course"/></div>
			</div>
			<div class="row">
				<div class="col-md-3">addLine1</div><div class="col-md-9"><input type="text" name="addLine1"/></div>
			</div>
			<div class="row">	
				<div class="col-md-3">addLine2</div><div class="col-md-9"><input type="text" name="addLine2"/></div>
			</div>
			<div class="row">
				<div class="col-md-3">state</div><div class="col-md-9"><input type="text" name="state"/></div>
			</div>
			<div class="row">
				<div class="col-md-3">pin</div><div class="col-md-9"><input type="number" name="pin"/></div>
			</div>
			<div class="row">
				<div class="col-md-3">mobileNumber</div><div class="col-md-9"><input type="number" name="mobileNumber"/></div>
			</div>
			<div class="row">
				<div class="col-md-3">CIty</div><div class="col-md-9"><input type="text" name="city"/></div>
			</div>
			<div class="row">
				<div class="col-md-3">EmailId</div><div class="col-md-9"><input type="text" name="emailId"/></div>
			</div>
			<div class="row">
				<div class="col-md-3">Password</div><div class="col-md-9"><input type="text" name="Password"/></div>
			</div>
			<button type="submit">Registration</button>
			</form>
			</div>
		  
		</div>
	</div>
</body>
</html>