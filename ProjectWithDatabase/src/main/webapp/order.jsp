<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Order page</h1>
<%
String a=request.getParameter("n1");
String b=request.getParameter("n2");
out.println(a);
%>
<img src="<%=b %>"width="200px" height="200px">
</body>
</html>