package com.springcore.standalone.collection.revision;

import java.util.List;
import java.util.Map;

public class Person {

	private List<String> friends;

	private Map<String, Integer> feeStructures;

	public Map<String, Integer> getFeeStructures() {
		return feeStructures;
	}

	public void setFeeStructures(Map<String, Integer> feeStructures) {
		this.feeStructures = feeStructures;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feeStructures=" + feeStructures + "]";
	}

}
