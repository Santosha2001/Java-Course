package com.xworkz.collection.dto;

import java.io.Serializable;

public class SaloonItemDTO implements Serializable {

	private int saloonId;
	private String saloonName;
	private double price;
	private String usage;
	private boolean man;

	public SaloonItemDTO(int saloonId, String saloonName, double price, String usage, boolean man) {
		super();
		this.saloonId = saloonId;
		this.saloonName = saloonName;
		this.price = price;
		this.usage = usage;
		this.man = man;
	}

	@Override
	public String toString() {
		return "SaloonItemDTO [saloonId=" + saloonId + ", saloonName=" + saloonName + ", price=" + price + ", usage="
				+ usage + ", man=" + man + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof SaloonItemDTO)) {
			return false;
		}
		SaloonItemDTO other = (SaloonItemDTO) obj;
		if (man != other.man) {
			return false;
		}
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
			return false;
		}
		if (saloonId != other.saloonId) {
			return false;
		}
		if (saloonName == null) {
			if (other.saloonName != null) {
				return false;
			}
		} else if (!saloonName.equals(other.saloonName)) {
			return false;
		}
		if (usage == null) {
			if (other.usage != null) {
				return false;
			}
		} else if (!usage.equals(other.usage)) {
			return false;
		}
		return true;
	}

}
