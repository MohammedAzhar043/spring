package com.springcore.standalone.collection.revision;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collection/revision/config.xml");

		Person p = context.getBean("person1", Person.class);

		System.out.println(p.getFriends());
		System.out.println(p.getFriends().getClass().getName());
		System.out.println(p.getFeeStructures().getClass().getName());
		System.out.println(p.getFeeStructures());
	}

}
