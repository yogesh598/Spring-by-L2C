package com.pack2.without_xml;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your bad day , Don't worry";
	}

}
