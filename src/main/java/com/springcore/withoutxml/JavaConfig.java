package com.springcore.withoutxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.withoutxml")
public class JavaConfig {

	
	  @Bean public Student getStudent() {
	  
	  return new Student();
	  
	  }
	 
}
