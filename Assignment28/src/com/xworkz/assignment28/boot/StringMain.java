package com.xworkz.assignment28.boot;

import java.nio.charset.Charset;

import com.xworkz.assignment28.app.StringClass;

public class StringMain {
	public static void main(String[] args) {

		// String Constructors
		String value = "X-Workz";

		StringClass class1 = new StringClass();

		char[] values = { 'a', 'b', 'c' };
		StringClass class2 = new StringClass(values);

		byte[] bytes = { 1, 2, 3 };
		Charset cs = Charset.defaultCharset();

		StringClass class3 = new StringClass(bytes, cs);

		System.out.println("\n----------String INSTANCE methods-------------\n");

		System.out.println("Value At index 0 is : " + value.charAt(0));

		System.out.println(value.getBytes());

		System.out.println(value.getClass());

		System.out.println("SubString that begins from index 2 : " + value.substring(2));

		System.out.println("Check for a Value Starts with X : " + value.startsWith("X"));

		System.out.println("\n----------String STATIC methods-------------\n");

		char[] val1 = { 'x', 'y', 'z' };
		String val2 = "";

		val2 = val2.copyValueOf(val1, 0, 3);

		System.out.println("Use of CopyValueOf Method : " + val2);

		String message = String.join("-", "This", "is", "a", "String");
		System.out.println("Use of join Method : " + message);

		int value1 = 30;
		String s1 = String.valueOf(value1);
		System.out.println(s1);

		String name = "sonoo";
		String sf1 = String.format("name is %s", name);
		System.out.println(sf1);

		boolean bool1 = false;
		boolean b1 = Boolean.valueOf(bool1);
		System.out.println(b1);

	}
}
