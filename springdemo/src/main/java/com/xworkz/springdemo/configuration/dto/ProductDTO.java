package com.xworkz.springdemo.configuration.dto;

public class ProductDTO {

	private String productName;
	private Integer productQuantity;
	private String manufactureCompany;

	public ProductDTO(String productName, Integer productQuantity, String manufactureCompany) {
		super();
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.manufactureCompany = manufactureCompany;
	}

	public String getProductName() {
		return productName;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public String getManufactureCompany() {
		return manufactureCompany;
	}

}
