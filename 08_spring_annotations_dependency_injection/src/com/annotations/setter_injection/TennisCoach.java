package com.annotations.setter_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Work hard to get your first job";
	}

	@Override//needs a dependency
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//creating a private field of fortune Service
	private FortuneService fortuneService;
	
	//creating a no arg constructor
	public TennisCoach()
	{
		System.out.println(">> Im inside no arg constructor");
	}
	//creating setter for injection
	@Autowired
	public void setFortuneService(FortuneService theFortuneService)
	{
		System.out.println(">> Im inside setter : setFortuneService");
		fortuneService  = theFortuneService;
	}
}
