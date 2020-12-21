package com.annotations.default_components_names;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach 
{
	@Override
	public String getDailyWorkout() {
		return "Practice 30'mis fronthand volley every single day";
	}
}
