package com.xworkz.database.dto;

public class MechanicDTO {

	private String mechanicName;
	private int experience;
	private String garage_name;

	public MechanicDTO(String mechanicName, int experience, String shopeName) {
		super();
		this.mechanicName = mechanicName;
		this.experience = experience;
		this.garage_name = shopeName;
	}

	@Override
	public String toString() {
		return "MechanicDTO [mechanicName=" + mechanicName + ", experience=" + experience + ", garage_name="
				+ garage_name + "]";
	}

	public String getMechanicName() {
		return mechanicName;
	}

	public int getExperience() {
		return experience;
	}

	public String getGarage_name() {
		return garage_name;
	}

}
