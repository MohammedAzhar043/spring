package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {

	private List<String> friends;

	private Map<String, Integer> feeStrtures;

	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, Integer> getFeeStrtures() {
		return feeStrtures;
	}

	public void setFeeStrtures(Map<String, Integer> feeStrtures) {
		this.feeStrtures = feeStrtures;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feeStrtures=" + feeStrtures + ", properties=" + properties + "]";
	}

}
