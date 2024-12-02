package com.springcore.springexpressionlanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/springexpressionlanguage/config.xml");
		Demo bean = context.getBean("demo1", Demo.class);
		System.out.println(bean);

		/*
		 * SpelExpressionParser temp = new SpelExpressionParser(); Expression expression
		 * = temp.parseExpression("20+30"); System.out.println(expression.getValue());
		 */

	}

}
