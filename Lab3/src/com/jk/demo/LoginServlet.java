package com.jk.demo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//1.Collect Input Data
		String un = request.getParameter("myusername");
		String pw = request.getParameter("mypassword");
		System.out.println(un);
		System.out.println(pw);

//2.Do Processing and Prepare the Response 
		String msg = "";
		if (un.equals(pw)) {
			msg = "<h2> Hello " + un + " !!! </h2> ";
			msg = msg + " <h1>Login Success - Welcome to JK</h1>";
		} else

		{
			msg = msg + " <h3>Login Failed - Try again</h3>";
		}

//3.Send Response 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print(msg);
	}
}
