package com.task;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/namePass")
public class UserPassPage extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		String name = req.getParameter("name");
		String pass =req.getParameter("pass");
		
		if((name!=null && !name.isBlank()) && 
				(pass!=null && pass.equals("Mahi07@cap"))) {
			RequestDispatcher rd = req.getRequestDispatcher("detail.html");
			rd.forward(req, res);
		}
		
		else {

			pw.print("Invalid name or password");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, res);
		}
	}

}
