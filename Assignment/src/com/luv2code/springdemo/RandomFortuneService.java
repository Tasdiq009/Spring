package com.luv2code.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	Vector fortune = new Vector();
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		//return "this is random fortune ";
		/*
		File file = new File("fortune.txt"); 
			    
		Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			  
		
		while (sc.hasNextLine()) {
			fortune.add(sc.nextLine());
		}
		      */
		Random rand=new Random(); ;
		int i=rand.nextInt(fortune.size());
		//System.out.println(i);
		return (String) fortune.get(i);
			    
			    
	   
	}
	
	//init method for this class's object
	
	@PostConstruct
	public void afterRandomFortuneService()
	{
		System.out.println("after creating RandomFortuneService Object ");
		
		File file = new File("fortune.txt"); 
	    
		Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			  
		
		while (sc.hasNextLine()) {
			fortune.add(sc.nextLine());
		}
		      
		
	}
	
	

}
