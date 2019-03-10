package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@Component("rugby")
public class RugbyCoach implements Coach {

	private FortuneService fortuneService;
	@Autowired
	//@Qualifier( "randomFortuneService")
	public RugbyCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
		
		System.out.println(">> inside RugbyCoach after randomservicee Qualifier");
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice rugby 50 min ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
