package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/dis")
public class AddServlet  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int num1=Integer.parseInt(req.getParameter("v1"));
		int num2=Integer.parseInt(req.getParameter("v2"));
		
	    PrintWriter pw = res.getWriter();
	      res.setContentType("text/html");
	    int c=num1+num2;
	    
	    pw.println("Sum of two Number is="+c);
	    
		
	}

}
