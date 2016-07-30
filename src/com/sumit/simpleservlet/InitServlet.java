package com.sumit.simpleservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/InitServlet", initParams={@WebInitParam(name="defaultUser", value="Sumit Sagar")}) 
public class InitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InitServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pr = response.getWriter();
		pr.println(this.getServletConfig().getInitParameter("defaultUser"));
	}

}
