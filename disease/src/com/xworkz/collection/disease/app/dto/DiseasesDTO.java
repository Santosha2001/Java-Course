package com.xworkz.collection.disease.app.dto;

import java.time.LocalDate;

public class DiseasesDTO {

	private double bloodPressureSystolic;
	private double bloodPressureDiastolic;
	private double bloodSugarLevel;
	private double bmi;
	private double cholesterolLDL;
	private double cholesterolHDL;
	private double cholesterolTotal;
	private int viralLoad;
	private int gleasonScore;
	private double tumorSize;
	private LocalDate date;

	public DiseasesDTO(double bloodPressureSystolic, double bloodPressureDiastolic, double bloodSugarLevel, double bmi,
			double cholesterolLDL, double cholesterolHDL, double cholesterolTotal, int viralLoad, int gleasonScore,
			double tumorSize, LocalDate date) {
		super();
		this.bloodPressureSystolic = bloodPressureSystolic;
		this.bloodPressureDiastolic = bloodPressureDiastolic;
		this.bloodSugarLevel = bloodSugarLevel;
		this.bmi = bmi;
		this.cholesterolLDL = cholesterolLDL;
		this.cholesterolHDL = cholesterolHDL;
		this.cholesterolTotal = cholesterolTotal;
		this.viralLoad = viralLoad;
		this.gleasonScore = gleasonScore;
		this.tumorSize = tumorSize;
		this.date = date;
	}

	public double getBloodPressureSystolic() {
		return bloodPressureSystolic;
	}

	public void setBloodPressureSystolic(double bloodPressureSystolic) {
		this.bloodPressureSystolic = bloodPressureSystolic;
	}

	public double getBloodPressureDiastolic() {
		return bloodPressureDiastolic;
	}

	public void setBloodPressureDiastolic(double bloodPressureDiastolic) {
		this.bloodPressureDiastolic = bloodPressureDiastolic;
	}

	public double getBloodSugarLevel() {
		return bloodSugarLevel;
	}

	public void setBloodSugarLevel(double bloodSugarLevel) {
		this.bloodSugarLevel = bloodSugarLevel;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public double getCholesterolLDL() {
		return cholesterolLDL;
	}

	public void setCholesterolLDL(double cholesterolLDL) {
		this.cholesterolLDL = cholesterolLDL;
	}

	public double getCholesterolHDL() {
		return cholesterolHDL;
	}

	public void setCholesterolHDL(double cholesterolHDL) {
		this.cholesterolHDL = cholesterolHDL;
	}

	public double getCholesterolTotal() {
		return cholesterolTotal;
	}

	public void setCholesterolTotal(double cholesterolTotal) {
		this.cholesterolTotal = cholesterolTotal;
	}

	public int getViralLoad() {
		return viralLoad;
	}

	public void setViralLoad(int viralLoad) {
		this.viralLoad = viralLoad;
	}

	public int getGleasonScore() {
		return gleasonScore;
	}

	public void setGleasonScore(int gleasonScore) {
		this.gleasonScore = gleasonScore;
	}

	public double getTumorSize() {
		return tumorSize;
	}

	public void setTumorSize(double tumorSize) {
		this.tumorSize = tumorSize;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "DiseasesDTO [bloodPressureSystolic=" + bloodPressureSystolic + ", bloodPressureDiastolic="
				+ bloodPressureDiastolic + ", bloodSugarLevel=" + bloodSugarLevel + ", bmi=" + bmi + ", cholesterolLDL="
				+ cholesterolLDL + ", cholesterolHDL=" + cholesterolHDL + ", cholesterolTotal=" + cholesterolTotal
				+ ", viralLoad=" + viralLoad + ", gleasonScore=" + gleasonScore + ", tumorSize=" + tumorSize + ", date="
				+ date + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof DiseasesDTO)) {
			return false;
		}
		DiseasesDTO other = (DiseasesDTO) obj;
		if (Double.doubleToLongBits(bloodPressureDiastolic) != Double.doubleToLongBits(other.bloodPressureDiastolic)) {
			return false;
		}
		if (Double.doubleToLongBits(bloodPressureSystolic) != Double.doubleToLongBits(other.bloodPressureSystolic)) {
			return false;
		}
		if (Double.doubleToLongBits(bloodSugarLevel) != Double.doubleToLongBits(other.bloodSugarLevel)) {
			return false;
		}
		if (Double.doubleToLongBits(bmi) != Double.doubleToLongBits(other.bmi)) {
			return false;
		}
		if (Double.doubleToLongBits(cholesterolHDL) != Double.doubleToLongBits(other.cholesterolHDL)) {
			return false;
		}
		if (Double.doubleToLongBits(cholesterolLDL) != Double.doubleToLongBits(other.cholesterolLDL)) {
			return false;
		}
		if (Double.doubleToLongBits(cholesterolTotal) != Double.doubleToLongBits(other.cholesterolTotal)) {
			return false;
		}
		if (date == null) {
			if (other.date != null) {
				return false;
			}
		} else if (!date.equals(other.date)) {
			return false;
		}
		if (gleasonScore != other.gleasonScore) {
			return false;
		}
		if (Double.doubleToLongBits(tumorSize) != Double.doubleToLongBits(other.tumorSize)) {
			return false;
		}
		if (viralLoad != other.viralLoad) {
			return false;
		}
		return true;
	}

}
