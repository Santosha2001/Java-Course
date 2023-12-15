package com.xworkz.collection.boot;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsingRegex {

	// email validation: santosha5856@gmail.com
	public static boolean emailRegex(String email) {
		String mailRegex = "^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]*)*@([a-zA-Z]+\\.)+[a-zA-Z]{2,5}$";
		Pattern pattern = Pattern.compile(mailRegex);
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
			System.out.println("Email Matches: " + matcher.matches());
			return true;
		} else {
			System.out.println("Email Matches: " + matcher.matches());
			return false;
		}
	}

	// pan number validate: CJDPC8700M
	public static boolean panNoRegex(String panNo) {
		Pattern pattern = Pattern.compile("^[A-Z]{5}\\d{4}[]A-Z]{1}");
		Matcher matcher = pattern.matcher(panNo);
		if (matcher.matches()) {
			System.out.println("Pan number matches: " + matcher.matches());
			return true;
		} else {
			System.out.println("Pan number matches: " + matcher.matches());
			return false;
		}

	}

	// number validation: starts with 6,7,8,9
	public static boolean numberValidate(String number) {
		Pattern pattern = Pattern.compile("^[6-9]\\d{9}");
		Matcher matcher = pattern.matcher(number);
		if (matcher.matches()) {
			System.out.println("Number matches: " + matcher.matches());
			return true;
		} else {
			System.out.println("Number matches: " + matcher.matches());
			return false;
		}
	}

	// pin validate: 583219
	public static boolean pinValidate(String pin) {
		Pattern pattern = Pattern.compile("^[1-9]\\d{5}");
		Matcher matcher = pattern.matcher(pin);
		if (matcher.matches()) {
			System.out.println("Pin matches: " + matcher.matches());
			return true;
		} else {
			System.out.println("Pin matches: " + matcher.matches());
			return false;
		}
	}

	public static void main(String[] args) {
		emailRegex("santosha.xworkz@gmail.com");
		emailRegex("santosha5856@gmail9.com");

		panNoRegex("CJDPC8700M");

		numberValidate("7022590204");

		pinValidate("583219");
	}
}
