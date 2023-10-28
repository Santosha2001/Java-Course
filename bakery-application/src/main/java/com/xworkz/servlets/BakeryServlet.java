package com.xworkz.servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlets.dto.BakeryDTO;

@WebServlet(urlPatterns = "/bake", loadOnStartup = 1)
public class BakeryServlet extends HttpServlet {

	public BakeryServlet() {
		System.out.println("Servlet is created");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String item = req.getParameter("item");
		String price = req.getParameter("price");
		String discount = req.getParameter("discount");
		String quantity = req.getParameter("quantity");
		String manuDate = req.getParameter("manuDate");
		String expDate = req.getParameter("expDate");
		String gst = req.getParameter("gst");

		int quantityConverted = Integer.parseInt(quantity);
		double priceConverted = Double.parseDouble(price);

		double total = quantityConverted * priceConverted;

		BakeryDTO bakeryDTO = new BakeryDTO(name, item, price, discount, manuDate, expDate, quantity, gst);

		req.setAttribute("cake", bakeryDTO);

		req.setAttribute("total", total);

		int discountConverted = Integer.parseInt(discount);
		double totalAmountWithDiscount = (total * (100 - discountConverted)) / 100;

		req.setAttribute("totalWithDiscount", totalAmountWithDiscount);

		LocalDateTime dateTime = LocalDateTime.now();

		req.setAttribute("date", dateTime);

		LocalDate date = LocalDate.now();

		req.setAttribute("date1", date);

		RequestDispatcher dispatcher = req.getRequestDispatcher("BakerySuccess.jsp");
		dispatcher.forward(req, resp);
	}

}
