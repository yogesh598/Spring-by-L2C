package com.injecting_from_properties_file;	//setter injection_properties_file

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//new properties
	private String emailAddress;
	private String team;
	
	//create a no-arg constructor
	public CricketCoach()
	{
		System.out.println("CricketCoach : Inside no-arg constructor");
	}
	
	//creating a setter, called by spring for injecting 
	public void setFortuneService(FortuneService fortuneService) 
	{
		System.out.println("CricketCoach : Inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	//creating a setters and getters for newly created properties
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : Inside setter method - setEmailAddress");

		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : Inside setter method - setTeam");

		this.team = team;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bolwing for 1 hour a day";
	}	

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
