package master.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hidden_field_servlet_2
 */
public class hidden_field_servlet_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	          
	        //Getting the value from the hidden field  
	        String n=request.getParameter("uname");  // name of the hidden field
	        out.print("Hello "+n);  
	  
	        out.close(); 
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
