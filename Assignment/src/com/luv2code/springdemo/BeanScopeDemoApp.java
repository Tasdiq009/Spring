package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the config file
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		//retrive bean fromm spring container
		 Coach theCoach=context.getBean("myCoach",Coach.class);
		 
		 Coach alphaCoach=context.getBean("myCoach",Coach.class);
		 
		 //check if they are same
		 boolean result=(theCoach==alphaCoach);
		 
		 
		 System.out.println("pointing to the same object: " + result);
		 System.out.println("Memory location for theCoach: "+theCoach);
		 System.out.println("Memory location for theCoach: "+alphaCoach);
	}

}
