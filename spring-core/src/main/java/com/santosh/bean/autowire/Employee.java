package com.santosh.bean.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private int id;
	private String employeeName;

	@Autowired
	@Qualifier("address2")
	private Address address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String employeeName, Address address) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", address=" + address + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
