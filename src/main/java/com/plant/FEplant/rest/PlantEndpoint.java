package com.plant.FEplant.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plant.FEplant.controller.PlantService;
import com.plant.FEplant.domein.Plant;

@RestController
public class PlantEndpoint {
	
	@Autowired
	PlantService plantservice;
	
	@GetMapping("/alleplanten")
	public Iterable<Plant> uitproberenalle() {
		return plantservice.test();
	}
	
	
	@GetMapping("/plant1")
	public void uitproberen() {
		System.out.println("Hij doet het");
	}
	
	@GetMapping("/plant2")
	public Plant uitproberen2() {
		System.out.println("Hij doet functie2");
		Plant plant = new Plant();
		plant.setLeeftijd(15);
		return plant;
		
		
	}

}
