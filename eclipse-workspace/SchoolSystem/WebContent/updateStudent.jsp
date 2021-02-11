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
			<form action="updateStudent" method="post">
			<div class="panel panel-body">
				<div class="row">
					<div class="col-md-3">StudentName</div><div class="col-md-9"><input type="text"  name="studentName" value="${student.studentName }"/></div>
					</br>
					<div class="col-md-3">FirstName</div><div class="col-md-9"><input type="text"  name="firstName" value="${student.firstName}"/></div>
					<div class="col-md-3">lastName</div><div class="col-md-9"><input type="text"  name="lastName" ${student.lastName }/></div>
					<div class="col-md-3">course</div><div class="col-md-9"><input type="text"  name="course" ${student.course }/></div>
					<div class="col-md-3">city</div><div class="col-md-9"><input type="text"  name="course" ${student.city }/></div>
					<div class="col-md-3">State</div><div class="col-md-9"><input type="text"  name="course" ${student.state }/></div>
					<div class="col-md-3">Address Line1</div><div class="col-md-9"><input type="text"  name="course" ${student.addLine1 }/></div>
					<div class="col-md-3">Address Line2</div><div class="col-md-9"><input type="text"  name="course" ${student.addLine2 }/></div>
					<div class="col-md-3">Email</div><div class="col-md-9"><input type="text"  name="course" ${student.email }/></div>
					<div class="col-md-3">Pin</div><div class="col-md-9"><input type="text"  name="course" ${student.pin }/></div>
					<div class="col-md-3">Mobile</div><div class="col-md-9"><input type="text"  name="course" ${student.mobile }/></div>
					<button type="submit" class="btn btn-success">Login</button>
				</div>
			</div>
			
			</form>
		</div>
	</div>
</body>
</html>