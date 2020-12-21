package com.annotations.method_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyDiet() {
		return diet.getDiet();
	}
	
	//define a private variable for injection
	private Diet diet;
	
	//method for injection with @autowired
	@Autowired
	public void foodPlan(Diet theDiet)
	{
		diet = theDiet;
	}
}