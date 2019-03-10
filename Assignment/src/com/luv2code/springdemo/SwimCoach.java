package com.luv2code.springdemo;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	
	
	public SwimCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim looooonggg!!!!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
