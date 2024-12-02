package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collections/config.xml");

		Person p = context.getBean("person1", Person.class);
		/*
		 * System.out.println(p.getFriends());
		 * System.out.println(p.getFriends().getClass().getName());
		 * System.out.println(p.getFeeStrtures());
		 * System.out.println(p.getFeeStrtures().getClass().getName());
		 */
		System.out.println(p.getProperties());

	}

}
