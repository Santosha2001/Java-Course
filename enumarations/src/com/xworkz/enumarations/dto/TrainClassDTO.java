package com.xworkz.enumarations.dto;

import com.xworkz.enumarations.constant.TrainBasePrice;

public class TrainClassDTO {

	private TrainBasePrice basePrice;

	public TrainClassDTO(TrainBasePrice basePrice) {
		super();
		this.basePrice = basePrice;
	}

	@Override
	public String toString() {
		return "TrainClassDTO [basePrice=" + basePrice + "]";
	}

	public void setBasePrice(TrainBasePrice basePrice) {
		this.basePrice = basePrice;
	}

	public TrainBasePrice getBasePrice() {
		return basePrice;
	}

}
