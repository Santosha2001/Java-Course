package com.xworkz.enumarations.constant;

public enum CitizenWithLowerAgeLimit {

	BABIES(2), KID(6), CHILD(10);

	private Integer ages;

	private CitizenWithLowerAgeLimit(Integer ages) {
		this.ages = ages;
	}

	public Integer getAges() {
		return ages;
	}

}
