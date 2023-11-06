package com.xworkz.collection.sorting.boot;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.collection.sorting.dto.TheatorDTO;

public class TheatorMain {

	public static void main(String[] args) {
		List<TheatorDTO> dtos = new LinkedList<TheatorDTO>();
		dtos.add(new TheatorDTO(1000, 100, "Aruna talkies", false));
		dtos.add(new TheatorDTO(400, 150, "Githanjali talkies", true));
		dtos.add(new TheatorDTO(300, 300, "PVR", true));
		dtos.add(new TheatorDTO(600, 100, "Vaibhav talkies", false));
		dtos.add(new TheatorDTO(200, 300, "Vasantha talkies", true));

		dtos.stream().sorted().forEach(a -> System.out.println(a));
	}
}
