package com.xworkz.newspaperdto.app.dto;

import java.io.Serializable;

public class DoctorDTO implements Serializable {

	private String name;
	private String specialist;
	private int expeience;
	private double consultancyCharge;

	public DoctorDTO() {
		// TODO Auto-generated constructor stub
	}

	public DoctorDTO(String name, String specialist, int expeience, double consultancyCharge) {
		super();
		this.name = name;
		this.specialist = specialist;
		this.expeience = expeience;
		this.consultancyCharge = consultancyCharge;
	}

	@Override
	public String toString() {
		return "DoctorDTO [name=" + name + ", specialist=" + specialist + ", expeience=" + expeience
				+ ", consultancyCharge=" + consultancyCharge + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public int getExpeience() {
		return expeience;
	}

	public void setExpeience(int expeience) {
		this.expeience = expeience;
	}

	public double getConsultancyCharge() {
		return consultancyCharge;
	}

	public void setConsultancyCharge(double consultancyCharge) {
		this.consultancyCharge = consultancyCharge;
	}

}
