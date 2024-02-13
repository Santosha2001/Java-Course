package com.amazon.dto;

import java.util.Date;

import lombok.Data;

@Data
public class AmazonDTO {

	private String productName;
	private String productManufactureCompany;
	private String companyLocation;
	private String productSellerCompany;
	private Integer quantity;
	private Double cost;
	private Date orderDate;
	private Date deliveryDate;
}
