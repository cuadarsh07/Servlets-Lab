package com.jkindia.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "addToCart", urlPatterns = "/addToCart.jk")
public class AddToCartServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("----AddToCartServlet---");
//1.Collect Input Data
		String bname = request.getParameter("bname");
		System.out.println(bname);

//2.Do Processing
		String page = "showBooks.jsp";

		HttpSession session = request.getSession();
		List<String> mycart = (List<String>) session.getAttribute("MyCart");
		mycart.add(bname);
		session.setAttribute("MyCart", mycart);
		System.out.println(mycart);
//3.Forward
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
	}
}
