package com.springcore.sterotype.scope;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("ob")//this is to explicitly specify the name of the object 
@Component
@Scope("prototype") // by default it is singleten,if we want to make it as prototype then we can use
// this annotation
public class Student {

	@Value("Mohammed Azhar Mansoori")
	private String studentName;
	@Value("mandya")
	private String city;

	@Value("#{myaddress}")
	private List<String> address;

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", address=" + address + "]";
	}

}
