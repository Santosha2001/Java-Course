package com.xworkz.assignment29.app;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread thread = new Thread();
		Thread thread2 = new Thread("Santosh");

		System.out.println(thread.getId());

		System.out.println(thread.equals(thread2));

		System.out.println(thread.getName());

		System.out.println(thread.getPriority());

		System.out.println(thread2.isAlive());

		System.out.println(thread2.hashCode());
		
		System.out.println(thread.hashCode());

		System.out.println(thread2.isDaemon());
	}
}
