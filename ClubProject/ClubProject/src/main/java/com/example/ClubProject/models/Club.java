package com.example.ClubProject.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Club {
	private String name;
	private String league;
	
	@Id
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLeague() {
		return league;
	}
	public void setLeague(String league) {
		this.league = league;
	}
}
