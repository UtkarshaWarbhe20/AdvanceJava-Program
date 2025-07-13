package com.patternprg;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/pttrn")

public class PatternPrg extends GenericServlet {
	
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		int row = Integer.parseInt(req.getParameter("n2"));
		int col = Integer.parseInt(req.getParameter("n3"));
		String sym = req.getParameter("n4");
		
		for(int i=1; i<row; i++) {
			for(int j=1; j<=col; j++) {
				pw.print(sym);
			}
			pw.print("<br>");
		}
	}

}
