package com.plant.FEplant.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.plant.FEplant.domein.Plant;

@Component
public interface PlantRepository extends CrudRepository<Plant, Long> {

}
