package com.plant.FEplant.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.plant.FEplant.domein.Timer;

@Component
public interface TimerRepository extends CrudRepository<Timer, Long>{

}