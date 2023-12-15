package com.xworkz.servlet.dto;

public class ProductDTO {

	private String productName;
	private String type;
	private String price;
	private String brand;
	private String quantity;
	private String description;

	public ProductDTO(String productName, String type, String price, String brand, String quantity,
			String description) {
		super();
		this.productName = productName;
		this.type = type;
		this.price = price;
		this.brand = brand;
		this.quantity = quantity;
		this.description = description;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
