package com.plant.FEplant.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plant.FEplant.controller.GebruikerService;
import com.plant.FEplant.domein.Gebruiker;

@RestController
public class GebruikerEndPoint {
	
	@Autowired
	GebruikerService gebruikerservice;
	
	@GetMapping("/alleGebruikers")
	public Iterable<Gebruiker> uitproberenalle() {
		return gebruikerservice.test();
	}
	
	
	@GetMapping("/Gebruiker1")
	public void uitproberen() {
		System.out.println("Hij doet het");
	}
	
	@GetMapping("/Gebruiker2")
	public Gebruiker uitproberen2() {
		System.out.println("Hij doet functie2");
		Gebruiker Gebruiker = new Gebruiker();
		Gebruiker.setGebruikerLeeftijd(15);
		return Gebruiker;
		
		
	}

}
