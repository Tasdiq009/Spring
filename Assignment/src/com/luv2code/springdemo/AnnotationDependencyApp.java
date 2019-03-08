package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDependencyApp {

	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("annotation-applicationContext.xml");
		//get the bean from spring container
		Coach theCoach=context.getBean("rugby",Coach.class);
		//call a method on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		//close the context
		context.close();

	}

}
