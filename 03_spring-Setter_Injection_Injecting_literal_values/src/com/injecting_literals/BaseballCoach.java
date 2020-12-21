package com.injecting_literals;

public class BaseballCoach implements Coach{

	// define private field
	private FortuneService fortuneService;
	
	//define the constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout()
	{
		return "Spend 60-min in batting practice";
	}

	@Override
	public String getDailyFortune() 
	{
		//use my FortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
