package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.collection.app.dto.HotelDTO;

public class HotelMain {

	public static void main(String[] args) {
		List<HotelDTO> dtos = new ArrayList<HotelDTO>();
		dtos.add(new HotelDTO(11, "Udupi hotel", "Santosh", "s123gs", "India"));
		dtos.add(new HotelDTO(12, "Soude hotel", "Amruth", "d234jd", "India"));
		dtos.add(new HotelDTO(13, "Kaaravali hotel", "Bindhu", "k342aw", "India"));
		dtos.add(new HotelDTO(14, "Aahar hotel", "Gagan", "f763er", "Srilanka"));
		dtos.add(new HotelDTO(15, "Navami hotel", "Sachin", "k345dr", "Srilanka"));
		dtos.add(new HotelDTO(16, "Krishna hotel", "Nithish", "e374yt", "Srilanka"));
		dtos.add(new HotelDTO(17, "CNZ Hotel", "Harish", "g239se", "USA"));
		dtos.add(new HotelDTO(18, "Foodland", "Ramesh", "h121de", "USA"));
		dtos.add(new HotelDTO(19, "Hotel Jhon", "Jhon", "h845cv", "UK"));
		dtos.add(new HotelDTO(20, "Hotel Smith", "Smith", "l234jr", "UK"));

		System.out.println(dtos.size());

		// find hotel names by location India
		List<String> list = new ArrayList<String>();
		dtos.stream().filter((a) -> a.getLocation().equals("India")).forEach(s -> list.add(s.getName()));
		list.forEach((a) -> System.out.println("Hotel of India: " + a));
		System.out.println();

		// find hotel names by location SriLanka
		List<String> list2 = new ArrayList<String>();
		dtos.stream().filter((a) -> a.getLocation().equals("Sri Lanka")).forEach(a -> list2.add(a.getName()));
		list2.forEach(a -> System.out.println("Hotel of Sri Lanka: " + a));
		System.out.println();

		// find all owner names
		dtos.stream().forEach(a -> list2.add(a.getOwnerName()));
		list2.forEach(a -> System.err.println("owner names " + a));
		System.out.println();

		// find all gst
		List<String> list3 = new ArrayList<String>();
		dtos.stream().forEach(a -> list3.add(a.getGst()));
		list3.forEach(a -> System.out.println("GST: " + a));

		List<Integer> list4 = new ArrayList<Integer>();
		dtos.stream().filter((a) -> a.getLocation().equals("UK")).forEach(a -> list4.add(a.getId()));
		list4.forEach(a -> System.out.println("Id of UK: " + a));

		List<String> list5 = new ArrayList<String>();
		dtos.stream().filter((a) -> a.getLocation().equals("USA")).forEach(a -> list5.add(a.getOwnerName()));
		list5.forEach(a -> System.out.println("Owners names of USA: " + a));

	}
}
