package com.xworkz.enumarations.constant;

public enum TrainBasePrice {

	GENERAL(130), FIRST_CLASS(180), AC(400), AC_SLEEPER(500);

	private Integer i;

	private TrainBasePrice(Integer i) {
		this.i = i;
	}

	public Integer getI() {
		return i;
	}

}
