package com.xworkz.servleet.dto;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/jsps", loadOnStartup = 2)
public class Login extends HttpServlet {

	public Login() {
		System.out.println("No argument constructor");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String userId = req.getParameter("userId");
		String password = req.getParameter("password");

		LoginDTO dto = new LoginDTO(userId, password);

		if (userId == "admin" && password == "secret") {
			RequestDispatcher dispatcher = req.getRequestDispatcher("LoginSuccess.jsp");
			dispatcher.forward(req, resp);
		} else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
			dispatcher.forward(req, resp);
		}
	}

}
