package com.annotations.default_constructor_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//let the spring to create the bean
@Component
public class TennisCoach implements Coach 
{
	FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		return "Practice 30'mis fronthand volley every single day";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	//create a constructor for injection
	@Autowired
	public TennisCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
}
