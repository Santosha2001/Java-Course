package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.servlet.dto.ProductDTO;

@WebServlet(urlPatterns = "/valid", loadOnStartup = 1)
public class Productservlet extends HttpServlet {

	public Productservlet() {
		System.out.println("Product servlet created");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String productName = req.getParameter("productName");
		String type = req.getParameter("type");
		String price = req.getParameter("price");
		String brand = req.getParameter("brand");
		String quantity = req.getParameter("quantity");
		String description = req.getParameter("description");

		ProductDTO dto = new ProductDTO(productName, type, price, brand, quantity, description);

		req.setAttribute("item", dto);

		double convertedPrie = Double.parseDouble(price);
		int convertedQuantity = Integer.parseInt(quantity);

		double total = convertedPrie * convertedQuantity;

		req.setAttribute("total", total);
		RequestDispatcher dispatcher = req.getRequestDispatcher("ProductSuccess.jsp");
		dispatcher.forward(req, resp);
	}

}
