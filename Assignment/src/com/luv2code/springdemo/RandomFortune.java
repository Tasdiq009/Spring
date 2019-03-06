package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortune implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		String fortune[]= {"Hundred percent lucky!",
							"Seventy percent lucky!",
							"Thirty percent lucky!"};
		Random rand=new Random(); ;
		int i=rand.nextInt()%3;
		return fortune[i];
	}

}
