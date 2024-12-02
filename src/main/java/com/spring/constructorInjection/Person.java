package com.spring.constructorInjection;

public class Person {

	private String personName;
	private int personId;
	private Certi certi;

	public Person(String personName, int personId, Certi certi) {
		this.personName = personName;
		this.personId = personId;
		this.certi = certi;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.personName + " : " + this.personId + " " + this.certi;
	}
}
