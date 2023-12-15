package com.xworkz.collection.app.dto;

import java.time.LocalDate;

public class CloningDemo implements Cloneable {

	private String name;
	private Integer age;
	private String addrs;
	private LocalDate dob;

	public CloningDemo(String name, Integer age, String addrs, LocalDate dob) {
		super();
		this.name = name;
		this.age = age;
		this.addrs = addrs;
		this.dob = dob;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Cloning method...");
		return super.clone();
	}

	@Override
	public String toString() {
		return "CloningDemo [name=" + name + ", age=" + age + ", addrs=" + addrs + ", dob=" + dob + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

}
