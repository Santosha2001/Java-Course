package com.xworkz.collection.sorting.boot;

import java.util.LinkedList;
import java.util.List;

import com.xworkz.collection.sorting.dto.RobotDTO;

public class RObotMain {

	public static void main(String[] args) {
		List<RobotDTO> dtos = new LinkedList<RobotDTO>();
		dtos.add(new RobotDTO("R2-D2", "AstroMech", 12345, true));
		dtos.add(new RobotDTO("C-3PO", "Protocol", 67890, true));
		dtos.add(new RobotDTO("Wall-E", "Waste Allocation", 54321, true));
		dtos.add(new RobotDTO("Bender", "Bending Unit", 98765, true));
		dtos.add(new RobotDTO("ASIMO", "Humanoid", 13579, true));

		dtos.stream().sorted().forEach(a -> System.out.println(a));
	}

}
