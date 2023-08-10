package com.xworkz.assignment24.boot;

import com.xworkz.assignme24.encapsulation.app.amazon.Amazon;

public class AmazonMain {
	public static void main(String[] args) {
		Amazon product = new Amazon();

		product.setProductName("Example Product");
		product.setProductId("ABC123");
		product.setPrice(99.99);
		product.setRatings(4);
		product.setCategory("Electronics");
		product.setSeller("Amazon Store");
		product.setAvailable(true);
		product.setNumberOfReviews(500);
		product.setDescription("This is an example product description.");
		product.setImageUrl("https://example.com/product-image.jpg");
		product.setShippingInfo("Ships within 2 business days.");
		product.setPrimeEligible(true);
		product.setBrand("Example Brand");
		product.setColor("Black");

		System.out.println("Product Name: " + product.getProductName());
		System.out.println("Product ID: " + product.getProductId());
		System.out.println("Price: $" + product.getPrice());
		System.out.println("Ratings: " + product.getRatings() + " stars");
		System.out.println("Category: " + product.getCategory());
		System.out.println("Seller: " + product.getSeller());
		System.out.println("Available: " + product.isAvailable());
		System.out.println("Number of Reviews: " + product.getNumberOfReviews());
		System.out.println("Description: " + product.getDescription());
		System.out.println("Image URL: " + product.getImageUrl());
		System.out.println("Shipping Info: " + product.getShippingInfo());
		System.out.println("Prime Eligible: " + product.isPrimeEligible());
		System.out.println("Brand: " + product.getBrand());
		System.out.println("Color: " + product.getColor());
	}
}
