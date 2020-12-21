//new code at line no 25
package com.injecting_values_from_propertiesfiles;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Swim daily 100 meters";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFoetuneService)
	{
		fortuneService = theFoetuneService; 
	}
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
}
