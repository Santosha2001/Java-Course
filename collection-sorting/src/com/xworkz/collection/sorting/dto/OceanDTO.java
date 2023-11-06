package com.xworkz.collection.sorting.dto;

public class OceanDTO implements Comparable<OceanDTO> {

	private String oceanName;
	private String location;
	private int earthSurthCovred;
	private boolean containFishes;

	public OceanDTO(String oceanName, String location, int earthSurthCovred, boolean containFishes) {
		super();
		this.oceanName = oceanName;
		this.location = location;
		this.earthSurthCovred = earthSurthCovred;
		this.containFishes = containFishes;
	}

	@Override
	public String toString() {
		return "OceanDTO [oceanName=" + oceanName + ", location=" + location + ", earthSurthCovred=" + earthSurthCovred
				+ ", containFishes=" + containFishes + "]";
	}

	@Override
	public int compareTo(OceanDTO ocean) {

		return this.location.compareTo(ocean.location);
	}

}
