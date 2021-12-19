<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
            <%@page import="model.LoginBean"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Uppgift 2</title>
</head>
<body>
<%

%>

		<form action="<%= request.getContextPath() %>/MainServlet" method="post">
		Username: <input name="user" type="username">
		Password: <input name="pass" type="password"> 
		
		<input type="submit" name="submit">
	</form>

</body>
</html>

