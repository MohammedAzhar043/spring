package com.spring.constructorInjectionRevision;

public class Person {

	private int personId;
	private String personName;
	private Certificate certi;

	public Person(int personId, String personName, Certificate certi) {
		this.personId = personId;
		this.personName = personName;
		this.certi = certi;
	}

	@Override
	public String toString() {

		return this.personName + " : " + this.personId + " : " + this.certi;
	}
}
