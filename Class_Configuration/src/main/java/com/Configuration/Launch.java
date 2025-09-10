package com.Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Employee emp = (Employee)context.getBean("emp1");
		System.out.println(emp);
	}

}
