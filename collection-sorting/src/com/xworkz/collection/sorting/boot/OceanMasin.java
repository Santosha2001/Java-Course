package com.xworkz.collection.sorting.boot;

import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.collection.sorting.dto.OceanDTO;

public class OceanMasin {

	public static void main(String[] args) {
		List<OceanDTO> dtos = new LinkedList<OceanDTO>();
		dtos.add(new OceanDTO("Paciffic", "Eat America", 79, true));
		dtos.add(new OceanDTO("Indian Ocean", "Asia", 30, true));
		dtos.add(new OceanDTO("Atlantic Ocean", "Americ", 43, true));
		dtos.add(new OceanDTO("Arctic Ocean", "North pole", 23, true));
		dtos.add(new OceanDTO("Southern Ocean", "Antartica", 60, true));

		dtos.stream().sorted().forEach(a -> System.out.println(a));
		
	}
}
