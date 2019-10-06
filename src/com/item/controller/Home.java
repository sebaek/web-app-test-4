package com.item.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet({"/home", "/"})
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/welcome.jsp");
		view.forward(request, response);
		System.out.println("get requested");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		doGet(request, response);
//		response.setContentType("text/html");
//		response.setCharacterEncoding("utf-8");
//		response.getWriter().println("<h1>반갑습니다.</h1>");
//		response.getWriter().println("<p>post 요청에 대한 응답입니다.</p>");
		
//		request.setAttribute("myname", request.getParameter("name"));
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/welcome.jsp");
		view.forward(request, response);
		System.out.println("post requested " + request.getParameter("name"));
	}

}
