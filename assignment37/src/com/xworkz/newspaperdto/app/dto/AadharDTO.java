package com.xworkz.newspaperdto.app.dto;

import java.io.Serializable;

public class AadharDTO implements Serializable {

	private long number;
	private String holderName;
	private String addrs;

	public AadharDTO() {
		// TODO Auto-generated constructor stub
	}

	public AadharDTO(long number, String holderName, String addrs) {
		super();
		this.number = number;
		this.holderName = holderName;
		this.addrs = addrs;
	}

	@Override
	public String toString() {
		return "AadharDTO [number=" + number + ", holderName=" + holderName + ", addrs=" + addrs + "]";
	}

	public long getNumber() {
		return number;
	}

	public String getHolderName() {
		return holderName;
	}

	public String getAddrs() {
		return addrs;
	}

}
