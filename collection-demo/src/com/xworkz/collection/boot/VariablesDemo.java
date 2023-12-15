package com.xworkz.collection.boot;

public class VariablesDemo {

	int id = 22;
	static String name = "santhu";

	public VariablesDemo() {
		int age = id;
		String n = name;
		System.out.println("id name: " + age);
		System.out.println("id name: " + n);
	}

	public void hi() {
		System.out.println("hi");
	}

	public static void hello() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		VariablesDemo demo = new VariablesDemo();
		System.out.println(demo);
	}
}
