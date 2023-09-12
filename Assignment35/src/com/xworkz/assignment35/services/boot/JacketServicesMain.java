package com.xworkz.assignment35.services.boot;

import com.xworkz.assignment35.app.repositary.jacket.JacketRepositary;
import com.xworkz.assignment35.app.repositary.jacket.JacketRepositaryImpl;
import com.xworkz.assignment35.app.services.jacket.JacketServices;
import com.xworkz.assignment35.app.services.jacket.JacketServicesImpl;

public class JacketServicesMain {

	public static void main(String[] args) {
		System.out.println("Jacket is in JacketServices");
		System.out.println();

		JacketRepositary jacketRepositary = new JacketRepositaryImpl();

		JacketServices jacketServices = new JacketServicesImpl(jacketRepositary);

		jacketServices.jacketValidate("Rain Jacket");
		System.out.println();

		jacketServices.jacketValidate(null);
		System.out.println();

		jacketServices.jacketValidate("");
		System.out.println();

		jacketServices.jacketValidate("a");

	}
}
