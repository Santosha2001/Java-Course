package com.xworkz.assignment23.app.hotel;

public class Canteen extends Hotel {
	@Override
	public void hotel() {
		System.out.println("hotel in derived class");
	}

	@Override
	public void hotel(String name) {
		System.out.println("hotel name in derived class: " + name);
	}

	@Override
	public void hotel(String name, int openTime) {
		System.out.println("hotel name in derived class: " + name);
		System.out.println("hotel open time in derived class: " + openTime);
	}

	@Override
	public void hotel(String name, int openTime, int closeTime) {
		System.out.println("hotel name in super derived: " + name);
		System.out.println("hotel open time in derived class: " + openTime);
		System.out.println("hotel close time in derived class: " + closeTime);
	}

	@Override
	public void hotel(String name, int openTime, int closeTime, String location) {
		System.out.println("hotel name in derived class: " + name);
		System.out.println("hotel open time in derived class: " + openTime);
		System.out.println("hotel close time in derived class: " + closeTime);
		System.out.println("hotel location in derived class: " + location);
	}

	@Override
	public void hotel(String name, int openTime, int closeTime, String location, String state) {
		System.out.println("hotel name in derived class: " + name);
		System.out.println("hotel open time in derived class: " + openTime);
		System.out.println("hotel close time in derived class: " + closeTime);
		System.out.println("hotel location in derived class: " + location);
		System.out.println("hotel state in derived class: " + state);
	}
}
