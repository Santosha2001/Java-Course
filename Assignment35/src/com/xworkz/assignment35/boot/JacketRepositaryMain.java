package com.xworkz.assignment35.boot;

import com.xworkz.assignment35.app.repositary.jacket.JacketRepositary;
import com.xworkz.assignment35.app.repositary.jacket.JacketRepositaryImpl;

public class JacketRepositaryMain {

	public static void main(String[] args) {

		JacketRepositary jacketRepositary = new JacketRepositaryImpl();

		System.out.println("Jackets are implementing in JacketRepositaryImpl");

		jacketRepositary.jackets("Jeans");
		jacketRepositary.jackets("Rain Jacket");
		jacketRepositary.jackets("White jacket");
		jacketRepositary.jackets("Stylish jacket");
		jacketRepositary.jackets("Cool Jacket");
		jacketRepositary.jackets("Jeans1");
		jacketRepositary.jackets("Jeans2");
		jacketRepositary.jackets("Jeans3");
		jacketRepositary.jackets("Jeans4");
		jacketRepositary.jackets("Jeans5");

		jacketRepositary.jackets("Jeans6");
	}

}
