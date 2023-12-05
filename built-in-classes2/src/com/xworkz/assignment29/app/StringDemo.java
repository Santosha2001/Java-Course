package com.xworkz.assignment29.app;

public class StringDemo {
	public static void main(String[] args) {
		String string = new String("Learning");
		String st = new String("Java");
		String s = new String("Java");
//		System.out.println("String concat: " + string.concat(" java"));
		String string2 = string.concat(" Java");
		System.out.println("Concatinated string is: " + string2);

		int indexAt = string.charAt(3);
		System.out.println("CharAt index 3 is: " + indexAt);

		String[] string3 = string2.split("a");
//		for(int i=0;i<string.length();i++) {
		System.out.println("String regex : " + string3);
//		}

		String[] string4 = string.split(string2, 1);
		System.out.println("String regex limit : " + string4);

		int string5 = st.compareTo(s);
		System.out.println(string5);

		String string6 = st.substring(2);
		System.out.println(string6);

		String string7 = st.substring(1, 3);
		System.out.println(string7);

		String string8 = new String();
		boolean b = string8.isEmpty();
		System.out.println(b);

		int i = st.length();
		System.out.println(i);

		boolean c = st.startsWith("J");
		System.out.println(c);

		boolean d = st.endsWith("v");
		System.out.println(d);

		boolean e = st.equals("java");
		System.out.println(e);

		boolean f = st.equalsIgnoreCase("java");
		System.out.println(f);

		boolean g = st.equalsIgnoreCase("javaaa");
		System.out.println(g);

		String string9 = st.toUpperCase();
		System.out.println(string9);

		String string10 = st.toLowerCase();
		System.out.println(string10);

		int j = st.indexOf(1);
		System.out.println(j);

		String string11 = new String("     Corse      ");
		System.out.println(string11.trim());

	}
}
