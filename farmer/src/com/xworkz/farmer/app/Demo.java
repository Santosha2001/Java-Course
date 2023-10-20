package com.xworkz.farmer.app;

public class Demo {

	private String clg;
	private int age;

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public Demo(String clg, int age) {
		super();
		this.clg = clg;
		this.age = age;
	}

	public String getClg() {
		return clg;
	}

	public void setClg(String clg) {
		this.clg = clg;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void name() {
		System.out.println("Name in method");
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.name();

//		demo.clone();

		System.out.println(demo.getClass());

		System.out.println(demo.hashCode());

	}

	

}
