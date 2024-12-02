package com.springcore.springexpressionlanguage.revision;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/springexpressionlanguage/revision/config.xml");

		Demo bean = context.getBean("demo", Demo.class);
		System.out.println(bean);

		/*
		 * SpelExpressionParser temp = new SpelExpressionParser(); Expression expression
		 * = temp.parseExpression("10+200"); System.out.println(expression.getValue());
		 */
	}

}

