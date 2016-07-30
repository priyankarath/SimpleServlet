package com.sumit.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(servletNames = "XMLServlet", filterName = "filterOne")

/*
 * @WebFilter("/admin")
 * 
 * @WebFilter("/*")
 * 
 * @WebFilter(servletNames = "MyOwnServlet")
 * 
 * @WebFilter(servletNames = {"MyOwnServlet", "UploadServlet"}) urlPatterns =
 * "/uploadFilter",initParams = @WebInitParam(name = "fileTypes", value =
 * "doc;xls;zip;txt;jpg;png;gif") urlPatterns = "/admin",dispatcherTypes =
 * {DispatcherType.REQUEST, DispatcherType.FORWARD}
 */
public class ServFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter pr = res.getWriter();

		pr.print("The filter is Executed ");
		chain.doFilter(req, res);
		pr.print(" filter is invoked after");

	}

	public void destroy() {
	}

}
