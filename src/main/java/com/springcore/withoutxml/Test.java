package com.springcore.withoutxml;

import java.io.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("com/springcore/withoutxml/config.xml");
		 * Student student = context.getBean("student", Student.class);
		 * System.out.println(student);
		 */

		ApplicationContext context2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student2 = (Student) context2.getBean("getStudent()");
		System.out.println(student2);

	}

}
