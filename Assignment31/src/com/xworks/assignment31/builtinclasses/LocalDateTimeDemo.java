package com.xworks.assignment31.builtinclasses;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		LocalDateTime dateTime2 = LocalDateTime.MAX;
		System.out.println(dateTime2);

		LocalDateTime dateTime3 = LocalDateTime.MIN;
		System.out.println(dateTime3);

		LocalDateTime dateTime4 = LocalDateTime.of(2023, 4, 14, 12, 20);
		System.out.println(dateTime4);

	}
}
