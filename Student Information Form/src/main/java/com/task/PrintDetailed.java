package com.task;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class PrintDetailed extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		String name = req.getParameter("name");
		String rollNo =req.getParameter("rollNo");
		String rollNo =req.getParameter("rollNo");
		String rollNo =req.getParameter("rollNo");
		String rollNo =req.getParameter("rollNo");
		String rollNo =req.getParameter("rollNo");
		
		

}
