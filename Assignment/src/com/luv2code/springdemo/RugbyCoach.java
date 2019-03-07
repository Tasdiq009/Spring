package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("rugby")
public class RugbyCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice rugby 50 min ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
