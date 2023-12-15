package com.xworkz.enumarations.dto;

import com.xworkz.enumarations.constant.CitizenWithLowerAgeLimit;
import com.xworkz.enumarations.constant.CitizenWithUpperAgeLimit;

public class CitizenWithAgesDTO {

	private String cityName;
	private CitizenWithLowerAgeLimit ageLimit;
	private CitizenWithUpperAgeLimit ageLimit2;

	public CitizenWithAgesDTO(String cityName, CitizenWithLowerAgeLimit ageLimit, CitizenWithUpperAgeLimit ageLimit2) {
		super();
		this.cityName = cityName;
		this.ageLimit = ageLimit;
		this.ageLimit2 = ageLimit2;
	}

	@Override
	public String toString() {
		return "CitizenWithAgesDTO [cityName=" + cityName + ", ageLimit=" + ageLimit + ", ageLimit2=" + ageLimit2 + "]";
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public void setAgeLimit(CitizenWithLowerAgeLimit ageLimit) {
		this.ageLimit = ageLimit;
	}

	public void setAgeLimit2(CitizenWithUpperAgeLimit ageLimit2) {
		this.ageLimit2 = ageLimit2;
	}

}
