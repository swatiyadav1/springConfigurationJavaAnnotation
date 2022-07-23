package com.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myTennisCoach")
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fs;
	
	
	public TennisCoach() {
		System.out.println("default constructor invoked");
	}
	
	
//	@Autowired
//	public void setFortuneService(FortuneService tfs) {
//		fs=tfs;
//	}
	
//	@Autowired
//	public TennisCoach(FortuneService tfs) {
//		fs=tfs;
//	}
//	
//	
	
	@Override
	public String getDailyWorkout() {
	
		return "its a leg day today";
	}

	@Override
	public String getDailyFortune() {
		
		return fs.getFortune();
	}

}
