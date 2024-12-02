package com.collection.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/collection/spring/config.xml");
//		System.out.println(context);
		Employee e = (Employee) context.getBean("emp1");

//		System.out.println(e);
		System.out.println(e.getName());
		System.out.println(e.getAddress());
		System.out.println(e.getCourses());
		System.out.println(e.getPhoneNumber());
		System.out.println(e.getProps());

	}

}
