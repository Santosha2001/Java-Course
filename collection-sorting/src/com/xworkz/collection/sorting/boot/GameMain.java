package com.xworkz.collection.sorting.boot;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import com.xworkz.collection.sorting.dto.GameDTO;

public class GameMain {
	public static void main(String[] args) {
		GameDTO dto = new GameDTO(1, "Cricket", 11, 2, LocalDate.of(2023, 11, 7), "Austrelia", "Afganistan", 6);
		GameDTO dto2 = new GameDTO(2, "Football", 11, 1, LocalDate.of(2023, 10, 7), "Liverpol", "Argentina", 3);
		GameDTO dto3 = new GameDTO(1, "Cricket", 11, 2, LocalDate.of(2023, 1, 7), "India", "Pakistan", 6);
		GameDTO dto4 = new GameDTO(6, "Hockey", 11, 1, LocalDate.of(2023, 3, 27), "India", "Japan", 3);
		GameDTO dto5 = new GameDTO(4, "Kabbadi", 7, 1, LocalDate.of(2023, 6, 17), "India", "Iran", 2);
		GameDTO dto6 = new GameDTO(5, "Volley ball", 6, 1, LocalDate.of(2023, 1, 7), "Poland", "France", 3);
		GameDTO dto7 = new GameDTO(2, "Football", 11, 1, LocalDate.of(2023, 10, 3), "Manchester", "Liverpool", 3);
		GameDTO dto8 = new GameDTO(8, "Tennis", 2, 5, LocalDate.of(2023, 4, 3), "America", "Italy", 2);
		GameDTO dto9 = new GameDTO(2, "Football", 11, 1, LocalDate.of(2023, 8, 3), "England", "Argentina", 3);
		GameDTO dto10 = new GameDTO(3, "Handball", 6, 2, LocalDate.of(2023, 2, 9), "Bangladesh", "Srilanka", 2);

		// default sorting: id
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted()
				.forEach(a -> System.out.println(a));
		System.out.println();

		// sorting by names in ascending order
		Comparator<GameDTO> comparator = (a1, a2) -> a1.getName().compareTo(a2.getName());
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(comparator)
				.forEach(a -> System.out.println(a));
		System.out.println();

		// sorting by names in descending order
		Comparator<GameDTO> comparator2 = (a1, a2) -> a2.getName().compareTo(a1.getName());
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(comparator2)
				.forEach(a -> System.out.println(a));
		System.out.println();

		// sorting points in ascending order
		Comparator<GameDTO> comparator3 = (a, b) -> a.getPoints().compareTo(b.getPoints());
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(comparator3)
				.forEach(a -> System.out.println(a));
		System.out.println();

		// sorting points in descending order
		Comparator<GameDTO> comparator4 = (a, b) -> b.getPoints().compareTo(a.getPoints());
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(comparator4)
				.forEach(a -> System.out.println(a));
		System.out.println();

		// sorting evnetDate in ascending order
		Comparator<GameDTO> comparator5 = (a, b) -> a.getEventDate().compareTo(b.getEventDate());
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(comparator5)
				.forEach(a -> System.out.println(a));
		System.out.println();

		// sorting evnetDate in descending order
		Comparator<GameDTO> comparator6 = (a, b) -> b.getEventDate().compareTo(a.getEventDate());
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(comparator6)
				.forEach(a -> System.out.println(a));
		System.out.println();

		// sorting by name, points in ascending order
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10)
				.sorted(comparator.thenComparing(comparator3)).forEach(a -> System.out.println(a));
		System.out.println();

		// sorting by name, points in descending order
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10)
				.sorted(comparator2.thenComparing(comparator4)).forEach(a -> System.out.println(a));
		System.out.println();

		// sorting by name, points, eventDate in ascending order
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10)
				.sorted(comparator.thenComparing(comparator3).thenComparing(comparator5))
				.forEach(a -> System.out.println(a));
		System.out.println();

		// sort by duration, eventDate, id in ascending order
		Comparator<GameDTO> comparator7 = (a, b) -> a.getDuration().compareTo(b.getDuration());
		Comparator<GameDTO> comparator8 = (a, b) -> a.getId().compareTo(b.getId());
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10)
				.sorted(comparator7.thenComparing(comparator5).thenComparing(comparator8))
				.forEach(a -> System.out.println(a));
		System.out.println();

		// sort only duration in descending order
		List<Integer> list = new LinkedList<Integer>();
		Comparator<GameDTO> comparator9 = (a, b) -> b.getDuration().compareTo(a.getDuration());
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(comparator9)
				.forEach(a -> list.add(a.getDuration()));
		list.forEach(a -> System.out.println(a));
		System.out.println();

		// sort only name
		List<String> list2 = new LinkedList<String>();
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(comparator)
				.forEach(a -> list2.add(a.getName()));
		list2.forEach(a -> System.out.println(a));
		System.out.println();

		// sort only winners in descending order
		List<String> list3 = new LinkedList<String>();
		Comparator<GameDTO> comparator10 = (a, b) -> b.getWinner().compareTo(a.getWinner());
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(comparator10)
				.forEach(a -> list3.add(a.getWinner()));
		list3.forEach(a -> System.out.println(a));
		System.out.println();

		// sort only runners
		List<String> list4 = new LinkedList<String>();
		Comparator<GameDTO> comparator11 = (a, b) -> a.getWinner().compareTo(b.getWinner());
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(comparator11)
				.forEach(a -> list4.add(a.getWinner()));
		list4.forEach(a -> System.out.println(a));
		System.out.println();

		// find game by eventDat
		List<String> list5 = new LinkedList<String>();
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(comparator)
				.filter(a -> a.getEventDate().equals(LocalDate.of(2023, 10, 7))).forEach(a -> list5.add(a.getName()));
		list5.forEach(a -> System.out.println(a));
		System.out.println();

		// find winner by game
		List<String> list6 = new LinkedList<String>();
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(comparator11)
				.filter(a -> a.getName().equals("Football")).forEach(a -> list6.add(a.getWinner()));
		list6.forEach(a -> System.err.println(a));
		System.out.println();

		// find points by game
		List<Integer> list7 = new LinkedList<Integer>();
		Stream.of(dto, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10).sorted(comparator3)
				.filter(a -> a.getName().equals("Tennis")).forEach(a -> list7.add(a.getPoints()));
		list7.forEach(a -> System.err.println(a));
		System.out.println();
	}
}
