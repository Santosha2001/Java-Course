package com.xworkz.assignment16.app;

public class Shop {

Salesman salesman = new Salesman();
	
	public void shopSalesman() {
		System.out.println("Shop has salesman");
		
		this.salesman.salesmanExperience();
		this.salesman.salesmanName();
		
		if(salesman != null) {
			System.out.println("salesman points to memory");
		}else {
			System.out.println("NullPointerException");
		}
	}

}
