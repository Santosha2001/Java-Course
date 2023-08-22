package com.xworkz.assignment28.app;

import java.time.*;
import java.time.temporal.ChronoField;

public class LoalDateTimeClass {
	public static void main(String[] args) {
		LocalDateTime a = LocalDateTime.now(Clock.systemDefaultZone());
		System.out.println(a);

		ZoneId zid = ZoneId.of("Europe/Paris");
		LocalDateTime lt = LocalDateTime.now(zid);
		System.out.println("LocalDateTime : " + lt);

		Clock cl = Clock.systemUTC();
		LocalDateTime lt1 = LocalDateTime.now(cl);
		System.out.println("LocalDateTime : " + lt1);

		LocalDateTime date = LocalDateTime.of(2017, 2, 3, 6, 30);
		System.out.println(date);

		LocalDateTime date1 = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
		System.out.println(date1);

		System.out.println("-------------instance methods--------------");

		ZonedDateTime date2 = ZonedDateTime.now();
		System.out.println(date2);

		LocalDateTime date3 = LocalDateTime.parse("2017-02-03T12:30:30");
		date2 = (ZonedDateTime) date3.adjustInto(date2);
		System.out.println(date2);

		LocalDateTime date4 = LocalDateTime.parse("2017-02-03T12:30:30");
		System.out.println(date4);
		OffsetDateTime date5 = date4.atOffset(ZoneOffset.ofHours(2));
		System.out.println(date5);

		LocalDateTime a1 = LocalDateTime.of(2014, 6, 30, 12, 00);
		ZonedDateTime b = a1.atZone(ZoneId.systemDefault());

		System.out.println(b);

		LocalDate a11 = LocalDate.of(2014, 6, 30);

		System.out.println(a11.get(ChronoField.DAY_OF_YEAR));

		LocalDate ld = LocalDate.parse("2019-02-14");
		System.out.println("The LocalDate is: " + ld);
		System.out.println("The day of the month is: " + ld.getDayOfMonth());

	}
}
