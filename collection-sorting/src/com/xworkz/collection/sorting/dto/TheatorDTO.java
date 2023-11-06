package com.xworkz.collection.sorting.dto;

public class TheatorDTO implements Comparable<TheatorDTO> {

	private int capacity;
	private double ticketPrice;
	private String theatorName;
	private boolean clean;

	public TheatorDTO(int capacity, double ticketPrice, String theatorName, boolean clean) {
		super();
		this.capacity = capacity;
		this.ticketPrice = ticketPrice;
		this.theatorName = theatorName;
		this.clean = clean;
	}

	@Override
	public String toString() {
		return "TheatorDTO [capacity=" + capacity + ", ticketPrice=" + ticketPrice + ", theatorName=" + theatorName
				+ ", clean=" + clean + "]";
	}

	@Override
	public int compareTo(TheatorDTO dto) {

		TheatorDTO dto2 = this;
		if (dto2.capacity == dto.capacity) {
			return 0;
		} else if (dto2.capacity > dto.capacity) {
			return 100;
		} else if (dto2.capacity < dto.capacity) {
			return -23;
		} else {
			throw new IllegalArgumentException("IllegalArgumentException");

		}

	}

}
