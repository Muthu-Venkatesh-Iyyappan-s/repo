
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


@WebServlet("/newproject")
public class newproject extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String a=request.getParameter("n1");
		String b=request.getParameter("n2");
		String c=request.getParameter("n3");
		String d=request.getParameter("n4");
		
		PrintWriter pw=response.getWriter();
		
		if(a!=null && b!=null && c!=null)
		{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","9442893519@18");
			Statement st=con.createStatement();
			st.executeUpdate("insert into Reg values('"+a+"','"+b+"','"+c+"','"+d+"')");
			response.sendRedirect("Login.jsp");			
		}
		catch(Exception e)
		{
			pw.println(e);
		}
		}
		else
		{
			pw.println("error");
		}
		
	}

}
