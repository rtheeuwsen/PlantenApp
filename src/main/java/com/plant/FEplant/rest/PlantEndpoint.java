package com.plant.FEplant.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plant.FEplant.domein.Plant;

@RestController
public class PlantEndpoint {
	
	@GetMapping("/plant1")
	public void uitproberen() {
		System.out.println("Hij doet het");
	}
	
	@GetMapping("/plant2")
	public Plant uitproberen() {
		System.out.println("Hij doet functie2");
		return new Plant();
	}

}
