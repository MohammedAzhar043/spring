package com.collection.revision;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

	private String empName;
	private List<String> empPhone;
	private Set<String> empAddress;
	private Map<String, String> courses;
	private Properties props;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<String> getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(List<String> empPhone) {
		this.empPhone = empPhone;
	}

	public Set<String> getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Set<String> empAddress) {
		this.empAddress = empAddress;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public Employee(String empName, List<String> empPhone, Set<String> empAddress, Map<String, String> courses,
			Properties props) {
		super();
		this.empName = empName;
		this.empPhone = empPhone;
		this.empAddress = empAddress;
		this.courses = courses;
		this.props = props;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empPhone=" + empPhone + ", empAddress=" + empAddress + ", courses="
				+ courses + ", props=" + props + "]";
	}

}
