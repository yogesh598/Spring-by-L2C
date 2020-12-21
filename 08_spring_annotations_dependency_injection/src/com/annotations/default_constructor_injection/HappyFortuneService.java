package com.annotations.default_constructor_injection;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is my bad day !!! Hmmm";
	}

}
