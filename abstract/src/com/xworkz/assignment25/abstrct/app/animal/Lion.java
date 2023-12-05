package com.xworkz.assignment25.abstrct.app.animal;

public class Lion extends Animal {
	@Override
	public void eat() {
		System.out.println("eating meat.");
	}

	@Override
	public void sleep() {
		System.out.println("sleeping in its den.");
	}

	@Override
	public void makeSound() {
		System.out.println("roars loudly.");
	}

	@Override
	public void move() {
		System.out.println("moving on the savannah.");
	}

	@Override
	public void reproduce() {
		System.out.println("gives birth to cubs.");
	}
}
