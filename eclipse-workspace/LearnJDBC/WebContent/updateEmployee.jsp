 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Employee</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
		<div class="panel-heading">
			<div class="row">
				<div class="col">
					<h2>Update Employee</h2>
				</div>
			</div>
		</div>
		<div class="panel-body">
			<form action="updateEmployee" method="post">
				<input type="hidden" value="${employeeDetail.empid }" name="empid"/>
				<div class="row">
					<div class="col-md-3"><label>Employee Name</label></div>
					<div class="col-md-9"><input type="text" value="${employeeDetail.name }" name="empName"/></div>
				</div>
				<div class="row">
					<div class="col-md-3"><label>Employee Age</label></div>
					<div class="col-md-9"><input type="number" value="${employeeDetail.age }" name="empAge"/></div>
				</div>
				<div class="row">
					<div class="col-md-3"><label>Employee Salary</label></div>
					<div class="col-md-9"><input type="number" value="${employeeDetail.salary }" name="salary"/></div>
				</div>
				<div class="row">
					<div class="col-md-3"><label>Employee department</label></div>
					<div class="col-md-9"><input type="text" value="${employeeDetail.department }" name="department"/></div>
				</div>
				<div class="row">
					<div class="col-md-3"><label>Employee SSN</label></div>
					<div class="col-md-9"><input type="number" value="${employeeDetail.ssn }" name="ssn"/></div>
				</div>
				<div class="row">
					<div class="col-md-3"><label>Employee Experience</label></div>
					<div class="col-md-9"><input type="number" value="${employeeDetail.experience }" name="experience"/></div>
				</div>
				<button type="submit" class="btn btn-primary">Update</button>
				<button type="reset" class="btn btn-danger">Clear</button>
			</form>
		</div>
	</div>
</body>
</html>