package com.xworkz.assignment29.app;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date date = new Date(23 / 8 / 2023);
		Date date2 = new Date(22 / 8 / 2021);
		boolean b = date.after(date);
		System.out.println(b);

		boolean c = date.before(date);
		System.out.println(c);

		System.out.println(date.equals(date));

		System.out.println(date.compareTo(date2));
		
		System.out.println(date.clone());

	}
}
