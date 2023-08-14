package com.xworkz.assignment25.abstrct.boot;

import com.xworkz.assignment25.abstrct.app.animal.Animal;
import com.xworkz.assignment25.abstrct.app.animal.Lion;

public class AnimalMain {
	public static void main(String[] args) {
		Animal lion = new Lion();

		lion.roam();
		lion.play();
		lion.rest();
		lion.hunt();

		System.out.println();

		lion.makeSound();
		lion.eat();
		lion.move();
		lion.sleep();
		lion.reproduce();

	}
}
