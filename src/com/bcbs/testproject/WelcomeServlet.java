package com.bcbs.testproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String zip = request.getParameter("zip");
		String state = request.getParameter("state");
		
		PrintWriter out = response.getWriter();
		out.println("Welcome "+firstName+" " +lastName+"Your details are given below. </br>");
		out.println("Address - " +address + "</br>");
	    out.println("City - " +city + "</br>");
	    out.println("State - " +state + "</br>");
	    out.println("Zip - " +zip );
			
		}
}
