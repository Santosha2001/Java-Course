package com.santoh.bean.lifecycle;

public class SamosaBean {

	private double price;
	private String samosaName;

	public SamosaBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SamosaBean(double price, String samosaName) {
		super();
		this.price = price;
		this.samosaName = samosaName;
	}

	@Override
	public String toString() {
		return "SamosaBean [price=" + price + ", samosaName=" + samosaName + "]";
	}

	/*
	 * there are three ways to initialize and destroy the bean 1. declare two
	 * methods and pass their names to the bean init-method and destroy-method 2.
	 * implement the interfaces InitializingBean and DisposableBean 3. use
	 * annotation @PostConstruct and @PreDestroy
	 */

	/*
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("Initializing the bean."); }
	 * 
	 * @Override public void destroy() throws Exception {
	 * System.out.println("Destroying the bean."); }
	 */

	public void init() {
		System.out.println("Initializing the bean...");
	}

	public void destroy() {
		System.out.println("Destroying the bean...");
	}
}
