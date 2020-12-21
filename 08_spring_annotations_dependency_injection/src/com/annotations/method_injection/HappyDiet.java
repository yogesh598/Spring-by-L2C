package com.annotations.method_injection;

import org.springframework.stereotype.Component;

@Component
public class HappyDiet implements Diet {

	@Override
	public String getDiet() {
		return "Breakfast : 1 cup milk \nLunch : 4 Eggs\nDinner : 2 Banana";
	}

}
