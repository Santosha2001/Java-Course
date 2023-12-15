package com.xworkz.collection.boot;

import java.time.LocalDate;

public class StringDemo {

	public static void name() {
		System.out.println("Name");
		age();
	}

	public static void age() {
		System.out.println("age");
		name();
	}

	public static void main(String[] args) {
		String str1 = new String("Santhu");
		System.out.println(str1);

//		String str2 = "Xworkz";
//		System.out.println(str2.charAt(0));
//		System.out.println(str2.codePointAt(2));
//		System.out.println(str2.codePointBefore(2));
//		System.out.println(str2.codePointCount(0, 3));
//		System.out.println(str2.concat(str1));
//		System.out.println(str2.compareTo(str1));
//		System.out.println(str2.compareToIgnoreCase("xworkz"));
//		System.out.println(str2.contains("wor"));
//		System.out.println(str2.contentEquals("ork"));
//		System.out.println(str2.contentEquals("Xworkz"));
//		System.out.println(str2.endsWith("z"));
//		System.out.println(str2.equals(str1));
//		System.out.println(str2.equalsIgnoreCase(str1));
//		System.out.println(str2.formatted(str1));
//		System.out.println(str2.format(str2, "adnafkj"));
//		System.out.println(str2.codePointBefore(2));
//		System.out.println(str2.hashCode());
//		System.out.println(str2.indent(4));
//		System.out.println(str2.indexOf(3));
//		System.out.println(str2.indexOf("k"));
//		System.out.println(str2.indexOf(2, 4));
//		System.out.println(str2.indexOf(str2, 0));
//		System.out.println(str2.intern());
//		System.out.println(str2.isBlank());
//		System.out.println(str2.isEmpty());
//		System.out.println(str2.lastIndexOf(4));
//		System.out.println(str2.lastIndexOf(0, 3));
//		System.out.println(str2.length());
//		System.out.println(str2.matches("Xworkz"));
//		System.out.println(str2.offsetByCodePoints(2, 4));
//		System.out.println(str2.regionMatches(1, "work", 2, 3));
//		System.out.println(str2.regionMatches(true, 1, str1, 2, 2));
//		System.out.println(str2.repeat(2));
//		System.out.println(str2.replace(str2, str1));
//		System.out.println(str2.replaceAll(str2, "XworkODC"));
//		System.out.println(str2.replaceFirst("X", "x"));
//		System.out.println(str2.resolveConstantDesc(null));
//		System.out.println(str2.startsWith("X"));
//		System.out.println(str2.startsWith("Xw", 0));
//		System.out.println(str2.strip());
//		System.out.println(str2.stripIndent());
//		System.out.println(str2.stripLeading());
//		System.out.println(str2.stripTrailing());
//		System.out.println(str2.lastIndexOf(4));
//		System.out.println(str2.substring(3));
//		System.out.println(str2.substring(2, 4));
//		System.out.println(str2.toCharArray());
//		System.out.println(str2.toLowerCase());
//		System.out.println(str2.toLowerCase());
//		System.out.println(str2.toString());
//		System.out.println(str2.toUpperCase());
//		System.out.println(str2.translateEscapes());
//		System.out.println(str2.trim());
//		System.out.println(str2.chars());
//		System.out.println(str2.join(str1, args));
//		System.out.println(str2.join(str2, "Sa"));
//		System.out.println(str2.valueOf(true));
//		System.out.println(str2.valueOf(2));

		int a = 2;
		int b = 2;
//		int c = (a + b) / (a - b);
//		System.out.println(c);
//
//		String str = null;
//		System.out.println(str.concat("Sahvs"));

		name();

	}
}
