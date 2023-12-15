package com.xworkz.enumarations.constant;

public enum VenderSerialNO {

	AMAZON(12), FLIPKART(53), AJIO(43);

	private Integer serialNo;

	private VenderSerialNO(Integer serialNo) {
		this.serialNo = serialNo;
	}

	public Integer getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}
}
