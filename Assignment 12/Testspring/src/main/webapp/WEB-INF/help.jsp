<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This is help controller</title>
</head>
<body>
<!-- first tareeka -->
<%-- <% String name=(String)request.getAttribute("name");
   Integer id=(Integer)request.getAttribute("id");
   LocalDateTime date = (LocalDateTime)request.getAttribute("Date");
%> --%>
<h1>My name is <%-- first tareeka<%=name %> --%>
${name }
</h1>
<h1>My id <%-- <%=id %> --%>  ${id }</h1>
<h1>Date and Time is: <%-- <%=date %> --%>  ${Date}</h1>
<hr>
<!-- dusra tareeka using jstl -->
<%-- <c:forEach var="item" items="${list }">
<h1>${item}</h1>
</c:forEach> --%>

<!-- teesra tareeka -->
 <c:forEach var="item" items="${list }">
<h1><c:out value="${item}"></c:out></h1>
</c:forEach> 
</body>
</html>