package com.xworkz.collection.boot;

import java.util.Scanner;

public class StringOpearions {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the input string: ");
		String str = scanner.nextLine();

		// split by delimiter character
		System.out.print("Enter the delimiter character: ");
		String delimiter = scanner.nextLine();

		scanner.close();
		String[] splitStriing = str.split(delimiter);
		for (int i = 0; i < splitStriing.length; i++) {
			System.out.println(splitStriing[i]);
		}

		// finding vowels
		for (char vowels : str.toCharArray()) {
			if ("aeiouAEIOU".indexOf(vowels) != -1) {
				System.out.print(vowels + " ");
			}
		}

		// total characters in string
		System.out.println("\nTotal length: " + str.length());

		// number words in string
//		String[] words = str.split("\\s+");
//		System.out.println("Number of words: " + words.length);
		System.out.println(str.split("\\s+").length);

	}
}