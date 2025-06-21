package com.jk.demo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="hello",urlPatterns = "/myhello.do")

public class HelloServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		// 1.Collect Input Data
		String sn = request.getParameter("sname");
		System.out.println(sn);

		// 2.Do Processing and Prepare Response 
		String msg="<h2> Hello "+ sn +" !!! </h2> ";
		msg = msg + " <h3> Welcome to Success Academy </h3>";

		// 3.Send Response 
		response.setContentType("text/html"); 
		
		
		PrintWriter out=response.getWriter(); 
		out.print(msg);
	}
}
