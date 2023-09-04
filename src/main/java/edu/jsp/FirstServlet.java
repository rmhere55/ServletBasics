package edu.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		PrintWriter write = res.getWriter();
		write.println("<h1>Welcome To First Servlet</h1>");
		write.println("<a href='https://www.youtube.com/'>Youtube</a>");
		//write.println("Welcome To First Servlet");
		
	}

}
