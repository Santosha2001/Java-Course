package com.xworkz.assignment28.app;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;

public class LocalDateClass {
	public static void main(String[] args) {
		LocalDate a = LocalDate.now(Clock.systemDefaultZone());
		System.out.println(a);

		LocalDate date = LocalDate.of(2017, 2, 3);
		System.out.println(date);

		LocalDate date1 = LocalDate.ofEpochDay(10);
		System.out.println(date1);

		LocalDate date11 = LocalDate.ofYearDay(2017, 34);
		System.out.println(date11);

		LocalDate a1 = LocalDate.parse("2007-12-03");
		System.out.println(a1);

		System.out.println("---------Instance methods------------");

		LocalDate date3 = LocalDate.parse("2017-02-03");
		System.out.println(date3);
		LocalDateTime date4 = date3.atTime(1, 20, 30);
		System.out.println(date4);

		LocalDate mon = LocalDate.parse("2017-02-03");
		System.out.println(mon);
		LocalDateTime date111 = mon.atTime(1, 20, 30);
		System.out.println(date111);

		LocalDate date5 = LocalDate.parse("2017-02-03");
		System.out.println(date5);
		OffsetTime time = OffsetTime.now();
		OffsetDateTime date15 = date5.atTime(time);
		System.out.println(date15);

		LocalDate dt = LocalDate.parse("2018-11-27");
		System.out.println(dt.getChronology());

		LocalDate ld = LocalDate.parse("2019-02-14");
		System.out.println("The LocalDate is: " + ld);
		System.out.println("The month is: " + ld.getMonth());
	}
}
