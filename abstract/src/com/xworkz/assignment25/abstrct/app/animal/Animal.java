package com.xworkz.assignment25.abstrct.app.animal;

public abstract class Animal {
	public abstract void eat();

	public abstract void sleep();

	public abstract void makeSound();

	public abstract void move();

	public abstract void reproduce();

	public void roam() {
		System.out.println("roaming.");
	}

	public void play() {
		System.out.println("playing.");
	}

	public void rest() {
		System.out.println("resting.");
	}

	public void hunt() {
		System.out.println("hunting.");
	}
}
