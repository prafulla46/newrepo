<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	</br>
	<div class="container">
		<div class="panel panel-primary">
			<div class="panel panel-heading">
				<div class="row">
					<h2>Welcome ${student.studentName} on Student detail page</h2>
				</div>
			</div>
			<div class="panel panel-body">
				<div class="row">
					<div class="col-md-3">StudentId</div><div class="col-md-9">${student.studentId }</div>
					<div class="col-md-3">StudentName</div><div class="col-md-9">${student.studentName }</div>
					<div class="col-md-3">course</div><div class="col-md-9">${student.course }</div>
					<div class="col-md-3">City</div><div class="col-md-9">${student.city }</div>
					<div class="col-md-3">State</div><div class="col-md-9">${student.state }</div>
					<div class="col-md-3">Address Line1</div><div class="col-md-9">${student.addLine1 }</div>
					<div class="col-md-3">Address Line2</div><div class="col-md-9">${student.addLine2 }</div>
					<div class="col-md-3">Email</div><div class="col-md-9">${student.email }</div>
					<div class="col-md-3">Pin</div><div class="col-md-9">${student.pin }</div>
					<div class="col-md-3">Mobile</div><div class="col-md-9">${student.mobile }</div>
					
				</div>
			</div>
		</div>
	</div>
</body>
</html>