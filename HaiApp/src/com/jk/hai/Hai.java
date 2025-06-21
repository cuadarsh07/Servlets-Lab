package com.jk.hai;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "hai", urlPatterns = { "/hai.jk" })
public class Hai extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		System.out.println("Hai - service()");

		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String city = request.getParameter("city");

		request.setAttribute("EMAIL", email);
		request.setAttribute("PHONE", phone);
		request.setAttribute("CITY", city);

		RequestDispatcher rd = request.getRequestDispatcher("hai.jsp");
		rd.forward(request, response);

	}
}
