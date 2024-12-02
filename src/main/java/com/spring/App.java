package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student stu = (Student) context.getBean("student");
		Student stu1 = (Student) context.getBean("student1");
		Student stu2 = (Student) context.getBean("student2");

		Student stu3 = (Student) context.getBean("student3");

		System.out.println(stu);
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
	}
}
