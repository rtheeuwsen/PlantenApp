package com.plant.FEplant.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plant {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	int leeftijd;

}
