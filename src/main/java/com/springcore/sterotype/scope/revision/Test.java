package com.springcore.sterotype.scope.revision;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext contetx = new ClassPathXmlApplicationContext(
				"com/springcore/sterotype/scope/revision/config.xml");
		Teacher t = contetx.getBean("teacher", Teacher.class);
		Teacher t1 = contetx.getBean("teacher", Teacher.class);
		/*
		 * System.out.println(t.getName()); System.out.println(t.getSalary());
		 * System.out.println(t.getAddress());
		 */
		/*
		 * By default the scope is singleten ,then we can make the scope as the
		 * prototype,for that we have 2 ways,annotation and the xml
		 */
		System.out.println(t.hashCode());
		System.out.println(t1.hashCode());

		Student student = (Student) contetx.getBean("student");
		Student student1 = (Student) contetx.getBean("student");

		System.out.println(student.hashCode());
		System.out.println(student1.hashCode());
	}

}
