package com.springcore.lifecycle.revision;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/revision/config.xml");

		/*
		 * Samosa s = (Samosa) context.getBean("samosa1");
		 * 
		 * System.out.println(s);
		 * 
		 * Pepsi p = (Pepsi) context.getBean("pepsi");
		 * 
		 * System.out.println(p);
		 */

		Example exmp = (Example) context.getBean("e");
		System.out.println(exmp);
		context.registerShutdownHook();

	}

}
