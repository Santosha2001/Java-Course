package com.xworkz.assignment28.app;

import java.lang.Integer;

public class IntegerClass {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.bitCount(a));

		int a1 = 10;
		int b = 20;
		System.out.println(Integer.compare(a1, b));

		System.out.println("Decimal 10:" + Byte.decode("10"));
		System.out.println("Octal 10:" + Byte.decode("010"));
		System.out.println("Hex F:" + Byte.decode("0XF"));

		System.out.println("Negative Hex F:" + Byte.decode("-0XF"));

		Integer i = new Integer(99);
		Integer i2 = new Integer(35);

		System.out.print("Integer objects i and i2 are equal: ");
		System.out.println(i.equals(i2));

		Integer i1 = new Integer("155");

		int hashValue = i1.hashCode();
		System.out.println("Hash code Value for object is: " + hashValue);

		Integer obj1 = 225;
		short s = obj1.shortValue();
		System.out.println("Value of s = " + s);

		Integer obj = new Integer(8);
		String stringvalue1 = obj.toString();
		System.out.println("String Value= " + stringvalue1);

	}
}
