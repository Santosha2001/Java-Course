package com.xworkz.enumarations.dto;

import com.xworkz.enumarations.constant.ShoeSize;
import com.xworkz.enumarations.constant.ShoeType;

public class ShoeDTO {

	private String brand;
	private ShoeType type;
	private ShoeSize size;
	private Double price;

	public ShoeDTO(ShoeType type) {
		super();
		this.type = type;
	}

	@Override
	public String toString() {
		return "ShoeDTO [brand=" + brand + ", type=" + type + ", size=" + size + ", price=" + price + "]";
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setSize(ShoeSize size) {
		this.size = size;
	}
}
