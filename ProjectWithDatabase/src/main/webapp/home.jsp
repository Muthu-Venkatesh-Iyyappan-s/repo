<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome to the home page
<%
String a=session.getAttribute("ex").toString();
out.println(a);
out.println("<br>");

try
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","9442893519@18");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from products");
	while(rs.next())
	{%>
        <form action="order.jsp" method="post">
	    <input type="hidden" name="n1" value="<%= rs.getString(2) %>">
	    <input type="hidden" name="n2" value="<%= rs.getString(5) %>">
	    Name<%= rs.getString(2) %>
	    Price<%= rs.getString(3) %>
		<img src=" <%=rs.getString(5) %>" width="250px" height="250px">
		<input type="submit">
		
		</form>
	<% }
		
}
catch(Exception e)
{
	out.println(e);
}

%>

</body>
</html>