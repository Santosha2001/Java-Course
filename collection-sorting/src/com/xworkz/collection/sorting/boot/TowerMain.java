package com.xworkz.collection.sorting.boot;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.collection.sorting.dto.TowerDTO;

public class TowerMain {

	public static void main(String[] args) {
		List<TowerDTO> dtos = new LinkedList<TowerDTO>();
		dtos.add(new TowerDTO(300, 100000, "Bengalore", "Airtel"));
		dtos.add(new TowerDTO(200, 123000, "Davanagere", "Jio"));
		dtos.add(new TowerDTO(470, 187000, "Hasan", "VI"));
		dtos.add(new TowerDTO(320, 100240, "Mysore", "BSNL"));
		dtos.add(new TowerDTO(180, 230000, "Bengalore", "Jio"));

		dtos.stream().sorted().forEach(a -> System.out.println(a));
	}
}
