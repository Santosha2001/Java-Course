package com.xworkz.servleet.dto;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/jsps", loadOnStartup = 1)
public class AddressServlet extends HttpServlet {

	public AddressServlet() {
		System.out.println("Address servlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String number = req.getParameter("number");
		String state = req.getParameter("state");
		String city = req.getParameter("city");
		String country = req.getParameter("country");
		String street = req.getParameter("street");

		LoginDTO dto = new LoginDTO(number, state, street, city, country);

		RequestDispatcher dispatcher = req.getRequestDispatcher("AddressSuccess.jsp");
		dispatcher.forward(req, resp);

	}

}
