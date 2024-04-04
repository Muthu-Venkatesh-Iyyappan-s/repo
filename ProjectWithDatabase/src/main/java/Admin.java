

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Admin")
public class Admin extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a=request.getParameter("n1");
		String b=request.getParameter("n2");
		if(a.equals("admin") && b.equals("admin"))
		{
			response.sendRedirect("adminhome.jsp");
		}
		else
		{
			response.sendRedirect("Admin.jsp");
		}
		}

}
