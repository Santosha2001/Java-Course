package com.xworkz.enumarations.constant;

public enum MoviePrice {

	FIRST_CLASS(100), SECOND_CLASS(150), BOLCANI(200);

	private Integer ticketPrice;

	private MoviePrice(Integer ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public Integer getTicketPrice() {
		return ticketPrice;
	}
}
