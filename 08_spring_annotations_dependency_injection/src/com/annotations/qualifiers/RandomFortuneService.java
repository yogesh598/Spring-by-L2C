package com.annotations.qualifiers;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You have choosen a ramdom fortune";
	}
}
