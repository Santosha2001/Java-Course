package com.xworkz.assignment21.app.elevator;

public class Elevator {
	public void elevator() {
		System.out.println("Elevator no paramete method");
		this.elevator(10);
		this.elevator(5, true);
	}
	
	public void elevator(int capacity) {
		System.out.println("capacity: " + capacity);
		this.elevator(0,false);
	}
	
	public void elevator(int capacity,boolean operator) {
		System.out.printf("capacity is: %d\noperator : %b\n",capacity,operator);
	}
	
	public void elevator(byte numberOfElevators) {
		System.out.println("\nnunber of elevators: " + numberOfElevators);
	}
}
