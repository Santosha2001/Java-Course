package com.xworkz.assignment23.app.hotel;

public class Hotel {
	public void hotel() {
		System.out.println("hotel in super class");
	}

	public void hotel(String name) {
		System.out.println("hotel name in super class: " + name);
	}

	public void hotel(String name, int openTime) {
		System.out.println("hotel name in super class: " + name);
		System.out.println("hotel open time in super class: " + openTime);
	}

	public void hotel(String name, int openTime, int closeTime) {
		System.out.println("hotel name in super class: " + name);
		System.out.println("hotel open time in super class: " + openTime);
		System.out.println("hotel close time in super class: " + closeTime);
	}

	public void hotel(String name, int openTime, int closeTime, String location) {
		System.out.println("hotel name in super class: " + name);
		System.out.println("hotel open time in super class: " + openTime);
		System.out.println("hotel close time in super class: " + closeTime);
		System.out.println("hotel location in super class: " + location);
	}

	public void hotel(String name, int openTime, int closeTime, String location, String state) {
		System.out.println("hotel name in super class: " + name);
		System.out.println("hotel open time in super class: " + openTime);
		System.out.println("hotel close time in super class: " + closeTime);
		System.out.println("hotel location in super class: " + location);
		System.out.println("hotel state in super class: " + state);
	}
}
