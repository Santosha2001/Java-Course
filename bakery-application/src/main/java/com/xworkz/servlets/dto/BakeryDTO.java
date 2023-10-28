package com.xworkz.servlets.dto;

public class BakeryDTO {

	private String name;
	private String item;
	private String price;
	private String discount;
	private String manuDate;
	private String expDate;
	private String quantity;
	private String gst;

	public BakeryDTO(String name, String item, String price, String discount, String manuDate, String expDate,
			String quantity, String gst) {
		super();
		this.name = name;
		this.item = item;
		this.price = price;
		this.discount = discount;
		this.manuDate = manuDate;
		this.expDate = expDate;
		this.quantity = quantity;
		this.gst = gst;
	}

	public String getGst() {
		return gst;
	}

	public void setGst(String gst) {
		this.gst = gst;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getManuDate() {
		return manuDate;
	}

	public void setManuDate(String manuDate) {
		this.manuDate = manuDate;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

}
