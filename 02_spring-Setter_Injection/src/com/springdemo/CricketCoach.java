package com.springdemo;	//setter injection related

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//create a no-arg constructor
	public CricketCoach()
	{
		System.out.println("CricketCoach : Inside no-arg constructor");
	}
	
	//creating a setter, called by spring for injecting 
	public void setFortuneService(FortuneService fortuneService) 
	{
		System.out.println("CricketCoach : Inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bolwing for 1 hour a day";
	}	

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
