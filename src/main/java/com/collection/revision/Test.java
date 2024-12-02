package com.collection.revision;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/collection/revision/config.xml");
		Employee emp = (Employee) context.getBean("employee");

		System.out.println(emp);
		System.out.println(emp.getEmpName());
		System.out.println(emp.getCourses());
		System.out.println(emp.getEmpAddress());
		System.out.println(emp.getEmpPhone());
		System.out.println(emp.getProps());
	}

}
