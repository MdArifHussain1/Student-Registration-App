package com.studentregistrationapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.studentregistrationapp.model.DAOimpl;

@WebServlet("/verifyLogin")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			DAOimpl d1 = new DAOimpl();
			d1.connectDB();

		boolean status = d1.verifyCredentials(email, password);
		if (status == true) {
			
			HttpSession session = request.getSession(true);
			session.setAttribute("email", email);
			//session.setMaxInactiveInterval(10);
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/menu.jsp");
			rd.forward(request, response);
		} else {
			request.setAttribute("error", "Invalid username/password");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);

		}
	}

}
