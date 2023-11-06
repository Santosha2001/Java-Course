package com.xworkz.collection.sorting.dto;

import java.util.LinkedList;
import java.util.List;

public class PendriveMain {

	public static void main(String[] args) {
		List<PrndriveDTO> dtos = new LinkedList<PrndriveDTO>();

		dtos.add(new PrndriveDTO("SanDisk", "Cruzer Blade", 32, "USB 2.0", false));
		dtos.add(new PrndriveDTO("Kingston", "DataTraveler", 64, "USB 3.0", true));
		dtos.add(new PrndriveDTO("Transcend", "JetFlash", 128, "USB 3.1", true));
		dtos.add(new PrndriveDTO("Samsung", "BAR Plus", 256, "USB 3.1", true));
		dtos.add(new PrndriveDTO("HP", "v236w", 16, "USB 2.0", false));

		dtos.stream().sorted().forEach(a -> System.out.println(a));
	}
}
