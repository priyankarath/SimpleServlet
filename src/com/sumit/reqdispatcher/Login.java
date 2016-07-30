package com.sumit.reqdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//default constructor
	public Login() {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String n = request.getParameter("userName");
		String p = request.getParameter("userPass");

		//if the password == "servlet"
		if (p.equals("servlet")) {
			//Create object of RequestDispatcher and send the Servlet welcome 
			RequestDispatcher rd = request.getRequestDispatcher("welcome");
			rd.forward(request, response);
		} else {
			out.print("Sorry UserName or Password Error!");
			//if in case wrong username password return back to index.html
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
	}

}
