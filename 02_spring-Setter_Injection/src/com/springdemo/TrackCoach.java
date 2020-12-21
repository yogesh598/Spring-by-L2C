package com.springdemo;

public class TrackCoach implements Coach {

	//define a private field
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() 
	{
		return "Run a hard 10k";
	}

	@Override
	public String getDailyFortune() 
	{
		return " This is your daily fortune "+fortuneService.getFortune();
	}

}
