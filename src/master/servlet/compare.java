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
 * Servlet implementation class compare
 */
public class compare extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name = request.getParameter("nm");
		String email = request.getParameter("em");
		String password = request.getParameter("ps");	
		
		HashMap<String, String> userdet = new HashMap<>();
		userdet.put("fn", name);
		userdet.put("em", email);
		userdet.put("pass", password);
		
		HttpSession ses = request.getSession();
		ses.setAttribute("user", userdet);
		
		RequestDispatcher disp = request.getRequestDispatcher("register_response.jsp");
		disp.forward(request, response);
	}

}
