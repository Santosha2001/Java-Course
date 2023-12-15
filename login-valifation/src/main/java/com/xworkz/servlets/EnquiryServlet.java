package com.xworkz.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlets.dto.EnquiryDTO;

@WebServlet(urlPatterns = "/enq", loadOnStartup = 2)
public class EnquiryServlet extends HttpServlet {

	public EnquiryServlet() {
		System.out.println("Servlet created....");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String number = req.getParameter("number");
		String email = req.getParameter("email");
		String dob = req.getParameter("date");
		String location = req.getParameter("location");
		String password = req.getParameter("pass");

		EnquiryDTO dto = new EnquiryDTO(name, number, email, dob, location, password);

		req.setAttribute("item", dto);

		RequestDispatcher dispatcher = req.getRequestDispatcher("EnquirySuccess.jsp");
		dispatcher.forward(req, resp);
	}

}
