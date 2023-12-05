package com.xworkz.assignment18.inheritance.app3;

public class Rombus extends Shape {
	public int noOfDiagonlasDraw;

	public Rombus() {
		System.out.println("Calling default Constructer of Rombus");
	}

	public void rombusMethod() {
		System.out.println("noOfDiogonals Can be Draw : "+noOfDiagonlasDraw);
	}
}
