package com.pack1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
        //Set the content type
		response.setContentType("text/html");
		
        //Get the writer
		PrintWriter out = response.getWriter();
		
        //Get the userName from the request
		String uName = request.getParameter("userName");
		String uPassword = request.getParameter("userPassword");
		
        //Get a reference to the HttpSession object
		HttpSession theSession = request.getSession();
		
       
		if(uName.trim().equals("vishnu")  && uPassword.trim().equals("1212")) {
      
			theSession.setAttribute("userName", uName);
			theSession.setAttribute("userPassword", uPassword);
 
			response.sendRedirect("dashboard");		
		}
		else {
			out.println("<font color='red'>Invalid username or Password...</font>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
			dispatcher.include(request, response);
		}
}
}