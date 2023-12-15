package com.xworkz.enumarations.boot;

public class StringReverse {
	public static String reverseString(String input) {

		String[] str = input.split(" ");

		StringBuilder reversedBuilder = new StringBuilder();
		for (int i = str.length - 1; i >= 0; i--) {
			reversedBuilder.append(str[i]);
			if (i > 0) {
				reversedBuilder.append(" ");
			}
		}
		String reversed = reversedBuilder.toString();

		return reversed;
	}

	public static void main(String[] args) {
		String input = "Hello World Java";
		String reversed = reverseString(input);
		System.out.println("Original String: " + input);
		System.out.println("Reversed String: " + reversed);
	}

}
