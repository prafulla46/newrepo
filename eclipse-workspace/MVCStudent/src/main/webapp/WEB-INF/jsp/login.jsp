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
	<c:if test="${message ne null}"> 
		<div class="alert alert-danger">
			<strong>${message}</strong>
		</div>
	</c:if>
	<form action="authication" method="post">
		<div class="row">
			<div class="col-md-3">EMAIL_ID</div><div class="col-md-9"><input type="text"  name="emailId" /></div>
		</div>	
		</br>
		<div class="row">
			<div class="col-md-3">PASSWORD</div><div class="col-md-9"><input type="text"  name="password" /></div>
		</div>	
		<button type="submit" class="btn btn-success">Login</button>
	</form>
	</div>
</body>
</html>