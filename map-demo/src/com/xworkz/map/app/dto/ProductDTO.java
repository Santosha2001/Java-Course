package com.xworkz.map.app.dto;

import java.time.LocalDate;

public class ProductDTO implements Comparable<ProductDTO> {
	private String productName;
	private Integer productId;
	private Double productPrice;
	private Integer productQuantity;
	private LocalDate manuDate;

	public ProductDTO(String productName, Integer productId, Double productPrice, Integer productQuantity,
			LocalDate manuDate) {
		super();
		this.productName = productName;
		this.productId = productId;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.manuDate = manuDate;
	}

	@Override
	public String toString() {
		return "ProductDTO [productName=" + productName + ", productId=" + productId + ", productPrice=" + productPrice
				+ ", productQuantity=" + productQuantity + ", manuDate=" + manuDate + "]";
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	public LocalDate getManuDate() {
		return manuDate;
	}

	public void setManuDate(LocalDate manuDate) {
		this.manuDate = manuDate;
	}

	@Override
	public int compareTo(ProductDTO o) {

		return productId.compareTo(o.productId);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((manuDate == null) ? 0 : manuDate.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((productPrice == null) ? 0 : productPrice.hashCode());
		result = prime * result + ((productQuantity == null) ? 0 : productQuantity.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ProductDTO)) {
			return false;
		}
		ProductDTO other = (ProductDTO) obj;
		if (manuDate == null) {
			if (other.manuDate != null) {
				return false;
			}
		} else if (!manuDate.equals(other.manuDate)) {
			return false;
		}
		if (productId == null) {
			if (other.productId != null) {
				return false;
			}
		} else if (!productId.equals(other.productId)) {
			return false;
		}
		if (productName == null) {
			if (other.productName != null) {
				return false;
			}
		} else if (!productName.equals(other.productName)) {
			return false;
		}
		if (productPrice == null) {
			if (other.productPrice != null) {
				return false;
			}
		} else if (!productPrice.equals(other.productPrice)) {
			return false;
		}
		if (productQuantity == null) {
			if (other.productQuantity != null) {
				return false;
			}
		} else if (!productQuantity.equals(other.productQuantity)) {
			return false;
		}
		return true;
	}

}
