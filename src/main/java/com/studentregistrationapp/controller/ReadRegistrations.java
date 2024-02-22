package com.studentregistrationapp.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.studentregistrationapp.model.DAOimpl;

@WebServlet("/listall")
public class ReadRegistrations extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ReadRegistrations() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		//session.setMaxInactiveInterval(10);
		if (session.getAttribute("email")!=null) {		
		DAOimpl d3=new DAOimpl();
		d3.connectDB();
		
		ResultSet result = d3.listAllRegistrations();
		request.setAttribute("result", result);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/SearchResult.jsp");
		rd.forward(request, response);
	} else {
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}
}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	}

}
