package com.luv2code.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		//return "this is random fortune ";
		
		File file = new File("fortune.txt"); 
			    
		Scanner sc = null;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			  
		Vector fortune = new Vector();
		while (sc.hasNextLine()) {
			fortune.add(sc.nextLine());
		}
		      
		Random rand=new Random(); ;
		int i=rand.nextInt(fortune.size());
		//System.out.println(i);
		return (String) fortune.get(i);
			    
			    
	   
	}

}
