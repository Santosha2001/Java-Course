package com.xworkz.collection.boot;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class NumberOperations {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Step 1: Take the 1st input and sort in descending order
		System.out.print("Enter the 1st input: ");
		String firstInput = scanner.nextLine();
		char[] firstInputArray = firstInput.toCharArray();
		Arrays.sort(firstInputArray);
		String sortedFirstInput = new StringBuilder(new String(firstInputArray)).reverse().toString();
		System.out.println("Sorted Descending: " + sortedFirstInput);

		// Step 2: Take the 2nd input and round off to 2 digits
		System.out.print("Enter the 2nd input: ");
		double secondInput = Double.parseDouble(scanner.nextLine());
		double roundedSecondInput = Math.round(secondInput * 100.0) / 100.0;
		System.out.println("Rounded to 2 digits: " + roundedSecondInput);

		// Step 3: Take the 3rd input, convert to BigDecimal, and subtract
		System.out.print("Enter the 3rd input: ");
		BigDecimal thirdInput = new BigDecimal(scanner.nextLine());
		BigDecimal result = thirdInput.subtract(BigDecimal.ONE); // Example subtraction
		System.out.println("Result of subtraction: " + result);

		// Step 4: Take the 4th input and sort in ascending order
		System.out.print("Enter the 4th input: ");
		String fourthInput = scanner.nextLine();
		char[] fourthInputArray = fourthInput.toCharArray();
		Arrays.sort(fourthInputArray);
		String sortedFourthInput = new String(fourthInputArray);
		System.out.println("Sorted Ascending: " + sortedFourthInput);

		// Close the scanner
		scanner.close();
	}
}
