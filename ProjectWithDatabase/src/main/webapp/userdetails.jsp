<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<Center><h1>USER DATEBASE</h1></Center>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>

<%
try
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","9442893519@18");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from Reg");
	while(rs.next())
	{
		out.println("username="+rs.getString(1)+",   ");
		out.println("password="+rs.getString(2)+",   ");
		out.println("email="+rs.getString(3)+",   ");
		out.println("Phoneno="+rs.getString(4)+",   ");
		out.println("<br><br>");
	}
}
catch(Exception e)
{
	
}
%>
</body>
</html>