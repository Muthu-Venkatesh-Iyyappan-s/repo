

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;
import java.io.*;

@WebServlet("/login")
public class login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a=request.getParameter("n1");
		String b=request.getParameter("n2");
		
		PrintWriter pw=response.getWriter();
		if(a!=null && b!=null)
		{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","9442893519@18");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from reg where Username='"+a+"' and passwords='"+b+"' ");
			if(rs.next())
			{
				HttpSession session=request.getSession();
				session.setAttribute("ex",a);
				response.sendRedirect("home.jsp");
			}
			else
			{
				pw.println("Incorrect password");
			}
		}
		catch(Exception e)
		{
			pw.println(e);
		}
		}
	}

}
