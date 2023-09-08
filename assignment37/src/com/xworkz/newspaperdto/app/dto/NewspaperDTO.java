package com.xworkz.newspaperdto.app.dto;

import java.io.Serializable;

public class NewspaperDTO implements Serializable{

	private String name;
	private int pages;
	private String publisher;

	public NewspaperDTO() {
		// TODO Auto-generated constructor stub
	}
	
	

	public NewspaperDTO(String name, int pages, String publisher) {
		super();
		this.name = name;
		this.pages = pages;
		this.publisher = publisher;
	}



	@Override
	public String toString() {
		return "NewspaperDTO [name=" + name + ", pages=" + pages + ", publisher=" + publisher + "]";
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
