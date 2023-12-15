package com.xworkz.map.app.dto;

public class CompanyDTO implements Comparable<CompanyDTO> {
	private String companyName;
	private String companyLocation;

	public CompanyDTO(String companyName, String companyLocation) {
		super();
		this.companyName = companyName;
		this.companyLocation = companyLocation;
	}

	@Override
	public String toString() {
		return "CompanyDTO [companyName=" + companyName + ", companyLocation=" + companyLocation + "]";
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyLocation() {
		return companyLocation;
	}

	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}

	@Override
	public int compareTo(CompanyDTO o) {

		return this.companyName.compareTo(o.companyName);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyLocation == null) ? 0 : companyLocation.hashCode());
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CompanyDTO)) {
			return false;
		}
		CompanyDTO other = (CompanyDTO) obj;
		if (companyLocation == null) {
			if (other.companyLocation != null) {
				return false;
			}
		} else if (!companyLocation.equals(other.companyLocation)) {
			return false;
		}
		if (companyName == null) {
			if (other.companyName != null) {
				return false;
			}
		} else if (!companyName.equals(other.companyName)) {
			return false;
		}
		return true;
	}

}
