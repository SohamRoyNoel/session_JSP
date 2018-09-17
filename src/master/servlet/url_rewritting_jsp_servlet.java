package master.servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class url_rewritting_jsp_servlet
 */
public class url_rewritting_jsp_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name = request.getParameter("nm");
		String email = request.getParameter("em");
		
		if(name.trim().length()==0) {
			response.sendRedirect("url_rewritting_jsp.jsp?status=Name can not be empty");
			return;
		}
		
		if(email.trim().length()==0) {
			response.sendRedirect("url_rewritting_jsp.jsp?status=Email can not be empty");
			return;
		}
		
		// using session just for fun
		HashMap<String, String> hsmp = new HashMap<>();
		hsmp.put("name", name);
		hsmp.put("email", email);
		
		HttpSession session = request.getSession();
		session.setAttribute("sess", hsmp);
		
		// in general case to prove the url re writting:
		// response.sendRedirect("url_rewritting_jsp_success.jsp");
		
		// in case of session 
		RequestDispatcher rd = request.getRequestDispatcher("url_rewritting_jsp_success.jsp");
		rd.forward(request, response);
	}

}
