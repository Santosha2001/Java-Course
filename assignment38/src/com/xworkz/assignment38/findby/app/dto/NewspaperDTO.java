package com.xworkz.assignment38.findby.app.dto;

import java.io.Serializable;

public class NewspaperDTO implements Serializable {

	private String publisher;
	private int pages;
	private double price;

	public NewspaperDTO() {
		// TODO Auto-generated constructor stub
	}

	public NewspaperDTO(String publisher, int pages, double price) {
		super();
		this.publisher = publisher;
		this.pages = pages;
		this.price = price;
	}

	@Override
	public String toString() {
		return "NewspaperDTO [publisher=" + publisher + ", pages=" + pages + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			if (obj instanceof NewspaperDTO) {
				NewspaperDTO dto = (NewspaperDTO) obj;
				if (dto.publisher.equals(publisher) && dto.pages == pages && dto.price == price) {
					return true;
				}
			}
		}

		return super.equals(obj);
	}

	public String getPublisher() {
		return publisher;
	}

	public int getPages() {
		return pages;
	}

	public double getPrice() {
		return price;
	}

}
