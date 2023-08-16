package com.xworkz.assignment26.tostring.boot;

import com.xworkz.assignment26.tostring.app.*;

public class ToStringMain {
	public static void main(String[] args) {
		Flag flag = new Flag();
//		System.out.println(flag.toString()); explisit toStriing()
		System.out.println(flag); // implisit toStriing()

		Flag flag2 = new Flag("Karnataka", 3, "India");
		System.out.println(flag2);

		Flag flag3 = new Flag("Karnataka", 2, "Karnataka");
		System.out.println(flag3);
		System.out.println();

		Logo logo = new Logo();
		System.out.println(logo);

		Logo logo2 = new Logo("Xworkz", "square", 'M', true, "Black");
		System.out.println(logo2);

		Logo logo3 = new Logo("Adidas", "Triangle", 'M', true, "White");
		System.out.println(logo3);
		System.out.println();

		Karchief karchief = new Karchief();
		System.out.println(karchief);

		Karchief karchief2 = new Karchief('S', "Blue", 20, "Square", true, true, true);
		System.out.println(karchief2);

		Karchief karchief3 = new Karchief('M', "White", 25, "Square", true, true, true);
		System.out.println(karchief3);
		System.out.println();

		Cave cave = new Cave();
		System.out.println(cave);

		Cave cave2 = new Cave("Crystal Cave", 12, 1000, true, 200, 170, "Calcite", false, 5, 2);
		System.out.println(cave2);

		Cave cave3 = new Cave("Mystic Grotto", 10, 700, false, 150, 140, "Gypsum, Quartz", false, 4, 3);
		System.out.println(cave3);
		System.out.println();

		Pendant pendant = new Pendant();
		System.out.println(pendant);

		Pendant pendant2 = new Pendant("Silver", "Blue", 3.0, 6, false, "Round with filigree", 2, 2, 3, "Rope chain",
				false, true);
		System.out.println(pendant2);

		Pendant pendant3 = new Pendant("Gold", "Red", 5.3, 8, true, "Heart-shaped", 3, 2, 3, "Curb chain", true, false);
		System.out.println(pendant3);

	}
}
