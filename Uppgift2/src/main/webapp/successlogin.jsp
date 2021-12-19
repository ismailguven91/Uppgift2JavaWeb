<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="model.LoginBean"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SUCCESS</title>
</head>
<body>

<h2>Logged in</h2>


<%

LoginBean LoginBean=(LoginBean)request.getAttribute("LoginBean");
		System.out.print("WrongLogin.jsp --> request.getAttribute");
out.println("<h1>Welcome " + LoginBean.getShowUser() + "!</h1>");

%>



</body>
</html>