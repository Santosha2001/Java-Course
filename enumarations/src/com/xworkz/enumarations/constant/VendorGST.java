package com.xworkz.enumarations.constant;

public enum VendorGST {

	AMAZON("23GSR3"), FLIPKART("65ADJ3"), AJIO("89HDB3");

	private String gstNumber;

	private VendorGST(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	public String getGstNumber() {
		return gstNumber;
	}

}
