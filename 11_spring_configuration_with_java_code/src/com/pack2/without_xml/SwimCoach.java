package com.pack2.without_xml;

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
}
