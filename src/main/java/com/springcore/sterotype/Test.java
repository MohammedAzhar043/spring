package com.springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/sterotype/config.xml");

		Student s = context.getBean("student", Student.class);
		System.out.println(s.getAddress().getClass().getName());
	}

}
