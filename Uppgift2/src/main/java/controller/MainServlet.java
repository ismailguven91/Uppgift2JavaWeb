package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginBean;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MainServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		// Ska två inlogg på samma sida. Beroende på vem som loggar in så ska man se
		// olika saker.


		String pass = request.getParameter("pass");
		String user = request.getParameter("user");

	

		if (pass.equals("Ismail") && user.equals("Ismail")) {
			System.out.println("MainServlet -> correct Admin");
			
			LoginBean LoginAdmin = new LoginBean();
			LoginAdmin.setShowUser(user);


			request.setAttribute("LoginBean", LoginAdmin);

			RequestDispatcher rd = request.getRequestDispatcher("successlogin.jsp");

			rd.forward(request, response);

		} else if (pass.equals("Maria") && user.equals("Maria")) {
			LoginBean LoginAdmin = new LoginBean();
			LoginAdmin.setShowUser(user);

			

			request.setAttribute("LoginBean", LoginAdmin);

			
			
			
			System.out.println("MainServlet -> correct Moderator");
			RequestDispatcher rd = request.getRequestDispatcher("successlogin.jsp");
			rd.forward(request, response);


		} else {
			System.out.println("MainServlet -> invalid");
			response.sendRedirect("index.jsp");
		}
	

	}
}
