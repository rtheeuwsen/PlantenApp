package com.plant.FEplant.domein;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gebruiker {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNaam() {
		return Naam;
	}
	public void setNaam(String Naam) {
		this.Naam = Naam;
	}
	String Naam;
 

	public String getAchterNaam() {
		return AchterNaam;
	}
	public void setAchterNaam(String AchterNaam) {
		this.AchterNaam = AchterNaam;
	}
	String AchterNaam;
	
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String UserName) {
		this.UserName = UserName;
	}
	String UserName;
	
	public int geGebruikerLeeftijd() {
		return GebruikerLeeftijd;
	}
	public void setGebruikerLeeftijd(int GebruikerLeeftijd) {
		this.GebruikerLeeftijd = GebruikerLeeftijd;
	}
	int GebruikerLeeftijd;
	
	
}

