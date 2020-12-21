package com.annotations.qualifiers;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Your database connection is sucseed";
	}

}
