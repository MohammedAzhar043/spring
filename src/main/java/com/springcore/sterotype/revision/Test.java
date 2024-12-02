package com.springcore.sterotype.revision;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext contetx = new ClassPathXmlApplicationContext("com/springcore/sterotype/revision/config.xml");
		Teacher t = contetx.getBean("teacher", Teacher.class);
		System.out.println(t.getName());
		System.out.println(t.getSalary());
		System.out.println(t.getAddress());
	}

}
