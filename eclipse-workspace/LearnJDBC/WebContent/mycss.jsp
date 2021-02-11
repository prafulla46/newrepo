<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<img class="rounded" src="img\ZoomLogo.jpg"/>
		<div class="text-center">
			<h1>This is my css page</h1>
		</div>
		<!-- Learn about buttons start -->
		<button type="button" class="btn btn-primary">Login</button>
		<a href="index.jsp" type="button" class="btn btn-success">Home</a>
		<a href="index.jsp" type="button" class="btn btn-warning">btn1</a>
		<a href="index.jsp" type="button" class="btn btn-danger">btn2</a>
		<!-- Learn about buttons end -->
		<!-- Learn about navigation menu start -->
		<nav class="navbar navbar-expand bg-dark navbar-default">
			<ul class="navbar-nav">
				<li class="navbar-items">
					<a href="index.jsp">Home</a>
				</li>
				<li class="navbar-items">
					<a href="index.jsp">Login</a>
				</li>
				<li class="navbar-items">
					<a href="index.jsp">Edit</a>
				</li>
			</ul>
		</nav>
		<!-- Learn about navigation menu end -->
		<!-- Learn about Messages start -->
			<div class="alert alert-success">
				<strong>Its awesome</strong>
			</div>
			<div class="alert alert-danger">
				<strong>Its awesome</strong>
			</div>
			<div class="alert alert-warning">
				<strong>Its awesome</strong>
			</div>
		<!-- Learn about Messages end -->
		<div class="row">
			<div class="col"><p class="text-primary">.text-primary</p></div>
			<div class="col"><p class="text-dark">testing</p></div>
			<div class="col">testing</div>
			<div class="col">testing</div>
		</div>
		<div class="row">
			<div class="col-md-3">Login</div>
			<div class="col-md-9">testing</div>
		</div>
		
		<table class="table table-hover table-bordered">
			<thead>
				<th>Name</th>
				<th>Department</th>
				<th>Salary</th>
			</thead>
			<tbody>
				<tr>
					<td>Jill</td>
					<td>Civil</td>
					<td>555</td>
				</tr>
				<tr>
					<td>ARti</td>
					<td>Civil</td>
					<td>2000</td>
				</tr>
				<tr>
					<td>ARti</td>
					<td>Civil</td>
					<td>2000</td>
				</tr>
			</tbody>
		</table>
	</div>
	

</body>
</html>