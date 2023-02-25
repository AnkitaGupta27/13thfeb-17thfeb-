<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="userInfo" modelAttribute="emp">
	Name: <form:input path="name" required="true" /><br>
	Password(*):<form:password path="password"/><br>
	<form:errors path="password" cssClass="error" />
	Age:<form:input path="age" required="true" />
	<input type="submit" value="submit">
</form:form>
</body>
</html>