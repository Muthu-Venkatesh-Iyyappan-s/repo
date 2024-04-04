

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.io.*;


@WebServlet("/up")
public class up extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a=request.getParameter("n1");
		String b=request.getParameter("n2");
		String c=request.getParameter("n3");
		PrintWriter pw=response.getWriter();
		
		if(b.equals(c)) 
		{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","9442893519@18");
			Statement st=con.createStatement();
			st.executeUpdate("update Reg set Passwords='"+b+"' where Passwords='"+a+"' ");
			pw.println("Password changed successfully");
					
		}
		catch(Exception e)
		{
			pw.println(e);
		}
		}
		else
		{
			pw.println("password wrong");
			response.sendRedirect("updatepassword.jsp");
		}
		
	}

}
