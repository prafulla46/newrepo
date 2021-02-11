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
		<c:if test="${message ne null }">
			<div class="alert alert-success"><strong>${message }</strong></div>
		</c:if>
		<div class="panel panel-primary">
		  <div class="panel panel-heading">
		  		<div class="row">
		  			<h3>Welcome to our student portal</h3>
		  		</div>
				
		  </div>
		  <div class="panel panel-body">
		  <form action="updateStudent" method="post">
		  <input type="hidden" value="${student.studentId }" name="studentId"/>
			<div class="row">
				<div class="col-md-3">StudentName</div><div class="col-md-9"><input type="text" value="${student.studentName }" name="studentName"/></div>
			</div>
			<div class="row">
				<div class="col-md-3">First Name</div><div class="col-md-9"><input type="text" value="${student.firstName }" name="firstName"/></div>
			</div>
			<div class="row">
				<div class="col-md-3">Last Name</div><div class="col-md-9"><input type="text" value="${student.lastName }" name="lastName"/></div>
			</div>
			<div class="row">
				<div class="col-md-3">Course</div><div class="col-md-9"><input type="text" value="${student.course }" name="course"/></div>
			</div>
			<div class="row">
				<div class="col-md-3">addLine1</div><div class="col-md-9"><input type="text" value="${student.addLine1 }" name="addLine1"/></div>
			</div>
			<div class="row">	
				<div class="col-md-3">addLine2</div><div class="col-md-9"><input type="text" value="${student.addLine2 }" name="addLine2"/></div>
			</div>
			<div class="row">
				<div class="col-md-3">state</div><div class="col-md-9"><input type="text" value="${student.state }" name="state"/></div>
			</div>
			<div class="row">
				<div class="col-md-3">pin</div><div class="col-md-9"><input type="number" value="${student.pin }" name="pin"/></div>
			</div>
			<div class="row">
				<div class="col-md-3">mobile</div><div class="col-md-9"><input type="number" value="${student.mobileNumber }" name="mobileNumber"/></div>
			</div>
			<div class="row">
				<div class="col-md-3">CIty</div><div class="col-md-9"><input type="text" value="${student.city }" name="city"/></div>
			</div>
			<div class="row">
				<div class="col-md-3">Email</div><div class="col-md-9"><input type="text" value="${student.emailId }" name="emailId"/></div>
			</div>
			<div class="row">
				<div class="col-md-3">Password</div><div class="col-md-9"><input type="text" value="${student.password }" name="password"/></div>
			</div>
			<button type="submit" class="btn btn-primary">UpdateStudent</button>
			</form>
			</div>
		  
		</div>
	</div>
</body>
</html>