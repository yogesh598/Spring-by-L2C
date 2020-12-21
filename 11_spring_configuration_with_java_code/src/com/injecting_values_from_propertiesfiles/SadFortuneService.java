package com.injecting_values_from_propertiesfiles;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your bad day , Don't worry";
	}

}
