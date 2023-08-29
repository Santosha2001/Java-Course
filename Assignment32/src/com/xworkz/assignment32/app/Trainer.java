package com.xworkz.assignment32.app;

public class Trainer {

	private String name;
	private Laptop laptop;

	public Trainer(String name) {
		super();
		this.name = name;
		System.out.println("Name is: " + name);
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void laptop() {
		System.out.println("Trainer has a laptop");
		this.laptop.storage();
	}
}
