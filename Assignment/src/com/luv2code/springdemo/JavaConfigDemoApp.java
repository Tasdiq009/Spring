package com.luv2code.springdemo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring config file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		//get the bean from spring container
		Coach theCoach=context.getBean("rugbyCoach",Coach.class);
		//call a method on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();

	}

}
