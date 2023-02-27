<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>This is jsp</h1>

<% String name=(String)request.getAttribute("name");
   Integer id=(Integer)request.getAttribute("id");
   List<String> friend=(List<String>)request.getAttribute("f");
%>

<h1>My name is <%=name %></h1>
<h1>My id: <%=id %></h1>

<%
for(String s:friend){
	%>
	<h1><%=s %></h1>
	<% 
}

%>
</body>
</html>