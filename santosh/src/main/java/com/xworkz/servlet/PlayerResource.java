package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/santhu", loadOnStartup = 1)
public class PlayerResource extends HttpServlet {

	public PlayerResource() {

		System.out.println("Default Constructor");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String sports = req.getParameter("sports");
		String place = req.getParameter("place");
		String exp = req.getParameter("exp");

		System.out.println(name);
		System.out.println(sports);
		System.out.println(place);
		System.out.println(exp);

		resp.setContentType("text/plain");
		PrintWriter printWriter = resp.getWriter();
		printWriter.println(name + " informations....");
		printWriter.println("Sports is: " + sports);
		printWriter.println("Place is: " + place);
		printWriter.println("Experience is: " + exp);
	}

}
