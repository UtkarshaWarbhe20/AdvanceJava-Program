package com.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cal")
public class Calculator extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String mob = req.getParameter("num");
		String gender =req.getParameter("gender");
		String[] hobbies = req.getParameterValues("hobbies");
		
		pw.println("<h2>Personal details(Table)</h2>");
		pw.println("<table border='1'>");
		pw.println("<tr><th>Name</th><th>Age</th><th>Mobile" +
		"</th><th>Gender</th><th>Hobbies</th><tr>");
		pw.println("<tr>");
		pw.println("<td>" + name + "</td>");
		pw.println("<td>" + age + "</td>");
		pw.println("<td>" + mob + "</td>");
		pw.println("<td>" + gender + "</td>");
		pw.print("<td>");
		
		if(hobbies != null) {
			for(int i=0; i<hobbies.length;i++) {
				pw.print( hobbies[i]+ " " );
			}
		}
		
		
		
	}

}
