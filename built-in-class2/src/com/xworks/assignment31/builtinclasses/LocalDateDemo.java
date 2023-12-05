package com.xworks.assignment31.builtinclasses;

import java.time.LocalDate;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalDate date2 = LocalDate.EPOCH;
		System.out.println(date2);

		LocalDate date3 = LocalDate.of(2023, 8, 23);
		System.out.println(date3);

		LocalDate date4 = LocalDate.MAX;
		System.out.println(date4);

		LocalDate date5 = LocalDate.ofEpochDay(2);
		System.out.println(date5);

	}
}
