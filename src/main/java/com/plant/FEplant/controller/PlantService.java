package com.plant.FEplant.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plant.FEplant.domein.Plant;

@Service
@Transactional
public class PlantService {
	@Autowired
	PlantRepository plantrepository;
	
	public Iterable<Plant> test() {
		System.out.println("test in service");
		Iterable<Plant> planten = plantrepository.findAll();
		return planten;
	}

}
