package com.xworkz.assignment35.services.boot;

import com.xworkz.assignment35.app.repositary.curd.CurdRepositary;
import com.xworkz.assignment35.app.repositary.curd.CurdRepositaryImpl;
import com.xworkz.assignment35.app.services.curd.CurdServices;
import com.xworkz.assignment35.app.services.curd.CurdServicesImpl;

public class CurdServicesMain {

	public static void main(String[] args) {
		System.out.println("Curd in CurdServices");
		System.out.println();

		CurdRepositary curdRepositary = new CurdRepositaryImpl();

		CurdServices curdServices = new CurdServicesImpl(curdRepositary);

		curdServices.curdValidate("Amul Curd");
		curdServices.curdValidate("HatSum Curd");
		System.out.println();

		curdServices.curdValidate(null);
		System.out.println();

		curdServices.curdValidate("");
		System.out.println();

		curdServices.curdValidate("a");
	}
}
