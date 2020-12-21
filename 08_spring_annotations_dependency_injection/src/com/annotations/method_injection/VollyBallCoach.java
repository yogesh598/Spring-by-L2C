package com.annotations.method_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VollyBallCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "practice boosting 1 hour daily";
	}

	@Override
	public String getDailyDiet() {
		return diet.getDiet();
	}
	private Diet diet;
	
	@Autowired
	public void volly(Diet theDiet)
	{
		diet = theDiet;
	}
}
