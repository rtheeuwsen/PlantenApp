package com.plant.FEplant.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.plant.FEplant.domein.Timer;

@RestController

public class TimerEndpoint {

	@GetMapping("/Timer")

	public void uitproberen() {

		System.out.println("Hoe doet het");

	}

	

	@GetMapping("/Timer2")

	public Timer uitproberen2() {

		System.out.println("Hoe doet 2 functie");

		return new Timer();

	}

}