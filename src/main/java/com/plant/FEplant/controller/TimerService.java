package com.plant.FEplant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.plant.FEplant.domein.Timer;

@Service
@Transactional
public class TimerService {
	@Autowired
	TimerRepository timerrepository;
	
	
	public Iterable<Timer> test() {
		System.out.println("test in service");
		Iterable<Timer> timers = timerrepository.findAll();
		return timers;
	}

	public void voerEenTimerIn(Timer timer) {
		timerrepository.save(timer);
		
	}
}