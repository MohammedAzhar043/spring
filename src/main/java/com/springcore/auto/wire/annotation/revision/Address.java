package com.springcore.auto.wire.annotation.revision;

public class Address {

	private String streetName;
	private String city;

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String streetName, String city) {
		super();
		this.streetName = streetName;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + "]";
	}

}
