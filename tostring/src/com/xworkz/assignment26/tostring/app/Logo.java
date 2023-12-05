package com.xworkz.assignment26.tostring.app;

public class Logo {
	private String logoName;
	private String shape;
	private char size;
	private boolean toIdentify;
	private String color;

	public Logo() {
		System.out.println("No parameters");
	}

	public Logo(String logoName, String shape, char size, boolean toIdentify, String color) {
		super();
		this.logoName = logoName;
		this.shape = shape;
		this.size = size;
		this.toIdentify = toIdentify;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Logo [logoName=" + logoName + ", shape=" + shape + ", size=" + size + ", toIdentify=" + toIdentify
				+ ", color=" + color + "]";
	}

}
