<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:green"">${msg }</h1>
<div class="container"></div>
<h1 class="text-center">${title }</h1>
<p class="text-center">${desc }</p>
<h1>your Email is ${user.email}</h1>
<h1>Your userName is: ${user.username }</h1>
<h1>your passwod is: ${user.password } secure your password </h1>

</div>
</body>
</html>