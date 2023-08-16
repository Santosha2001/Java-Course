package com.xworkz.assignment26.tostring.app;

public class Pendant {
	private String material;
	private String color;
	private double weight;
	private int gemCount;
	private boolean isPrecious;
	private String design;
	private int length;
	private int width;
	private int depth;
	private String chainType;
	private boolean isEngraved;
	private boolean isAntique;

	public Pendant() {
		System.out.println("No parameters");
	}

	public Pendant(String material, String color, double weight, int gemCount, boolean isPrecious, String design,
			int length, int width, int depth, String chainType, boolean isEngraved, boolean isAntique) {
		super();
		this.material = material;
		this.color = color;
		this.weight = weight;
		this.gemCount = gemCount;
		this.isPrecious = isPrecious;
		this.design = design;
		this.length = length;
		this.width = width;
		this.depth = depth;
		this.chainType = chainType;
		this.isEngraved = isEngraved;
		this.isAntique = isAntique;
	}

	@Override
	public String toString() {
		return "Pendant [material=" + material + ", color=" + color + ", weight=" + weight + ", gemCount=" + gemCount
				+ ", isPrecious=" + isPrecious + ", design=" + design + ", length=" + length + ", width=" + width
				+ ", depth=" + depth + ", chainType=" + chainType + ", isEngraved=" + isEngraved + ", isAntique="
				+ isAntique + "]";
	}

}
