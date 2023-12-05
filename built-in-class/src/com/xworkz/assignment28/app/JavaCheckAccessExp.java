package com.xworkz.assignment28.app;

public class JavaCheckAccessExp extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " finished executing");
	}

	public static void main(String arg[]) throws InterruptedException, SecurityException {
		// creating the thread
		JavaCheckAccessExp t1 = new JavaCheckAccessExp();

		t1.start();

		t1.checkAccess();
		System.out.println(t1.getName() + " has access");

	}
}
