package com.xworkz.assignment32.boot;

import com.xworkz.assignment32.app.Laptop;
import com.xworkz.assignment32.app.Trainer;

public class TrainerMain {

	public static void main(String[] args) {
		Trainer trainer = new Trainer("Santosh");
		Laptop laptop = new Laptop();
		trainer.setLaptop(laptop);

		trainer.laptop();
	}
}
