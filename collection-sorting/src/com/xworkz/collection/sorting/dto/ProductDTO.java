package com.xworkz.collection.sorting.dto;

import java.time.LocalDate;

public class ProductDTO {

	private Integer id, quantity, peopleRatedFive, peopleRatedFour, peopleRatedThree, peopleRatedTwo, peopleRatedOne;
	private String name, company, discription, packer, included, genericName, countryOfOrigin, serialNumber;
	private Double price, discount, rating, itemWeight;
	private LocalDate manfDate, expDate, availableDate, delivaryExceptedDate, returnByDate;
	private Boolean peopeRated, damaged, returnable, warrenty, primeDelivary;
	private Long mobileNumber;

	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProductDTO(Integer id, Integer quantity, Integer peopleRatedFive, Integer peopleRatedFour,
			Integer peopleRatedThree, Integer peopleRatedTwo, Integer peopleRatedOne, String name, String company,
			String discription, String packer, String included, String genericName, String countryOfOrigin,
			Double price, Double discount, Double rating, Double itemWeight, LocalDate manfDate, LocalDate expDate,
			LocalDate availableDate, LocalDate delivaryExceptedDate, LocalDate returnByDate, Boolean peopeRated,
			Boolean damaged, Boolean returnable, Boolean warrenty, Boolean primeDelivary, Long mobileNumber,
			String serialNumber) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.peopleRatedFive = peopleRatedFive;
		this.peopleRatedFour = peopleRatedFour;
		this.peopleRatedThree = peopleRatedThree;
		this.peopleRatedTwo = peopleRatedTwo;
		this.peopleRatedOne = peopleRatedOne;
		this.name = name;
		this.company = company;
		this.discription = discription;
		this.packer = packer;
		this.included = included;
		this.genericName = genericName;
		this.countryOfOrigin = countryOfOrigin;
		this.price = price;
		this.discount = discount;
		this.rating = rating;
		this.itemWeight = itemWeight;
		this.manfDate = manfDate;
		this.expDate = expDate;
		this.availableDate = availableDate;
		this.delivaryExceptedDate = delivaryExceptedDate;
		this.returnByDate = returnByDate;
		this.peopeRated = peopeRated;
		this.damaged = damaged;
		this.returnable = returnable;
		this.warrenty = warrenty;
		this.primeDelivary = primeDelivary;
		this.mobileNumber = mobileNumber;
		this.serialNumber = serialNumber;
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", quantity=" + quantity + ", peopleRatedFive=" + peopleRatedFive
				+ ", peopleRatedFour=" + peopleRatedFour + ", peopleRatedThree=" + peopleRatedThree
				+ ", peopleRatedTwo=" + peopleRatedTwo + ", peopleRatedOne=" + peopleRatedOne + ", name=" + name
				+ ", company=" + company + ", discription=" + discription + ", packer=" + packer + ", included="
				+ included + ", genericName=" + genericName + ", countryOfOrigin=" + countryOfOrigin + ", price="
				+ price + ", discount=" + discount + ", rating=" + rating + ", itemWeight=" + itemWeight + ", manfDate="
				+ manfDate + ", expDate=" + expDate + ", availableDate=" + availableDate + ", delivaryExceptedDate="
				+ delivaryExceptedDate + ", returnByDate=" + returnByDate + ", peopeRated=" + peopeRated + ", damaged="
				+ damaged + ", returnable=" + returnable + ", warrenty=" + warrenty + ", primeDelivary=" + primeDelivary
				+ ", mobileNumber=" + mobileNumber + ", serialNumber=" + serialNumber + "]";
	}

	public Integer getId() {
		return id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Integer getPeopleRatedFive() {
		return peopleRatedFive;
	}

	public Integer getPeopleRatedFour() {
		return peopleRatedFour;
	}

	public Integer getPeopleRatedThree() {
		return peopleRatedThree;
	}

	public Integer getPeopleRatedTwo() {
		return peopleRatedTwo;
	}

	public Integer getPeopleRatedOne() {
		return peopleRatedOne;
	}

	public String getName() {
		return name;
	}

	public String getCompany() {
		return company;
	}

	public String getDiscription() {
		return discription;
	}

	public String getPacker() {
		return packer;
	}

	public String getIncluded() {
		return included;
	}

	public String getGenericName() {
		return genericName;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public Double getPrice() {
		return price;
	}

	public Double getDiscount() {
		return discount;
	}

	public Double getRating() {
		return rating;
	}

	public Double getItemWeight() {
		return itemWeight;
	}

	public LocalDate getManfDate() {
		return manfDate;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public LocalDate getAvailableDate() {
		return availableDate;
	}

	public LocalDate getDelivaryExceptedDate() {
		return delivaryExceptedDate;
	}

	public LocalDate getReturnByDate() {
		return returnByDate;
	}

	public Boolean getPeopeRated() {
		return peopeRated;
	}

	public Boolean getDamaged() {
		return damaged;
	}

	public Boolean getReturnable() {
		return returnable;
	}

	public Boolean getWarrenty() {
		return warrenty;
	}

	public Boolean getPrimeDelivary() {
		return primeDelivary;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

}
