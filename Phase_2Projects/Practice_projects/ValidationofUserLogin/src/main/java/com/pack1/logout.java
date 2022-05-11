package com.pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/logout")
public class logout extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
        response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		request.getSession().invalidate();
		
		out.println("<h2>You are now logged out...<br>");
		
		out.println("<a href='index.html'>Login again</a>");
	}

}
