package com.plant.FEplant.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plant.FEplant.domein.Gebruiker;

@Service
@Transactional
public class GebruikerService {
	@Autowired
	GebruikerRepository GebruikerRepository;
	
	public Iterable<Gebruiker> test() {
		System.out.println("test in service");
		Iterable<Gebruiker> Gebruiker = GebruikerRepository.findAll();
		return Gebruiker;
	}

}
