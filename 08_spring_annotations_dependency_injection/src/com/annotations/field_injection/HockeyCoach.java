package com.annotations.field_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice goal keeping daily for one hour";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	// creating a private field
	@Autowired
	private FortuneService fortuneService;
	
	//creating default constructor
	public HockeyCoach()
	{
		System.out.println(">> Inside default constructor HockeyCoach");
	}
	
	// no setter, no constructor , no methods needed for injection
}
