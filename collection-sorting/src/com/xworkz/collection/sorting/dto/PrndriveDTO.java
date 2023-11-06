package com.xworkz.collection.sorting.dto;

public class PrndriveDTO implements Comparable<PrndriveDTO> {

	private String brand;
	private String model;
	private int capacityGB;
	private String connectionType;
	private boolean isUsb3Compatible;

	public PrndriveDTO(String brand, String model, int capacityGB, String connectionType, boolean isUsb3Compatible) {
		super();
		this.brand = brand;
		this.model = model;
		this.capacityGB = capacityGB;
		this.connectionType = connectionType;
		this.isUsb3Compatible = isUsb3Compatible;
	}

	@Override
	public String toString() {
		return "PrndriveDTO [brand=" + brand + ", model=" + model + ", capacityGB=" + capacityGB + ", connectionType="
				+ connectionType + ", isUsb3Compatible=" + isUsb3Compatible + "]";
	}

	@Override
	public int compareTo(PrndriveDTO drive) {
		PrndriveDTO dto = this;
		if (drive.capacityGB == dto.capacityGB) {
			return 0;
		}
		if (drive.capacityGB > dto.capacityGB) {
			return 1;
		}
		if (drive.capacityGB < dto.capacityGB) {
			return -1;
		}
		return capacityGB;
	}

}
