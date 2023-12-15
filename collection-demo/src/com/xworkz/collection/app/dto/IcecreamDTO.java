package com.xworkz.collection.app.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class IcecreamDTO implements Serializable, Comparable<IcecreamDTO> {

	private String flavour;
	private Double price;
	private String type;
	private LocalDate manuDate;

	public IcecreamDTO(String flavour, Double price, String type, LocalDate manuDate) {
		super();
		this.flavour = flavour;
		this.price = price;
		this.type = type;
		this.manuDate = manuDate;
	}

	@Override
	public String toString() {
		return "IcecreamDTO [flavour=" + flavour + ", price=" + price + ", type=" + type + ", manuDate=" + manuDate
				+ "]";
	}

	@Override
	public int compareTo(IcecreamDTO ice) {
		return this.price.compareTo(ice.price);
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getManuDate() {
		return manuDate;
	}

	public void setManuDate(LocalDate manuDate) {
		this.manuDate = manuDate;
	}

}
