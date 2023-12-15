package com.xworkz.collection.boot;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Stream;

import com.xworkz.collection.app.dto.IcecreamDTO;

public class IcecreamMain {

	public static void main(String[] args) {
		IcecreamDTO dto = new IcecreamDTO("Chacolate", 100D, "Cup", LocalDate.of(2023, 11, 1));
		IcecreamDTO dto2 = new IcecreamDTO("Straberry", 200D, "Cone", LocalDate.of(2023, 11, 3));
		IcecreamDTO dto3 = new IcecreamDTO("Venilla", 200D, "Cup", LocalDate.of(2023, 11, 2));
		IcecreamDTO dto4 = new IcecreamDTO("Butter scotch", 400D, "Cup", LocalDate.of(2023, 10, 2));

		Comparator<IcecreamDTO> comparator = (c1, c2) -> c1.getFlavour().compareTo(c2.getFlavour());
		Comparator<IcecreamDTO> comparator2 = (c1, c2) -> c1.getPrice().compareTo(c2.getPrice());
		Comparator<IcecreamDTO> comparator3 = (d1, d2) -> d2.getManuDate().compareTo(d1.getManuDate());
		Comparator<IcecreamDTO> comparator4 = (t1, t2) -> t1.getType().compareTo(t2.getType());

		Stream.of(dto, dto2, dto3, dto4).sorted(comparator).forEach(a -> System.out.println(a));
		System.out.println();
		Stream.of(dto, dto2, dto3, dto4).sorted(comparator2).forEach(a -> System.out.println(a));

		System.out.println();
		Stream.of(dto, dto2, dto3, dto4).sorted(comparator3).forEach(a -> System.out.println(a));

		System.out.println();
		Stream.of(dto, dto2, dto3, dto4).sorted(comparator4).forEach(a -> System.out.println(a));

		System.out.println();
		Stream.of(dto, dto2, dto3, dto4).sorted(comparator2.thenComparing(comparator3))
				.forEach(a -> System.err.println(a));

	}
}
