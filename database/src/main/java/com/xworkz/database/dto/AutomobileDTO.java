package com.xworkz.database.dto;

public class AutomobileDTO {

	private String name;
	private String color;
	private String vehicleType;
	private int model;
	private int id;

	public AutomobileDTO(String name, String color, String vehicleType, int i) {
		super();
		this.name = name;
		this.color = color;
		this.vehicleType = vehicleType;
		this.model = i;
	}

	public AutomobileDTO(String name, String color, String vehicleType, int model, int id) {
		super();
		this.name = name;
		this.color = color;
		this.vehicleType = vehicleType;
		this.model = model;
		this.id = id;
	}

	public AutomobileDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AutomobileDTO [name=" + name + ", color=" + color + ", vehicleType=" + vehicleType + ", model=" + model
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
