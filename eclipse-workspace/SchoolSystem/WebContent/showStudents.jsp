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
		<table class="table table-hover table-bordered">
			<thead>
				<th>Name</th>
				<th>Course</th>
				<th>Email</th>
				<th>City</th>
				<th>Action</th>
			</thead>
			<tbody>
				<c:forEach items="${students}" var="student">
					<tr>
						<td>${student.studentName }</td>
						<td>${student.course }</td>
						<td>${student.email }</td>
						<td>${student.city }</td>
						<td>
							<a href="deleteStudent?student_id=${student.studentId }"><img src="img/delete.png" style="height:40px"/></a>
							<a href="studentDetail?student_id=${student.studentId }&action=detail">Detail</a>
							<a href="studentDetail?student_id=${student.studentId }&action=update"><img src="img/edit.png" style="height:40px"/></a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>