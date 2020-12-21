package com.annotations.explicit_components_names;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach 
{
	@Override
	public String getDailyWorkout() {
		return "Practice 30'mis backhand volley every single day";
	}
}
