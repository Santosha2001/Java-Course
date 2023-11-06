package com.xworkz.collection.sorting.dto;

public class TowerDTO implements Comparable<TowerDTO> {

	private int height;
	private int range;
	private String location;
	private String company;

	public TowerDTO(int height, int range, String location, String company) {
		super();
		this.height = height;
		this.range = range;
		this.location = location;
		this.company = company;
	}

	@Override
	public String toString() {
		return "TowerDTO [height=" + height + ", range=" + range + ", location=" + location + ", company=" + company
				+ "]";
	}

	@Override
	public int compareTo(TowerDTO tower) {
		TowerDTO dto = this;
		if (dto.range == tower.range) {
			return 0;
		}
		if (dto.range < tower.range) {
			return 1;
		}
		if (dto.range > tower.range) {
			return -1;
		}
		return range;
	}

}
