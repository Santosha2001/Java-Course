package com.xworkz.assignment26.tostring.app;

public class Karchief {
	private char size;
	private String color;
	private double cost;
	private String shape;
	private boolean muktiPurpose;
	private boolean variousDesign;
	private boolean easlyAffordable;

	public Karchief() {
		System.out.println("No parameters");
	}

	public Karchief(char size, String color, double cost, String shape, boolean muktiPurpose, boolean variousDesign,
			boolean easlyAffordable) {
		super();
		this.size = size;
		this.color = color;
		this.cost = cost;
		this.shape = shape;
		this.muktiPurpose = muktiPurpose;
		this.variousDesign = variousDesign;
		this.easlyAffordable = easlyAffordable;
	}

	@Override
	public String toString() {
		return "Karchief [size=" + size + ", color=" + color + ", cost=" + cost + ", shape=" + shape + ", muktiPurpose="
				+ muktiPurpose + ", variousDesign=" + variousDesign + ", easlyAffordable=" + easlyAffordable + "]";
	}

}
