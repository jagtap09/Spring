package com.all;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Sim {

	@Override
	public String calling() {
		return "Your Calling From Airtel";
		
	}

}
