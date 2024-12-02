
package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");

		
		 Samosa s = (Samosa) context.getBean("s1"); System.out.println(s);
		

		// to enable the registering shutdown hook/this is to run the destroy the method
		context.registerShutdownHook();

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		Pepsi p = (Pepsi) context.getBean("p1");
		System.out.println(p);
		
		ExampleAnnotation e =(ExampleAnnotation) context.getBean("e1");
		System.out.println(e);
	}
}
