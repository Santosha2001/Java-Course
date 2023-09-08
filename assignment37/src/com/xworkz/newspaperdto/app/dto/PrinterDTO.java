package com.xworkz.newspaperdto.app.dto;

import java.io.Serializable;

public class PrinterDTO implements Serializable {

	private String brand;
	private String size;
	private double costPerPaper;

	public PrinterDTO() {
		// TODO Auto-generated constructor stub
	}

	public PrinterDTO(String brand, String size, double costPerPaper) {
		super();
		this.brand = brand;
		this.size = size;
		this.costPerPaper = costPerPaper;
	}

	@Override
	public String toString() {
		return "PrinterDTO [brand=" + brand + ", size=" + size + ", costPerPaper=" + costPerPaper + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getCostPerPaper() {
		return costPerPaper;
	}

	public void setCostPerPaper(double costPerPaper) {
		this.costPerPaper = costPerPaper;
	}

}
