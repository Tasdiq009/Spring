package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

 
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is your lucky day";
	}

}
