package com.xworkz.assignment28.app;

public class RunTime {
	public static void main(String[] args) {
		System.out.println("Program starting...");
		Runtime run = Runtime.getRuntime();

		System.out.println("---------instance method------");

		System.out.println("Hello world!");
		System.out.println("" + Runtime.getRuntime().availableProcessors());

		System.out.println("" + Runtime.getRuntime().freeMemory());

		System.out.println("Program starting...");

		Runtime.getRuntime().halt(0);
		System.out.println("Process is still running.");

		System.out.println("Programmm3 starting...");
		System.out.println("" + Runtime.getRuntime().maxMemory());

		System.out.println("Programmm34 is starting...");
		System.out.println("" + Runtime.getRuntime().totalMemory());
	}
}
