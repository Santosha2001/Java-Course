package com.xworkz.collection.boot;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collection.app.dto.CameraDTO;

public class CameraMain {

	public static void main(String[] args) {
		List<CameraDTO> cameraDTOs = new ArrayList<CameraDTO>();
		cameraDTOs.add(new CameraDTO(1, "Sony", "Alpha", 10000, LocalDate.of(2022, 2, 12)));
		cameraDTOs.add(new CameraDTO(2, "Google pixel", "EOS", 15000, LocalDate.of(2021, 2, 22)));
		cameraDTOs.add(new CameraDTO(3, "Lenovo", "D7500", 20000, LocalDate.of(2022, 3, 12)));
		cameraDTOs.add(new CameraDTO(4, "Canon", "SLR", 22000, LocalDate.of(2011, 11, 3)));
		cameraDTOs.add(new CameraDTO(5, "Nikon", "Beta", 13000, LocalDate.of(2012, 12, 13)));

		System.out.println(cameraDTOs.size());
//		for (CameraDTO cameraDTO : cameraDTOs) {
//			System.out.println(cameraDTO);
//		}

		System.out.println();
//		cameraDTOs.stream().filter((camera) -> camera.getBrand().equals("Canon")).forEach(c -> System.out.println(c));
//
//		cameraDTOs.stream().filter((camera) -> camera.getCost() > 15000).collect(Collectors.toList())
//				.forEach(c -> c.getModel());

		List<String> collection = new ArrayList<String>();
		List<Double> collection2 = new ArrayList<Double>();

//		cameraDTOs.stream().filter((ca) -> ca.getCost() > 15000).forEach(ca -> collection.add(ca.getModel()));

//		Collection<CameraDTO> collection3 = cameraDTOs.stream().filter((camera) -> camera.getBrand().equals("Canon"))
//				.collect(Collectors.toList());
//		System.err.println(collection3);

		cameraDTOs.stream().filter((a) -> a.getBrand().equals("Sony")).forEach(a -> collection2.add(a.getCost()));

		collection2.forEach(e -> System.out.println(e));

		// map is used to convert one another type
//		cameraDTOs.stream().filter((e) -> e.getModel().equals("Beta")).map((a) -> a.getBrand())
//				.forEach(q -> System.err.println(q));

//		cameraDTOs.stream().filter((w) -> w.getBrand().startsWith("S")).map((a) -> a.getId())
//				.collect(Collectors.toList()).forEach(a -> System.err.println(a));

	}
}
