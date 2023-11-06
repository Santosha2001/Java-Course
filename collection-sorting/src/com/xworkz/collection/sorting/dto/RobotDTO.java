package com.xworkz.collection.sorting.dto;

public class RobotDTO implements Comparable<RobotDTO> {
	private String name;
	private String type;
	private int serialNumber;
	private boolean isFunctional;

	public RobotDTO(String name, String type, int serialNumber, boolean isFunctional) {
		super();
		this.name = name;
		this.type = type;
		this.serialNumber = serialNumber;
		this.isFunctional = isFunctional;
	}

	@Override
	public String toString() {
		return "RobotDTO [name=" + name + ", type=" + type + ", serialNumber=" + serialNumber + ", isFunctional="
				+ isFunctional + "]";
	}

	@Override
	public int compareTo(RobotDTO robo) {

		return this.name.compareTo(robo.name);
	}

}
