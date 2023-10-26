package com.xworkz.collections.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class LaptopModels {
	public static void main(String[] args) {

		Collection<String> collection = new ArrayList<String>(Arrays.asList("Pavilion", "HP Envy", "Omen",
				"HP ENVY x360", "Probook", "Spectre", "HP ProBook 450 G4", "HP Spectre x360", "Elitebook",
				"HP Pavilion 14-dv2000", "HP Pavilion Aero 13-be00", "HP Chromebook", "HP Inc. HP Pavilion ",
				"ThinkPad", "IdeaPad", "ThinkPad T series", "ThinkPad E series", "ThinkPad X series",
				"Thinkpad P Series", "Lenovo ThinkPad E14", "Lenovo ThinkPad L Series", "ThinkPad X1 series",
				"ThinkBook", "Thinkpad Yoga", "Lenovo ThinkPad E15", "X1 Carbon", "Lenovo Yoga Slim 7 (14)"));

		Collection<String> collection2 = new ArrayList<String>(Arrays.asList("Pavilion", "HP Envy", "Omen",
				"HP ENVY x360", "Probook", "Spectre", "HP ProBook 450 G4", "HP Spectre x360", "Elitebook",
				"HP Pavilion 14-dv2000", "HP Pavilion Aero 13-be00", "HP Chromebook", "HP Inc. HP Pavilion ",
				"ThinkPad", "IdeaPad", "ThinkPad T series", "ThinkPad E series", "ThinkPad X series",
				"Lenovo ThinkPad E15", "X1 Carbon", "Lenovo Yoga Slim 7 (14)"));

		System.out.println(collection);
		System.out.println(collection.size());
		System.out.println(collection2);

		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		System.out.println();

		collection.remove("Spectre");
		System.out.println(collection.size());

		boolean b = collection.contains("Probook");
		boolean c = collection.containsAll(collection2);

		System.out.println(b);
		System.out.println(c);

		System.out.println();
		collection2.removeAll(collection2);
		System.out.println(collection2.size());
	}
}
