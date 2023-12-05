package com.xworkz.assignment21.boot;

import com.xworkz.assignment21.app.elevator.Elevator;
import com.xworkz.assignment21.app.gadget.Gadget;
import com.xworkz.assignment21.app.hotel.Hotel;
import com.xworkz.assignment21.app.ironbox.IronBox;
import com.xworkz.assignment21.app.ladder.Ladder;
import com.xworkz.assignment21.app.mouse.Mouse;
import com.xworkz.assignment21.app.plier.Plier;
import com.xworkz.assignment21.app.spects.Spects;
import com.xworkz.assignment21.app.stapller.Stapler;
import com.xworkz.assignment21.app.umbrella.Umbrella;

public class Assignment21Main {
	public static void main(String[] args) {
		Elevator elevator = new Elevator();
		elevator.elevator();
		elevator.elevator(8);
		System.out.println("\n");

		Hotel hotel = new Hotel();
		hotel.hotel();
		hotel.hotel("Navami");
		System.out.println("\n");

		Gadget gadget = new Gadget();
		gadget.gadget();
		gadget.gadget(10000, "Flipkart");
		System.out.println("\n");

		IronBox box = new IronBox();
		box.ironBox(true, "Usha");
		box.ironBox(1000);
		System.out.println("\n");

		Ladder ladder = new Ladder();
		ladder.ladder("Bamboo");
		ladder.ladder("iron", 500);
		System.out.println("\n");

		Mouse mouse = new Mouse();
		mouse.mouse();
		mouse.mouse(true);
		System.out.println("\n");

		Plier plier = new Plier();
		plier.plier();
		plier.plier("Santh brand");
		System.out.println("\n");

		Spects spects = new Spects();
		spects.spects(2.1);
		spects.spects(1.6, "canvex");
		System.out.println("\n");

		Stapler stapler = new Stapler();
		stapler.stapler('s');
		stapler.stapler('M', 49);
		System.out.println("\n");

		Umbrella umbrella = new Umbrella();
		umbrella.umbrella();
		umbrella.umbrella('s', 200);

	}
}
