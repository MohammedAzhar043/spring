package com.springcore.sterotype.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/sterotype/scope/config.xml");

		Student s = context.getBean("student", Student.class);
		Student s1 = context.getBean("student", Student.class);
		/*
		 * System.out.println(s.getAddress().getClass().getName());
		 * System.out.println(s.hashCode()); System.out.println(s1.hashCode());
		 */
		Teacher t1 = context.getBean("teacher", Teacher.class);
		Teacher t2 = context.getBean("teacher", Teacher.class);
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}
