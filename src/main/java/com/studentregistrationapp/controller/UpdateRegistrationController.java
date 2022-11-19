package com.studentregistrationapp.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.studentregistrationapp.model.DAOimpl;


@WebServlet("/update")
public class UpdateRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateRegistrationController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String email = request.getParameter("email");
	String mobile = request.getParameter("mobile");
	request.setAttribute("email", email);
	request.setAttribute("mobile", mobile);
	RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/UpdatePage.jsp");
	rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String email = request.getParameter("email");
	String mobile = request.getParameter("mobile");
	DAOimpl d5=new DAOimpl();
	d5.connectDB();
	d5.updateRegistration(email, mobile);
	ResultSet result = d5.listAllRegistrations();
	request.setAttribute("result", result);
	RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/SearchResult.jsp");
	rd.forward(request, response);
	
	
	
	
	
	}

}
