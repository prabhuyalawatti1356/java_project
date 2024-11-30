package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet")
public class Demo extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter p = resp.getWriter();
		
		p.println("Servlet Started");
		
		int a = Integer.parseInt(req.getParameter("userId"));
		String b = req.getParameter("userName");
		
		
		p.println("Welcome "+b+"of Id "+a);
		
	}

}
