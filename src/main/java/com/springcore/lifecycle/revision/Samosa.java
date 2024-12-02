package com.springcore.lifecycle.revision;

public class Samosa {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init() {
		System.out.println("we are inside the init method");
	}
	
	public void destroy() {
		System.out.println("we are inside the destroy method");
	}
}
