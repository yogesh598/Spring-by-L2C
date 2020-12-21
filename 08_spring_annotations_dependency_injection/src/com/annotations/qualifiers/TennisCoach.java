package com.annotations.qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "getDailyWorkout : Practice your backhand vally for 1 hour daily (^-^)";
	}

	@Override
	public String getDailyFortune() {
		return "getDailyFortune : "+fortuneService.getFortune();
	}
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
}
