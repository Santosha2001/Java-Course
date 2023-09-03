package com.xworkz.assignment35.boot;

import com.xworkz.assignment35.app.repositary.curd.CurdRepositary;
import com.xworkz.assignment35.app.repositary.curd.CurdRepositaryImpl;

public class CurdRepositaryMain {

	public static void main(String[] args) {
		CurdRepositary curdRepositary = new CurdRepositaryImpl();

		System.out.println("Curd is implementing in curdRepositary");

		curdRepositary.curd("Amul");
		curdRepositary.curd("Arogya");
		curdRepositary.curd("Hatsome");
		curdRepositary.curd("Nandini");
		curdRepositary.curd("Butter curd");
		curdRepositary.curd("Amul1");
		curdRepositary.curd("Amul2");
		curdRepositary.curd("Amul3");
		curdRepositary.curd("Amul4");
		curdRepositary.curd("Amul5");

		curdRepositary.curd("Amul6");

	}

}
