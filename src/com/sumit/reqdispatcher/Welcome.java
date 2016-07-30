package com.sumit.reqdispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Welcome() {
        super();
 
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	    //getting the userName parameter from login servlet  
	    String n=request.getParameter("userName");  
	    out.print("Welcome "+n);  
	}

}
