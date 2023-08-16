package com.xworkz.assignment26.tostring.app;

public class Cave {
	private String name;
	private double temperature;
	private int altitude;
	private boolean isExplored;
	private int stalactiteCount;
	private int stalagmiteCount;
	private String mineralComposition;
	private boolean hasWaterSource;
	private int entranceWidth;
	private int entranceHeight;

	public Cave() {
		System.out.println("No parameters");
	}

	public Cave(String name, double temperature, int altitude, boolean isExplored, int stalactiteCount,
			int stalagmiteCount, String mineralComposition, boolean hasWaterSource, int entranceWidth,
			int entranceHeight) {
		super();
		this.name = name;
		this.temperature = temperature;
		this.altitude = altitude;
		this.isExplored = isExplored;
		this.stalactiteCount = stalactiteCount;
		this.stalagmiteCount = stalagmiteCount;
		this.mineralComposition = mineralComposition;
		this.hasWaterSource = hasWaterSource;
		this.entranceWidth = entranceWidth;
		this.entranceHeight = entranceHeight;
	}

	@Override
	public String toString() {
		return "Cave [name=" + name + ", temperature=" + temperature + ", altitude=" + altitude + ", isExplored="
				+ isExplored + ", stalactiteCount=" + stalactiteCount + ", stalagmiteCount=" + stalagmiteCount
				+ ", mineralComposition=" + mineralComposition + ", hasWaterSource=" + hasWaterSource
				+ ", entranceWidth=" + entranceWidth + ", entranceHeight=" + entranceHeight + "]";
	}

}
