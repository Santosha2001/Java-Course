package com.xworkz.enumarations.boot;

public class Reverse {

	public static void main(String[] args) {
		String str = "Hello";
		String reversedStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversedStr += str.charAt(i);
		}

		System.out.println("Original string is: " + str);
		System.out.println("The reversed string is: " + reversedStr);
	}
}
