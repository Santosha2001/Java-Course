package com.xworkx.assignment18.inheritance.app8;

public class Metro extends Train {
public int noOFStops;
	
	public Metro()
	{
		this.noOFStops=15;
		System.out.println("No Of Stops : "+this.noOFStops);
	}
	
	public String metroMethod()
	{
		return "GreenLine";
	}
}
