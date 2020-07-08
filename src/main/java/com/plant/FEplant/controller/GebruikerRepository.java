package com.plant.FEplant.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.plant.FEplant.domein.Gebruiker;

@Component
public interface GebruikerRepository extends CrudRepository<Gebruiker, Long> {

}
