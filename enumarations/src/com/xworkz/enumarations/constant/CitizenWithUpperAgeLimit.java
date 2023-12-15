package com.xworkz.enumarations.constant;

/**
 * @author MY
 *
 */
public enum CitizenWithUpperAgeLimit {

	ADULTS(18), YOUNG(25), OLDES(50);

	private Integer ages;

	private CitizenWithUpperAgeLimit(Integer ages) {
		this.ages = ages;
	}

	public Integer getAges() {
		return ages;
	}
}
