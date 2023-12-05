package com.xworkz.assignment30.interfaces.app.impl;

import com.xworkz.assignment30.interfaces.app.Temple;

public class TempleImpl implements Temple {

	@Override
	public String templeName(String name) {
		System.out.println("Name of the temple: " + name);
		return name;
	}

	@Override
	public double openTime(double time) {
		System.out.println("open time: " + time);
		return time;
	}

	@Override
	public String location(String location) {
		System.out.println("Temple location: " + location);
		return location;
	}

}
