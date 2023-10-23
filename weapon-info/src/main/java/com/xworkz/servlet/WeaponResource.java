package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/akm", loadOnStartup = 1)
public class WeaponResource extends HttpServlet {

	public WeaponResource() {
		System.out.println("Default constructor");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String price = req.getParameter("price");
		String madeBy = req.getParameter("made-by");
		String weaponType = req.getParameter("weapon-type");

		double convertedPrice = Integer.parseInt(price);

		System.out.println("Name--> " + name);
		System.out.println("Price--> " + convertedPrice);
		System.out.println("madeBy--> " + madeBy);
		System.out.println("weaponType--> " + weaponType);

		resp.setContentType("text/html");
		PrintWriter printWriter = resp.getWriter();

//		printWriter.println(name + " saved..");
		
		printWriter.println("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Home Page</title>\r\n"
				+ "    <link rel=\"stylesheet\" href=\"style.css\">\r\n"
				+ "</head>\r\n"
				+ "\r\n"
				+ "<body>\r\n"
				+ "    <header>\r\n"
				+ "        <nav id=\"navbar\">\r\n"
				+ "            <div class=\"left\">Santosh</div>\r\n"
				+ "            <div class=\"right\">\r\n"
				+ "                <ul>\r\n"
				+ "                    <li><a href=\"#\">Home</a></li>\r\n"
				+ "                    <li><a href=\"weapon.html\">Weapon</a></li>\r\n"
				+ "                </ul>\r\n"
				+ "            </div>\r\n"
				+ "        </nav>\r\n"
				+ "    </header>\r\n"
				+ "<h3 style='text-align:center'>Name: <b>" + name + "</b></h3>"
				+ "<h3 style='text-align:center'>convertedPrice: <b>" + convertedPrice + "</b></h3>"
				+ "<h3 style='text-align:center'>madeBy: <b>" + madeBy + "</b></h3>"
				+ "<h3 style='text-align:center'>weaponType: <b>" + weaponType + "</b></h3>"
				+ "</body>\r\n"
				+ "\r\n"
				+ "</html>");

	}
}
