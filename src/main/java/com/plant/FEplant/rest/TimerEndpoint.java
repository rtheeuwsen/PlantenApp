package com.plant.FEplant.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plant.FEplant.controller.TimerService;
import com.plant.FEplant.domein.Timer;

@RestController

public class TimerEndpoint {

	@Autowired
	TimerService timerservice;
	
	@GetMapping("/alletimers")
	public Iterable<Timer> uitproberenalle() {
		return timerservice.test();
	}
	
	@GetMapping("/Timer")

	public void uitproberen() {

		System.out.println("Hoe doet het");

	}

	

	@GetMapping("/Timer2")

	public Timer uitproberen2() {

		System.out.println("Hoe doet 2 functie");
		Timer timer = new Timer();
		timer.setReminder("dag");
		return timer;
	}

}