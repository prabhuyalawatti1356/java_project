package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class userName
 */
@WebFilter("/servlet")
public class userName implements Filter {

    /**
     * Default constructor. 
     */
   
   
	public void destroy() {
		// TODO Auto-generated method stub
	}


	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		
		HttpServletRequest req = (HttpServletRequest)request;
		
		String name = request.getParameter("userName");
		
		out.println(name);
		
		String s = new String(name);
		
		String s1 = "prabhu";
		
		if (s.equals(s1))
		{
			chain.doFilter(request, response);	
		}
		else
		{
			out.println("User name is Incorrect");
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
